package day0919;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    //Q1();
		//Q2();
		//Q3();
		Q4();
//		int []arr= {5,4,7,1,3,9};
//		int max=arr[0];
//		int min=arr[0];
//		for (int j = 0; j <arr.length; j++) {
//			if(max<arr[j])
//			{
//				max=arr[j];
//				
//			}else if(arr[j]<min)
//			{
//				min=arr[j];
//			}
////			System.out.println(arr[j]);
//		}
//		System.out.println("最大值是"+max);
//		System.out.println("最小值是"+min);
//	}
//	
	}
	public static void Q1()
	{
		System.out.println("本次的特价商品有");
		String[] goodsName={"背包","运动衫","李宁运动鞋","kappa外套","361腰包"};
		for (int i = 0; i < goodsName.length; i++) {
			System.out.println(goodsName[i]);
		}
	}
	
	
	public static void Q2()
	{
		double sum=0;
		Scanner myscan=new Scanner(System.in);
		double[] m_arr=new double[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("请输入第"+(i+1)+"笔购物金额:");
			double money=myscan.nextDouble();
			m_arr[i]=money;
		}
		System.out.println("序号\t金额(元)");
		for(int j=0;j<m_arr.length;j++)
		{
			System.out.println(j+1+"\t"+m_arr[j]);
			sum+=m_arr[j];
		}
		System.out.println("总金额\t"+sum);
	}
	
	public static void Q3()
	{
		int [] grade= {72,89,65,58,87,91,53,82,71,93,76,68};
		int []count= {0,0,0,0,0};
		for (int i =0 ; i < grade.length; i++) {
			if(grade[i]>=90)//2
				{
					count[4]++;
					
					
				}else if(grade[i]>=80)//3
				{
					
					count[3]++;
					
				}else if(grade[i]>=70)//3
				{
					count[2]++;
					
				}else if(grade[i]>=60)//2
				{
					count[1]++;
					
				}else if(grade[i]>=0)//2
				{
					count[0]++;
					
				}
		}
		

		System.out.println("A\tB\tC\tD\tE");
		for (int i = count.length-1; i >=0; i--) {
			System.out.print(count[i]+"\t");
		}
		
	}
	
	public static void Q4()
	{
		
		int i=0;
		
		Scanner myscan=new Scanner(System.in);
		
		
		String key="y";
		System.out.println("--------为你的数组赋值吧--------");
		do
		{
			System.out.println("想输入多少个数字?:");
			int num=myscan.nextInt();
			int []arr=new int[num];
			for(i=0;i<num;i++)
			{
				System.out.print("输入第"+(i+1)+"位:");
				int number =myscan.nextInt();
				arr[i]=number;
				
			}
			int max=arr[0];
			int min=arr[0];
			System.out.print("你的数组是:<");
			for (int j = 0; j <i; j++) {
				if(max<arr[j])
				{
					max=arr[j];
					
				}else if(arr[j]<min)
				{
					min=arr[j];
				}
				
				System.out.print(arr[j]+" ");
			}
			System.out.println(">");
			
			System.out.println("最大值是"+max);
			System.out.println("最小值是"+min);
			
			
			System.out.println("是否继续?(输入n或N退出，输入任意值继续)");
			String choice=myscan.next();
			if(choice.equalsIgnoreCase("n"))
			{
				System.out.println("下次再见");
				key="n";
			}
			
			
		}while(key.equalsIgnoreCase("y"));
		
		
	}
	
	
}
