package com.spring.reactive.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.spring.reactive.model.ClinicalData;
import com.spring.reactive.model.Patient;

import reactor.core.publisher.Mono;

@Controller
public class rsocketController {

	@MessageMapping("/get-patient-data")
	public Mono<ClinicalData> requestResponce(Patient patient) {
		return Mono.just(new ClinicalData(90, "80/120"));

	}
}
