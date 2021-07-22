package java_pro;

//import引包  包名.子名.<类名>
// .*全引用
public class Test {
//方法只有被调用才有意义
	
	public static void swap(int i)
	{
		i=6;
		System.out.println("swap方法中的参数i的值："+i);
	}
	
	public static void swap2(DataSwap ds1)
	{
		ds1.a=6;
		System.out.println("swap2方法中的参数ds1.a的值："+ds1.a);
	}
	public static void main(String[] args)
	{
		//栈中存的是堆的地址（new Person的地址）
		//new出来的对象都在堆中
		//基本数据类型的值是保存在栈中，引用对象的值保存在堆中
		//栈中存的对象是堆中的地址
		//java中传参只有传值的方法
		/*int a=0;
		swap(a);
		System.out.println("main方法中的参数a的值："+a);*/
		
		DataSwap ds=new DataSwap();
		System.out.println("调用方法之前,ds.a的值："+ds.a);
		swap2(ds);
		System.out.println("调用方法之后："+ds.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
