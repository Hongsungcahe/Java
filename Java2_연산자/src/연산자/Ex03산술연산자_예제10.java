package ������;

import java.util.Scanner;

public class Ex03���������_����10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		time = time - hour*3600;
		int min = time/60;
		time = time - min*60;
		int sec = time;
		
		System.out.printf("%d�� %d�� %d��",hour,min,sec);
	}
}
