/*
 * �������
 */
public class Animal {
	String name;
	int eyecolor;
	int legs;
	String type;
	
	/*
	 * ��������Ƥë��ɫ
	 */
	public void furcolor(String color)
	{
		System.out.println("���ֶ���Ƥë����ɫ��:"+color);
	}
	
	/*
	 * ���������ƶ���ʽ
	 */
	public void move(String mode) {
		System.out.println("���ֶ�����ƶ���ʽ "+mode);
	}
	
	public String showType()
	{
		return type;
	}

}
