package day23;

public class Person {
	//public int age;//���࿪�������õ��������ʹ�þͻ������
	//��Ҫ�Բ�������ʹ�õ���������װ������
	private int age;//��װ����
	
	
public int getAge()
{
	return age;
}
	
	public void setAge(int a)
	{
		if (a<=150&&a>=0)
		{
			age=a;
			
			System.out.println("������"+age);
		}
		else
		{
			System.out.println("�����ӳ����");
		}
	}

}
