package interface_;

public class InterfacePolyPass {
	/*
	 * ��ʾ��̬��������
	 */

	public static void main(String[] args) {
		//�ӿ����͵ı�������ָ��ʵ���˸ýӿڵ���Ķ���ʵ��
		IG ig = new Teacher();
		//���IG�̳��� IH �ӿ� �� ��Teacher��ʵ����IG�ӿ�
		//���൱��Teacherʵ���� IH�ӿ�
		//����ǽӿڶ�̬��������
		IH ih = new Teacher();
		

	}

}


interface IH{
	void hi();
}
interface IG extends IH{}
class Teacher implements IG{

	@Override
	public void hi() {
		System.out.println("hi...");
		
	}
	
	
}