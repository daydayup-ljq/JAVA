package day20210727;

public class Student extends Person{
	String school;
	int age;//���Ը��า��
	public void showInfo()
	{
		System.out.println("������student��Է�������д");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
	
	public static void main(String[] args)
	{
		Person e=new Person();//��������ÿ���ָ�������ʵ��
		Student s=new Student();
		Person p=new Person();
		p=new Student();
		//��ǰp���õ���Student����
		
		
		
		//���ⷽ������
		p.showInfo();
	   e.showInfo();
	
	}

}
