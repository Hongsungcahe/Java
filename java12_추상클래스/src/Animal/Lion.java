package Animal;

public class Lion extends Animal {

	boolean tail;
	@Override
	public void moving() {
		System.out.println("���� ������");
	}

	@Override
	public void attack() {
		System.out.println("���ڰ���");	
	}
	public void sleep() {
		System.out.println("���� �ڴ�");
	}
	
	public void f() {
		System.out.println("!");
	}
}
