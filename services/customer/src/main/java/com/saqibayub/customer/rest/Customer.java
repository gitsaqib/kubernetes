package com.saqibayub.customer.rest;

import org.springdoc.core.annotations.RouterOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;



@RestController
@RequestMapping("/api")
public class Customer {

	
	@RequestMapping(value = "/customers/", method = RequestMethod.GET)
	@RouterOperation(
				operation = 
				@Operation(
						description = "Get Customer infomation by Customer Id", 
						operationId = "getCustomer", tags = "Customer Info",
						responses = @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = com.saqibayub.customer.domain.Customer.class)))
						)
				)
	public com.saqibayub.customer.domain.Customer getCustomers(){
		
		return new com.saqibayub.customer.domain.Customer();
	}
	
}
