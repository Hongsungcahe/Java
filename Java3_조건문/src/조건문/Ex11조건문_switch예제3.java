package ���ǹ�;

import java.util.Scanner;

public class Ex11���ǹ�_switch����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//��ĳ��
		System.out.print("�ݾ� �Է� : ");
		int num = sc.nextInt();
		System.out.println("--�޴�-- ");
		System.out.println("1. �ݶ�(1800��)  2. �Ŀ����̵�(2000��)  3. ź���(1200��)");
		System.out.print("������ ����� ��ȣ : ");
		int num2 = sc.nextInt();

		switch(num2) {
		case 1 : 
			System.out.printf("�ܵ� : %d��\n",num-1800);
			if(num<1800) 
				System.out.println("���� �����ؿ� ��-��");
			else {
				int a = num - 1800;
				System.out.printf("õ�� : %d\n",a/1000);
				System.out.printf("����� : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("��� : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		case 2 :
			System.out.printf("�ܵ� : %d��\n",num-2000);
			if(num<1800) 
				System.out.println("���� �����ؿ� ��-��");
			else {
				int a = num - 2000;
				System.out.printf("õ�� : %d\n",a/1000);
				System.out.printf("����� : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("��� : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		case 3 : 
			System.out.printf("�ܵ� : %d��\n",num-1200);
			if(num<1800) 
				System.out.println("���� �����ؿ� ��-��");
			else {
				int a = num - 1200;
				System.out.printf("õ�� : %d\n",a/1000);
				System.out.printf("����� : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("��� : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		}
	}

}
