package day20210820;

public class Student {
	String name;
	private int age;
	

	public int getAge() {
		
			return age;
		
		
	}


	public void setAge(int age) {
		
		if(age>120||age<0)
		{
			System.out.println("��������");
		}
		else
		{
			this.age = age;
		}
		}
	


	public void show()
	{
		System.out.println("������"+name+"������"+age);
	}

}
