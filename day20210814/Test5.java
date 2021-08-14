package day20210814;

import java.util.Scanner;



public class Test5 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("请输入第"+(x+1)+"个评委的打分:");
			arr[x]=sc.nextInt();
		}
		
		int  max=getMax(arr);
		int  min=getMin(arr);
		int  sum=getSum(arr);
		
		int avg=(sum-max-min)/(arr.length-2);
		
		//输出平均分
		System.out.println("选手的最终得分是:"+avg);
	}
	
	//遍历数组
	public static void printArrary(int []arr)
	{
		System.out.println("[");
		
		for(int x=0;x<arr.length;x++)
		{
			if(x==arr.length-1)
			{
				System.out.println(arr[x]);
			}else {
				System.out.println(arr[x]+",");
			}
	}
		
		System.out.println("]");
	}
		
	public static int getMax(int []arr)
	{
		int max=arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>max)
			{
				max=arr[x];
			}
		}
		return max;
	}
	
	public static int getMin(int []arr)
	{
		int min=arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<min)
			{
				min=arr[x];
			}
		}
		return min;
	}
	
	public static int getSum(int[]arr)
	{
		int sum=0;
		for(int x=0;x<arr.length;x++)
		{
			sum+=arr[x];
		}
		return sum;
	}
}


