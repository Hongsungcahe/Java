package Thread;
//���ÿ� ���� ��ų�� ����� �� ����
//�̱۽�����
public class Blitzcrank {
	private String skill;//���� ������� ��ų �����ʵ�
	
	public Blitzcrank(String key) {
		skill = key;
	}
	
	//��ų ��� �޼ҵ�
	public void run() {
		System.out.println("�Է� Ű : " + skill);
		for(int i = 1; i<=3; i++) {
			System.out.println(skill + "��ų���" + i + "s");
		}
		System.out.println(skill + "��ų ��� ����");
	}
}
