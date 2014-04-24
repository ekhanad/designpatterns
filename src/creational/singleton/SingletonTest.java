package creational.singleton;

import org.junit.Test;

public class SingletonTest
{
	@Test
	public void test()
	{
		System.out.println(SingletonUsingEnum.INSTANCE.toString());
	}
}
