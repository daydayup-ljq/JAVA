package day20210726;

public class Kids extends ManKind{
	public Kids(int sex,int salary)
	{
		super(sex,salary);
		//�ڸ���ֻ���вι������ʹ�õ�ʱ�����������ʾ�Ĺ���һ�����������ø�����вι���
		//���ҵ��ø��๹�췽��Ҫд�ڵ�һ��
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
	 * ��д�˸���ķ���
	 */
	@Override
	public void employeed() {
		// TODO Auto-generated method stub
		super.employeed();
		//System.out.println("Kids do not need jood");
		
		super.employeed();//��ִ�е��ø���ķ���
		System.out.println("Kids do not need jood");
	}
	
	public static void main(String[] args)
	{
		Kids someKid=new Kids();//new ���ڵ���Kids���Ĭ���޲ι��췽��������������оͻ�
		//ʹ�ø�����޲ι���
//		someKid.setSex(0);
//		someKid.setSalary(100);
//		someKid.manOrwoman();
//		someKid.employeed();
		
	}

}
