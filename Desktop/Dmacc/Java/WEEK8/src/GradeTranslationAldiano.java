import java.util.Scanner;
import java.util.*;

public class GradeTranslationAldiano {
//Array printing returns null//
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of scores: ");
		int i = in.nextInt();
		
		
		int [] score = new int[i];
		for( i = 0; i < score.length; i++  ) {
			System.out.println("Enter a score");
			score[i] = in.nextInt();
		}
		String [] grade = new String[score.length];
		
		System.out.println(Arrays.toString(grade));
		
		in.close();
	}
	public static String[] getGrade(int[]score) {
		int i = score.length;
		String grade[]= new String[i];
		final int GradeA = 90;
		final int GradeB = 80;
		final int GradeC = 70;
		final int GradeD = 60;
		
		for (i = 0; i < score.length; i++) 
		{
		if(score[i] >= GradeA) {
			grade[i] = "A";
			i++;
		}
		else if(score[i] >= GradeB) {
			grade[i] = "B";
			i++;
		}
		else if(score[i] >= GradeC) {
			grade[i] = "C";
			i++;
		}
		else if(score[i] >= GradeD) {
			grade[i] = "D";
			i++;
		}else  { 
			grade[i] = "F";
			i++;
			}
		}
		return grade;
	}
}
