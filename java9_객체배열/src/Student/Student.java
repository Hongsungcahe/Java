package Student;

public class Student {
	//�Ӽ�(�ʵ�)
	private String name;
	private int ban;
	private int num;
	
	//���(�޼���) : getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//Override : �θ��� ��� ������
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", num=" + num + "]";
	}
	
	
	
}
