package �ݺ���;

import java.util.Scanner;

public class Ex02�ݺ���_while����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = 0;
		int fnum = 0;
		while(num != -1) {
			System.out.print("�� �Է� : ");
			num = sc.nextInt();
			fnum+=num;
		}	
		System.out.println(fnum+1);
	}
		
}


