package ���ǹ�;

import java.util.Scanner;

public class EX05���ǹ�_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ʈ���� ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("����Ʈ���� ���� �Է� : ");
		int b = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� �Է� : ");
		int c = sc.nextInt();
		System.out.print("���α׷��� ��� Ȱ�� �Է� : ");
		int d = sc.nextInt();
		System.out.print("�����ý��� ���� ���� �Է� : ");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		
		if(a>=8 && b>=8 && c>=8 && d>=8 && e>=8 && sum> 60) {
			System.out.println("�հ�");
		}
		else
			System.out.println("���հ�");
		
	}

}
