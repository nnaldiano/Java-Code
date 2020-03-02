package view;

import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.TheWord;

public class GamePanel extends JPanel {
	
	private JLabel gameTitle = new JLabel("Guess the word!");
	private JLabel instructionsLabel = new JLabel ("Enter a letter");
	private JTextField letterGuess = new JTextField(10);
	private JLabel wordLabel = new JLabel("        Word:      ");
	private JLabel currentGuessLabel = new JLabel(" ");
	
	private JButton submit = new JButton("Submit Letter");
	private JButton newWord = new JButton("Get a New Word");
	
	TheWord currentWord = new TheWord();
	
	
	
	public GamePanel() {
		add(gameTitle);
		add(instructionsLabel);
		add(letterGuess);
		add(wordLabel);
		currentGuessLabel.setText(currentWord.getCurrentGuess());
		add(currentGuessLabel);
		add(submit);
		add(newWord);
		
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
		
		NewWordButtonListener nwbl = new NewWordButtonListener();
		newWord.addActionListener(nwbl);
		
		
		
	}
	class SubmitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String userGuess = letterGuess.getText();
			boolean success = currentWord.checkForLetter(userGuess);
			currentGuessLabel.setText(currentWord.getCurrentGuess());
			letterGuess.setText("");
			if(currentWord.isGameOver()) {
				
			}
			
	
	
		}
	}
	
	class NewWordButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			currentWord = new TheWord();
			currentGuessLabel.setText(currentWord.getCurrentGuess());
			submit.setEnabled(true);
		}
		
	}
}
		
	
	

