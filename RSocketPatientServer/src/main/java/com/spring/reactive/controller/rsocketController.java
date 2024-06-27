package com.spring.reactive.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.reactive.model.ClinicalData;
import com.spring.reactive.model.Patient;

import reactor.core.publisher.Mono;

@Controller
public class rsocketController {

	Logger log = LoggerFactory.getLogger(rsocketController.class);

	@MessageMapping("/get-patient-data")
	public Mono<ClinicalData> requestResponce(@RequestBody Patient patient) {
		log.info("Received Patient"+ patient);
		return Mono.just(new ClinicalData(90, "80/120"));

	}
	@MessageMapping("patient-checkout")
	public Mono<Void>FireAndForget(Patient patient){
		log.info("Patient Checking Out"+patient);
		log.info("Biiling Initiated");
		return Mono.empty().then();
	}
}
