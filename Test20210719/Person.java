package java_pro;

public class Person {
	int age;
	String name;
	char sex;
	
	void study()
	{
		System.out.println("studying");
	}

	void showAge()
	{
		System.out.println("age is "+age);
	}
	
	public void addAge(int i)
	{
		age+=i;
	}
}
