package �ݺ���;

import java.util.Scanner;

public class Ex04�ݺ���_while����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		int num5=0;
	
		System.out.print("��ǥ ������ �Է� : ");
		num = sc.nextInt();
		System.out.print("���� ������ �Է� : ");
		num2 = sc.nextInt();
		while(num2 >= num) {
			int num4= 0;
			System.out.print(num5+"���� ������ ������ �Է� : ");
			num5++;
			num4 = sc.nextInt();
			num2-=num4;	
			
		}
		System.out.println("���� ������ : "+num2);
	}

}
