package StdScore;

import java.util.Scanner;

public class StdScoremain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdSore stds[];
		
		stds = new StdSore[3];

		
		String a = "";
		int b,c,d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <3; i++) {
			StdSore st = new StdSore();
			System.out.print((i+1)+"���� �л��� �̸��� �Է��ϼ��� >> ");
			st.setName(sc.next());
			System.out.print((i+1)+"���� �л��� Java�� �Է��ϼ��� >> ");
			st.setScoreJava(sc.nextInt());
			System.out.print((i+1)+"���� �л��� Web�� �Է��ϼ��� >> ");
			st.setScoreWeb(sc.nextInt());
			System.out.print((i+1)+"���� �л��� Android�� �Է��ϼ��� >> ");
			st.setScoreAndroid(sc.nextInt());
			stds[i] = st;
			}
		for(int i = 0; i<stds.length; i++) {
		System.out.println(stds[i].toString()) ;
		}
		for(int i = 0; i<stds.length; i++) {
			System.out.println(stds[i].getName()+"�� ������ :"+stds[i].sum()+"������ : "+ stds[i].avg()
					) ;
			}
			
		
	}

}
