
public class Createnew {
	public static void main (String[] args) {
		//实例化person类，创建person类
		Animal animal=new Animal();//申明一个Animal类型的变量,变量名叫animal
		//new Animal就是实例化
		animal.name="名字是尹丰";//给animal的name属性赋值
		animal.furcolor("黑");//方法调用;
		animal.type="灵长类";
		String i=animal.showType();		
		System.out.println(i);
		System.out.println(animal.name);
		animal.move("爬");
		
	}

}
