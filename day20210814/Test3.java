package day20210814;

public class Test3 {
	//��һ�����ӣ��ӳ����������¿�ʼÿ������һ�����ӣ�С���ӳ�����������
	//����һ�����ӣ��������Ӳ��ǣ��ڶ�ʮ�������Ӷ���Ϊ����

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
		System.out.println("�ڶ�ʮ�������ӵĶ�����:"+arr[19]);

	}

}
