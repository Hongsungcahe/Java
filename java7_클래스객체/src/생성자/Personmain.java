package ������;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		Person person1 = new Person();
		person1.setName("ȫ�浿");
		person1.setAge(25);
		
		Person person2 = new Person("�迵��",27);
		
		System.out.println("st1��ü �л� �̸� : "+person1.getName()+","
							+" ���� : "+person1.getage());
		
		System.out.println("st2��ü �л� �̸� : "+person2.getName()+","
				+" ���� : "+person2.getage());		
		
		
		
	}

}
