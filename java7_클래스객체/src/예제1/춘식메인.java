package ����1;

public class ��ĸ��� {

	public static void main(String[] args) {
		new ���();
		
		��� cs = new ���();
		
		//���� �Ӽ� ���
		
		//������ ��� �ν��Ͻ��� ������ ����
		System.out.println(cs.level);
		cs.attack();
		
		cs.name = "�� �����";
		cs.level = 20;
		cs.power = 50;
		
		System.out.println("�̸� : "+cs.name);
		System.out.println("���� : " +cs.level);
		System.out.println("���ݷ� : "+cs.power);
		
		��� cs2 = new ���("���2",10,50);
		
		cs2.attack();
	}
}
