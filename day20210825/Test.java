package day20210825;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscan=new Scanner(System.in);
		
		int arr[]= {1,2,3};
		
	do {
		int[] Newarr=new int [arr.length+1];
		for(int i=0;i<arr.length;i++)
		{
			Newarr[i]=arr[i];
		}
		System.out.println("��������Ҫ��ӵ�Ԫ��");
		int addnum=myscan.nextInt();
		Newarr[arr.length]=addnum;
		
		arr=Newarr;
		
		System.out.println("���ݺ��Ч��");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
		
		System.out.println("�Ƿ������� y/n");
		char key=myscan.next().charAt(0);
		if(key=='n')
		{
			System.out.println("���˳������");
			break;
		}

		}while(true);
	}

}
