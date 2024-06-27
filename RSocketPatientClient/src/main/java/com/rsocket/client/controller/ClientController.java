package com.rsocket.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.reactive.model.ClinicalData;
import com.spring.reactive.model.Patient;

import reactor.core.publisher.Mono;

@RestController
public class ClientController {
	
	Logger log = LoggerFactory.getLogger(ClientController.class);


	private final RSocketRequester requester;

	public ClientController(@Autowired RSocketRequester.Builder builder) {
			this.requester = builder.tcp("localhost",7000);

	}

	@GetMapping("/request-response")
	public Mono<ClinicalData> requestResponse( Patient patient) {
		
		log.info("Send the rsocket request patient "+ patient);

		return requester
				.route("get-patient-data")
				.data(patient)
				.retrieveMono(ClinicalData.class);
	}
	@PostMapping("/fire-and-forget")
	public Mono<Void>FireAndForget(@RequestBody Patient patient){
		log.info("Patient Being Checked Out"+patient);
		 return requester.route("patient-checkout").data(patient).retrieveMono(Void.class);
		
		
	}
}
