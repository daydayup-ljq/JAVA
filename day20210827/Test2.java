package day20210827;

public class Test2 {

	public static void main(String[] args) {
		int[] arr= {24,69,50,30,12};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.print(" "+arr[i]);
			
		}

	}

}
