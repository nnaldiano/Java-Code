import java.util.ArrayList;
public class ArrayListExampleAldiano {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Andy");
		names.add("Angela");
		names.add("Dwight");
		names.add("Erin");
		names.add("Jim");
		names.add("Michael");
		names.add("Pam");
		names.add("Toby");
		System.out.println(names);
		System.out.println();
		System.out.println("Names in array:\n" + names.get(0) + ", " + names.get(1) + ", " + names.get(2) + ", " + names.get(3) + 
	    		   ", " + names.get(4) + ", " + names.get(5) + ", " + names.get(6) + ", " + names.get(7));
	    System.out.println();	
	    System.out.println("The size of this array is:\n" + names.size());
	    System.out.println();
	    System.out.println("The last name in this array is:\n" + names.get(names.size() - 1));
	    System.out.println();
	    names.set(0, "Andy Bernard");
	    System.out.println("This is the array list with Andy's new name:\n" + (names));
	    System.out.println();
	    names.add(5, "Kelly");
	    System.out.println("This is the array list with Kelly's name added after Jim:\n" + (names));
	    System.out.println();
	    System.out.print("This is the array list with a loop that prints names:\n");
	    for(Object name : names) {
	    	System.out.print((String) name + " ");
	    }
	    System.out.println();
	    System.out.println();
	    ArrayList<String> names2 = new ArrayList<String> (names);
	    System.out.println("This is the new ArrayList:\n" + (names2));
	    System.out.println();
	    names.remove(0);
	    System.out.println("This is the array list where Andy has been removed from the array list:\n" + (names));
	    System.out.println();
	    System.out.println("Array list Andy wasn't removed, Andy has returned:\n" + (names2));
	    
	    }
}
