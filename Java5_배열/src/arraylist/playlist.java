'package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
	/*	
		musiclist.add("Maria");
		musiclist.add("HowYouLikeThat");
		musiclist.add("��");
		musiclist.add("��¦������");
	*/
		
		while(true) {
			System.out.print("[1] �뷡��ȸ  [2] �뷡�߰�  [3] �뷡����  [4] ����>>");

			int a = sc.nextInt();
			
			if(a == 1) {
				if(musiclist.size() == 0) {
					System.out.println("��� ����� �����ϴ�.");
				}
				else {
					for(int i = 0; i<musiclist.size(); i++) {
						System.out.println(musiclist.get(i));
					}
				}
			}
			else if(a == 2) {
				System.out.print("[1] ������ �κп� �뷡 �߰� [2] ���ϴ� ��ġ�� �߰� >>");
				int i = sc.nextInt();
				if(i == 1) {
				System.out.print("�߰��� �뷡 �̸��� �����ּ��� : ");
				String music = sc.next();
				musiclist.add(music);
				}
				if(i == 2) {
					System.out.print("���ϴ� ��ġ �Է��ϼ��� : ");
					int j = sc.nextInt();
					System.out.print("�߰��� �뷡 �̸��� �����ּ��� : ");
					String music = sc.next();
					musiclist.add(j,music);
				}
			}
			else if(a == 3) {
				System.out.println("[1] ��ü���� [2] ���û���");
				int num = sc.nextInt();
				
				if(num ==1)
				{
					System.out.println("��ü ���� �Ϸ�");
					musiclist.clear();
				}
				else if(num == 2) {
				/*	System.out.println("������ �뷡 ���� >> ");
					int music = sc.nextInt();
					musiclist.remove(music);
					System.out.println("�뷡 ���� �Ϸ�");
				*/
					
					System.out.print("������ �뷡 �̸��� �����ּ��� : ");
					String music = sc.next();
					for(int j = 0; j<musiclist.size(); j++) {
						if(musiclist.get(j).equals(music)){
							musiclist.remove(j);
							System.out.println("�뷡�� ���� �Ǿ����ϴ�.");
							break;
						}
						else {
							System.out.println("��ġ�� �뷡�� �����ϴ�.");
							break;//��  ��atkgkqslek
						//������ �浹~!!!�ٵ� ���� ������ ���� ������ �ص� �浹�� �Ͼ����??
							// ����... �ٵ� �������� �������� ����.. i�� ����ص� �Ǵµ� .. 
							// �� �浹�� ���°����� �ѹ� ó������ �ڵ带 ���� �˼� �����Ͱ��ƿ�
							//��.. �����մϴ�!!
						}
				}
			}
			}
			else if(a == 4) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}	
		}
	}
}
		
		
	