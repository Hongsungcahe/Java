package Animal;

public class Cat extends Animal{

	public void groom() {
		System.out.println("�׷����");
	}
	
	@Override
	//�������̵��� �� ��Ÿ ����, ������ �� �� ������ Ȯ���� �� �ְ�
	public void cry() {
		System.out.println("�̾߿�!");
	}
}
