package com.sunyuki.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.juvenxu.mvnbook.helloworld.HelloWorld;

public class TestHelloWorld {
	
	@Test
	public void testSayHello(){
		HelloWorld helloWorld = new HelloWorld();
		String sayHello = helloWorld.sayHello();
		
		assertEquals("Hello Maven", sayHello);
	}
}
