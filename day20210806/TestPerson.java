package day20210806;

interface ShowMassage//һ����Ҫ���ص�׼��
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
		sm.showLogo("�����Ƶ��ӻ�");
		sm=new PC();
		sm.showLogo("DELL");
		//ʵ���������ķ����ǵ��ò�����
		//ֻ�ܵ��ø������еķ���
	}

}
