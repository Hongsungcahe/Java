package BookData;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      ArrayList<BookData> al = new ArrayList<BookData>();

	      int menu = 0; // ����ڰ� ����ϰ� ���� �޴� ���� ����
	      
	      while(menu!=4) {
	         System.out.println("1)å �߰� 2)å ���� 3)���� �� �� �ִ� å 4)����");
	         menu = sc.nextInt();
	         
	         if(menu==1) {
	            System.out.print("å �̸� : ");
	            String name = sc.next();
	            System.out.print("���� : ");
	            int price = sc.nextInt();
	            System.out.print("�۰� : ");
	            String writer = sc.next();
	            
	            al.add(new BookData(name, price, writer));
	            
	         }else if(menu==2) {
	            for(int i=0; i<al.size(); i++) {
	               System.out.printf("%d. %s\t%d\t%s\n",i+1, al.get(i).getTitle(), al.get(i).getPrice(), al.get(i).getWriter());
	            }
	            
	            System.out.print("�����ϰ� ���� å >>");
	            int del_num = sc.nextInt();
	            
	            al.remove(del_num-1);
	         }else if(menu==3) {
	            System.out.print("�ݾ��� �Է��Ͻÿ� : ");
	            int money = sc.nextInt();
	            
	            for(int i=0; i<al.size(); i++) {
	               if(money>=al.get(i).getPrice()) {
	                  System.out.printf("%d. %s\t%d\t%s\n",i+1, al.get(i).getTitle(), al.get(i).getPrice(), al.get(i).getWriter());
	               }
	            }
	         }
	      }

	   }

	}
