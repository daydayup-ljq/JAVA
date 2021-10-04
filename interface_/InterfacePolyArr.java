package interface_;

public class InterfacePolyArr {

	public static void main(String[] args) {
		//��̬���� - �ӿ���������
		Usb[] usbs = new Usb[2];
		usbs[0] = new Camera_();
		usbs[1] = new Phone_();
		for(int i=0;i<usbs.length;i++)
		{
			usbs[i].work();
			
			//��������ת��
			if(usbs[i] instanceof Phone_)
			{//�ж�������������
				((Phone_)usbs[i]).call();
			}
		}
		
	}

}

interface Usb{
	void work();
}
class Phone_ implements Usb{
	public void call(){
		System.out.println("�ֻ����Դ�绰");
	}

	@Override
	public void work() {
		System.out.println("�ֻ�������...");
		
	}
	
	
}
class Camera_ implements Usb{
	public void take(){
		System.out.println("�����������");
	}
	@Override
	public void work() {
		System.out.println("���������...");
		
	}
}
