package ���ǹ�;

import java.util.Scanner;

public class Ex07���ǹ�_ifelse����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ��� �Է��ϼ��� : ");
		String data = sc.next();
		
		if("A".equals(data)) {
			System.out.println("A�Է�");
		}
		else if("B".equals(data)) {
			System.out.println("B�Է�");
		}
		else if("C".equals(data)){
			System.out.println("C�Է�");
		}
		else
			System.out.println("A,B,C �� �Է�");
		
	}

}
