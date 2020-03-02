import java.util.Random;
import java.util.Scanner;
public class RPSMOD {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a '1' for rock, '2' for paper, '3' for scissors, '4' for lizard and '5' for spock.");
		int PlayerOne = scanner.nextInt();
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(5) + 1;
		int PlayerTwo = randomInt;
		
		System.out.println(whoWins(PlayerOne, PlayerTwo));
		
		scanner.close();
		
		}
	public static String whoWins(int PlayerOne, int PlayerTwo) {
		
		String winner = " ";
		if(PlayerOne == PlayerTwo) {
			winner = "It's a tie!";
		}else if(PlayerOne == 3 && PlayerTwo == 2){ 
			winner = "Player one wins!";
		}else if(PlayerOne == 2 && PlayerTwo == 1) {  
			winner = "Player one wins!";
		}else if (PlayerOne == 1 && PlayerTwo == 4) {  
			winner = "Player one wins!";
		}else if (PlayerOne == 4 && PlayerTwo == 5) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 5 && PlayerTwo == 3) { 
			winner = "Player one wins!";
		}else if(PlayerOne == 3 && PlayerTwo == 4) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 4 && PlayerTwo == 2) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 2 && PlayerTwo == 5) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 5 && PlayerTwo == 1) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 1 && PlayerTwo == 3) {  
			winner = "Player one wins!";
		}else if(PlayerOne == 2 && PlayerTwo == 3) {
			winner = "Player two wins!";
		}else if(PlayerOne == 1 && PlayerTwo == 2) {
			winner = "Player two wins!";
		}else if(PlayerOne == 4 && PlayerTwo == 1) {
			winner = "Player two wins!";
		}else if(PlayerOne == 5 && PlayerTwo == 4) {
			winner = "Player two wins!";
		}else if(PlayerOne == 3 && PlayerTwo == 5) {
			winner ="Player two wins!";
		}else if(PlayerOne == 4 && PlayerTwo == 3) {
			winner = "Player two wins!";
		}else if(PlayerOne == 2 && PlayerTwo == 4) { 
			winner = "Player two wins!";
		}else if(PlayerOne == 5 && PlayerTwo == 2) {
			winner = "Player two wins!";
		}else if(PlayerOne == 1 && PlayerTwo == 5) {
			winner = "Player two wins!";
		}else if(PlayerOne == 3 && PlayerTwo == 1) {
			winner = "Player two wins!";
		}
		return winner;
	}

	
}
