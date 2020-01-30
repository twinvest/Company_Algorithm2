package day0122;

import java.util.Scanner;

public class 원재의메모리복구 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			//기억해야될 상태 중 원래상태. 입력값
			char[] input = sc.next().toCharArray();
			//기억해야될 상태 중 초기상태에서 출발해서 변경해나갈 비트열
			char[] sol = new char[input.length];
			//변경해나갈 비트열은 초기값이 모두 0인 상태
			for(int i = 0; i < sol.length; i++)
				sol[i] = '0';
			//변경한 횟수를 저장할 변수
			int cnt = 0;
			
			//모든 비트에 대해 검사
			for(int i = 0; i < input.length; i++) {
				//i번째 비트에 대해서 sol과 input이 다른 상태라면.
				if( sol[i] != input[i] ) {
					//sol의 i번째부터 끝까지를 input의 i번째 값으로 변경.
					for(int j = i; j < sol.length; j++)
						sol[j] = input[i];
					cnt++;
				}
				//같으면 패스
			}
			System.out.println("#" + tc + " " + cnt);
			
		}
	}
}