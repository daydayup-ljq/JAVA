
public class Test20210715 {
	public static void main(String[] args)
	{
		/*int i=1;
		int k=i>0?1:0;//i是否大于0 ,是就输出1否则输出0
		System.out.println(k);*/
		
		//int m=2;
		//int n=1;
		//System.out.println(m>n?n:m);//m是否大于n？是就输出n，否则输出m
		
		//int k=0;
		//System.out.println(m>n?(m>k?m:k):(n>k?n:k));//嵌套的三位比较
		//
		//合法的顺序结构
		//int i=2;
		//int kk=i;
		
	    //分支语句
		/*int ii=1;
		if(ii==1||k==1)
		{
			System.out.println("ii="+ii);
		}
		
		//判断一个数字是奇数还是偶数
		int l=3;
		if(l%2==0)
		{
			System.out.println("偶数");
			
		}
		else
		{
			System.out.println("奇数");
		}
		*/
		
		//数字一输出星期一，二输出星期二，三输出星期三
		//if-else可以嵌套使用，也就是说if-else中可以有多个if-else
	/*	int p=3;
		if(p==1)
		{
			System.out.println("周一");
			
		}
		else if(p==2)
		{
			System.out.println("周二");
		}
		else if(p==3)
		{
			System.out.println("周三");
		}
		else
		{
			System.out.println("不知道");
		}*/
		
		//switch 语句
		/*int i0=7;
		switch(i0)
		{
		case 1:
			System.out.println("周一");
			break;
		case 2:
			System.out.println("周二");
			break;
		case 3:
			System.out.println("周三");
			break;
		default:
		System.out.println("周末");
			
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
			c='a'-32;//小写字母比大写字母的ASCLL码大32
			System.out.println(c);
			break;
			default:
				System.out.println("啥也不是");
		}
		*/
		
		//for循环
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
		
		
		//水仙花
		for(int i=100;i<=999;i++)
		{
			//145
			int m=i/100;//得到百位数
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
