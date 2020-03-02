
public class BreakandContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 3) {
				break; 
// if a "continue;" was here then the for loop would stop
// and start a new iteration skipping 3 
			}
			System.out.println(i);
		}
		System.out.println("End of run");
	}

}
