package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FolderPhone p2 = new FolderPhone();
		SmartPhone p3 = new SmartPhone();
		
		
		p2.call();
		
		//����Ʈ���� ���� ������ �������� Phone�� ��ӹ޾����Ƿ� ��밡���ϴ�.
		p3.call();
		
		//�θ��� ����� ���� �����Ͽ� ����ϴ� �� -> �������̵�
		
		
		//�θ�� �ڽĲ� ��� X
		//p1.internet();
		
	
		System.out.println(p3.getSpeaker());
		
		//�޼��忡�� �����ε� X
		
	}

}
