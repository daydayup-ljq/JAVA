package day20210811;


class Data
{
	int day;
	int month;
	int year;
	public Data(int y,int m,int d)
	{
		year=y;
		month=m;
		day=d;
	}
}


public class Test���� {
//������������������ͣ�����Ҳ���Կ����Ƕ��������е�ÿ��Ԫ���൱�ڸö���ĳ�Ա����
	//�����е�Ԫ�ؿ������κ��������ͣ������������ͺ���������
	//������ʽ type var[] ���� type[] var
	//java��ʹ�ùؼ���new�������������
	public static void main(String args[])
	{
		
		//����ռ�͸�ֵ�ֿ�����--��̬��ʼ��
		/*Data days[];
		days=new Data[3];
		for(int i=0;i<3;i++)
		{
			days[i]=new Data(2020,4,i+1);
		}
		
		//����ռ�͸�ֵһ�����--��̬��ʼ��
		int a[]= {0,1,2,3,4};
		Data ds[]=
				{new Data(1,4,2004),
						new Data(2,4,2004),new Data(3,4,2004)
				};
		*/
		
		
		/*int s[];//������
		s=new int [5];//new �ռ������
		for(int i=0;i<5;i++)
		{
			s[i]=i;
		}*/
		
		
		
		
		
		/*int M=5;
		int[]a=new int[M];
		//System.out.println(a.length);
		//System.out.println(a[0]);//Ĭ��0
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		
		int aa[][]=new int [3][];//�������÷ֱ�ָ������һά����--��Cͬ����ά����ʡ
		aa[0]=new int[2];
		aa[1]=new int[4];
		aa[2]=new int[5];
		
		System.out.println(aa[0][0]);
		System.out.println(aa[0][1]);
	//	System.out.println(aa[0][2]);
		
		int b[][]=new int [3][4];
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[0][2]);*/
		
		/*int a[][]= {{1,2},{3,4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}*/
		
		//����Ŀ���
		/*int a[]= {1,2,3,4,5};
		int b[]= new int[a.length];
		System.arraycopy(a,0,b,0,a.length);//a�����0��Ԫ��ʼ��������b�����У�����a.lenth��4
		for(int i=0;i<b.length;i++)
		{
			System.out.println(""+b[i]);
		}
		System.out.println("\n�޸�b����ֵ");
		b[b.length-1]=6;
		System.out.println("b�޸ĺ������ֵ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(""+b[i]);
		}
		
		*/
		
		
		int [][] intArray= {{1,2},{1,2,3},{3,4}};
		int [][] intArrayBak=new int[3][];
		System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
		System.out.println("\n�޸�intArrayBak����ֵ");
		intArrayBak[2][1]=100;
		System.out.println("\n�޸ĺ�intArrayBak����ֵ");
		for(int i=0;i<intArrayBak.length;i++)
		{
			for(int j=0;j<intArrayBak[i].length;j++)
			{
				System.out.println(intArrayBak[i][j]+"");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	
}
