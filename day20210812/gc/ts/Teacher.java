package gc.ts;
import  gc.*;
public class Teacher extends Person {
	//��д���캯���൱�������пղεĹ��캯��
	String tid;
	public static int count_t;//���ж����е�
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
