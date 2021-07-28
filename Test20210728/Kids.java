package day20210728;

public class Kids extends ManKind{
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
	
	
	public static void main(String[] args)
	{
		Kids someKid=new Kids();
		someKid.setSex(0);
		someKid.setSalary(100);
		someKid.manOrwoman();
		someKid.employeed();
	}

}
