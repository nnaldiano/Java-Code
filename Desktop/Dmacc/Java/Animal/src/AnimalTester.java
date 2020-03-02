
public class AnimalTester {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.setType("dog");
		System.out.println(dog.getType());
		dog.setName("Fido");
		System.out.println(dog.getName());
		dog.setAge(7);
		System.out.println(dog.getAge());
		
		Animal cat = new Animal("cat", "Mittens", 3);
		System.out.println(cat.getType());
		System.out.println(cat.toString());
		cat.gainWeight(15);
		System.out.println(cat.toString());
	}

}
