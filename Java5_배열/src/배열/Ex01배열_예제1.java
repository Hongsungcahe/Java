package �迭;

public class Ex01�迭_����1 {

	public static void main(String[] args) {
		char[] c = new char[3];
		
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		int[] i = {1,5,7,3,10};
		
		System.out.println("i�迭 ����"+ i.length);
		
		System.out.println(i);
		System.out.println(c);
		
		int [] intArray = new int[5];
		int [] myArray = intArray;
		System.out.println("intArray ������ : "+intArray);
		System.out.println("myArray ������ : "+myArray);
		System.out.println(intArray[0]);
		intArray[1] = 2;
		System.out.println(intArray[1]);
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		
	}

}
