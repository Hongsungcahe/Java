package �޼ҵ�;

import java.util.Scanner;

public class Ex02�޼ҵ�_����2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		getMinusVal(num1, num2);
		getAbsoluteVal(num1,num2);
		System.out.println("�� ���� ���밪�� :  "+		getAbsoluteVal(num1,num2));
		
		//static �޼��� ������ non-static ȣ�� �Ұ�
		// non-static �޼��� ȣ���Ϸ��� -> ��ü, �ν��Ͻ� ������ ȣ���ؾߵ�
		
	}
	private static void getMinusVal(int num1, int num2){
		int a = num1;
		int b = num2;
		System.out.println("�� ���� : "+(a - b));
		
	}
	private static int getAbsoluteVal(int num1, int num2) {
		if(num1 - num2<0) {
			return ((num1-num2)*-1);
		}
		else
			return (num1-num2);
	}
	

}
