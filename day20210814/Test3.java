package day20210814;

public class Test3 {
	//有一对兔子，从出生第三个月开始每个月生一对兔子，小兔子长到第三个月
	//又生一对兔子，假如兔子不是，第二十个月兔子对数为多少

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		arr[2]=arr[0]+arr[1];
		arr[3]=arr[2]+arr[1];
		for(int x=2;x<arr.length;x++)
		{
			arr[x]=arr[x-2]+arr[x-1];
		}
		System.out.println("第二十个月兔子的对数是:"+arr[19]);

	}

}
