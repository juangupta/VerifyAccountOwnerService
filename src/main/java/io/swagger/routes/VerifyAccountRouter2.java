package io.swagger.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class VerifyAccountRouter2 extends RouteBuilder {
	
	
	@Override
    public void configure() throws Exception {
        from("direct:writeToLog")
        .log("Route 2: Body Response ${body}");
        
    }
}