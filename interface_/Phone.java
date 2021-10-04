package interface_;

//Phone 类 实现 Usbinterface
//即Phone需要实现 接口提供的方法
public class Phone implements UsbInterface{

	@Override
	public void start() {
		System.out.println("手机开始工作...");
		
	}

	@Override
	public void stop() {
		System.out.println("手机停止工作...");
		
	}
	

}
