package com.programe;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void a() {
		System.out.println("Frome a");
		Reporter.log("Frome abcd",true);
		Reporter.log("xyz");
		
		
	}

}
