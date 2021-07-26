package day20210726;

public class Student extends Person {
	String classroom;
	
//	public void showInfo()
//	{
//		System.out.println(this.age);
//		System.out.println(this.sex);
//		System.out.println(this.name);
//		System.out.println(this.classroom);
//	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("以下是student类对Person类的showInfo方法重写");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
	
	@Override
	public void setInfo(int age, int sex, String name) {
		// TODO Auto-generated method stub
//		super.setInfo(age, sex, name);
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(sex);
	}
	
	public static void main(String[] args)
	{
		//重载指的是一个类可以有多个同名方法
		//重写指的是子类可以重新写父类的方法,覆盖父类的方法
		//子类不能访问父类私有的东西
		Student stu=new Student();
		stu.showInfo();
	}
}
