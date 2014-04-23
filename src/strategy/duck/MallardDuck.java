package strategy.duck;

import strategy.behaviour.FlyWithWings;
import strategy.behaviour.Quack;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I am a MallardDuck");
	}
}
