package �迭;

import java.util.Scanner;

public class Ex10�迭_�ǽ�6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String id_arr[] = new String[3];
		int pw_arr[] = new int[3];
		int cnt = 0;
		while(true) {
			System.out.print("[1]ȸ������   [2]�α���    [3]����");
			menu = sc.nextInt();
			
			
			if(menu == 1) {
				System.out.println("ȸ������");
				System.out.print("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				int pw = sc.nextInt();
				
				id_arr[cnt] = id;
				pw_arr[cnt] = pw;
				cnt++;
				
			}
			else if(menu == 2) {
				System.out.println("�α���");
				
				System.out.print("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				int pw = sc.nextInt();
				int i = 0;
				for( i =0; i<=2; i++) {
					if(id_arr[i] != null) {
						if(id_arr[i].equals(id)&&pw_arr[i]==pw) {
							System.out.println("�α��� ����");
							break;
						}
					}
				}
				
				if(i ==3) {
					System.out.println("�α��� ����");
				}
			}
			
			else if(menu == 3) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("1,2,3 �߿� �Է����ּ���");
			}
			
		}
		
		
		
		
		//Ȯ�� for��(�迭/arraylist ���� �� Ȯ���� �� ����ϱ� ���� ����)
		//for~each��
		//for(���� ������(�ƹ��ų�) : �迭�̸�
		for(String s:id_arr) {
			System.out.println(s);
		}
		for(int s:pw_arr) {
			System.out.println(s);
		}
	
	
	
	
	
	}

}
