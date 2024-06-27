package com.spring.reactive;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class OrderConsumer implements Consumer<String>{

	@Override
	public void accept(String data) {

		System.out.println(data);
	
	}
}
