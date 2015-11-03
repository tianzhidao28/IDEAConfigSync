package com.rocyuan.idea;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;

/**
 * Created by rocyuan on 2015/10/28.
 */
public class MoreRouterBuilders {

    public static class LocalFileMoveRouteBuilder extends RouteBuilder {
        @Override
        public void configure() throws Exception {
            PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
            pc.setLocation("classpath:ftp.properties");
            from("file:D:\\tmp\\lepow?delay=30000").to("file:D:\\tmp\\in");  //本地文件互传
        }
    }


    public static class FTPClientUploadRouteBuilder extends RouteBuilder {
        /**
         * <b>Called on initialization to build the routes using the fluent builder syntax.</b>
         * <p/>
         * This is a central method for RouteBuilder implementations to implement
         * the routes using the Java fluent builder syntax.
         *
         * @throws Exception can be thrown during configuration
         */
        @Override
        public void configure() throws Exception {
            // configure properties component
            PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
            pc.setLocation("classpath:ftp.properties");
            // lets shutdown faster in case of in-flight messages stack up
            getContext().getShutdownStrategy().setTimeout(10);

            from("file:target/upload?moveFailed=../error")
                    .log("Uploading file ${file:name}")
                    .to("{{ftp.client}}")
                    .log("Uploaded file ${file:name} complete.");

            // use system out so it stand out
            System.out.println("*********************************************************************************");
            System.out.println("Camel will route files from target/upload directory to the FTP server: "
                    + getContext().resolvePropertyPlaceholders("{{ftp.server}}"));
            System.out.println("You can configure the location of the ftp server in the src/main/resources/ftp.properties file.");
            System.out.println("If the file upload fails, then the file is moved to the target/error directory.");
            System.out.println("Use ctrl + c to stop this application.");
            System.out.println("*********************************************************************************");

        }
    }


    public static class SyncIDEAConfig extends RouteBuilder{

        /**
         * <b>Called on initialization to build the routes using the fluent builder syntax.</b>
         * <p/>
         * This is a central method for RouteBuilder implementations to implement
         * the routes using the Java fluent builder syntax.
         *
         * @throws Exception can be thrown during configuration
         */
        @Override
        public void configure() throws Exception {

            PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
            pc.setLocation("classpath:idea.properties");
            // lets shutdown faster in case of in-flight messages stack up
            getContext().getShutdownStrategy().setTimeout(20);

            // 同步IDEA的模板到 git
            from("{{idea.configfile.local}}?recursive=true&antExclude=**.jar,**/consoles/**,**/eval/**,**/inspection/**,**/options/**,**/plugins/**,**/tasks/**&move=backup/${date:now:yyyyMMdd}/${file:name}")
                    .log("move new file ${file:name}")
                    .to("{{idea.configfile.center}}?autoCreate=true &fileExist=Override")
                    .log("move new file ${file:name} complete.");






        }
    }


}
