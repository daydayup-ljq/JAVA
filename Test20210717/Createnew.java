
public class Createnew {
	public static void main (String[] args) {
		//ʵ����person�࣬����person��
		Animal animal=new Animal();//����һ��Animal���͵ı���,��������animal
		//new Animal����ʵ����
		animal.name="����������";//��animal��name���Ը�ֵ
		animal.furcolor("��");//��������;
		animal.type="�鳤��";
		String i=animal.showType();		
		System.out.println(i);
		System.out.println(animal.name);
		animal.move("��");
		
	}

}
