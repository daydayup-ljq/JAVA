package day20210808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//�쳣����
class People{
	private int age=1;
	public void setAge(int age)throws ArithmeticException{
		if(age>=160||age<=0)
		{
			//�����׳��쳣���·�������
			throw new ArithmeticException(age+"illegal");
		}
		else
		{
			this.age=age;
		}
	}
	public int getAge()
	{
		System.out.println(age+"legal");
		return age;
	}
}
public class Test {

	public static void main(String[] args) {
		
		People wang=new People(),zhang=new People();
		try {
			wang.setAge(180);
			System.out.println(wang.getAge());
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try {
			zhang.setAge(18);
			System.out.println(zhang.getAge());
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		/*int d=0,a;
		try
		{
			a=42/d;
		}catch(ArithmeticException e)//��ѧ�쳣--����
		{
			System.out.println("catched");
			e.printStackTrace();//��ӡ��ջ��Ϣ
		}
		System.out.println("going");*/
		
		/*int [] a=new int [5];
		try
		{
			a[10]=200;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e)//Խ��
		{
			System.out.println(e);
			System.out.println("going here");
		}*/
		
		/*FileInputStream in =null;
		
		
		try{in =new FileInputStream("myfile.txt");
		int b;
		b=in.read();
		while(b!=-1)
		{
			System.out.println((char) b);
			b=in.read();
		}
		
		}catch(FileNotFoundException e)
		{
			System.out.println("�������Ҳ����ļ�");
			//System.out.println(e);
		}
		catch(IOException e)//��������ָ���������
		{
			System.out.println("IO�������쳣");
		}finally {//�뿪ǰ��Ҫִ��finally�еĶ���
			try {
				in.close();
			} catch (IOException e2) {
				// TODO: handle exception
				System.out.println("�ر�IO�쳣");
			}
			catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("��ָ���쳣");
			}
			
		}*/
		//�쳣����Ҳ�ָߵͼ�
		//����ȷ���쳣Ӧ����ȥִ��
		
		
	
	}

}
