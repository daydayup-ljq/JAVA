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


public class Test数组 {
//数组变量属于引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
	//数组中的元素可以是任何数据类型，包括基本类型和引用类型
	//申明方式 type var[] 或者 type[] var
	//java中使用关键字new来创建数组对象
	public static void main(String args[])
	{
		
		//分配空间和赋值分开进行--动态初始化
		/*Data days[];
		days=new Data[3];
		for(int i=0;i<3;i++)
		{
			days[i]=new Data(2020,4,i+1);
		}
		
		//分配空间和赋值一起进行--静态初始化
		int a[]= {0,1,2,3,4};
		Data ds[]=
				{new Data(1,4,2004),
						new Data(2,4,2004),new Data(3,4,2004)
				};
		*/
		
		
		/*int s[];//给名字
		s=new int [5];//new 空间给长度
		for(int i=0;i<5;i++)
		{
			s[i]=i;
		}*/
		
		
		
		
		
		/*int M=5;
		int[]a=new int[M];
		//System.out.println(a.length);
		//System.out.println(a[0]);//默认0
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		
		int aa[][]=new int [3][];//三个引用分别指向三个一维数组--和C同样高维不可省
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
		
		//数组的拷贝
		/*int a[]= {1,2,3,4,5};
		int b[]= new int[a.length];
		System.arraycopy(a,0,b,0,a.length);//a数组从0单元开始，拷贝到b数组中，拷贝a.lenth个4
		for(int i=0;i<b.length;i++)
		{
			System.out.println(""+b[i]);
		}
		System.out.println("\n修改b的数值");
		b[b.length-1]=6;
		System.out.println("b修改后的数据值");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(""+b[i]);
		}
		
		*/
		
		
		int [][] intArray= {{1,2},{1,2,3},{3,4}};
		int [][] intArrayBak=new int[3][];
		System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
		System.out.println("\n修改intArrayBak的数值");
		intArrayBak[2][1]=100;
		System.out.println("\n修改后intArrayBak的数值");
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
