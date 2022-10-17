package com.cine.salaService.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cine.salaService.dto.Ack;
import com.cine.salaService.dto.Sala;

@Endpoint
public class SalasEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.cine";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "sala")
	@ResponsePayload
	public Ack salaRegistration(@RequestPayload Sala request) {
		Ack response = new Ack();
		
		response.setCode(0);
		response.setDescription("OK");
		
		return response;
		
	}

}