/*
 * 动物的类
 */
public class Animal {
	String name;
	int eyecolor;
	int legs;
	String type;
	
	/*
	 * 输出动物的皮毛颜色
	 */
	public void furcolor(String color)
	{
		System.out.println("此种动物皮毛的颜色是:"+color);
	}
	
	/*
	 * 输出动物的移动方式
	 */
	public void move(String mode) {
		System.out.println("此种动物的移动方式 "+mode);
	}
	
	public String showType()
	{
		return type;
	}

}
