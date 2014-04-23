package creational.builder;


public class Main
{

	public static void main(String[] args)
	{

		User user = new User.UserBuilder("mango", "tango").age(5)
				.phone("46707213").address("adv").build();

		System.out.println(user);
	}

}
