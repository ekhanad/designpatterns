package behavioural.strategy;

import org.junit.Test;

import behavioural.strategy.behaviour.FlyNoWay;
import behavioural.strategy.behaviour.Squeak;
import behavioural.strategy.duck.Duck;
import behavioural.strategy.duck.MallardDuck;

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
