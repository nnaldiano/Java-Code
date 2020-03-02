
public class Biycyle {
	private int height;
	public String model;
	private int wheels;
	
	public Biycyle(){
		this.height = 28;
		this.model = "Capital";
		this.wheels = 2;
		System.out.println("Hello");
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
