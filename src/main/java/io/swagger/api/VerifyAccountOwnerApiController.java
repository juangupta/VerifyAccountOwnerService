package io.swagger.api;

import io.swagger.model.JsonApiBody;
import io.swagger.model.VerifyAccountError;
import io.swagger.model.VerifyAccountRequest;
import io.swagger.model.VerifyAccountResponse;
import io.swagger.model.client.AttributesRequest;
import io.swagger.model.client.JsonApiRequest;
import io.swagger.model.client.JsonApiResponse;
import io.swagger.model.client.ValidateChannelRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-02T20:16:10.917Z")

@Controller
public class VerifyAccountOwnerApiController implements VerifyAccountOwnerApi {

    private static final Logger log = LoggerFactory.getLogger(VerifyAccountOwnerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    //@Value("${attr.type.transaction}")
    private static final String TYPE_TRANSACTION = "transaction";
    
    @EndpointInject(uri = "direct:validateChannel")
    private FluentProducerTemplate producerTemplate;

    @org.springframework.beans.factory.annotation.Autowired
    public VerifyAccountOwnerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<VerifyAccountResponse> verifyAccountOwner(@ApiParam(value = "" ,required=true )  @Valid @RequestBody JsonApiBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	VerifyAccountRequest verifyAccountRequest = new VerifyAccountRequest();
        	verifyAccountRequest = body.getData().get(0);
        	
        	System.out.println("Before Response.......");
            
        	JsonApiResponse channelServiceResponse = producerTemplate.withBody(verifyAccountRequest).request(JsonApiResponse.class);
        	System.out.println("Response.......");
            System.out.println(channelServiceResponse.getData().get(0).getId());
            VerifyAccountResponse response = new VerifyAccountResponse();
            response.setHeader(verifyAccountRequest.getHeader());
            response.setMessageId(verifyAccountRequest.getMessageId());
            response.setOwnerAccountName("Juan G Gomez Isaza");
            response.setTransactionDate(new Timestamp(System.currentTimeMillis()).toString());
			return new ResponseEntity<VerifyAccountResponse>(response, HttpStatus.OK);
        }

        return new ResponseEntity<VerifyAccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
