package creational.factory;

import org.junit.Test;

import creational.factory.pizza.ClamPizza;
import creational.factory.pizza.Pizza;
import creational.factory.store.NYStylePizzaStore;
import creational.factory.store.PizzaStore;

public class FactoryTest
{

	@Test
	public void createPizza()
	{
		Pizza pizza = new ClamPizza();
	}

	@Test
	public void createPizzaStore()
	{
		new NYStylePizzaStore().orderPizza("veggie");
	}

	@Test
	public void orderPizza()
	{
		PizzaStore pizzaStore = new NYStylePizzaStore();
		pizzaStore.orderPizza("cheese");
	}
}
