package Employee;

public abstract class Employee {
	//�ʵ� : ���, �̸�, ����(�ϴ�/����)
	//�޼��� : ���ް���ϴ�, �������(���,�̸�,����)
	String empno;
	String name;
	int pay;
	
	public abstract int getPay();
	
	public String print() {
		return empno + ":"+name+":"+getPay();
	}
	
}
