package day0917;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//System.out.println("5"+2);
		//System.out.println(getValue(2));
		//int  num = 90;
		//System.out.println( num ++ );
		//double a = 89.9;
		//int b = (int)a + 10;
		//System.out.println(2%9);
		//Q1();

		//Q2();
		//int i=153;
		//System.out.println(i/100%10);
		//System.out.println(i/10%10);
		//System.out.println(i%10);
//		System.out.println(2%1);
//		System.out.println(2%2);

		
		//Q3();
		Q4();
	}
	 public static int getValue(int i) {
	        int result = 0;
	        switch (i) {
	        case 1:
	            result = result + i;
	        case 2:
	            result = result + i * 2;
	        case 3:
	            result = result + i * 3;
	        }
	        return result;
	    }

	 
	 public static void Q1()
	 {
		 Scanner myscan=new Scanner(System.in);
		 System.out.println("������ѧ���ɼ�:");
		 double score=myscan.nextDouble();
		 if(score>=90)
		 {
			 System.out.println("A");
		 }else if(score>=60&&score<=89)
		 {
			 System.out.println("B");
		 }else
		 {
			 System.out.println("C");
		 }
	 }
	 
	 public static void Q2()
	 {
		 Scanner myscan=new Scanner(System.in);
		 String key="y";
		 System.out.println("*****��ӭʹ������ת����������n�����˳���ϵͳ******");
		 
		 while(key.equals("y"))
		 {
			 System.out.println("��������ĸ:");
			 char  first=myscan.next().charAt(0);
			 switch(first)
			 {
			 case 'D':
				 System.out.println("����");
				 System.out.println("Dry");
				 break;
			 case 'M':
				 System.out.println("��ʪ");
				 System.out.println("Moisture");
				 break;
			 case 'H':
				 System.out.println("����");
				 System.out.println("Hot");
				 break;
			 case 'R':
				 System.out.println("����");
				 System.out.println("Rainy");
				 break;
			 
			 default:
				 System.out.println("��������!");
				 break;

			 }
			 System.out.println("�Ƿ����?(y/n)");
			 String  choice=myscan.next();
			 if(choice.equals("n"))
			 {
				 System.out.println("��ӭ�´�ʹ��");
				 key="n";
			 }

		 }

		 
		 
	 }
	 
	 
	 public static void Q3()
	 {
		 
		for(int i=100;i<=999;i++)
		{
			if(((i/100%10)*(i/100%10)*(i/100%10))+((i/10%10)*(i/10%10)*(i/10%10))+((i%10)*(i%10)*(i%10))==i)
			{
				System.out.print("  "+i);
			}
			
			
		}
		 
	 }
	 
	 public static void Q4()
	 {
		 
		 for(int i=0;i<=1000;i++)
		 {
			 int sum=0;
			 for(int j=1;j<=i;j++)
			 {
				 if(i%j==0)//����
				 {
					
					 sum=sum+j;
					 if(sum==i)
					 {
						 System.out.print(i+"=");
						 for(int k=1;k<i;k++)
						 {
							 if(i%k==0)
							 {
								 System.out.print(k+"+");
							 }
							
							 
						 }
						 if(i==1)
					      {
					    	  System.out.print(1+"+");
					      }
						 System.out.println();
						 
				      }
					 
				 }
				 
				 }
				
			 
		 }
	 }
	 
	 
	 
	 
	 
}
