package �ݺ���;

import java.util.Scanner;

public class Ex06�ݺ���_while����6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		

		while(true) {
			System.out.print("����1 : ");
			i = sc.nextInt();
			System.out.print("����2 : ");
			j = sc.nextInt();
			System.out.print("������ : ");
			String z = sc.next();
			if(z.equals("+"))
				System.out.printf("%d + %d = %d\n",i,j,j+i);
			else
				System.out.printf("%d - %d = %d\n",i,j,j-i);
			System.out.print("���? : ");
			String f = sc.next();
			if("N".equals(f)){
				break;
			}
		}
	}
}
