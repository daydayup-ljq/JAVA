package day20210727;

public class Student extends Person{
	String school;
	int age;//不对父类覆盖
	public void showInfo()
	{
		System.out.println("以下是student类对方法的重写");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
	
	public static void main(String[] args)
	{
		Person e=new Person();//父类的引用可以指向子类的实例
		Student s=new Student();
		Person p=new Person();
		p=new Student();
		//当前p引用的是Student对象
		
		
		
		//虚拟方法调用
		p.showInfo();
	   e.showInfo();
	
	}

}
