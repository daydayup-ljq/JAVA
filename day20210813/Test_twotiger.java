package day20210813;

import java.util.Random;
import java.util.Scanner;

public class Test_twotiger {

	public static void main(String[] args) {
		//三元运算符
//		int weight1=200;
//		int weight2=200;
//		
//		boolean b=weight2==weight1?true:false;
//		System.out.println(b);
//		
//		
//		int h1=150;
//		int h2=210;
//		int h3=165;
//		int temp=h1>h2?h1:h2;
//		int max=h3>temp?h3:temp;
//		System.out.println(max);
		
		//数据输入--scanner
		//创建对象
	//	Scanner sc= new Scanner(System.in);
		
		//接收数据
	//	int x=sc.nextInt();
		
		//输出数据
	//	System.out.println("x:" + x);
		
		
		//for循环
		/*for (int i=100;i<=999;i++)
		{
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i)
			{
				System.out.println("水仙花树是:"+i);
			}
		}
		*/
		
		
		//while循环
		
		/*double paper=0.1;
		int count=0;
		while(paper<8844430)
		{
			paper=paper*2;
			count++;
		}
		
		System.out.println(count);
		
		*/
		
		//用radom实现猜数字游戏
		
		/*Random r=new Random();
		int number =r.nextInt(100)+1;
		
		while(true)
			
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入你要猜的数字:");
			
			int guessNumber=sc.nextInt();
			
			if(guessNumber>number)
			{
				System.out.println("你猜的数字" + guessNumber +"大了" );
			}
			else if(guessNumber<number)
			{
				System.out.println("你猜的数字" + guessNumber +"小了" );
			}else if(guessNumber==number)
			{
				System.out.println("恭喜你" + guessNumber +"猜对了" );
				break;
			}
		}
	*/
		
		
		//数组常见的两个小问题
		//遍历
		/*int[]arr= {11,22,33,44,55};
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
		
		
		
		 
*/
		
		//带参数方法练习
		
		//getMax(10,20);
		
		//方法重载练习
		
		
	}
	/*public static void getMax(int a,int b)
	{
		if(a>b)
		{
			System.out.println("较大值是"+a);
		}else
		{
			System.out.println("较大值是"+b);
		}
	}*/
	
	
}
