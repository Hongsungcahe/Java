package ������;

import java.util.Scanner;

public class Ex07���׿�����_����3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1>num2 ? "�� ���� �� : " +(num1-num2)
				: "�� ���� �� : " +(num2-num1));
	}
}
