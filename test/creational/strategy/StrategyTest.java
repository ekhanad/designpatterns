package creational.strategy;

import org.junit.Test;

import creational.strategy.behaviour.FlyNoWay;
import creational.strategy.behaviour.Squeak;
import creational.strategy.duck.Duck;
import creational.strategy.duck.MallardDuck;

public class StrategyTest
{

	@Test
	public void test()
	{
		Duck duck = new MallardDuck();
		duck.performQuack();
		duck.performFly();
	}

	@Test
	public void changeFlyBehaviourDynamically()
	{
		Duck duck = new MallardDuck();
		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
	}

	@Test
	public void changeQuackBehaviourDynamically()
	{
		Duck duck = new MallardDuck();
		duck.setQuakBehaviour(new Squeak());
		duck.performQuack();
	}

}
