	import javax.swing.JOptionPane;
public class RockPaperScissorsNoahAldiano {
	public static void main(String[] args) {
		String playerONEchoice;		
		playerONEchoice = JOptionPane.showInputDialog("Player 1 enter rock, paper or scissors");
		String PONE = playerONEchoice.toLowerCase();
		
		String playerTWOchoice;
		playerTWOchoice = JOptionPane.showInputDialog("Player 2 enter rock, paper or scissors");
		String PTWO = playerTWOchoice.toLowerCase();
		
		 if ((PONE.equals("rock") && PTWO.equals("rock"))) {
		 
					//(PONE.equals("scissors") && PTWO.equals("scissors"))
					
		        	System.out.println("Who won?\n");
		        	System.out.print("Player 1's choice: " + PONE + "\n");
		        	System.out.print("Player 2's choice: " + PTWO + "\n");
		        	System.out.println();
		        	System.out.println("It's a tie!"); 
		        }
		        if  ((PONE.equals("rock") && PTWO.equals("scissors")) ||
		    		(PONE.equals("paper") && PTWO.equals("rock")) ||
		    		(PONE.equals("scissors") && PTWO.equals("paper")) ||
		    		(PONE.equals("spock") && PTWO.equals("scissors")) ||
		    		(PONE.equals("spock") && PTWO.equals("rock"))) {
		        		System.out.println("Who won?\n");
		        		System.out.print("Player 1's choice: " + PONE + "\n");
		        		System.out.print("Player 2's choice: " + PTWO + "\n");
		        		System.out.println();
		        		System.out.println("Player 1 wins!"); 
		        }
		        
		        // Player 2 wins
		        if ((PTWO.equals("rock") && PONE.equals("lizard")) ||
		            (PTWO.equals("rock") && PONE.equals("scissors")) ||
		        	(PTWO.equals("paper") && PONE.equals("rock")) ||
		        	(PTWO.equals("paper") && PONE.equals("spock")) ||
		        	(PTWO.equals("scissors") && PONE.equals("paper")) ||
		        	(PTWO.equals("scissors") && PONE.equals("lizard")) ||
		        	(PTWO.equals("lizard") && PONE.equals("spock")) ||
		        	(PTWO.equals("lizard") && PONE.equals("paper")) ||
		        	(PTWO.equals("spock") && PONE.equals("scissors")) ||
		        	(PTWO.equals("spock") && PONE.equals("rock"))) {
		        		System.out.println("Who won?\n");
		        		System.out.print("Player 1's choice: " + PONE + "\n");
		        		System.out.print("Player 2's choice: " + PTWO + "\n");
		        		System.out.println();
		        		System.out.println("Player 2 wins!"); 
		        		}	
		 		}
		 	}
		

	

