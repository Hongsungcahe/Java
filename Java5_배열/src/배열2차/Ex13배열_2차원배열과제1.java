package �迭2��;

public class Ex13�迭_2�����迭����1 {

	public static void main(String[] args) {
		int array[][] = new int[5][5];
		int num=1;
		for(int i =0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}