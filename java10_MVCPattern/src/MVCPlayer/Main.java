package MVCPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �÷��̾�
		
		
		Scanner sc = new Scanner(System.in);
		//[1] ���  [2] ����  [3] ������  [4] ������  [5]���� >>
		
		
		MP3Player mp3 = new MP3Player();
		//controller �ȿ� ����� ����ϱ����� Ŭ���� ��������
		Controller con = new Controller();
		//music Ŭ�����ȿ� �ִ� �����鿡�� �����͸� ���������
		Music music1 = new Music("��","Rain",59,"C:\\Users\\smhrd\\Desktop\\music\\��.mp3");
		Music music2 = new Music("Maria","ȭ��",59,"C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("MANGO","�̸���",59,"C:\\Users\\smhrd\\Desktop\\music\\MAGO.mp3");
		Music music4 = new Music("How you like that","����ũ",59,"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("��¦������","�����̰�",59,"C:\\Users\\smhrd\\Desktop\\music\\��¦������.mp3");
		
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		
		list.get(0).getTitle();
		int index = 0;
		while(true) {
			//[1] ���  [2] ����  [3] ������  [4] ������  [5]���� >>
			System.out.print("[1] ���  [2] ����  [3] ������  [4] ������  [5]���� >>");
			//����ڿ� �Է¹��� ���� ����
			int menu = sc.nextInt();
			
			if(menu == 1) {
				
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				//mp3.play(list.get(index).getPath());
				//Controller�� �ִ� play�޼���(���)�� �ҷ����� ��
				con.play(list,index);
			}
			else if(menu == 2) {
				
				if(mp3.isPlaying() == true)
					mp3.stop();
			}
			else if(menu == 3) {
				if(mp3.isPlaying() == true)
					mp3.stop();
				
				if(index <= 0) {
					index = list.size()-1;
				}else
					index--;
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				con.play(list,index);
			}
			else if(menu == 4) {
				if(mp3.isPlaying() == true)
					mp3.stop();
				index++;/*
				index = index%5;*/
				
				 if(index > list.size()-1)
				 {
				 index = 0;
				 }
				 
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				con.play(list,index);
			}
			else if(menu == 5) {
				break;
			}
			else {
				
			}
		}
		
	}

}
