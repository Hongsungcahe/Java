package ������;

public class Ex08��Ʈ����Ʈ������ {

	public static void main(String[] args) {
		//��Ʈ ������  
		//AND(&) - �Ѵ� true�϶� true
		//OR(|) - �Ѵ� false�϶� false
		//XOR(^) - �ΰ��� ���� �� 0 �ٸ��� 1
		//NOT(~) - 0�� 1�� �ݴ�� (�Ǿ� 1��  (-)��ȣ)
		System.out.println(6&7);
		System.out.println(6|7);
		System.out.println(6^7);
		System.out.println(~120);
		
		//����Ʈ ������
		//<<���� : ���ڸ�ŭ 2�� n���ؼ� ���ϱ�
		//>>���� : ���ڸ�ŭ 2�� n���ؼ� ������
		int a = 3;
		int b = a>>4;
		System.out.println(b);
	}

}
