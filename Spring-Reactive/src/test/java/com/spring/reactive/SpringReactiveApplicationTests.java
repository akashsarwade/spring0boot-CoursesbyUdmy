package com.spring.reactive;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringReactiveApplicationTests {

	@Test
	void testMono() {
		Mono<String> mono = Mono.just("MacBook Pro..");
		mono.log().map(data -> data.toUpperCase())
		.subscribe(data->System.out.println(data));
	}

	
	@Test
	void testFlux() {
		Flux<String> flux = Flux.just("Google Pixel....","OnePlus","Samsung");
		flux
		.log().map(data -> data
				.toUpperCase())
		.subscribe(data->System.out.println(data));
	}
}
