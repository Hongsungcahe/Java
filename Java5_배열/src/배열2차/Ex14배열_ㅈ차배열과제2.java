package �迭2��;

public class Ex14�迭_�����迭����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[5][5];
		int num=1;
		for(int i =0; i<5; i++) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					array[i][j] = num;
					num++;
				}
			}
			else {
				for(int j=4; j>=0; j--) {
				array[i][j] = num;
				num++;
			}
				
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