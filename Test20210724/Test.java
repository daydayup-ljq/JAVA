package day24;

class T1
{
	//默认的构造方法
	T1(){}
}

public class Test {
	public static void main(String[] args)
	{
		//默认的构造方法前面有没有访问的修饰符跟定义的类有关
		//类是public的，默认构造方法就是public
		//public Test() {}
		//Test test=new Test();//new出来的对象，就是调用public Test() {};
		//无论它写还是不写它都是存在的
		
		//父类的构造器不可被子类继承
		/*Person per=new Person(2,"zhangsan");
		per.inFo();
		per.age=6;
		per.name="lisi";
		per.inFo();*/
		
		Person1 per1=new Person1(20,"liuwu");
		System.out.println(per1.age);
		
		Point po=new Point(1,2,3);
		po.setPoint(1, 2, 3);
		
		
		
		
		//构造器的重载
		new Person1();
		new Person1(1);
		new Person1("name");
		//为了创建出不同需求的对象
		//重载的多个创造方法实际上相当于提供了多个创造的模板
		
		//this 关键字(当前对象)
	}
	

}
