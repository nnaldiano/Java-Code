
public class PizzaTesterAldiano implements PizzaConstants {

	public static void main(String[] args) {
		System.out.println("Welcome to " + COMPANY);
		System.out.println(PizzaConstants.getSpecial());
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		Pizza mikePizza = Pizza.quickOrder("Mushroom");
		//Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		System.out.println(myPizza.repeatOrder());
		System.out.println(yourPizza.repeatOrder());
		System.out.println("Mike's pizza: " + mikePizza.repeatOrder());
		//System.out.println(thirdPizza.repeatOrder());
	}
}
