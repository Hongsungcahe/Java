package EPoketmon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Epoketmon ���δ� ��ü ���� �Ұ���
		
		pikachu p =new pikachu();
		Coil c = new Coil();
		
		Epoketmon e1 = p;
		Epoketmon e2 = c;
		
		Epoketmon e_arr[] = new Epoketmon[2];
		
		e_arr[0] = e1;//=p, ��ī�� �ڵ����� ���� ���ϸ� Ÿ������ ��ĳ���õ�
		e_arr[1] = e2;//=c
		e_arr[0].attact();
	}

}
