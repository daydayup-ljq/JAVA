package day20210806;

interface Computable//�ӿڱ���ʹ�ã���ʵ��
{
	int MAX=100;//public static final
	int f(int x);//public abstract
}

 class China implements Computable//��һ����ʵ����һ���ӿڵ�ʱ������ķ���������д
{
	int number;
	public int f(int x)//public �ؼ����ǹؼ�
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
 
 class Japan implements Computable
 {
	 int number;
	public  int f(int x)//��д�����Ļ�����Ҫ��public�����಻�ܱȸ�����ϸ�
	 {
		 return 46+x;
	 }
 }
 
 class US implements Computable
 {

	@Override
	public int f(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }
public class Computer {
	
	public static void main(String args[])
	{
		China zhang;
		Japan baga;
		zhang = new China();
		baga  = new Japan();
		zhang.number=28+Computable.MAX;
		baga.number=20+Computable.MAX;
		System.out.println(zhang.number);
		System.out.println(baga.number);
		System.out.println(zhang.f(2));
		System.out.println(baga.f(2));
	}

}
