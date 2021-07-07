package com.jade.javaAssignments;

public class AsteriskLogger implements Logger {

	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");	
	}

	@Override
	public void error(String error) {
	 String stars = "******************************";
	 //print one whole line of stars
	 System.out.println(stars);
	 
	 //prrint the error message with starts as shown on the question
	 System.out.println("***ERROR:" + error + "***");
	 
	 
	 //print one whole line of stars
	 System.out.println(stars);
		
	}

}
