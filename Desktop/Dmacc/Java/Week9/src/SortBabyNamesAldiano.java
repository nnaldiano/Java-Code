import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
public class SortBabyNamesAldiano {

	public static void main(String[] args) throws IOException {
		try 
		{
		String address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2015.txt";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		
		PrintWriter GirlNames = new PrintWriter("girlNames.txt");
		PrintWriter BoyNames = new PrintWriter("boyNames.txt");
		String Value = " ";
		
		while (in.hasNextLine()) {
			Value = in.nextLine();
			if(Value.contains("girl")) {
				GirlNames.println(Value);
			}
			if(Value.contains("boy")) {
				BoyNames.println(Value);
			}
			}
		
		in.close();
		GirlNames.close();
		BoyNames.close();
		}catch(IOException e) {
			System.out.println("File was not found");
		}
		
		
	}

}
