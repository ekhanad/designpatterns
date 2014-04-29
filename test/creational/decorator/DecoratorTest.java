package creational.decorator;

import org.junit.Test;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.decorator.Mocha;
import decorator.decorator.Whip;

public class DecoratorTest
{

	@Test
	public void createBeverage()
	{
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " " + beverage.cost());
	}

	@Test
	public void orderWhippedDoubleMocha()
	{
		Beverage beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);

		System.out.println(beverage.getDescription() + " " + beverage.cost());
	}
}
