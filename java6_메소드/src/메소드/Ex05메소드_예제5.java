package �޼ҵ�;

import java.util.Scanner;

public class Ex05�޼ҵ�_����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
	
		int result = largerNumber(num1, num2);
		System.out.println("�� ū����? >>"+result);
	}
	public static int largerNumber(int num1, int num2) {
		
		return (num1>num2?num1:num2);
		/*
		if(a>b) {
			return num1;
		}
		else if(a<b) {
			return num2;
		}
		return 0;*/
	}
	
	

}
