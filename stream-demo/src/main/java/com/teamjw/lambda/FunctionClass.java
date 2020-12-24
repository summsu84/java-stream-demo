package com.teamjw.lambda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionClass implements FunctionInterface{

	@Override
	public void printMessage(String msg) {
		// TODO Auto-generated method stub
		log.info("msg : {}", msg);
		
	}

}
