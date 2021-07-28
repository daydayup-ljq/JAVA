package day20210728;


interface Computer{
	public static final int MAX=100;
	public abstract int f(int x);
}

 class China implements Computer{
	int number;
	//一旦一个类实现了一个接口的话，就要把接口的所有方法拿出来重写
	//这样以后就可以调用

	@Override
	public int f(int x) {
		// TODO Auto-generated method stub
		return x+46;
	}
	
}
public class Test {
	// instanceof 关键字
	// x instanceod A:
	//检测x是否为类A的对象，返回值为boolean型
	
	//Object类
	//是所有Java类的根父类
	//如果在类的声明中没有使用extends关键字指明其父类,则默认父类为Object类
	
	/*
	 * 问题,想给test方法设置一个形参参数,这个参数我不确定到底会传进来一个什么类
	 * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型?
	 */
	/*public void test(Object obj)
	{
		
	}*/
	
	public static void main(String[] args)
	{
		/*Test t=new Test();
		Person p=new Person();
		Student s=new Student();
		t.test(p);
		t.test(s);
		t.test(new Kids());
		
		Person e=new Person();//变量名在栈上,new出来的空间在堆上
		e=p;
		System.out.println(p.equals(e));//为什么p对象可以执行object的方法
		//object是所有类的父类，子类可以使用父类的方法
		
		Object o=new Object();
		System.out.println(o.hashCode());
		
		Object pp=new Person();//父类实例可以接受任何子类对象*/
		
		//接口,一种特殊的抽象类
		//只包含常量和方法定义,没有变量和方法的实现
		//final:定义常量，要赋值
		//
		
		China zhong;
		zhong=new China();
		zhong.number=28+Computer.MAX;
		System.out.println(zhong.number+" "+zhong.f(100));
	}

}
