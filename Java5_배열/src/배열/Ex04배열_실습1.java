package �迭;

import java.util.Scanner;

public class Ex04�迭_�ǽ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			System.out.print(i+"��° �迭 �� : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i <= 9; i++) {
			if(arr[i]%3 == 0){
			System.out.println(arr[i]);
			}
		}
	}
}

