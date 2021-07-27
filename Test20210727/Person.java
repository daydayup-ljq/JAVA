package day20210727;


//简单类对象的实例化过程
//1. 在方法区加载Perso.class
//2.在栈中申请空间,申明变量p
//3.在堆内存中开辟空间，分配地址
//4.在对象空间中，对对象的属性进行默认初始化，赋值就显示初始化
//5.调用Person构造方法，先让构造方法进栈,进行初始化
//6.初始化完毕后，将堆内存的地址赋值给引用变量


//子类对象的实例化过程
//Student extends Person
//Student stu=new Student()
//1.先加载Person.class 再Student.class
//2.在栈中申请空间，申明变量stu
//3.在堆内存中开辟空间，分配地址，假设地址是BE3500
//4.并在对象空间中,对对象中的属性(包含父类属性)进行默认初始化
//5.子类的构造函数进栈(public Student(){})
//6.显示初始化父类的属性
//7.父类构造方法进栈，执行完毕出栈
//8.显示初始化子类的属性
//9.初始化完毕后，将堆内存中的地址值赋给引用变量，子类构造方法出栈

public class Person {
	public Person()
	{
		
	}
	int age=1;//默认0
	String name="zhangsan";//默认NULL
	int sex=0;
	
	public void showInfo()
	{
		System.out.println("以下是Person类对方法的重写");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
	
	public void setInfo(int age,int sex,String name)
	{
		this.age=age;
		this.name=name;
		this.sex=sex;
	}

}
