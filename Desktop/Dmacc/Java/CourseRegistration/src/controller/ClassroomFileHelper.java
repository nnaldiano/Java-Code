package controller;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Classroom;

public class ClassroomFileHelper implements FileHelper {

	String nameOfFile = "classrooms.txt";
	File classroomList = new File(nameOfFile);

	@Override
	public boolean doesAFileExist() {
		if (classroomList.exists()) {
			return true;
		} else {
			return false;
		}
	}
@Override
	public ArrayList<?> readFile() {
		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();

		Scanner fileIn;
		try {
			fileIn = new Scanner(classroomList);

			while (fileIn.hasNextLine()){
				String value = fileIn.nextLine();
				String[] parts = value.split(",");
				
				
				
				Classroom currentClassroom = new Classroom(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4])); 
				allClassroom.add(currentClassroom);
			}
			fileIn.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
		return allClassroom;

	}

	@Override public boolean writeFile(ArrayList<?> list) {
		ArrayList<Classroom> classroomToWrite = (ArrayList<Classroom>)(list);
		
		try {
				PrintWriter classroomFile = new PrintWriter(nameOfFile);
				for(Classroom c: classroomToWrite){
					StringBuilder sb = new StringBuilder();
					sb.append(c.getBuilding() + "|" +c.getRoomNumber() + "|" + c.getCampus() + "|" + c.getType() + "|" + c.getCapacity());
					classroomFile.println(sb.toString());
			}
				classroomFile.close();
				
		} catch (FileNotFoundException e) {
			return false;
		} 
		return true;
	}
	

}
