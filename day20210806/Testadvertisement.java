package day20210806;
//�ӿڻص�
class AdBoard
{
	public void show(Advertisement adver)
	{
		System.out.println("�������ʾ"+adver.getCorpName()+"��˾�Ĺ���:");
		adver.showAdvertisement();
	}
}

interface Advertisement
{
	public void showAdvertisement();
	public String getCorpName();
}

class FeiLipu implements Advertisement
{

	@Override
	public void showAdvertisement() {
		// TODO Auto-generated method stub
		System.out.println("******");
		System.out.println("feifeifei");
		System.out.println("******");
	}

	@Override
	public String getCorpName() {
		// TODO Auto-generated method stub
		return "������";
	}
	
}

class LianXiang implements Advertisement
{

	@Override
	public void showAdvertisement() {
		// TODO Auto-generated method stub
		System.out.println("@@@@@@");
		System.out.println("world become small");
		System.out.println("@@@@@@");
	}

	@Override
	public String getCorpName() {
		// TODO Auto-generated method stub
		return "����";
	}
	
}
public class Testadvertisement {
	public static void main(String args[])
	{
		AdBoard ab=new AdBoard();
		ab.show(new FeiLipu());
		ab.show(new LianXiang());
	}

}
