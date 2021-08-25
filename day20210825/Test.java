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
		System.out.println("请输入你要添加的元素");
		int addnum=myscan.nextInt();
		Newarr[arr.length]=addnum;
		
		arr=Newarr;
		
		System.out.println("扩容后的效果");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
		
		System.out.println("是否继续添加 y/n");
		char key=myscan.next().charAt(0);
		if(key=='n')
		{
			System.out.println("你退出了添加");
			break;
		}

		}while(true);
	}

}
