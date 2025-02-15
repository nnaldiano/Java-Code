package Model;

import java.util.ArrayList; 
import java.util.Random;

public class TheWord {
	private String realWord;
	private String currentGuess;
	private int numberOfGuesses;
	private static final int MAX_GUESS_ALLOWED = 6;
	private ArrayList<String> lettersGuessed;
	public boolean didUserWin;
	
	private static String[] allWords = new String[] {"plant", "house",  "bottle", "scissors","cat"};
	
	
	
	public TheWord() {
		Random r = new Random ();
		int result = r.nextInt(allWords.length );
		realWord = allWords[result].toUpperCase();
		
		lettersGuessed = new ArrayList<String>();
		
		makeBlanks();
		}
	
	
	

	private void makeBlanks() {
		// TODO Auto-generated method stub
		StringBuilder blanks = new StringBuilder();
		for(int i = 0; i < realWord.length(); i++) {
		blanks.append(" _ ");	
		}
		this.currentGuess = blanks.toString();
	}




	public String getRealWord() {
		return realWord;
	}

	public void setRealWord(String realWord) {
		this.realWord = realWord;
	}

	public String getCurrentGuess() {
		return currentGuess;
	}

	public void setCurrentGuess(String currentGuess) {
		this.currentGuess = currentGuess;
	}

	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}

	public void setNumberOfGuesses(int numberOfGuesses) {
		this.numberOfGuesses = numberOfGuesses;
	}

	public ArrayList<String> getLettersGuessed() {
		return lettersGuessed;
	}

	public void setLettersGuessed(ArrayList<String> lettersGuessed) {
		this.lettersGuessed = lettersGuessed;
	}

	public boolean isDidUserWin() {
		return didUserWin;
	}

	public void setDidUserWin(boolean didUserWin) {
		this.didUserWin = didUserWin;
	}




	public boolean checkForLetter(String letter) {
		// TODO Auto-generated method stub
		letter = letter.toUpperCase();
		lettersGuessed.add(letter);
		if(realWord.indexOf(letter) >= 0) {
	
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < realWord.length(); i++) {
				String toAdd = " _ ";
				sb.append(toAdd);

				for(String c: lettersGuessed) {
					if(realWord.substring(i, i+1).equals(c)){
						toAdd = " " + c + " ";
					}
				}
			}
			
			setCurrentGuess(sb.toString());
			return true;
		}else {
			numberOfGuesses++;
			return false;
		}
		
	}




	public boolean isGameOver() {
		// TODO Auto-generated method stub
		if(percnetOfGuessedUsed() >= 1) {
			return true;
		}else if(!(getCurrentGuess().contains(" _ "))) {
			this.setDidUserWin(true);
			return true;
		}else {
			return false;

		}
	}




	private double percnetOfGuessedUsed() {
		// TODO Auto-generated method stub
		return (double)numberOfGuesses/MAX_GUESS_ALLOWED;
		}
	
	

}
