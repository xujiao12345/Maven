package com.imooc.maven02.model;

import org.junit.*;
import org.junit.Assert.*;

public class SpeakTest{
	@Test
	public void testsayHi(){
		Assert.assertEquals("Hello World!",new Speak().sayHi());
	}
}