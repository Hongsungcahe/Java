package �ݺ���;

import java.util.Random;
import java.util.Scanner;
public class Ex07�ݺ���_while���� {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			int num = 0;
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			int c=0;
			int b=0;
			while(true) {
			System.out.print("�� �Է� : ");
			int num3 = sc.nextInt();
			System.out.printf("%d + %d = %d\n",num1,num2,num3);
			if(num1+num2 == num3) {
				System.out.println("succes");
				c++;
				System.out.print("����Ͻðڽ��ϱ�?");
				String a = sc.next();
				if(a.equals("N")) {
					System.out.println("����");
					break;
				}
				num1 = rd.nextInt(10);
				num2 = rd.nextInt(10);
			}
			else {
				System.out.print("����Ͻðڽ��ϱ�?");
				b++;
				String a = sc.next();
				if(a.equals("N")) {
					System.out.println("����");
					break;
					
				}
			}
		}
			System.out.println("���� ���� : "+ c);
			System.out.println("Ʋ�� ���� : "+ b);
	}
}


