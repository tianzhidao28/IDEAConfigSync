package com.rocyuan.idea;


import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.main.Main;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LocalMoveTest extends CamelTestSupport {


    @Test
    public  void moveFileTest() throws Exception {

        Main main = new Main();
        main.addRouteBuilder(new RouteBuilder(){

            @Override
            public void configure() throws Exception {
                PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
                pc.setLocation("classpath:ftp.properties");

                getContext().getShutdownStrategy().setTimeout(5);

                from("file:D:/tmp/lepow")
                        .log("Uploading file ${file:name}")
                        .to("file:D:/tmp/in")
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
        });
        main.enableHangupSupport();
        main.run();







    }


}