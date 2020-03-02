	import javax.swing.JOptionPane;
public class RockPaperScissorsNoahAldiano2 {
	public static void main(String[] args) {
				String player1Choice;
				player1Choice = JOptionPane.showInputDialog("Player 1 enter a choice of rock, paper, scissors, lizard, or Spock");
				String player1 = player1Choice.toLowerCase();
				String player2Choice;
				player2Choice = JOptionPane.showInputDialog("Player 2 enter a choice of rock, paper, scissors, lizard, or Spock");
				String player2 = player2Choice.toLowerCase();
		        if ((player1.equals("rock") && player2.equals("rock")) ||
		        	(player1.equals("paper") && player2.equals("paper")) ||
					(player1.equals("scissors") && player2.equals("scissors"))) {
		        	System.out.println("Who won?\n");
		        	System.out.print("Player 1's choice: " + player1 + "\n");
		        	System.out.print("Player 2's choice: " + player2 + "\n");
		        	System.out.println();
		        	System.out.println("It's a tie!"); 
		        }
		        if  ((player1.equals("rock") && player2.equals("scissors")) ||
		    		(player1.equals("paper") && player2.equals("rock")) ||
		    		(player1.equals("scissors") && player2.equals("paper"))) {
		        		System.out.println("Who won?\n");
		        		System.out.print("Player 1's choice: " + player1 + "\n");
		        		System.out.print("Player 2's choice: " + player2 + "\n");
		        		System.out.println();
		        		System.out.println("Player 1 wins!"); 
		        }
		        if ((player2.equals("rock") && player1.equals("scissors")) ||
		        	(player2.equals("paper") && player1.equals("rock")) ||
		        	(player2.equals("scissors") && player1.equals("paper"))) {
		        		System.out.println("Who won?\n");
		        		System.out.print("Player 1's choice: " + player1 + "\n");
		        		System.out.print("Player 2's choice: " + player2 + "\n");
		        		System.out.println();
		        		System.out.println("Player 2 wins!"); 
		         }   
		    }
	
	}


