package day20210814;

public class Test2 {
	//��ӡ��һ��һ��֮�京���߻������ߵı���������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(x=1;x<=100;x++)
		{
			if(x%7==0)
			{
				System.out.println("��"+x);
			}else if(x%10==7 || x/10%10==7)
			{
				System.out.println("��"+x);
			}
		}

	}

}
