package EPoketmon;

public interface Epoketmon {//��ü ���� �Ұ���
	//�������̽� �������� ����� ���� ����(final)
	//����� ������ ������ �� �ʱ�ȭ ���������
	final String type = "����";
	
	int Level = 1;//���
	//�������̽� ������ ���� ������ �Ұ����ϱ� ������ final�� �Ⱥٿ���
	//����� ����(�ʱ�ȭ�� �ؾߵ�)
	
	//�������̽� �������� �߻�޼��� ���𰡴�
	public abstract void attact();
	public void moving();//�߻����� �ڵ� ����
	
	//java8���� �̻���ʹ� �Ϲݸ޼��嵵 ���� ����
	//default, static�� �پ�� ����
	//default : ���������ڰ� �ƴ϶� �������̽� ������ �Ϲ� �޼��带 ������ �� �ְ� ���ִ� Ű����
	public default void hello() {
		System.out.println("�ȳ�");
	}
	public static void hello2() {
		System.out.println("�ȳ�");
	}	
}
