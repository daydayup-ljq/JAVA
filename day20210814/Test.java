package day20210814;

import java.util.*;

public class Test {
	//重载的练习
	/*public static boolean compare(int a,int b)
	{
		System.out.println("int");
		return a==b;
	}
	
	//short类型
	public static boolean compare(short a,short b)
	{
		System.out.println("short");
		return a==b;
	}
	
	//long类型
	public static boolean compare(long a,long b)
	{
		System.out.println("long");
		return a==b;
	}
	
	//byte类型
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
		
		//switch实现减肥计划表
		Scanner sc =new Scanner(System.in);
		int a=1;
		System.out.println("请输入一个星期数");
		while(a!=0)
		{
		int week=sc.nextInt();
		switch(week) {
		case 1:
			System.out.println("跑步");
			break ;
		case 2:
			System.out.println("游泳");
			break ;
		case 3:
			System.out.println("动感单车");
			break ;
		case 4:
			System.out.println("俯卧撑");
			break ;
		case 5:
			System.out.println("仰卧起坐");
			break ;
		case 6:
			System.out.println("深蹲");
			break ;
		case 7:
			System.out.println("好好吃一顿");
			break ;
			
			default:
			System.out.println("你输入的日期有误");
		}
		}
	}

}
