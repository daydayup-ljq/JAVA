package java_pro;

public class Person {
	/*public void printInfo(String name,int age)//�������ܴ�ӡ����Ϣ���������βεĴ���
	{
		//���Ը��������ݲ�ͬ�Ĳ�����
		//�������������£���֪����Ҫ�����ַ������ݶ��ٸ�����
		//�������Ա����䣬Ҳ���������֤���룬��ͥסַ���ֻ��ŵȵ�
		System.out.println();
	}*/
	/*
	 * ������ķ�ʽ�����ݿɱ����
	 * ���û�в�����Ҫ���������NULL
	 * ͨ������ʵ��
	 */
	public void pInfp(String [] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}

	/*
	 * ��java���е�...�����ݿɱ����
	 * �������ʹ�÷�ʽ��ͬ
	 * ���Բ���
	 */
	public void printInfo(int age ,String... args)//�ɱ����һ��Ҫ���������
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	public void test(int... i)
	{
		
	}
}
