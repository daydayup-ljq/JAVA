package day20210820;

import java.util.Scanner;

public class Test2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ģ���û���¼
		int n=3;
		String username="123";
		String userpassword="123";
		
		for(n=3;n>0;)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("�������û���");
			String name=sc.nextLine();
			if(name.equals(username))
			{
				System.out.println("����������");
				String password=sc.nextLine();
				if(password.equals(userpassword))
				{
					System.out.println("��¼�ɹ�");
					break;
				}
				else
				{
					n--;
					System.out.println("�������,����"+n+"�λ���");
				}
			}
			else
			{
				n--;
				System.out.println("�û�������,����"+n+"�λ���");
			}
		}
		
		{
			System.out.println("�������ʴ���");
		}
		

	}

}
