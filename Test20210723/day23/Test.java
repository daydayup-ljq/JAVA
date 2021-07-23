package day23;
//不同包下可以重名
public class Test {
	public static void main(String[]args)
	{
		Person p=new Person();
		p.setAge(18);
		int age=p.getAge();
		System.out.println("年龄是"+age);
	}

}
