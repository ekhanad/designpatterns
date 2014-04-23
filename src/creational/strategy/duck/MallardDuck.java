package creational.strategy.duck;

import creational.strategy.behaviour.FlyWithWings;
import creational.strategy.behaviour.Quack;

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
