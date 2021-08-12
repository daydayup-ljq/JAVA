package day20210812;

import java.util.Random;

public class Test {

	public static void main(String args[])
	{
		
		Random ran =new Random();
		
		//System.out.println(ran.nextBoolean());
		//System.out.println(ran.nextDouble());//0-1之间的随机数
		System.out.println(ran.nextInt(5));//0-50的随机数
		System.out.println(ran.nextInt(5));
		System.out.println("............................");
	
		
		Random ran1 =new Random(5);//给了种子之后就不随机了
        System.out.println(ran1.nextInt(5));
        System.out.println(ran1.nextInt(5));
       
		
		
	}
}
