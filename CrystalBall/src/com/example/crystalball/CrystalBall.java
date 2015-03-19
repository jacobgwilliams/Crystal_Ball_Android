package com.example.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certain",
			"It will definitely happen",
			"All signs say YES",
			"The stars are full of poop",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now"};
	
	public String getAnAnswer(){
		
				
		String answer = "";
		
		// Randomly select one of three answers: Yes, No, or Maybe
		Random randomGenerator = new Random(); //Construct a new random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}
}
