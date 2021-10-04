package interface_;

public class InterfacePolyPass {
	/*
	 * 演示多态传递现象
	 */

	public static void main(String[] args) {
		//接口类型的变量可以指向实现了该接口的类的对象实例
		IG ig = new Teacher();
		//如果IG继承了 IH 接口 ， 而Teacher类实现了IG接口
		//就相当于Teacher实现了 IH接口
		//这就是接口多态传递现象
		IH ih = new Teacher();
		

	}

}


interface IH{
	void hi();
}
interface IG extends IH{}
class Teacher implements IG{

	@Override
	public void hi() {
		System.out.println("hi...");
		
	}
	
	
}