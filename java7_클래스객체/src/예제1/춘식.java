package ����1;

public class ��� {
//����� ĳ���� ����
	//�Ӽ�(field), �ൿ(method)
	//1. �Ӽ� : �̸�, ����, ���ݷ�
	String name;
	int level;
	int power;
	
	//������ : newŰ���� ����ؼ� ��ü�� �����Ҷ��� ȣ��Ǵ� �޼���
	//���� ������ Ŭ�����̸�(){}
	//�Ű�����X, ���X
	public ���() {
		
	}
	
	public ���(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;
		
	}
	
	//2. �޼ҵ� : �����Ѵ�, �ȴ´�, 
	public void attack() {
		System.out.println(name +"����");
	}
	public void work() {
		System.out.println("�ȴ´�");
	}
}
