package �迭;

import java.util.Random;

public class Ex08�迭_�ǽ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int array[] = new int[5];
		int i=0;
		for (i = 0; i<array.length; i++) {
			array[i] = rd.nextInt(9)+1;
			for(int j = 0; j<i; j++) {
				if(array[i] == array[j]) {
					i--;
					break;
				}
			}
			
		}
		System.out.println("====�ζ�====");
		for (i = 0; i<5; i++) {
			System.out.print(array[i] +" ");
		}
	}
}
