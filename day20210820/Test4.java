package day20210820;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ�����ƴ��
		
		int arr[]={1,2,3};
	 String   s= arrayToString(arr);
		System.out.println(s);

	}

	//���巽��
	//��ȷ����ֵ�Ͳ���
	public static String arrayToString(int []arr)
	{
		String s=" ";
		s+="[";
		for (int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				s+=arr[i];
			}
			else
			{
				s+=arr[i];
				s+=", ";
			}
			
		}
		s+="]";
		return s;
	}
}
