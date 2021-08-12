package gc;

import gc.ts.*;
public class Test {
	public static void main(String []args)
	{
		Teacher t1=new Teacher("张三",40,'f',"123456","20191025207");
		Teacher t2=new Teacher("李四",35,'m',"654321","20191025206");
		System.out.println(Teacher.count_t);
	}

}
