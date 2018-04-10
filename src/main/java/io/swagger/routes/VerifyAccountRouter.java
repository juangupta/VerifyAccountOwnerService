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

import io.swagger.model.JsonApiBody;


@Component
public class VerifyAccountRouter extends RouteBuilder {
	
	
	@Override
    public void configure() throws Exception {
        from("direct:validateChannel")
	        .marshal().json(JsonLibrary.Jackson)
	        .log("Route validateChannel: Before send POST Request")
	        .setHeader(Exchange.HTTP_METHOD, constant("POST"))
	        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
	    .to("https://postman-echo.com/post")
	        .log("Route validateChannel: After send POST Request");
        //.to("direct:writeToLog")
        //.log("After call to direct");
        
    }
}