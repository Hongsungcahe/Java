package ����1;

public class PiggyBank {
	//���� Ŭ����(��ü)�������� ���� �����ϵ���
	private int money ;
	
	public void deposit(int money) {
		this.money = this.money + money;
	}
	public void withdrow(int money) {
		if(this.money >= money)
			this.money -=money;
		else
			System.out.println("�ܾ� �����մϴ�. ");
	}
	public void showMoney() {
	System.out.println("���� �ܾ� : "+money);
	}
}
