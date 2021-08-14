package day20210814;

public class Test2 {
	//打印出一到一百之间含有七或者是七的倍数的数字

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(x=1;x<=100;x++)
		{
			if(x%7==0)
			{
				System.out.println("过"+x);
			}else if(x%10==7 || x/10%10==7)
			{
				System.out.println("过"+x);
			}
		}

	}

}
