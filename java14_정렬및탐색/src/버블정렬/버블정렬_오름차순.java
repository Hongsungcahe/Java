package ��������;

import java.util.Arrays;

public class ��������_�������� {

	public static void main(String[] args) {
		
		int arr[] = {7,4,5,1,3};
		
		System.out.println("���� �� : "+Arrays.toString(arr));
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("���� �� : "+Arrays.toString(arr));
		
	}

}
