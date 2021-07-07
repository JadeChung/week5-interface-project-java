package com.jade.javaAssignments;

public class App {

	public static void main(String[] args) {
		// Instantiate SpacedLogger
		SpacedLogger spacedLogger = new SpacedLogger();

		String log = "hello";
		String error = "Oh nooo";
		spacedLogger.log(log);
		spacedLogger.error(error);

		AsteriskLogger asteriskLogger = new AsteriskLogger();

		asteriskLogger.log(log);
		asteriskLogger.error(error);

	
	}

}
