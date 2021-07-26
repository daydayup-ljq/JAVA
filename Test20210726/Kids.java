package day20210726;

public class Kids extends ManKind{
	public Kids(int sex,int salary)
	{
		super(sex,salary);
		//在父类只有有参构造可以使用的时候，子类必须显示的构建一个构造来调用父类的有参构造
		//并且调用父类构造方法要写在第一行
		System.out.println("ManKinds");
	}
	int yearsOld;
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge()
	{
		System.out.println(this.yearsOld);
	}
	
	/*
	 * 重写了父类的方法
	 */
	@Override
	public void employeed() {
		// TODO Auto-generated method stub
		super.employeed();
		//System.out.println("Kids do not need jood");
		
		super.employeed();//先执行调用父类的方法
		System.out.println("Kids do not need jood");
	}
	
	public static void main(String[] args)
	{
		Kids someKid=new Kids();//new 是在调用Kids类的默认无参构造方法，在这个过程中就会
		//使用父类的无参构造
//		someKid.setSex(0);
//		someKid.setSalary(100);
//		someKid.manOrwoman();
//		someKid.employeed();
		
	}

}
