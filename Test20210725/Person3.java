package day210725;
/*
 * һ��javabean
 * ����˽�е�����
 * ���Զ�Ӧ��get set����
 */
public class Person3 {
	private String name;
	private int sex;//�Ա�0��1Ů
	private int age;
	//��������Ҽ���Source��getter and setters
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setSex(int sex)
	{
		this.sex=sex;
	}
	public int getSex()
	{
		return this.sex;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}

}
