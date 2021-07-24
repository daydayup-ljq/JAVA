package day24;

public class Person {
	/*
	 * 如果定义了构造方法,就会使用显示的构造，不会使用默认构造
	 */
	/*public Person()
	{
		age=1;
		name="angsan";
	}*/
	//可以写带参数的构造方法
	public Person(int a,String n)
	{
		age=a;
		name=n;
	}
	
	public int age;
	public String name;
	public void inFo()
	{
		System.out.println(age);
		System.out.println(name);
	}

}
