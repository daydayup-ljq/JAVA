package interface_;

public class Computer {
	//编写一个方法
	public void work(UsbInterface usbinterface )
	{
		usbinterface .start();
		usbinterface .stop();
	}

}
