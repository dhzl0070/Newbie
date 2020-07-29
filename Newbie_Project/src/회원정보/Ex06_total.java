package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_total {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]회원정보수정 [4]회원탈퇴 [5]회원정보보기 [6]종료 >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("======로그인======");
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				System.out.print("비밀번호 입력 >>");
				String pw = sc.next();
				String result = dao.login(id, pw);
				System.out.println(result);
			} else if (input == 2) {
				System.out.println("======회원가입======");
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				System.out.print("패스워드 입력 >>");
				String pw = sc.next();
				System.out.print("이름 입력 >>");
				String name = sc.next();
				System.out.print("나이 입력 >>");
				int age = sc.nextInt();
				int cnt = dao.insert(id, pw, name, age);
				if (cnt > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원갑입 실패!");
				}
			} else if (input == 3) {
				System.out.println("======회원정보수정======");
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				System.out.print("비밀번호 입력 >>");
				String pw = sc.next();
				System.out.print("변경할 아이디 입력 >>");
				String chn_id = sc.next();
				int cnt = dao.Update(chn_id, id, pw);
				if (cnt > 0)
					System.out.println("회원정보 수정 완료!");
				else
					System.out.println("회원정보 수정 실패!");
			} else if (input == 4) {
				System.out.println("======회원탈퇴======");
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				System.out.print("비밀번호 입력 >>");
				String pw = sc.next();
				int cnt = dao.Delete(id, pw);
				if (cnt > 0)
					System.out.println("탈퇴성공!");
				else
					System.out.println("탈퇴실패!");
			} else if (input == 5) {
				System.out.println("======전체회원 정보보기======");
				System.out.println("번호\t아이디\t비밀번호\t이름\t나이");
				ArrayList<VO> result = dao.allSelect();
				int num = 1;
				for (int i = 0; i < result.size(); i++) {
					System.out.println(num++ + "\t" + result.get(i).getId() + "\t" + result.get(i).getPw() + "\t"
							+ result.get(i).getName() + "\t" + result.get(i).getAge());
				}
			} else if (input == 6) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}

		}

	}
}
