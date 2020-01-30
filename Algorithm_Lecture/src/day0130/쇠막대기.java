package day0130;

import java.util.Scanner;

public class 쇠막대기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int result = 0; // 결과를 저장할 변수
			int stick = 0; //누적막대기의 갯수
			//입력을 한글자씩 검사하면서
			for(int i = 0; i < str.length(); i++) {
				//열림괄호라면 누적막대기 1증가
				if(str.charAt(i) == '(')
					stick++;
				//닫힘괄호라면 막대기 하나 감소(레이저라면 열린괄호가 막대가 아니었으므로 무효화, 닫힘이라면 실제로 막대기가 사라졌으니까)
				else if(str.charAt(i) == ')') {
					stick--;
					//	직전아이가 열림괄호라면(레이저판정), 누적막대기만큼을 result에 더함
					if( str.charAt(i-1) == '(')
						result += stick;
					//  직전아이가 닫힘괄호라면(나무막대기종료판정), result에 1증가
					else if( str.charAt(i-1) == ')')
						result++;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
