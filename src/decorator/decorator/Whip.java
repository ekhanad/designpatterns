package decorator.decorator;

import decorator.beverage.Beverage;

public class Whip extends Beverage
{

	Beverage beverage;

	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost()
	{
		return 1.0 + beverage.cost();
	}
}
