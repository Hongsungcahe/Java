package Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] key = {"Q", "W", "E"};
		
		for(int i = 0; i<key.length; i++) {
			Blitzcrank b = new Blitzcrank(key[i]);
			b.run();
		}
		System.out.println("===========================");
		for(int i =0; i<key.length; i++) {
			Ari a = new Ari(key[i]);
			//Start() �޼ҵ带 ȣ���ϸ� �����带 ���� ��Ŵ
			//�����尡 ������ �����ϱ����ؼ��� �� start() �޼��带 ȣ���ؾ���
			//start()�޼ҵ�� ����� �������̵� �ϸ� �ȵ�
			
			//������ ������ ��ü�� �����ٸ��� ������ ���·� ��ȯ�ϵ��� jvi���� ����
			//�����ٸ� : �޸𸮿� ����� ���α׷��� CPU�� ������ �� �ֵ��� �ü���� �����忡�� CPU�Ҵ�
			//�����ٸ��� ���ؼ� �ش� �����尡 �����̵Ǹ� jvm�� ���ؼ� run() �޼��尡 ȣ��Ǿ� ������ ��
			a.start();//�����带 �����Ϸ��� ����ؾߵ�
		}

		System.out.println("===========================");
		for(int i =0; i<key.length; i++) {
			Thread thread = new Thread(new Ari2(key[i]));
			thread.start();
		}
	}
		
}
