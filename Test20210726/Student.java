package day20210726;

public class Student extends Person {
	String classroom;
	
//	public void showInfo()
//	{
//		System.out.println(this.age);
//		System.out.println(this.sex);
//		System.out.println(this.name);
//		System.out.println(this.classroom);
//	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("������student���Person���showInfo������д");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
	
	@Override
	public void setInfo(int age, int sex, String name) {
		// TODO Auto-generated method stub
//		super.setInfo(age, sex, name);
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(sex);
	}
	
	public static void main(String[] args)
	{
		//����ָ����һ��������ж��ͬ������
		//��дָ���������������д����ķ���,���Ǹ���ķ���
		//���಻�ܷ��ʸ���˽�еĶ���
		Student stu=new Student();
		stu.showInfo();
	}
}
