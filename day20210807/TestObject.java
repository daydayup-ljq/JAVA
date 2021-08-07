package day20210807;

class Cat
{
	int age;
	int height;
	int weight;
	public Cat(int a,int h,int w)
	{
		this.age=a;
		this.height=h;
		this.weight=w;
	}
	@Override
	public String toString() {
		return "Cat [age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + height;
		result = prime * result + weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		else {
			if(obj instanceof Cat)
			{
				Cat c=(Cat)obj;
				if(c.age==age&&c.height==height&&c.weight==weight)
				{
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	
}


public class TestObject {
	public static void main(String args[])
	{
		Cat c1=new Cat(18,65,100);
		Cat c2=new Cat(18,65,10);
		
		
		System.out.println(c1);
		//System.out.println(c1.toString());//重写tostring方法
		
		System.out.println(c2);
		
		System.out.println(c1==c2);
		
		System.out.println(c1.equals(c2));//equals只是判断是不是指向同一个对象，不是判断数值
		
		c1=c2;//c2的哈希码给c1
		System.out.println(c1.equals(c2));
		
		
	}

}
