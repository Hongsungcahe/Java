package ����1;

public class PiggyBankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank pb = new PiggyBank();

		//priavte ���������ڰ� �����ʵ�� �ٷ� ����X
		//����� ����ؼ� �� �����ؾߵ�
		//pb.money = 1000000;
		
		pb.deposit(1000);
		pb.showMoney();
		System.out.println("================");
		pb.withdrow(600);
		pb.showMoney();
		System.out.println("================");
		pb.withdrow(600);
		pb.showMoney();
	}

}
