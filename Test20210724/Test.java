package day24;

class T1
{
	//Ĭ�ϵĹ��췽��
	T1(){}
}

public class Test {
	public static void main(String[] args)
	{
		//Ĭ�ϵĹ��췽��ǰ����û�з��ʵ����η�����������й�
		//����public�ģ�Ĭ�Ϲ��췽������public
		//public Test() {}
		//Test test=new Test();//new�����Ķ��󣬾��ǵ���public Test() {};
		//������д���ǲ�д�����Ǵ��ڵ�
		
		//����Ĺ��������ɱ�����̳�
		/*Person per=new Person(2,"zhangsan");
		per.inFo();
		per.age=6;
		per.name="lisi";
		per.inFo();*/
		
		Person1 per1=new Person1(20,"liuwu");
		System.out.println(per1.age);
		
		Point po=new Point(1,2,3);
		po.setPoint(1, 2, 3);
		
		
		
		
		//������������
		new Person1();
		new Person1(1);
		new Person1("name");
		//Ϊ�˴�������ͬ����Ķ���
		//���صĶ�����췽��ʵ�����൱���ṩ�˶�������ģ��
		
		//this �ؼ���(��ǰ����)
	}
	

}
