package Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std_arr[];
		
		std_arr = new Student[2];
		
		std_arr[0] = new Student();
		
		Student std2 = new Student();
		std_arr[1] = std2;
		
		std_arr[0].setName("�����");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);
		
		std_arr[1].setName("�ں���");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);
		
		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan()+"��");
		System.out.println(std_arr[0].getNum()+"��");
	/*	
		System.out.println(std_arr[1].getName());
		System.out.println(std_arr[1].getBan()+"��");
		System.out.println(std_arr[1].getNum()+"��");
		*/
		for(int i = 0; i<std_arr.length; i++)
			System.out.println(std_arr[i].toString());
		
	}
}
