package �ݺ���;

import java.util.Scanner;

public class Ex11�ݺ���_for������3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int i = sc.nextInt();
		int j=1;
		for(; j<=i; j++)
		{
			if(i%j==0)
				System.out.println(j);
		}
	}
}

