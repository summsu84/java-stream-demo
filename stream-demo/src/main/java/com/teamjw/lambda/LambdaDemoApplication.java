package com.teamjw.lambda;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

// @SpringBootApplication
@Slf4j
public class LambdaDemoApplication {

	public static void main(String[] args) {
		// 방법 #1
		FunctionClass fc = new FunctionClass();
		print(fc);
		
		// 방법 #2
		print(new FunctionInterface() {

			@Override
			public void printMessage(String msg) {
				// TODO Auto-generated method stub
				log.info("익명 : {}", msg);
			}
		});
		
		// 방법 #3
		print(msg -> log.info("람다 : {}", msg));
		
	}
	
	public static void print(FunctionInterface fi) {
		fi.printMessage("Test");
	}

	
}
