package day20210726;

public class KK extends Kids{
	public void test()
	{
		super.salary=1;
		//是KK的父类的父类,可以使用super向上追溯父类的父类
		//可以一直向上追溯，如果有那么多个层级的父类的话
		super.yearsOld=1;//也可以使用super直接追溯父类
		super.employeed();//也可以使用super直接追溯父类的成员方法
		super.manOrwoman();//也可以使用super直接追溯父类的父类的成员方法
	}

}
