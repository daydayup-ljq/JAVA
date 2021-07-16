
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
			int m=i/100;//百位
			int n=(i-m*100)/10;//十位
			int k=i-(m*100)-(n*10);//个位
			//System.out.println( m+" "+n+" "+ k);
			
			if(m*m*m+n*n*n+k*k*k==i)
			{
				System.out.println("水仙花数为:"+i);
			}
		}*/
		
		
		//while循环
		/*int i=1;
		while(i<=100)
		{
			System.out.println(i);
			i++;
			
		}*/
		
	/*	int m=101;//先执行在判断
		do {
			System.out.println(m);
			m++;
		}while(m<=100);*/

		
		//嵌套循环
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
				System.out.print(i+"*"+j+"="+(i*j)+"   ");//print不换行，println换行
			}
			System.out.println();
		}
		*/
		
		//输出一到一百之间的质数
		
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
		
		//特殊流程控制语句
		/*for(int i=0;i<9;i++)
		{
			if(i>6)
			{
				break;//终止循环
			}
			System.out.print(i);
		}*/
		
		/*for(int k=0;k<9;k++)
		{
			if(k%2==0)
			{
				continue;//结束当前循环进入下次循环
			}
			System.out.print(k);
		}*/
		
		
		/*for(int k=0;k<9;k++)
		{
			if(k==2)
			{
				return ;//看起来和break一样，实际上return 是把整个方法结束了，break只是终止了当前循环
			}
			System.out.print(k);
		}*/
		
		
		//数组
		/*int ii[]=new int [5];//数组里能放五个int类型数据的数组,动态初始化
		int iii[]=new int[] {1,2,3,4};//静态初始化，申明存放了1,2,3,4四个数的数组
		
		String[] strs=new String[] {"a","b","c"};
		System.out.println(strs[2]);
		System.out.println("strs的数组长度："+strs.length);
		int iiii[]=new int [2];
		System.out.println(iiii[1]);//默认值为0*/
		//iiii[0]=2;
		//System.out.println(iiii[0]);
		
		
		//二维数组
		//int[][]y或者int[]y[]或者int y[][]
		//int[]x,y[],x是一维数组，y是二维数组
		int i[][]=new int[2][2];//2个大括号，每个大括号里面2个元素
		
		int ii[][]=new int[][]
		{
			{
				1,2,3
			},
			{
				1,2,3
			}
						};
		
						
		int iii[][]=new int[2][];//只定义第一维
		
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
