package ���ǹ�;

import java.util.Scanner;

public class Ex06���ǹ�_ifelse����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score�� �Է��ϼ��� : ");
		int a = sc.nextInt();
		if(a>=90)
			System.out.println("A�����Դϴ�.");
		else if(a>=80)
			System.out.println("B�����Դϴ�.");
		else if(a>=70)
			System.out.println("C�����Դϴ�.");
		else
			System.out.println("F�����Դϴ�.");
		
	}

}