package com.teamjw;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionInterfaceDemoApplication {

	public static void main(String[] args) {
		//1. 익명 객체
		MyFunction f = new MyFunction() {

			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a : b;
			}
		};
		
		//2. 익명 객체 대신에 람다식
		MyFunction f2 = (a, b) -> a > b ? a : b;
		
		//3. 함수에 람다를 바로 사용 
		
		int value = f.max(3, 5);
		int value2= f2.max(4,5);
		printMsg(value);
		printMsg(value2);
		
		//////MyFunctionRun/////
		// 람다식으로 MyFunctionRun 구현
		MyFunctionRun f1 = () -> log.info("f1.run();");
		
		// 익명 클래스로 run() 구현
		MyFunctionRun f12 = new MyFunctionRun() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				log.info("f12.run()");
			}
			
		};
		
		//반환형으로 구현
		MyFunctionRun f13 = getMyFunctionRun();
		f1.run();
		f12.run();
		f13.run();
		
		execute(f1);
		execute(()->log.info("run!!"));
	}
	
	public static void MyFunction3(int a, int b, MyFunction f) {
		printMsg(f.max(a,  b));
	}
	
	public static void printMsg(int value) {
		log.info("value : {}", value);
	}
	
	// 매개 변수 타입이 MyFunctionRun인 메서드
	public static void execute(MyFunctionRun fr) {
		fr.run();
	}
	
	// 반환 타입이 MyFunctionRun인 메서드
	public static MyFunctionRun getMyFunctionRun() {
		MyFunctionRun fr = () -> log.info("fr run");
		return fr;
	}
}
