package decorator.beverage;

public class Decaf extends Beverage
{

	public Decaf()
	{
		description = "DarkRoast";
	}

	@Override
	public double cost()
	{
		return 1.5;
	}

}
