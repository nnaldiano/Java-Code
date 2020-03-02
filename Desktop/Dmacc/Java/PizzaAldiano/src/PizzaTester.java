
public class PizzaTester {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("mushroom", "large", 9.99);
		/*pizza.setToppings("mushrooms");
		System.out.println(pizza.getToppings());
		pizza.setSize("medium");
		System.out.println(pizza.getSize());
		pizza.setPrice(9.99);
		System.out.println(pizza.getPrice());
		*/
		System.out.println(pizza.repeatOrder());		
		
	}

}
