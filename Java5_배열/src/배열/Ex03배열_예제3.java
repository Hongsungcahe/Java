package �迭;

import java.util.Random;

public class Ex03�迭_����3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[10];
		for(int i = 0; i<10; i++) {
			array[i] = rd.nextInt(100);
		}
		
		int count = 0;	System.out.print("Ȧ���� ");
		for(int i = 0; i<10; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i]+" ");
				count++;
				}
		}	
		System.out.println("��" + count+"���Դϴ�.");
}

}
