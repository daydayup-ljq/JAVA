package java_pro;

public class Person {
	/*public void printInfo(String name,int age)//问题是能打印的信息都来自于形参的传递
	{
		//可以给方法传递不同的参数吗
		//如果在这种情况下，不知道想要给这种方法传递多少个参数
		//可能是性别年龄，也可能是身份证号码，家庭住址，手机号等等
		System.out.println();
	}*/
	/*
	 * 用数组的方式来传递可变参数
	 * 如果没有参数就要定义空数组NULL
	 * 通过迭代实现
	 */
	public void pInfp(String [] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}

	/*
	 * 用java特有的...来传递可变参数
	 * 与数组的使用方式相同
	 * 可以不填
	 */
	public void printInfo(int age ,String... args)//可变参数一定要申明在最后
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	public void test(int... i)
	{
		
	}
}
