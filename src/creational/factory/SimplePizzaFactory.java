package creational.factory;

import creational.factory.pizza.CheesePizza;
import creational.factory.pizza.ClamPizza;
import creational.factory.pizza.PepperoniPizza;
import creational.factory.pizza.Pizza;
import creational.factory.pizza.VeggiePizza;

public class SimplePizzaFactory
{

	public static void main(String[] args)
	{

	}

	Pizza pizza = null;

	public Pizza createPizza(String type)
	{
		if (type.equals("cheese"))
		{
			pizza = new CheesePizza();
		}
		else if (type.equals("pepperoni"))
		{
			pizza = new PepperoniPizza();
		}
		else if (type.equals("clam"))
		{
			pizza = new ClamPizza();
		}
		else if (type.equals("veggie"))
		{
			pizza = new VeggiePizza();
		}

		return pizza;
	}

}
