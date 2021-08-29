package day20210829;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean[] bar=new boolean[3];
//		int i=1;
//		int j=3;
//		bar[2]=i==j;
//		System.out.println(bar[0]);
//		System.out.println(bar[1]);
//		System.out.println(bar[2]);
		
		int []arr= {1,12,24,36};
		int temp=0;
		Scanner myscan=new Scanner (System.in);
		while(1!=0)
		{
		    System.out.println("请输入你要插入的数字");
			int add = myscan.nextInt();
			int arrNew[]=new int [arr.length+1];
			for(int i=0;i<arr.length;i++)
			{
				arrNew[i]=arr[i];
			}
			arr=arrNew;
			arr[arr.length-1]=add;
			
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			
			
			System.out.println("降序组合后得到");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(" "+arr[i]);
			
			}
			System.out.println();
			System.out.println("是否继续添加:(y/n)");
			char key=myscan.next().charAt(0);
				if(key=='n')
				{
					System.out.println("你退出了使用");
					break;
				}
		}
			
			
	}

}
