package day20210814;

import java.util.*;

public class Test {
	//���ص���ϰ
	/*public static boolean compare(int a,int b)
	{
		System.out.println("int");
		return a==b;
	}
	
	//short����
	public static boolean compare(short a,short b)
	{
		System.out.println("short");
		return a==b;
	}
	
	//long����
	public static boolean compare(long a,long b)
	{
		System.out.println("long");
		return a==b;
	}
	
	//byte����
	public static boolean compare(byte a,byte b)
	{
		System.out.println("byte");
		return a==b;
	}
	
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(compare(3,2));
		System.out.println(compare((byte)3,(byte) 2));
		System.out.println(compare((short)3,(short) 2));
		System.out.println(compare(3L,2L));*/
		
		//switchʵ�ּ��ʼƻ���
		Scanner sc =new Scanner(System.in);
		int a=1;
		System.out.println("������һ��������");
		while(a!=0)
		{
		int week=sc.nextInt();
		switch(week) {
		case 1:
			System.out.println("�ܲ�");
			break ;
		case 2:
			System.out.println("��Ӿ");
			break ;
		case 3:
			System.out.println("���е���");
			break ;
		case 4:
			System.out.println("���Գ�");
			break ;
		case 5:
			System.out.println("��������");
			break ;
		case 6:
			System.out.println("���");
			break ;
		case 7:
			System.out.println("�úó�һ��");
			break ;
			
			default:
			System.out.println("���������������");
		}
		}
	}

}
