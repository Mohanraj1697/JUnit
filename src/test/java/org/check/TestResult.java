package org.check;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {
	
	@Test
	public void test() {
		Result rn = JUnitCore.runClasses(Apple.class,Banana.class,Capcicum.class);
		
		//Test Results
		
//		int runCount = rn.getRunCount();
//		System.out.println(runCount);
		//or
		System.out.println("Run Count....."+rn.getRunCount());
		System.out.println("Failure Count"+rn.getFailureCount());
		System.out.println("Ignore Count....."+rn.getIgnoreCount());
		System.out.println("Run Time....."+rn.getRunTime());

		//Suite Result
		System.out.println("Suite Result....."+rn.wasSuccessful());
		
		//Failures
		List<Failure> failures = rn.getFailures();
		for(Failure x:failures) {
			System.out.println(x);
		
			//TestHeader
//			String testHeader = x.getTestHeader();
//			System.out.println(testHeader);
			//or
			System.out.println("Test Header....."+x.getTestHeader());
			System.out.println("Message...."+x.getMessage());
			System.out.println("Exception....."+x.getException());
		}
	}
	
	

}
