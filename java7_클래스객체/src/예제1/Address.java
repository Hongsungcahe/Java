package ����1;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		new AddressList();
		AddressList al = new AddressList();
		
		
		System.out.print("�̸� : ");
		al.name = sc.next();
		System.out.print("�ּ� : ");
		al.address = sc.next();
		System.out.print("��ȣ : ");
		al.call = sc.next();
		
		al.shoaddr();
		
		AddressList al1 = new AddressList();
		System.out.print("�̸� : ");
		al1.name = sc.next();
		System.out.print("�ּ� : ");
		al1.address = sc.next();
		System.out.print("��ȣ : ");
		al1.call = sc.next();
		
		al1.shoaddr();
		
	}

}
