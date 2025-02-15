package WebScrappertest;
import java.net.*;
import java.io.*;


public class Desktop {
	public static void main(String[] args) {
		String output = getUrlContents("https://www.google.com/");
		System.out.println(output);
	}
	private static String getUrlContents(String theUrl) {
		StringBuilder content = new StringBuilder();
		try
		{
			//creates the URL 
			URL url = new URL(theUrl);
			
			//creates a URL connection object 
			URLConnection urlConnection = url.openConnection();
			
			//wraps the URL connection in a bufferedreader
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;
			
			//read from the URL connection via the bufferedreader
			while((line = bufferedReader.readLine())!= null) {
				content.append(line + "\n");
			}
			bufferedReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}
}
