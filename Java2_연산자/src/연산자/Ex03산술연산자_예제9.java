package ������;

import java.util.Scanner;

public class Ex03���������_����9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA ���� �Է� : ");
		int Java_grade = sc.nextInt();
		System.out.print("WEB ���� �Է� : ");
		int WEB_grade = sc.nextInt();
		System.out.print("ANDROID ���� �Է� : ");
		int ANDROID_grade = sc.nextInt();
		int sum = Java_grade + WEB_grade + ANDROID_grade;
		System.out.printf("�հ� : %d",sum);
		System.out.println();
		System.out.printf("��� : %.2f",(float)sum/3);
	}

}
