package day210725;

//�ѹ��ԵĶ���������γɸ���
//ʵ������������ڼ̳и���Ļ�����д�Լ������д��뼴��
//��Ҫֻ��Ϊ��ʹ��ĳ�����Զ�ȥ�̳б��繷���˶����������������ǲ����Լ̳�
//��Ҫ�����࣬��Ҫ�߼���ϵ����������̳�
//һ������ֻ����һ�����࣬���ܶ�̳У����Զ��̳�
public class Student extends Person{
	String school;
	
	public void showInfo()
	{
		System.out.println(this.age);
		System.out.println(this.school);
		System.out.println(this.name);
		System.out.println(this.sex);
	}

}
