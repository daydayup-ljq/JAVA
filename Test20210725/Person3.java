package day210725;
/*
 * 一个javabean
 * 含有私有的属性
 * 属性对应的get set方法
 */
public class Person3 {
	private String name;
	private int sex;//性别，0男1女
	private int age;
	//或者鼠标右键，Source，getter and setters
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
