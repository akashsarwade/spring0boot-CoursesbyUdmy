package com.spring.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

	private String[] courses = { "java Web Services", "End to end project", "full staack developer" };
	private int count = 0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Inside Read Method..");
		if (count < courses.length) {
			return courses[count++];
		} else {
			count = 0;
		}
		return null;
	}

}
