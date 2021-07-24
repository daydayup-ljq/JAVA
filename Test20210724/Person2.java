package day24;

public class Person2 {
	int age;
	String name;
	
	public Person2() {
		
	}
	public Person2(int a,String name) {
		age=a;
		this.name=name;//等于号后面的是形参
	
	}
	public Person2(int age)
	{
		this.age=age;
	}

	public void setName(String name)
	{
		this .name =name;
	}
	
	public void setName1(String name)
	{

		this.setName(name);
	}
	
	public void showInfo()
	{
		
		System.out.println("name"+this.name);
		System.out.println("age"+this.age);
	}
}
