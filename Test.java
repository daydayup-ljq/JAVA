
public class Test {
	public static void main(String[] args)
	{
		/*for(float y=(float)1.5;y>-1.5;y-=0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
		
		/*int i=1;
		short s=2;
		byte b=3;
		
		int res=i+s+b;
		//在计算过程中，整数类型是int的范围最大，所以s和b都分别先转换成int 类型然后运算
		
		char c='a';
		//char类型的数据在与数字进行数学运算的时候，他是转换为对应的ASCLL码进行运算
		byte b0=2;
		int k=c+b0;
		System.out.println(k);
		
		String str="abc";
		
		System.out.println(str+i);
		
		String str2="1"+1+2+3;
		System.out.println(str2);
		//String后面要有双引号，需要输出字符串
		System.out.println(3+4+"HELLO");//前面先执行加法,遇到双引号之后进行拼接
		System.out.println('a'+1+"hello");//先用a的ASCLL码和1相加，然后执行拼接
		
		byte bb=9;
		int ii=b;
		int kk=7;
		byte bb0=(byte)kk;//强制转换
		//boolen不能进行转换
		 * byte short char 运算时不能相互转换，先转换成int
		*/
		//int i=0;
		//System.out.println(-i);
		//System.out.println(7/2);//整数运算保留整数
		//System.out.println(7%2);//取余数
	//	System.out.println(2.3/3.2);
		//i++;
		//int k=++i;
		//int j=i++;
		//System.out.println(i);
		//System.out.println(k);
		//System.out.println(j);
		
		//String str="h" +"e" +"ll"+"o";
		//System.out.println(str);
		
	/*	int i1=10;
		int i2=20;
		int i=i1++;//i=10,i1=11
		System.out.println("i="+i);*/
		/*int i=0;
		short s=2;
		//i=s;//自动类型转换
		//s=i;//只能强制类型转换 s=(short)i
		i+=2;
		s*=2;
		s+=2;//扩展运算符会直接进行强制转换
		//s=s+3;//short是一个短整型数据，在整数类型中默认的是int,所以short会转换成int
		////可以强制换s=(short)(s+3)；
		System.out.println(i);
		System.out.println(s);
		int k=1;
		k*=0.1;//k的值是0.1强制类型转换成int 整形只保留整数部分是0
		System.out.println(k);
		k+=1;
		System.out.println(k);*/
		
		/*System.out.println(4==4&1==1);
		int i=0;
		int k=1;
		System.out.println(i!=0&++k==2);*/
		
	//	System.out.println(1<<2);//1*2的2次方
		//System.out.println(31<<3);//31*2的3次方
		//System.out.println(31>>3);//31*2的-3次方//右移的时候看最前面的最高位，是0就补0 是1就补1
		
}
}