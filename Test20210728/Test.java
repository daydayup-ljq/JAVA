package day20210728;


interface Computer{
	public static final int MAX=100;
	public abstract int f(int x);
}

 class China implements Computer{
	int number;
	//һ��һ����ʵ����һ���ӿڵĻ�����Ҫ�ѽӿڵ����з����ó�����д
	//�����Ժ�Ϳ��Ե���

	@Override
	public int f(int x) {
		// TODO Auto-generated method stub
		return x+46;
	}
	
}
public class Test {
	// instanceof �ؼ���
	// x instanceod A:
	//���x�Ƿ�Ϊ��A�Ķ��󣬷���ֵΪboolean��
	
	//Object��
	//������Java��ĸ�����
	//��������������û��ʹ��extends�ؼ���ָ���丸��,��Ĭ�ϸ���ΪObject��
	
	/*
	 * ����,���test��������һ���ββ���,��������Ҳ�ȷ�����׻ᴫ����һ��ʲô��
	 * ����ȷ�����Ǵ���ʵ��һ������һ���࣬��ôtest�������β�Ҫ����һ��ʲô����?
	 */
	/*public void test(Object obj)
	{
		
	}*/
	
	public static void main(String[] args)
	{
		/*Test t=new Test();
		Person p=new Person();
		Student s=new Student();
		t.test(p);
		t.test(s);
		t.test(new Kids());
		
		Person e=new Person();//��������ջ��,new�����Ŀռ��ڶ���
		e=p;
		System.out.println(p.equals(e));//Ϊʲôp�������ִ��object�ķ���
		//object��������ĸ��࣬�������ʹ�ø���ķ���
		
		Object o=new Object();
		System.out.println(o.hashCode());
		
		Object pp=new Person();//����ʵ�����Խ����κ��������*/
		
		//�ӿ�,һ������ĳ�����
		//ֻ���������ͷ�������,û�б����ͷ�����ʵ��
		//final:���峣����Ҫ��ֵ
		//
		
		China zhong;
		zhong=new China();
		zhong.number=28+Computer.MAX;
		System.out.println(zhong.number+" "+zhong.f(100));
	}

}
