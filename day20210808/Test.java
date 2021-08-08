package day20210808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//异常处理
class People{
	private int age=1;
	public void setAge(int age)throws ArithmeticException{
		if(age>=160||age<=0)
		{
			//方法抛出异常导致方法结束
			throw new ArithmeticException(age+"illegal");
		}
		else
		{
			this.age=age;
		}
	}
	public int getAge()
	{
		System.out.println(age+"legal");
		return age;
	}
}
public class Test {

	public static void main(String[] args) {
		
		People wang=new People(),zhang=new People();
		try {
			wang.setAge(180);
			System.out.println(wang.getAge());
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try {
			zhang.setAge(18);
			System.out.println(zhang.getAge());
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		/*int d=0,a;
		try
		{
			a=42/d;
		}catch(ArithmeticException e)//数学异常--捕获
		{
			System.out.println("catched");
			e.printStackTrace();//打印堆栈信息
		}
		System.out.println("going");*/
		
		/*int [] a=new int [5];
		try
		{
			a[10]=200;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e)//越界
		{
			System.out.println(e);
			System.out.println("going here");
		}*/
		
		/*FileInputStream in =null;
		
		
		try{in =new FileInputStream("myfile.txt");
		int b;
		b=in.read();
		while(b!=-1)
		{
			System.out.println((char) b);
			b=in.read();
		}
		
		}catch(FileNotFoundException e)
		{
			System.out.println("错误是找不到文件");
			//System.out.println(e);
		}
		catch(IOException e)//父类引用指向子类对象
		{
			System.out.println("IO的其他异常");
		}finally {//离开前都要执行finally中的东西
			try {
				in.close();
			} catch (IOException e2) {
				// TODO: handle exception
				System.out.println("关闭IO异常");
			}
			catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("空指针异常");
			}
			
		}*/
		//异常捕获也分高低级
		//更精确的异常应该先去执行
		
		
	
	}

}
