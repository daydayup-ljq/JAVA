package day20210827;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 int[] arr= {1,2,3};
		
		 Scanner myscan=new Scanner(System.in);
		 
		 do {
			 int []arrNew=new int[arr.length+1];
		 for(int i=0;i<arr.length;i++)
		 {
			 arrNew[i]=arr[i];
		 }
		 
		 System.out.println("��������Ҫ��ӵ�����:");
		 
		 int addNum=myscan.nextInt();
		 arrNew[arr.length]=addNum;
		 
		 arr=arrNew;
		 
		 System.out.println("չʾ��չ���Ч��");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(" "+arr[i]);
		 }
		 
		 System.out.println("�Ƿ���Ҫ�������?(y/n)");
		 
		 char key=myscan.next().charAt(0);
		 if(key=='n')
		 {
			 System.out.println("���˳������");
			 break;
		 }
		 
		 }while(true);
		
		 
	}

}
