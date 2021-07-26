package day20210726;

public class ManKind {
//	public ManKind()
//	{
//		System.out.println("ManKid");
//	}
	//当存在显示的构造方法时,默认的就隐藏
	public ManKind(int sex,int salary)
	{
		this.salary=salary;
		this.sex=sex;
	}
	int sex;
	int salary;
	
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void manOrwoman()
	{
		if(this.sex==1)
		{
			System.out.println("man");
			
		}else if(this.sex==0)
		{
			System.out.println("woman");
			
		}
	}
	
	public void employeed()
	{
		if(this.salary>0)
		{
			System.out.println("有工作");
			
		}else if(this.sex<=0)
		{
			System.out.println("没工作");
			
		}
	}

}
