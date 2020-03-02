import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
	
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(1);
		int count = 0;
		for(int i = 0; i < num.size(); i++) 
		{
			if (num.get(i) % 2 == 0) {
				count++;
			}
		}
				System.out.print(count);
		
		
	}
}
