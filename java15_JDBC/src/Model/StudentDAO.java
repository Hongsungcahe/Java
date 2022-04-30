package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO (Data Access Object) : �����ͺ��̽� ���� �۾��� �����ϴ� Ŭ����
//�����ͺ��̽� ����, (�Է�, ����, ����, ��ȸ) - CRUD ���� �۾��� �ϴ� Ŭ����
//CR3.UD(Create(�Է�), Read(��ȸ), Update(����), Delete(����))
public class StudentDAO {
	// DB���� �޼ҵ�
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public void connect() {
		try {
			// ClassNotFoundException �߻��� �� ����
			// 1. ������Ʈ�� ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
			// 2. ��ŸȮ��
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// 2. ����� ���� ����, db���� ��ü(Connection) ����
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if(rs != null) {
			rs.close();// selectTsds(), selectOneStd()������ ����ϴ� ��ü
						//ResultSet������ ������ �Ǿ��� �� ȣ�� ������ �޼���
			}
			if(pst != null) {
			pst.close();
			}
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	ArrayList<StudentVO> al = new ArrayList<StudentVO>();

	// ���1. ����ڰ� �Է��� ���� STUDENT ���̺� ����(�л��߰�)
	public boolean insertStd(String name, int age, String tel, String email) {
		// JAVA - Oracle DB : JDBC java api
		boolean check = false;

		try { // ������ �ڵ�
				// 1. Oracle JDBC driver ���� �ε�(�����Ҷ� ������ ���ڴ�)
				// try ~catch : ����ó���� �� �� ���
				// ����1 : ������ ���� : �ڵ���ü�� Ʋ��(��Ÿ, �����̸�, ��������)
				// ����2 : ��Ÿ�� ���� : �ڵ尡 Ʋ������ �ƴ�, �������� �� ������ ���� ���
				// -> ��Ÿ�� ������ ���������� ������ �߻����� �� �� ���� -> ����ó���� �������
				// ClassNotFoundException �߻��� �� ����
				// 1. ������Ʈ�� ojdbc ���̺귯���� �߰��Ͽ����� Ȯ��
				// 2. ��ŸȮ��
			connect();
			// 3. ������ sql��(String) ����
			// ? : ���ε� ����
			// ����Ǵ� ���� ���� ��� �� ?�� �ؾߵ�(�Է��ϴ� ��)
			// java�� �����ϴ� sql���� ��� auto commit : ��� sql�� �ڿ��� ; ������ �ȵ�
			String sql = "insert into Student values(stdseq.nextval, ?, ?, ?, ?)";

			// 4. sql���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);

			// 6. sql���� �����ؼ� ��� ó��
			// executeUpdate() : insert, delete, update (���̺� �� ��ȭ O)
			// ��ȯ�� : int(-> table�󿡼� ��� ���� ������ �Ǿ������� ��ȯ)
			// ������ ����� �Ͼ ��쿡�� �׻� 0���� ū ���� ��ȯ

			// executeQuery() : select (���̺� �� ��ȭX)
			// ��ȯŸ�� : ResultSet ��ü�� ��ȯ

			int cnt = pst.executeUpdate();

			if (cnt > 0) { // �߰� ����
				check = true;
			} else { // �߰� ����
				check = false;
			}

			// ���⿡�ٰ� ���� ������ �ȵ�

			// catch : try������ ���ܻ�Ȳ�� �߻��� ��� catch������ �����Ե�
		} catch (Exception e) { // ClassNotFoundException �� ó������
			// Exception e -> ��� ���ܻ�Ȳ�� ó�� ����
			// �߻��� ���ܻ�Ȳ�� �߻� ������� ���(��𿡼� ���ܻ�Ȳ�� �߻��߰�
			// ���������� �߻��ߴ����� �ܼ�â���� ����Ȯ��)
			e.printStackTrace();// �����߿� ���� ���
			System.out.println("������ �غ����Դϴ�.");
			// finally : try������ ���ܻ�Ȳ�� �߻��ϴ���/ �߻����� �ʴ��� �������� ������ ����
			// �ɼ�(�ᵵ �ǰ� �Ƚᵵ �ǰ�)
		} finally {
			// ����� ��ü��(Connection, PreparedStatement) ������ ��ȯ
			// ������ ���� : ������ ���� �ݴ��
			close();
		}
		return check;
	}
	public ArrayList<StudentVO> selectStd() {
		try {
			connect();

			// 3. sql�� ����
			String sql = "select * from student";

			// 4. sql ������ �غ����ִ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. sql�� ���� �� ���ó��
			rs = pst.executeQuery();

			// Student ���̺� �ִ� ���� �о ���(�� �л��� ���� ���
			while (rs.next()) {
				int num = rs.getInt(1); // ���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�.
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");

				al.add(new StudentVO(num, name, age, phone, email));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();

		}

		return al;

	}

	public StudentVO selectOneStd(int num) {
		// selectStd ���� : Arraylist�� ���� �ʿ� ����!
		// sql�� ���� (������ �ʿ�! : �л���ȣ(����� �Է�)�� �˻�) , insert����
		// ��ȯŸ��, �Ű����� ����!
			StudentVO vo = null; // StudentVo ��üX
								// StudentVO ��ü�� �������� ���常 �� �� �ְ�
								//

		try {
			connect();

			// 3. ������ sql�� ����
			String sql = "select * from student where num = ?";

			// 4. sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 4-1. ���ε庯�� ä���
			pst.setInt(1, num);

			// 5. sql���� �����ϰ� ��� ó��
			rs = pst.executeQuery();

			// STUDENT ���̺� ���� �о ��� (�� �л��� ���� ���)
			// sql�� ����� where���������� Ư���� ��ȣ�� ���� �л��� �˻�
			// -> resultset �� �ش� ��ȣ�� table�� �����ϸ� �ִ� 1�� ���� �����͸� ����
			// �������� ������ ������ x
			if (rs.next()) {
				int get_num = rs.getInt(1); // ���� Ŀ���� ����Ű�� �ִ� ���� ù��° �÷����� �о���ڴ�!
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				// ������ �о�� ����� �ʱ�ȭ���� ������ StudentVO ��ü�� ��������
				// ArrayList�� �߰�
				vo = new StudentVO(num, name, age, phone, email);
			} else {
				System.out.println("X");
			}q

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ��ü��(Connection, PreparedStatement, ResultSet) ������
			close();
		}
		return vo;
	}
}
	public boolean updatePhone(int num, String phone) {
		boolean check = false;
		try {
			connect();
			String sql = "update student set phone = ? where num = ?";

			pst = conn.prepareStatement(sql);
			// 4-1 ���ε� ����
			pst.setString(1, phone);
			pst.setInt(2, num);
			// 5. sql�� ���� �� ���ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // ���� ����
				check = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();
		}
		return check;

	}

	public boolean updateEmail(int num, String email) {
		boolean check = false;
		try {
			connect();

			String sql = "update student set email = ? where num = ?";

			pst = conn.prepareStatement(sql);
			// 4-1 ���ε� ����
			pst.setString(1, email);
			pst.setInt(2, num);
			// 5. sql�� ���� �� ���ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // ���� ����
				check = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();
		}
		return check;

	}

	public boolean deleteStd(int num) {
		boolean check = false;
		try {
			// 1. jdbc ����̹� �����ε�
			connect();
			// 3. ������ sql�� ����
			String sql = "delete from student where num = ?";

			// 4. sql ���� �غ� ��ü(PreparedStatement) ����
			pst = conn.prepareStatement(sql);

			// 5. ���ε� ���� ä���
			pst.setInt(1, num);

			// 6. sql�� �����ϰ� ���ó��
			int cnt = pst.executeUpdate();

			if (cnt > 0)
				check = true;
			else
				check = false;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
		close();

		}
		return check;

	}

}
