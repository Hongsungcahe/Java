package ���ǹ�;

import java.util.Scanner;

public class dfdffdfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");
		int num = sc.nextInt();
		System.out.println("--�޴�-- ");
		System.out.println("1. �ݶ�(1800��)  2. �Ŀ����̵�(2000��)  3. ź���(1200��)");
		System.out.print("������ ����� ��ȣ : ");
		int num2 = sc.nextInt();
		
		int num3 = 0;//�ܵ� ���� ����
	
		//���� ����, �ݾ� ��
		if(num2 == 1) { //�ݶ� ������ ��
			System.out.println("�ݶ�"); 
			if(num < 1800) { //�ݾ� ��, �ݾ��� ���� ��
				System.out.println("�ݾ� ����");
			}
			num3 = num - 1800; //�ܵ��� num3�� ����
		}
		else if(num2 == 2) { //�Ŀ����̵带 ������ ��
			System.out.println("�Ŀ����̵�");
			if(num < 2000) { //�ݾ� ��, �ݾ��� ���� ��
				System.out.println("�ݾ� ����");
			}
			num3 = num - 2000;//�ܵ��� num3�� ����
		}
		else if(num2 == 3) {//ź����� ������ ��
			System.out.println("ź���");
			if(num < 1200) {//�ݾ� ��, �ݾ��� ���� ��
				System.out.println("�ݾ� ����");
			}
			num3 = num - 1200;//�ܵ��� num3�� ����
		}
		else //��ȣ�� ���� ��
			System.out.println("���� ����");
		//������� if�� ��
		//���� ���� �� �ܵ��� ���� ���, ���� ���� ���� �� �ʱ⿡ 0���� �ʱ�ȭ �ؼ�
		// 0�� ���
		System.out.printf("�ܵ� : %d\n", num3);
		System.out.printf("õ�� : %d\n", num3/1000);
		System.out.printf("����� : %d\n", num3%1000/500);
		System.out.printf("õ�� : %d\n", num3%1000%500/100);
	}	
}
