package �迭;

import java.util.Scanner;

public class Ex09�迭_�ǽ�6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int cnt = 0;
		while (true) {
			System.out.print("[1]ȸ������  [2]�α���  [3]���� >>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("====ȸ�� ���� ====");

				while (cnt < 3) {
					System.out.print("���̵� �Է� : ");
					id_array[cnt] = sc.next();
					System.out.print("��й�ȣ �Է� : ");
					pw_array[cnt] = sc.next();
					cnt++;
					break;
				}
			} else if (num == 2) {
				System.out.println("==�α���==");
				System.out.print("���̵� : ");
				String id = sc.next();
				System.out.print("��й�ȣ  : ");
				String pw = sc.next();

				for (int i = 0; i < id_array.length; i++) {
					for (int j = 0; j < pw_array.length; j++) {
						if (id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if (i == j) {
								System.out.println("�α��� ����!");
								break;
							}

						} else {
							System.out.println("�α��� ����..");
							break;
						}
						break;
					}
					break;
				}

			} else if (num == 3) {
				System.out.println("����");
				break;
			}
		}

	}
}