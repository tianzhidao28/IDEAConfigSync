package com.rocyuan.idea;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.main.Main;

/**
 * Created by rocyuan on 2015/10/30.
 */
public class FTPFileUploadMain {

    public static void main(String args[]) throws Exception {



        Main main = new Main();
        main.enableHangupSupport();
        main.addRouteBuilder(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
                pc.setLocation("classpath:ftp.properties");
                from("file:E:/rocyuan/IDEA/JPush-Services/JPush-Services-Sms/Sms-Rest/target").to("{{ftp.server}}");  //上传
                from("file:E:/rocyuan/IDEA/JPush-Services/JPush-Services-Sms/Sms-Server/target").to("{{ftp.server}}");  //上传
                from("file:E:/rocyuan/IDEA/JPush-Services/JPush-Services-ChargedSms/ChargedSms-Pre-Send/target").to("{{ftp.server}}");  //上传
                from("file:E:/rocyuan/IDEA/JPush-Services/JPush-Services-ChargedSms/ChargedSms-Server/target").to("{{ftp.server}}");  //上传

            }
        });
        main.run(args);
    }
}
