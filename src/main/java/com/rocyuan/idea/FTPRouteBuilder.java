
package com.rocyuan.idea;


import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class FTPRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    
    public void configure(){    	
//    	from("file:d:/temp/inbox/?delay=30000").to("file:d:/temp/outbox");  //本地文件互传
//    	from("ftp://127.0.0.1/wamp/tmp?username=wangwt&password=123456&delay=30000").to("file:d:/temp/outbox");  //下载
    	from("file:d:/temp/outbox").to("ftp://127.0.0.1/wamp/tmp2?username=wangwt&password=123456");  //上传
    	
    	
    }

}
