
public class Test20210717 {
	public static void main(String[] args )
	{
		
		//int arr[]=new int[] {4,2,7,1,3,5};
		/*int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("max:"+max);
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min:"+min);
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count+=arr[i];
		}
		System.out.println("count:"+count);
		System.out.println("avg:"+(count/arr.length));*/
		
		//复制
		/*int copy[]=new int[arr.length];//申明了一个和arr长度一致的数组
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
			System.out.println(copy[i]);
		}
		*/
		
		//考虑再申明一个数组temp,temp数组的长度和arr数组一致，倒着循环arr正着给temp赋值
		
		/*int copy[]=new int[arr.length];//申明了一个和arr长度一致的数组
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=0;j<arr.length;j++)
			{
				copy[j]=arr[i];
				
			}
			System.out.println(copy[i]);
		}
		*/
		
		//排序，按照正序排
		/*for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1-j;i++)
			{
				int temp;
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
				
			}
			
			
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		*/
		
		//面向对象程序编程
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
