package day20210807;

class RedCowForm
{
	String formname;
	RedCow cow;
	RedCowForm(){
		
	}
	RedCowForm(String s)
	{
		cow=new RedCow(150,112,5000);
		formname=s;
	}
	public void showCowMess()
	{
		cow.speak();
	
	}
	class RedCow
	{
		String cowName="��ţ";
		int height,weight,price;
		RedCow(int h,int w,int p)
		{
			this.height=h;
			this.weight=w;
			this.price=p;
		}
		
		void speak()
		{
			System.out.println("����"+cowName+",���"+height+",����:"+weight+",������"+formname);
		}
	}
}


public class Example {
	public static void main(String args[])
	{
		RedCowForm form=new RedCowForm("��ţũ��");
		form.showCowMess();
		form.cow.speak();
		
		
	}

}
