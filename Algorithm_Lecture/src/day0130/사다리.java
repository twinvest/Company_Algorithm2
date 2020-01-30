package day0130;

import java.util.Scanner;

public class 사다리 {
	static int MAX = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int tc = 1; tc <= T; tc++) {
			sc.nextInt();//입력되는 테스트케이스의 번호, 어차피 반복계수 tc와 같은 값.
			int[][] map = new int[MAX][MAX];
			for(int i = 0; i < MAX; i++) {
				for(int j = 0; j < MAX; j++)
					map[i][j] = sc.nextInt();
			}
			//사다리 줄기의 번호들을 순차적으로 저장할 배열. 
			int[] lanes = new int[50];
			//맨 아랫줄을 왼쪽부터 보면서, 사다리 줄기가 발견되면, lanes배열에 순차적으로 저장.
			int idx = 0;
			int goalIdx = 0;
			for(int j = 0; j < MAX; j++) {
				if(map[MAX-1][j] != 0) {
					if(map[MAX-1][j] == 2)
						goalIdx = idx;
					lanes[idx++] = j;
				}
			}
			int currentIdx = goalIdx;
			for(int i = MAX-1; i >= 0; i--) {
				//왼쪽이 낭떠러지가 아니면서, 왼쪽에 1이 존재하면 currentIdx 를 하나 줄여서 왼쪽으로 이동
				if( lanes[currentIdx] - 1 >= 0 && map[i][lanes[currentIdx]-1] == 1 )
					currentIdx--;
				
				else if( lanes[currentIdx] + 1 < MAX && map[i][lanes[currentIdx]+1] == 1 )
					currentIdx++;
			}
			System.out.println("#" + tc + " " + lanes[currentIdx]);
		}
	}
}
