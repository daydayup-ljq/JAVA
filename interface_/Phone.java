package interface_;

//Phone �� ʵ�� Usbinterface
//��Phone��Ҫʵ�� �ӿ��ṩ�ķ���
public class Phone implements UsbInterface{

	@Override
	public void start() {
		System.out.println("�ֻ���ʼ����...");
		
	}

	@Override
	public void stop() {
		System.out.println("�ֻ�ֹͣ����...");
		
	}
	

}
