package Phone;

public class SmartPhone extends Phone{
	//�ʵ�(�Ӽ�) : (����Ŀ, ����ũ)->Phone Ŭ���� , ī�޶�
	//�޼���(���) : (��ȭ�ϴ�, �����ϴ�)->Phone, ���ͳ��ϴ�.
	String camera;
	//SmartPhone�� ������ �� �� speaker �ʵ� ���� �ʱ�ȭ(LG);
	
	public SmartPhone() {
		super("LG");//����Ŭ������ ������ ȣ��
		//���� ���� �� ����Ŭ������ �⺻������ȣ��
	}
	
	public void internet() {
		System.out.println("���ͳ� ����");
	}
	public String getSpeaker() {
		//super:�θ� ���(�ʵ�, �޼���) ȣ��
		return super.getSpeaker();
	}
}
