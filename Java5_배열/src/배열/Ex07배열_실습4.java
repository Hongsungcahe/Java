package �迭;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex07�迭_�ǽ�4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int max = 0,sum = 0;
		for(int i = 0; i<5; i++) {
			System.out.print((i+1)+"��° �Է� : ");
			array[i] = sc.nextInt();
		}
		int min = array[0];
		for(int i = 0; i < 5; i++) {
			if(max<=array[i]) {
				max = array[i];
			}
			if(min >= array[i]) {
				min = array[i];
			}
			sum += array[i];
		}
		System.out.println("ū �� : "+max);
		System.out.println("���� �� : "+min);
		System.out.println("���� : "+sum);
		System.out.println("���� : "+(double)sum/array.length);
	}
}
