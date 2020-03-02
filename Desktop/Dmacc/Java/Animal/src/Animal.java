
public class Animal {
	private String type;
	private String name;
	public Animal(String type, String name, int age) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
	}
	private double weight;
	private int age;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String type, String name, double weight, int age) {
		super();
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
	public void gainWeight(double weightGain) {
		this.weight = this.weight + weightGain;
	}
	
	public void haveBirthday() {
		this.age++;
	}

}
