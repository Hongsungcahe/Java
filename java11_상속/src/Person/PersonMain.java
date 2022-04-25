package Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("��ҿ�");
		
		System.out.println(s1.getName());
		System.out.println(s1.stdId);
		
		s1.walk();
		//��ĳ���� : ����Ŭ������ ��ü�� ����Ŭ������ ����ȯ(�ڵ�) �ϴ� ��
		//��ĳ������ �Ǿ��� ���� �� �� ����(����Ŭ����)�� ��ü ������� ���� X
		//�� �������̵��� ��쿡�� ����Ŭ������ �޼��� ȣ�� ����
		Person p = s1;
		
		p.walk();
		
		Student p1 = new Student("������");
		Teacher p2 = new Teacher("��ä��");
		//���� Ÿ���� �ٸ��� ������ �迭�̳� ����Ʈ�� ���� �� X
		//Student, Teacher -> ��� Person
		
		Person ps1 = p1;
		Person ps2 = p2;//��ĳ���õ� ���
		
		Person p_arr[] = new Person[2];
		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for(Person person:p_arr) {
			person.walk();
		}
		
		//��ĳ���� �� ���¿��� ���� � Ÿ���̾����� �˰� ���� �� ����ϴ� �����ڴ�
		//instanceof�Դϴ�. -> true/false ��ȯ 
		System.out.println(ps1 instanceof Student);
		System.out.println(ps1 instanceof Teacher);
		
		//�ٿ� ĳ���� : ��ĳ���õ� ��ü�� ���� Ÿ������ �ٽ� �ǵ����� ��
		//����� ����ȯ�ؾߵ�
		Student p3 = (Student)ps1;
		System.out.println(p3.stdId);
	}

}
