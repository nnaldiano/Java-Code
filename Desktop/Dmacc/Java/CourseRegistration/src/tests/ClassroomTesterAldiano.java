package tests;
import java.time.LocalTime;

import Model.Classroom;
import Model.Instructor;
import Model.Course;
public class ClassroomTesterAldiano {

	public static void main(String[] args) {
System.out.println("Course Registration\n---------------------------\n");
		
		
		System.out.println("Classrooms\n==========");
		
		System.out.print("Object Name: CompSciLab,  ");
		Classroom compSciLab = new Classroom("Building 8", "17", "Ankeny", "Computer Lab", 25);
		System.out.println(compSciLab);

		System.out.print("Object Name: BioLab,  ");
		Classroom bioLab = new Classroom("Building 3", "28a", "Ankeny", "Science Lab", 22);
		System.out.println(bioLab);
		
		System.out.print("Object Name: LitRoom,  ");
		Classroom litRoom = new Classroom("Building 2", "12", "Urban", "Classroom", 18);
		System.out.println(litRoom);
		
		
		System.out.println();
		
		
		System.out.println("Instructors\n=========");
		
		System.out.print("Object Name: wsmith,  ");
		Instructor wsmith = new Instructor("Wanda", "Smith");
		System.out.println(wsmith);

		System.out.print("Object Name: wfitz,  ");
		Instructor wfitz = new Instructor("Wilma",  "Fitz");
		System.out.println(wfitz);
		
		System.out.print("Object Name: etheo,  ");
		Instructor etheo = new Instructor("Emily", "Theo");
		System.out.println(etheo);
		
		
		System.out.println();
		
		
		System.out.println("Courses\n=======");
		
		System.out.print("Object Name: bio101,  ");
		Course bio101 = new Course("24680", "BIO101",  LocalTime.of(11, 15), LocalTime.of(12, 55), wsmith, bioLab);
		System.out.println(bio101.toString());

		System.out.print("Object Name: cis171,  ");
		Course cis171 = new Course("23456", "CIS171",  LocalTime.of(10, 10), LocalTime.of(12, 20), wfitz, compSciLab);
		System.out.println(cis171.toString());
		
		System.out.print("Object Name: lit105,  ");
		Course lit105 = new Course("29876", "LIT105",  LocalTime.of(15, 15), LocalTime.of(16, 30), etheo, litRoom);
		System.out.println(lit105.toString());

	}
		/*Classroom CompSciLab = new Classroom();
		Classroom BioLab = new Classroom("3","28a","Ankeny","Science Lab", 22);
		Classroom LitRoom = new Classroom("2","12","Urban","Classroom",18);
		
		Instructor wsmith = new Instructor("Wanda", "Smith", "");
		Instructor wfitz = new Instructor("Wilma", "Fitz", "");
		Instructor etheo = new Instructor("Emily", "Theo", "");
		
		Course bio101 = new Course("24680", "BIO101", LocalTime.of(11, 15), LocalTime.of(12,55), wsmith, BioLab);
		Course cis171 = new Course("23456", "CIS171", LocalTime.of(10, 10), LocalTime.of(12, 20), wfitz, CompSciLab);
		Course lit105 = new Course("29876", "LIT105", LocalTime.of(15, 15), LocalTime.of(16, 30), etheo, LitRoom);
		
		
		/*System.out.println(CompSciLab.toString());
		System.out.println(BioLab.toString());
		System.out.println(LitRoom.toString());
		System.out.println(wsmith.toString());
		System.out.println(wfitz.toString());
		System.out.println(etheo.toString());
		
		
		System.out.println(bio101.toString());
		System.out.println(cis171.toString());
		System.out.println(lit105.toString());
		*/
		
	}


