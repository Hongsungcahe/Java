package �ݺ���;

public class Ex12�ݺ���_for������4 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			if(i%10 ==3 ||i%10 ==6 || i%10 ==9 ) {
				System.out.println("�ڼ�");
			}
			else if(i%10==5) 
					System.out.println("����");
			else
				System.out.println(i);
		}

	}

}
