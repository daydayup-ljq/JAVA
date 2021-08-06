package day20210806;
//接口回调
class AdBoard
{
	public void show(Advertisement adver)
	{
		System.out.println("广告牌显示"+adver.getCorpName()+"公司的广告词:");
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
		return "飞利浦";
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
		return "联想";
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
