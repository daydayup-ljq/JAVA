package day24;

public class Person {
	/*
	 * ��������˹��췽��,�ͻ�ʹ����ʾ�Ĺ��죬����ʹ��Ĭ�Ϲ���
	 */
	/*public Person()
	{
		age=1;
		name="angsan";
	}*/
	//����д�������Ĺ��췽��
	public Person(int a,String n)
	{
		age=a;
		name=n;
	}
	
	public int age;
	public String name;
	public void inFo()
	{
		System.out.println(age);
		System.out.println(name);
	}

}
