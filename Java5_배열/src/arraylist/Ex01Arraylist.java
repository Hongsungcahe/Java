package arraylist;

import java.util.ArrayList;

public class Ex01Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Arraylist �����ϱ�
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("����ȸ");
		list.add("�ٻ���");
		list.add("���ȸ");
		list.add("��������");
		list.add(2,"�δ��");
		//list.size() �� ���
		for(int i = 0; i<list.size(); i++)
		System.out.println(list.get(i));
		
		//list.remove(0);
		
		list.size();
	}

}
