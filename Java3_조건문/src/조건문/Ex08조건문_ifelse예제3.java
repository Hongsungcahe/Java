package ���ǹ�;

import java.util.Scanner;

public class Ex08���ǹ�_ifelse����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ܾ��� �Է��ϼ��� : ");
		int data = sc.nextInt();
		
		System.out.print("����/û�ҳ�/��� : ");
		String age = sc.next();

		if("����".equals(age)) {
			if(data>=1800) {
				System.out.println("�����մϴ�.");
			}
		}
		else if("û�ҳ�".equals(age)) {
			if(data>=1500) {
				System.out.println("�ݰ����ϴ�.");
			}
		}
		else if("���". equals(age)) {
			if(data>=1000) {
				System.out.println("�ȳ��ϼ���.");
			}
		}
		else
			System.out.println("�ܾ׺����Դϴ�.");
	
	}

}
