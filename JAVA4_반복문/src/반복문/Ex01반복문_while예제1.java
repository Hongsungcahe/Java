package �ݺ���;

import java.util.Scanner;

public class Ex01�ݺ���_while����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = sc.nextInt();
		
		while(num<10) {
			System.out.println("���ڴ� : "+ num);
			System.out.println("���� ���� �Է� : ");
			 num = sc.nextInt();
		}
		System.out.println("��� ��!");
		num = 0;
		do {
			System.out.println("���ڴ� : "+ num);
			System.out.println("���� ���� �Է� : ");
			 num = sc.nextInt();
		}while(num<10);
		System.out.println("��� ��!");
	}

}
