package day20210806;

interface Singer
{
	void sing();
}

interface Painter
{
	void paint();
}

class Student implements Painter
{

	@Override
		// TODO Auto-generated method stub
		public void paint()
		{
			System.out.println("Student is paintting");
		}
	
	public void study()
	{
		System.out.println("Student is studying");
	}
	
}

class Teacher implements Painter,Singer
{

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Teacher is singing");
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Teacher is painting");
	}
	
}
public class Teststudent {

	public static void main(String args[])
	{
		Painter s1=new Student();
		s1.paint();
		
		Painter s2=new Teacher();
		s2.paint();
		
		Singer s=(Singer)s2;//sÒ²Ö¸Ïòteacher
		s.sing();
	}
}
