package day0123;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력을 받자.
		int N = sc.nextInt(); //판의 크기
		//판의 너비 만큼의 배열을 만들어서 각 칸에 막대기 높이를 입력받자
		int[] input = new int[N];
		for(int i = 0; i < N; i++)
			input[i] = sc.nextInt();
		int max = 0;
		//각 막대기 별로 낙차를 계산하자.
		for(int i = 0; i < N; i++) {
			//내 오른쪽으로 나보다 작은 막대기의 갯수를 세자
			int cnt = 0;
			for(int j = i + 1; j < N; j++) {
				if(input[i] > input[j])
					cnt++;
			}
			if( max < cnt )
				max = cnt;
		}
		System.out.println(max);
	}
}
