package day20210728;

interface ShowMessage
{
	void showInfo(String s);
}

class TV implements ShowMessage
{
	public void showInfo(String s)
	{
		System.out.println("******");
		System.out.println(s);
		System.out.println("******");
	}
}

class PC implements ShowMessage
{
	public void showInfo(String s)
	{
		System.out.println("@@@@@@");
		System.out.println(s);
		System.out.println("@@@@@@");
	}
}
public class Example {
	public static void main(String[] args)
	{
		ShowMessage sm;
		sm=new TV();
		sm.showInfo("小八嘎电视机");
		
		sm=new PC();
		sm.showInfo("我是尹丰");
	}

}
