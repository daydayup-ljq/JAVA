
public class Test20210715 {
	public static void main(String[] args)
	{
		/*int i=1;
		int k=i>0?1:0;//i�Ƿ����0 ,�Ǿ����1�������0
		System.out.println(k);*/
		
		//int m=2;
		//int n=1;
		//System.out.println(m>n?n:m);//m�Ƿ����n���Ǿ����n���������m
		
		//int k=0;
		//System.out.println(m>n?(m>k?m:k):(n>k?n:k));//Ƕ�׵���λ�Ƚ�
		//
		//�Ϸ���˳��ṹ
		//int i=2;
		//int kk=i;
		
	    //��֧���
		/*int ii=1;
		if(ii==1||k==1)
		{
			System.out.println("ii="+ii);
		}
		
		//�ж�һ����������������ż��
		int l=3;
		if(l%2==0)
		{
			System.out.println("ż��");
			
		}
		else
		{
			System.out.println("����");
		}
		*/
		
		//����һ�������һ����������ڶ��������������
		//if-else����Ƕ��ʹ�ã�Ҳ����˵if-else�п����ж��if-else
	/*	int p=3;
		if(p==1)
		{
			System.out.println("��һ");
			
		}
		else if(p==2)
		{
			System.out.println("�ܶ�");
		}
		else if(p==3)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("��֪��");
		}*/
		
		//switch ���
		/*int i0=7;
		switch(i0)
		{
		case 1:
			System.out.println("��һ");
			break;
		case 2:
			System.out.println("�ܶ�");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
		System.out.println("��ĩ");
			
		}
		*/
		
	/*	String str="abc";
		switch(str)
		{
		case "a":
			System.out.println("a");
			break;
		case "abc":
			System.out.println("abc");
			break;
			default:
				System.out.println("default");
				break;
		}*/
				
		/*char c='a';
		switch(c)
		{
		case 'a':
			c='a'-32;//Сд��ĸ�ȴ�д��ĸ��ASCLL���32
			System.out.println(c);
			break;
			default:
				System.out.println("ɶҲ����");
		}
		*/
		
		//forѭ��
		/*int i=1;
		for(i=1;i<151;i++)
		{
			String str="";
			str=str+i;

			if(i%3==0)
			{
				str+="foo";
			}
				if(i%5==0)
				{
					str+="biz";
				}
					if(i%7==0)
					{
						str+="baz";
					}
				
			System.out.println(str);
		}
		*/
		
		
		//ˮ�ɻ�
		for(int i=100;i<=999;i++)
		{
			//145
			int m=i/100;//�õ���λ��
			int n=(i-m*100)/10;
			int k=i-m*100-n*10;
			//System.out.println(m+" "+n+" "+k+" ");
			
			int res=m*m*m+n*n*n+k*k*k;
			if(res==i)
			{
				System.out.println(i);
			}
		}
		
		
		
	}
	
}
