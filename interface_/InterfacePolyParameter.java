package interface_;

public class InterfacePolyParameter {

	public static void main(String[] args) {
		//�ӿڵĶ�̬����
		//�ӿ����͵ı���if01����ָ�� ʵ����IF�ӿڵĶ���ʵ��
		IF if01 = new Monster();
		if01 = new Car();

	}

}

interface IF{};
class Monster implements IF{};
class Car implements IF{};
