package day23;

public class Person2 {
	private int age;//本类内部使用
	
	private void getAge()
	{
		
	}
	
	public void setAge()//全局可以使用
	{
		
	}
	
	void getName()//类内部和同一个包可以使用
	{
		
	}
	
	protected void age()//类内部，同一个包，子类可以使用
	{
		
	}

	//public>protected>default>private
}
