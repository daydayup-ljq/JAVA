package day20210829;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,2,5,6,1};
		int temp=0;
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
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		
		}

	}

}
