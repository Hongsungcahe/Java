package ���ǹ�;

import java.util.Scanner;

public class Ex09���ǹ�_switch����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String Hi = sc.next();
		
		switch(Hi) {
		case "�ѱ���":
			System.out.println("�ȳ��ϼ���");
			break;
		case "����":
			System.out.println("���");
			break;
		
		case "�߱���":
			System.out.println("���Ͽ�");
			break;
		
		default :
			System.out.println("�ٸ����Է�");
		}
		
	}
}

