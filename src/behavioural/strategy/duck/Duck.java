package behavioural.strategy.duck;

import behavioural.strategy.behaviour.FlyBehaviour;
import behavioural.strategy.behaviour.QuackBehaviour;

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