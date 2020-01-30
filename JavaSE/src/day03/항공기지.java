package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

 
public class 항공기지 {
	static int T, N, K;
	static int answer = 0;
	static int[][] map;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/항공기지건설.txt"));
		Scanner scs = new Scanner(System.in);

		T = scs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			N = scs.nextInt();
			K = scs.nextInt();
			map = new int[N][N];
			answer = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = scs.nextInt();
				}
			}

			//시작점 i,j
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int tmp = 0;
					//끝점 k,s
					for (int k = i; k < N; k++) {
						for (int s = j; s < N; s++) {
							//차가 K이내인지 확인하는 루프
							int max = 0, min = 987654321;
							for (int m = i; m <= k; m++) {
								for (int n = j; n <= s; n++) {
									max = Math.max(map[m][n], max);
									min = Math.min(map[m][n], min);
								}
							}
							if(Math.abs(max) - Math.abs(min) <= K) {
								//끝점 - 시작점 해서 곱하면 넓이
								tmp = Math.max(tmp, Math.abs(k-i+1)*Math.abs(s-j+1));
							}
						}
					}
					answer = Math.max(tmp, answer);
				}
			}
			System.out.println("#"+tc + " " + answer);
		}
	}
}