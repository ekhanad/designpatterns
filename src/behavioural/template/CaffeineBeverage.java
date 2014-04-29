package behavioural.template;

public abstract class CaffeineBeverage
{

	void prepareBeverage()
	{
		boilWater();
		pourBeverage();
		addCondiments();
	}

	private void boilWater()
	{
		System.out.println("Boiling Water");
	}

	private void pourBeverage()
	{
		System.out.println("Pouring Beverage");
	}

	protected abstract void addCondiments();

}
