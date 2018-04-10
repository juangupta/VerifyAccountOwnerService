package io.swagger.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.ZipDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class VerifyAccountRouter2 extends RouteBuilder {
	
	
	@Override
    public void configure() throws Exception {
        from("direct:writeToLog")
        .log("Route 2: Body Response ${body}");
        
    }
}