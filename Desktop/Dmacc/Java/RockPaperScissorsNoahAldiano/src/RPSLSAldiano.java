import javax.swing.JOptionPane;
public class RPSLSAldiano {
	public static void main(String[] args) {
				
				final int ROCK = 1;
				final int PAPER = 2;
				final int SCISSORS = 3;
				final int LIZARD = 4;
				final int SPOCK = 5;
				Integer winner = null;
		       String player1 = JOptionPane.showInputDialog("Player 1 - Enter 1 for Rock, 2 for Paper, 3 for Scissors,"
		       		+ " 4 for Lizard, or 5 for Spock: ");
		       final int PLAYER_1 = Integer.parseInt(player1);
		       
		       String player2 = JOptionPane.showInputDialog("Player 2 - Type 1 for Rock, 2 for Paper, 3 for Scissors, "
		       		+ "4 for Lizard, or 5 for Spock: ");
		       final int PLAYER_2 = Integer.parseInt(player2);
		       switch (PLAYER_1) {
		          case ROCK: {
		        	  if (PLAYER_2 == PAPER) {
		            	 winner = PLAYER_2;
		             }
		        	  else if (PLAYER_2 == SCISSORS) {
		            	 winner = PLAYER_1;
		             }
		             else if (PLAYER_2 == LIZARD) {
		            	 winner = PLAYER_1;
		             }
		             else if (PLAYER_2 == SPOCK) {
		            	 winner = PLAYER_2;
		             }
		                else {
		                	System.out.println("It's a tie!");
		                }
		             break;
		          }

		          case PAPER: {
		             if (PLAYER_2 == ROCK) {
		                winner = PLAYER_1;
		             }
		             else if (PLAYER_2 == SCISSORS) {
		            	 winner = PLAYER_2;
		             }
		             else if (PLAYER_2 == LIZARD) {
		            	 winner = PLAYER_1;
		             }
		             else if (PLAYER_2 == SPOCK) {
		            	 winner = PLAYER_1;
		             }
		                else {
		                	System.out.println("It's a tie!");
		                }
		             break;
		          }

		          case SCISSORS: {
		              if (PLAYER_2 == ROCK) {
		             	 winner = PLAYER_2;
		              }
		        	  else if (PLAYER_2 == PAPER) {
		            	 winner = PLAYER_1;
		             }
		        	  else if (PLAYER_2 == LIZARD) {
		             	 winner = PLAYER_1;
		              }
		        	  else if (PLAYER_2 == SPOCK) {
		             	 winner = PLAYER_2;
		              }
		                else {
		                	System.out.println("It's a tie!");
		                }
		              break;
		          }
		          
		          case LIZARD: {
		              if (PLAYER_2 == ROCK) {
		             	 winner = PLAYER_2;
		              }
		        	  else if (PLAYER_2 == PAPER) {
		            	 winner = PLAYER_1;
		             }
		        	  else if (PLAYER_2 == SCISSORS) {
		             	 winner = PLAYER_2;
		              }
		        	  else if (PLAYER_2 == SPOCK) {
		             	 winner = PLAYER_1;
		              }
		                else {
		                	System.out.println("It's a tie!");
		                }
		              break;
		          }
		          
		          case SPOCK: {
		              if (PLAYER_2 == ROCK) {
		             	 winner = PLAYER_1;
		              }
		        	  else if (PLAYER_2 == PAPER) {
		            	 winner = PLAYER_2;
		             }
		        	  else if (PLAYER_2 == SCISSORS) {
		             	 winner = PLAYER_1;
		              }
		        	  else if (PLAYER_2 == LIZARD) {
		             	 winner = PLAYER_2;
		              }
		                else {
		                	System.out.println("It's a tie!");
		                }
		          }
		          
		       }

		  
		       System.out.println("***************\n");
		       if (winner == PLAYER_1) {
		   			System.out.println("Player 1 wins!");
		       }
		       else if (winner == PLAYER_2) {
		    	   	System.out.println("Player 2 wins!");
		       }
		          else {
		            System.out.println("It's a tie!");
		          }
		 
		 }
		


	}


