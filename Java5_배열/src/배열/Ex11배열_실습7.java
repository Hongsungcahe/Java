package �迭;

import java.util.Scanner;


public class Ex11�迭_�ǽ�7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		int array_1[] = {1,4,3,2,1};
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"���� ���� �Է��ϼ��� : ");
			array[i] = sc.nextInt();
		}
		//�Է��� �� ����ϱ�
		for(int i = 0; i<5; i++) {
			System.out.print(" "+array[i]);
		}
		
		
		System.out.println("");
		System.out.println("����Ȯ��");
		for(int i = 0; i < 5; i++) {
			if(array[i] == array_1[i]) { //�Է� ���� �迭�� ���� �迭�� �� �� ������
				System.out.print("O ");//O���
				num++;//num�� ���� �� ���ϱ� 20(����)�ϱ� ���� ����
			}
			else {
				System.out.print("X ");//Ʋ���� X���
			}
				
		}
		System.out.println("���� : " + num*20);
		
	}

}
