package ���ǹ�;

import java.util.Scanner;

public class EX10���ǹ�_switch����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int weather = sc.nextInt();
		
		switch(weather) {
		case 1  :
		case 2  :
		case 12  :
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3  :
		case 4  :
		case 5  :
			System.out.println("���Դϴ�.");
			break;
		case 6  :
		case 7  :
		case 8  :
			System.out.println("�����Դϴ�.");
			break;
		case 9  :			
		case 10  :
		case 11  :
			System.out.println("�����Դϴ�.");
			break;
		}
		
		
	}

}
