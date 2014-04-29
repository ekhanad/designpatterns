package decorator.beverage;

public class HouseBlend extends Beverage
{

	public HouseBlend()
	{
		description = "Espresso";
	}

	@Override
	public double cost()
	{
		return 0.89;
	}
}
