package Thread;

public class Ari2 implements Runnable{
	
private String skill;
	
	public Ari2(String key) {
		skill = key;
	}
	//������ Ŭ������ run()�޼ҵ带 �������̵�(������)�� ��
	//run() => ������ �ڵ�
	//������� Run()�޼ҵ忡�� ���� ������ �����ϰ� Run() ����Ǹ� �����嵵 ����
	//�������̵� ���������� Thread Ŭ������ �ۼ��� Run()�� ȣ���ϰ� �Ǹ�
	//�̶� run()�޼ҵ�� �ƹ��ϵ� �����ʰ� �����带 �ٷ� ����
	public void run() {
		System.out.println("�Է� Ű : "+ skill);
		for(int i =1; i<=3; i++) {
			System.out.println(skill + "��ų ��� �� : " + i+ "s");
		}
		System.out.println(skill + "��� ����");
	}
	
}
