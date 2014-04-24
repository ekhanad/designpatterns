package creational.singleton;

public class SingletonUsingFactoryMethod
{

	private static final SingletonUsingFactoryMethod INSTANCE = new SingletonUsingFactoryMethod();

	private SingletonUsingFactoryMethod()
	{

	}

	public static SingletonUsingFactoryMethod getInstance()
	{
		return INSTANCE;
	}
}
