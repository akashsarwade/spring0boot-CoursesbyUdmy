package com.java.java8.understanding;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {

//		1. Stream.list

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		Stream<Integer> strmList = list.stream();
		strmList.forEach(p -> System.out.println(p));

//		2.	Stream.of

		System.out.println("----Of Method");
		Stream<Integer> stm = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
		stm.forEach(p -> System.out.println(p));

//		3. Stream.of(array)

		Stream<Integer> arryStream = Stream.of(new Integer[] { 1, 2, 4, 5, 686, 87, 342, 56 });
		arryStream.forEach(p -> System.out.println("Stream Array:-" + p));

//		4. Random Number Generator
		Stream<Integer> randomNum = Stream.generate(() -> new Random().nextInt(100));
//		randomNum.forEach(p -> System.out.println(p));
		randomNum.limit(5).forEach(System.out::println);

//		Add Even Numbers only from list
		List<Integer> list1 = new ArrayList<>();
		for (int i = 1; i <= 29; i++) {
			list1.add(i);

			System.out.println("This Is original List" + i);
		}

		Stream<Integer> strm = list1.stream();
		List<Integer> evenNum = strm.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNum);

//		Filter in Streams

		List<String> names = new ArrayList<>();
		names.add("Akassh");
		names.add("Raju");
		names.add("Sham");
		names.add("Vicky");
		names.add("Sanjana");
		names.add("Rama");
//		startWith()
		names.stream().filter((p) -> p.startsWith("R")).forEach(System.out::println);

//		EndsWith()
		names.stream().filter((p) -> p.endsWith("a")).forEach(System.out::println);

//		sorted.
		names.stream().filter((f) -> f.endsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);

//		Sorted in Natural Alphabetically order
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

//		Stream Match
//		allMatch()
		boolean isAllMatch = names.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println("All String Start with A- " + isAllMatch);

//		anyMatch()

		boolean isAnyMatch = names.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println("Any String start with 'A'- " + isAnyMatch);

//		noneMatch()

		boolean isNoneMatch = names.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println("None Matched- " + isNoneMatch);

//		count()
		long totalCount = names.stream().count();
		System.out.println("Total count of List " + totalCount);

//		reduce()
		Optional<String> reduced = names.stream().reduce((s1, s2) -> s1 + s2);
		reduced.ifPresent(System.out::println);

//		find Specific Member of List
//		findFirst()
		String findMember = names.stream().filter((s) -> s.startsWith("Ak")).findFirst().get();
		System.out.println(findMember);

	}

}
