package com.rocyuan.idea;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by rocyuan on 2015/10/30.
 */
public class IDEAConfigSync2GitMain {

    public static void main(String args[]) throws Exception {

        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new MoreRouterBuilders.SyncIDEAConfig());
        context.start();
        Thread.sleep(10000);
        context.stop();
    }
}
