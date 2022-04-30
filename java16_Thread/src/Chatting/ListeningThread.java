package Chatting;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListeningThread extends Thread{
	Socket socket = null; //���� ���� ���� �ʵ�
	
	public ListeningThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
		//Thread�� ������ ���� �׻� run()
		//�������� ���� �޼����� Ŭ���̾�Ʈ�� ������ ���� �۾�
		InputStream in = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		while(true){//�д� �۾��� ���ѹݺ�
			System.out.println(reader.readLine());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
