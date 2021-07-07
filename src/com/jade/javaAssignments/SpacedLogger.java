package com.jade.javaAssignments;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
			for (int i = 0; i < log.length(); i++) {
				if (i > 0) {
				result.append(" ");
		    }

				result.append(log.charAt(i));
		}

				System.out.println(result.toString());
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			if (i > 0) {
			newWord.append(" ");
	    }

			newWord.append(error.charAt(i));
	}

			System.out.println("ERROR:"+ newWord.toString());
	}

}
