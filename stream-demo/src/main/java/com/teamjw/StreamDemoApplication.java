package com.teamjw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

// @SpringBootApplication
@Slf4j
public class StreamDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StreamDemoApplication.class, args);
		// Stream 은 List, Collection 이런데 사용!
		
		List<String> list = Arrays.asList("a1", "b2", "c3", "d4", "e5", "f6");
		
		//명령형 방식
		for(int i = 0 ; i < list.size(); i++) {
			String s = list.get(i);
			if(s.startsWith("c")) {
				log.info("{}", s.toUpperCase());
			}
		}
		
		// stream 기반 #1
		list.stream().filter(s -> s.startsWith("c")).map(s -> s.toUpperCase()).forEach(s -> {
			log.info("stream {} : ", s);
		});
		// stream 기반 + method reference
		list.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).forEach(log::info);
	}
	
	public static void genStream() {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> intStream = list.stream(); // Collection to Stream
		Stream<String> strStream = Stream.of(new String[] {"a", "b", "c", "d"}); // Array to Stream
		Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
		Stream<Double> randomStream = Stream.generate(Math::random);
	
	}
		
	
}
