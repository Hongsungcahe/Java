package �ݺ���;

import java.util.Scanner;

public class Ex05�ݺ���_while����5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1;
		
		while(num<4) {
			System.out.print("���̵� �Է��ϼ��� : ");
			String id = sc.next();
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			int pw = sc.nextInt();
			if("smhrd".equals(id) && pw == 1234) {
				System.out.println("�α��� ����");
				break;
			}
		
			else
				System.out.println("�ٽ� �Է��ϼ���.");
			
		}

	}

}
