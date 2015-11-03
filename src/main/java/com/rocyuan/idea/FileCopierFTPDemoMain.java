package com.rocyuan.idea;

import javax.annotation.processing.Processor;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.Exchange;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.camel.component.file.GenericFile;

/**
 * Created by rocyuan on 2015/10/28.
 */
public class FileCopierFTPDemoMain {

        public static void main(String args[]) throws Exception
        {
            int i = 0;
            CamelContext context = new DefaultCamelContext();

//            context.addRoutes(new RouteBuilder()
//            {
//                public void configure() {
//
//                    from("ftp://192.168.230.1:21?username=mauro")
//                            .choice()
//                            .when(header("CamelFileName").endsWith(".xml"))
//                            .process(new org.apache.camel.Processor() {
//                                public void process(Exchange exchange) throws Exception {
//
//                                    System.out.println("Copying file XML: "
//                                            + exchange.getIn().getHeader("CamelFileName"));
//                                    System.out.println(exchange.getIn().getBody());
//                                }
//                            })
//                            .to("file:C:/DataOUT")//.setHeader(Exchange.FILE_NAME,simple("${file:name.	noext}.old"))
//                            .when(header("CamelFileName").endsWith(".txt"))
//                            .process(new org.apache.camel.Processor() {
//                                public void process(Exchange exchange) throws Exception {
//
//                                    System.out.println("Copying file txt: "
//                                            + exchange.getIn().getHeader("CamelFileName"));
//                                    System.out.println(exchange.getIn().getBody());
//                                }
//                            })
//                            .to("file:C:/DataIN"); //.to("ftp://192.168.230.1:21?username=mauro");*/
//				/*prova aggiunto commento
//				Aggiunto un ulteriore commento*/
//                }
//            });

            context.addRoutes(new MoreRouterBuilders.SyncIDEAConfig());

            context.start();

            Thread.sleep(10000);

            context.stop();
        }
}
