package day23;

public class Person {
	//public int age;//把类开发出来让调用者随便使用就会出问题
	//需要对不能随意使用的属性做封装和隐藏
	private int age;//封装隐藏
	
	
public int getAge()
{
	return age;
}
	
	public void setAge(int a)
	{
		if (a<=150&&a>=0)
		{
			age=a;
			
			System.out.println("年龄是"+age);
		}
		else
		{
			System.out.println("你脑子抽抽了");
		}
	}

}
