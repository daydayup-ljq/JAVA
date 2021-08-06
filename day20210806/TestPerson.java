package day20210806;

interface ShowMassage//一个需要遵守的准则
{
	void showLogo(String s);
}
class TV implements ShowMassage
{
	public void showLogo(String s)
	{
		System.out.println("******");
		System.out.println(s);
		System.out.println("******");
	}
}

class PC implements ShowMassage
{
	public void showLogo(String s)
	{
		System.out.println("@@@@@@");
		System.out.println(s);
		System.out.println("@@@@@@");
	}
	
	public void PrintIn()
	{
		
	}
}



public class TestPerson {
	public static void main(String args[])
	{
		ShowMassage sm;
		sm=new TV();
		sm.showLogo("长城牌电视机");
		sm=new PC();
		sm.showLogo("DELL");
		//实现类新增的方法是调用不到的
		//只能调用父类已有的方法
	}

}
