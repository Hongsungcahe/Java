package ������;

import java.util.Scanner;

public class Calculatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num2 = sc.nextInt();		
		
		new Calculator();
		Calculator cal = new Calculator(num1,num2);
		
		System.out.println(cal.sum());
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num2 = sc.nextInt();		
	
		cal.setNum1(num1);
		cal.setNum2(num2);
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
	}
}
