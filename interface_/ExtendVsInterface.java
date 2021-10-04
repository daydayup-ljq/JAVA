package interface_;

public class ExtendVsInterface {

	public static void main(String[] args) {
		LittleMonkey aw = new LittleMonkey("阿威");
		aw.climbtree();
		aw.swimming();
		aw.flying();
		

	}

}
/*
 * 小结：当子类继承了父类，就自动的拥有了父类的功能
 * 如果子类想要拓展的话，可以通过接口进行
 * 
 */
//接口
interface Fishable
{
	void swimming();
}

interface Bird
{
	void flying();
}
//猴子
class Monkey{
	private String name;
	
	public String getName() {
		return name;
	}
	
	

	public Monkey(String name) {
		super();
		this.name = name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void climbtree()
	{
		System.out.println(getName()+"努力学习后学会了爬树...");
	}
}


//小猴子
class LittleMonkey extends Monkey implements Fishable,Bird{

	public LittleMonkey(String name) {
		super(name);
		
	}

	@Override
	public void swimming() {
		System.out.println(getName()+"通过努力学习会游泳");
		
	}

	@Override
	public void flying() {
		System.out.println(getName()+"通过努力学习会飞翔");
		
	}
	
	
}
