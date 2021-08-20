package day20210820;

import java.util.Scanner;

public class Test2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟用户登录
		int n=3;
		String username="123";
		String userpassword="123";
		
		for(n=3;n>0;)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名");
			String name=sc.nextLine();
			if(name.equals(username))
			{
				System.out.println("请输入密码");
				String password=sc.nextLine();
				if(password.equals(userpassword))
				{
					System.out.println("登录成功");
					break;
				}
				else
				{
					n--;
					System.out.println("密码错误,还有"+n+"次机会");
				}
			}
			else
			{
				n--;
				System.out.println("用户名错误,还有"+n+"次机会");
			}
		}
		
		{
			System.out.println("超过访问次数");
		}
		

	}

}
