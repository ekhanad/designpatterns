package creational.strategy.duck;

import creational.strategy.behaviour.FlyBehaviour;
import creational.strategy.behaviour.QuackBehaviour;

public abstract class Duck
{
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;

	public abstract void display();

	public void performQuack()
	{
		quackBehaviour.quack();
	}

	public void performFly()
	{
		flyBehaviour.fly();
	}

	public void setFlyBehaviour(FlyBehaviour behaviour)
	{
		flyBehaviour = behaviour;
	}

	public void setQuakBehaviour(QuackBehaviour behaviour)
	{
		quackBehaviour = behaviour;
	}

}