package �迭2��;

import java.util.Scanner;

public class Ex17�迭_2��������迭����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]seat = new int[4][];
		int sum[];
		sum = new int[4];
		seat[0]=new int[1];
		seat[1]=new int[3];
		seat[2]=new int[2];
		seat[3]=new int[2];
		
		
		
		for(int i = 0; i<seat.length; i++) { //1���� �迭�� ��
			System.out.print((i+1)+"�� ���� �Է� : ");
			for(int j=0; j<seat[i].length; j++) {
				
				seat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<seat.length; i++) { //1���� �迭�� ��
			for(int j=0; j<seat[i].length; j++) {
				sum[i] += seat[i][j];
			}
			System.out.println("");
		}
		for(int i = 0; i<seat.length; i++) { //1���� �迭�� ��
			System.out.print((i+1)+"�� ���� ���� :  "+sum[i]);
			System.out.println("");
			
				System.out.print((i+1)+"�� ���� ��� :  "+(double)sum[i]/seat[i].length);
			
			System.out.println("");
		}
		

	}

}
