package �޼ҵ�;

import java.util.Scanner;

public class Ex06�޼ҵ�_����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivisor(num1, num2);
		//���� is�� ���� �޼ҵ�� booleanŸ��
		System.out.println(result);
		getDivisor(24);
		
		
		int num = 10;
		int result2 = getSumOfDivisor(num);
		System.out.println(num + "�� ����� ���� : "+result2);
		
		
		int num3 = 8128;
		boolean result3 = isPerfectNumber(num3);
		System.out.println(num3 + "�� �������ΰ�? >>"+ result3);
		
		
		int startNumber = 2;
		int endNumber = 1000;
		getperfectNumber(startNumber,endNumber);
		
	}
	
	public static boolean isDivisor(int a, int b) {
		boolean result = false;
		if(a%b == 0)
			return true;
		else 
			return result;
	}
	public static void getDivisor(int num) {
		String result = "";
		result += num +"�� ��� : ";
		System.out.print(result);
		for(int i = 1; i<=24; i++) {		
			
			if(isDivisor(num,i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static int getSumOfDivisor(int n) {
		int result=0;
		for(int i = 1; i<=n; i++) {		
			
			if(isDivisor(n,i)) {
				result += i;
			}
		}
		
		return result;
		
	}
	public static boolean isPerfectNumber(int c){
		int result = 0;
		boolean result1 = false;
	
		if(c==getSumOfDivisor(c)/2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void getperfectNumber(int a, int b) {
		String result = "";
		result = a + "~" + b+ "������ ������ : ";
		
		for(int i = a; i<=b; i++) {
			if(isPerfectNumber(i)) {
				result += i +" " ;
			}
		}
		System.out.println(result);
	}
}
