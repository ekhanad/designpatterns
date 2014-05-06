package creational.factory.store;

import creational.factory.pizza.ClamPizza;
import creational.factory.pizza.NYStyleCheesePizza;
import creational.factory.pizza.PepperoniPizza;
import creational.factory.pizza.Pizza;
import creational.factory.pizza.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore
{

	@Override
	Pizza createPizza(String type)
	{
		if (type.equals("cheese"))
		{
			return new NYStyleCheesePizza();
		}
		else if (type.equals("pepperoni"))
		{
			return new PepperoniPizza();
		}
		else if (type.equals("clam"))
		{
			return new ClamPizza();
		}
		else if (type.equals("veggie"))
		{
			return new VeggiePizza();
		}
		return null;
	}

}
