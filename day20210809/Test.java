package day20210809;
//��̬��ϰ

class animal
{
	String name;
	animal(String name)
	{
		this.name=name;//�ֲ�������ֵ��ȫ�ֱ���
		
		}
	
	void enjoy()
	{
		System.out.println("......");
	}
}

class cat extends animal
{
	String eyescolor;
	
	cat(String name,String c)
	{
		super(name);
		eyescolor=c;
		
	}

	@Override
	void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}

class dog extends animal
{
	String furcolor;
	dog(String name,String c)
	{
		super(name);
		furcolor=c;
	}
	@Override
	void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}

class bird extends animal
{
	String name;
	int age;
	bird(String name,int a)
	{
		super(name);
		age=a;
	}
	@Override
	void enjoy() {
		// TODO Auto-generated method stub
		System.out.println("��");
	}
	
	
}
class lady
{
	String name;
	int age;
	lady(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void playwith(animal a)
	{
		a.enjoy();
	}
}
public class Test {
	
/*	void f(animal a)//��������
	{
		System.out.print(a.name);
		if(a instanceof dog)
		{
			dog d2=(dog) a;
			System.out.println(" is dog");
		}
		else if(a instanceof cat)
		{
			cat c2=(cat) a;
			System.out.println(" is cat");
		}
	}*/
	
	
	
	public static void main(String []args)
	{
		animal a=new animal("������");
		cat c=new cat("mimi","green");
		dog d=new dog("dahuang","huang");
		lady l=new lady("jiaojiao",18);
		bird b=new bird("������", 2);
		l.playwith(d);
		
		/*Test t=new Test();
		t.f(a);
		t.f(d);
		t.f(c);*/
		//System.out.println(a instanceof animal);//a��animal�������
	//	System.out.println(c instanceof animal);
		//System.out.println(a instanceof dog);
		
		//a=new dog("xiaobai", "white");//�������ָ����������
		/*System.out.println(a instanceof dog);
		System.out.println(a instanceof animal);
		System.out.println(a instanceof cat);*/
		
		//a=new cat("huahua", "hua");
		/*System.out.println(a instanceof dog);
		System.out.println(a instanceof animal);
		System.out.println(a instanceof cat);*/
		
		//System.out.print(a.name);
		//System.out.println(c.eyescolor);
		//cat c1=(cat) a;//ǿ��ת��
		//System.out.println(c1.eyescolor);
		
		
		
		/*if (a instanceof dog)
		{
			dog d1=(dog) a;
			System.out.println(" a is dog");
		}
		else
		{
			System.out.println("a isn't a dog");
		}

		if (a instanceof cat)
		{
			cat c1=(cat) a;
			System.out.println(" a is cat");
		}
		else
		{
			System.out.println("a isn't a cat");
		}*/

				
	}

}
