package day20210728;

public class ManKind {
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
