package java_pro;

//import����  ����.����.<����>
// .*ȫ����
public class Test {
//����ֻ�б����ò�������
	
	public static void swap(int i)
	{
		i=6;
		System.out.println("swap�����еĲ���i��ֵ��"+i);
	}
	
	public static void swap2(DataSwap ds1)
	{
		ds1.a=6;
		System.out.println("swap2�����еĲ���ds1.a��ֵ��"+ds1.a);
	}
	public static void main(String[] args)
	{
		//ջ�д���Ƕѵĵ�ַ��new Person�ĵ�ַ��
		//new�����Ķ����ڶ���
		//�����������͵�ֵ�Ǳ�����ջ�У����ö����ֵ�����ڶ���
		//ջ�д�Ķ����Ƕ��еĵ�ַ
		//java�д���ֻ�д�ֵ�ķ���
		/*int a=0;
		swap(a);
		System.out.println("main�����еĲ���a��ֵ��"+a);*/
		
		DataSwap ds=new DataSwap();
		System.out.println("���÷���֮ǰ,ds.a��ֵ��"+ds.a);
		swap2(ds);
		System.out.println("���÷���֮��"+ds.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
