package interface_;

public class ExtendVsInterface {

	public static void main(String[] args) {
		LittleMonkey aw = new LittleMonkey("����");
		aw.climbtree();
		aw.swimming();
		aw.flying();
		

	}

}
/*
 * С�᣺������̳��˸��࣬���Զ���ӵ���˸���Ĺ���
 * ���������Ҫ��չ�Ļ�������ͨ���ӿڽ���
 * 
 */
//�ӿ�
interface Fishable
{
	void swimming();
}

interface Bird
{
	void flying();
}
//����
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
		System.out.println(getName()+"Ŭ��ѧϰ��ѧ��������...");
	}
}


//С����
class LittleMonkey extends Monkey implements Fishable,Bird{

	public LittleMonkey(String name) {
		super(name);
		
	}

	@Override
	public void swimming() {
		System.out.println(getName()+"ͨ��Ŭ��ѧϰ����Ӿ");
		
	}

	@Override
	public void flying() {
		System.out.println(getName()+"ͨ��Ŭ��ѧϰ�����");
		
	}
	
	
}
