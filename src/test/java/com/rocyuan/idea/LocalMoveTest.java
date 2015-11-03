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
        main.addRouteBuilder(new MoreRouterBuilders.SyncIDEAConfig());
        main.enableHangupSupport();
        main.run();







    }


}