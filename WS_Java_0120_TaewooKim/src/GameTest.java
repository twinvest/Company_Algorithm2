

import java.util.*;

public class GameTest {
	public static void main(String[] args) {
		// 1은 가위, 2를 주먹, 3을 보.
		// 컴퓨터와 사용자가 함께하는 가위바위보

		System.out.println(" >> 가위바위보 게임을 시작합니다." + "아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.println("번호를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int num = 0;
		if (number == 1) {
			num = 5;
		} else if (number == 2) {
			num = 3;
		} else
			num = 1;

		int com_cnt = 0;
		int user_cnt = 0;
		for (int i = 1; i <= num; i++) {
			int computer = (int) (Math.random() * 3) + 1;
			int user = 0;
			
			System.out.println("가위바위보 중 하나 입력: ");
			String str = sc.next();
			
			switch (str) {
			case "가위":
				user = 1;
				break;
			case "바위":
				user = 2;
				break;
			case "보":
				user = 3;
				break;
			}
			
			System.out.println(computer);
			
			if(computer == user) {
				System.out.println("비겼습니다!");
			}
			if((computer== 1 && user == 2)||(computer == 2 && user == 3) || (computer == 3 & user == 1)) {
				System.out.println("이겼습니다!");
				user_cnt++;
			}
			if((computer==1 && user == 3)||(computer == 2 && user == 1) || (computer == 3 & user == 2)) {
				System.out.println("졌습니다!");
				com_cnt++;
			}
			
			if(num == 5) {
				if(user_cnt == 3) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(com_cnt == 3) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
			else if(num == 3) {
				if(user_cnt == 2) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(com_cnt == 2) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
			else if(num == 1) {
				if(user_cnt == 1) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(com_cnt == 1) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
		}

	}
}
