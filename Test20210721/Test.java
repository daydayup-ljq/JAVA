package java_pro;

public class Test {
	public static void main(String[] args)
	{
		/*Test te=new Test();
		te.mol(2);
		te.mol("С��");
		te.mol(2, 3);
		
		te.max(2, 3);
		te.max(2, 3);
		te.max(0, 1, 2);*/
		
		
		Person per=new Person();
		String[] ss=new String[] {"С��","11"};
		per.pInfp(ss);
		String[] sss=new String[] {"������","113334444","123456789"};
		per.pInfp(sss);
		
		per.printInfo("lisi","32","male");
		per.pInfp(sss);
		}
	//�����ͬ���Ƶķ����������һ�����й��棬��ô��Щͬ������һ������һЩ��ͬ
	//������ͬ��������������
	/*public int add(int x,int y)
	{
		return x+y;
	}
	public double add(int x,double y)
	{
		return x+y;
	}

	public int add(int x,int y,int z)
	{
		return x+y+z;
	}*/
	
	public void mol(int x)
	{
		System.out.println(x*x);
	}
	
	public void mol(int x,int y)
	{
		System.out.println(y * x);
	}
	
	public void mol(String x)
	{
		System.out.println(x);
	}
	
	public void max(int x,int y)
	{
		if(x>y)
		{
			System.out.println("���ֵ��"+x);
		}
		else
		{
			System.out.println("���ֵ��"+y);
		}
	}
	
	public void max(double x,double y)
	{
		double res=0;
		if(x>y)
		{
			res=x;
			
		}
		else
		{
			res=y;
		
		}
		System.out.println("���ֵ��"+res);
	}
	
	public void max(double a,double b,double c)
	{
		double tem=0;
		if(a>b)
		{
			if(a>c)
			{
				tem=a;
			}
		}
		else if(a<c)
		{
			tem=c;
		}
		else {
			if(b>c)
			{
				tem=b;
			}
		}
		
		System.out.println("���ֵ��"+tem);
	}

}
