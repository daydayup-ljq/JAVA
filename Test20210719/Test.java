package java_pro;

public class Test {
	
	
	public static void main(String[] args)//标这个static类的方法只能访问static类的变量
	{
		/*public String name="zhangsan";
		private int age;
		//private,私有，可以在本类的方法中使用，不能在类的外部使用
		//修饰符可以修饰一个变量是公有地还是私有的
		//私有的类变量不可以通过对象.属性的方法调用
		
		public static String sex="男";//静态，可以直接使用，不需要类实例化成对象就可以使用
		
		public void showAge() {
			System.out.println(age);
		}*/

		
		
		//类只有一个，但是通过类实例化出来的对象可以有多个，每个对象独立，互不干扰
		
		/*Student stu=new Student();
		stu.age=18;
		stu.name="xiaoming";
		stu.showInfo();*/
		
		/*Test t=new Test();
		int area=t.getArea(2,3);
		System.out.println(area);
//方法中只能调用方法
	}
	public int getArea(int x,int y)
	{
		return x+y;
	}*/
		
		
		//当一个对象被创建的时候，会自动赋值
		//String 是null
		//blooen 是 false
		//Student stu=new Student();
		//stu.showInfo();
		//匿名对象
		//对一个对象只一次调用；
		//new Student().showInfo();//只能使用一次
		
		/*Person per=new Person();
		per.age=18;
		per.name="xiaoming";
		per.sex='f';
		per.showAge();
		per.addAge(2);
		per.showAge();*/
		
		double area=new Circle().area(2);//匿名函数做参数
		System.out.println(area);
		
		
		
		
		
	}
	
}
