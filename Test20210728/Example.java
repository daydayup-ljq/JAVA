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
		sm.showInfo("С�˸µ��ӻ�");
		
		sm=new PC();
		sm.showInfo("��������");
	}

}
