package �ݺ���;

import java.util.Scanner;

public class Ex03�ݺ���_while���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		while(num!=-1) {
			System.out.print("�� �Է� : ");
			num = sc.nextInt();
			if(num%2==0)
				num2++;
			else
				num3++;
				
		}
		System.out.println("Ȧ�� ���� : "+(num3-1));
		System.out.println("¦�� ���� : "+num2);
	}

}
