package day20210727;


//��������ʵ��������
//1. �ڷ���������Perso.class
//2.��ջ������ռ�,��������p
//3.�ڶ��ڴ��п��ٿռ䣬�����ַ
//4.�ڶ���ռ��У��Զ�������Խ���Ĭ�ϳ�ʼ������ֵ����ʾ��ʼ��
//5.����Person���췽�������ù��췽����ջ,���г�ʼ��
//6.��ʼ����Ϻ󣬽����ڴ�ĵ�ַ��ֵ�����ñ���


//��������ʵ��������
//Student extends Person
//Student stu=new Student()
//1.�ȼ���Person.class ��Student.class
//2.��ջ������ռ䣬��������stu
//3.�ڶ��ڴ��п��ٿռ䣬�����ַ�������ַ��BE3500
//4.���ڶ���ռ���,�Զ����е�����(������������)����Ĭ�ϳ�ʼ��
//5.����Ĺ��캯����ջ(public Student(){})
//6.��ʾ��ʼ�����������
//7.���๹�췽����ջ��ִ����ϳ�ջ
//8.��ʾ��ʼ�����������
//9.��ʼ����Ϻ󣬽����ڴ��еĵ�ֵַ�������ñ��������๹�췽����ջ

public class Person {
	public Person()
	{
		
	}
	int age=1;//Ĭ��0
	String name="zhangsan";//Ĭ��NULL
	int sex=0;
	
	public void showInfo()
	{
		System.out.println("������Person��Է�������д");
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
