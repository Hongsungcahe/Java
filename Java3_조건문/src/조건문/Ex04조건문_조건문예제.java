package ���ǹ�;

import java.util.Scanner;

public class Ex04���ǹ�_���ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA ���� �Է� : ");
		int java = sc.nextInt();
		System.out.print("Python ���� �Է� : ");
		int python = sc.nextInt();
		System.out.print("Android ���� �Է� : ");
		int android = sc.nextInt();
		
		int avg = java + python + android;
		if(avg/3 >= 80)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}

}
