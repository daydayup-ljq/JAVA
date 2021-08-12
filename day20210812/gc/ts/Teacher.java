package gc.ts;
import  gc.*;
public class Teacher extends Person {
	//不写构造函数相当于里面有空参的构造函数
	String tid;
	public static int count_t;//所有对象共有的
	public Teacher(String name ,int age,char sex,String telephone,String tid)
	{
		super(name,age,sex,telephone);
		this.tid=tid;
		count_t++;
	}
	@Override
	public String getTelephone() {
		String str=name+":"+this.getTelephone();
		
		return"ok"; 
	}
	
	
	

}
