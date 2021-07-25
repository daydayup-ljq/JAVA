package day210725;

//把共性的东西抽出来形成父类
//实际需求的子类在继承父类的基础上写自己的特有代码即可
//不要只是为了使用某个属性而去继承比如狗和人都可以有姓名，但是不可以继承
//需要动物类，需要逻辑关系，不能随意继承
//一个子类只能有一个父类，不能多继承，可以多层继承
public class Student extends Person{
	String school;
	
	public void showInfo()
	{
		System.out.println(this.age);
		System.out.println(this.school);
		System.out.println(this.name);
		System.out.println(this.sex);
	}

}
