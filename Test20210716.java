
public class Test20210716 {
	public static void main(String[] args)
	{
		/*for(int i=1;i<=150;i++)
		{
			String str="";
			str+=i;
			if(i%3==0)
			{
				str+="foo";
			}
			if(i%5==0)
			{
				str+="biz";
			}
			System.out.println(str);
			
		}
	}*/
		/*int count=0;
		for(int i=1;i<=100;i++)
		{
			
			if(i%2!=0)
			{
				count+=i;
			}
			
		}
		System.out.println(count);*/
		
		/*for(int i=100;i<=999;i++)
		{
			int m=i/100;//��λ
			int n=(i-m*100)/10;//ʮλ
			int k=i-(m*100)-(n*10);//��λ
			//System.out.println( m+" "+n+" "+ k);
			
			if(m*m*m+n*n*n+k*k*k==i)
			{
				System.out.println("ˮ�ɻ���Ϊ:"+i);
			}
		}*/
		
		
		//whileѭ��
		/*int i=1;
		while(i<=100)
		{
			System.out.println(i);
			i++;
			
		}*/
		
	/*	int m=101;//��ִ�����ж�
		do {
			System.out.println(m);
			m++;
		}while(m<=100);*/

		
		//Ƕ��ѭ��
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("i="+i+" j="+j);
			}
		}*/
		
		/*for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+(i*j)+"   ");//print�����У�println����
			}
			System.out.println();
		}
		*/
		
		//���һ��һ��֮�������
		
		/*for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if (count==2)
			{
				System.out.println(i);
			}
		}*/
		
		//�������̿������
		/*for(int i=0;i<9;i++)
		{
			if(i>6)
			{
				break;//��ֹѭ��
			}
			System.out.print(i);
		}*/
		
		/*for(int k=0;k<9;k++)
		{
			if(k%2==0)
			{
				continue;//������ǰѭ�������´�ѭ��
			}
			System.out.print(k);
		}*/
		
		
		/*for(int k=0;k<9;k++)
		{
			if(k==2)
			{
				return ;//��������breakһ����ʵ����return �ǰ��������������ˣ�breakֻ����ֹ�˵�ǰѭ��
			}
			System.out.print(k);
		}*/
		
		
		//����
		/*int ii[]=new int [5];//�������ܷ����int�������ݵ�����,��̬��ʼ��
		int iii[]=new int[] {1,2,3,4};//��̬��ʼ�������������1,2,3,4�ĸ���������
		
		String[] strs=new String[] {"a","b","c"};
		System.out.println(strs[2]);
		System.out.println("strs�����鳤�ȣ�"+strs.length);
		int iiii[]=new int [2];
		System.out.println(iiii[1]);//Ĭ��ֵΪ0*/
		//iiii[0]=2;
		//System.out.println(iiii[0]);
		
		
		//��ά����
		//int[][]y����int[]y[]����int y[][]
		//int[]x,y[],x��һά���飬y�Ƕ�ά����
		int i[][]=new int[2][2];//2�������ţ�ÿ������������2��Ԫ��
		
		int ii[][]=new int[][]
		{
			{
				1,2,3
			},
			{
				1,2,3
			}
						};
		
						
		int iii[][]=new int[2][];//ֻ�����һά
		
		int t=0;
		int temp=0;
		int arr[][]=new int[][]
				{
			{3,8,2},{2,7},{9,0,1,6}
				};
				
				int len=arr.length;
				for(int l=0;l<len;l++)
				{
					int arr0[]=arr[l];
					int len2=arr0.length;
					for(int j=0;j<len2;j++)
					{
						t+=arr0[j];
					}
				}
		System.out.println(t);
		
		
		for(int i2=0;i2<arr.length;i2++)
		{
			for(int j2=0;j2<arr[i2].length;j2++)
			{
				temp+=arr[i2][j2];
			}
		}
		
		System.out.println(temp);
}
}
