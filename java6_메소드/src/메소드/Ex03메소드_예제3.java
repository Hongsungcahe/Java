package �޼ҵ�;

public class Ex03�޼ҵ�_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,7,2,8,9};
		arrayToString(arr);
	}
	
	public static void arrayToString(int a[]) {
		for(int i = 0; i<a.length; i++)
			System.out.print(a[i]+"\t");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	

}
