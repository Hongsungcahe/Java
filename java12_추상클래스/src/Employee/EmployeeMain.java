package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempEmployee te = new TempEmployee("SMHRD001","ȫ��ä",3000);
		RegularEmployee re = new RegularEmployee("SMHRD002","������",4000,400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003","������",10,20);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
		
		//��ĳ���� ����
		Employee e1 = te;
		Employee e2 = re;
		Employee e3 = pe;
		
		//��ĳ���õ� ���¿��� �迭�� ��
		Employee emp_arr[] = new Employee[3];
		emp_arr[0] = te;
		emp_arr[1] = re;
		emp_arr[2] = pe;
		
		
	}

}
