package day20210806;

interface Computable//接口被类使用，叫实现
{
	int MAX=100;//public static final
	int f(int x);//public abstract
}

 class China implements Computable//当一个类实现了一个接口的时候，里面的方法必须重写
{
	int number;
	public int f(int x)//public 关键字是关键
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
 
 class Japan implements Computable
 {
	 int number;
	public  int f(int x)//重写方法的话必须要有public，子类不能比父类更严格
	 {
		 return 46+x;
	 }
 }
 
 class US implements Computable
 {

	@Override
	public int f(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }
public class Computer {
	
	public static void main(String args[])
	{
		China zhang;
		Japan baga;
		zhang = new China();
		baga  = new Japan();
		zhang.number=28+Computable.MAX;
		baga.number=20+Computable.MAX;
		System.out.println(zhang.number);
		System.out.println(baga.number);
		System.out.println(zhang.f(2));
		System.out.println(baga.f(2));
	}

}
