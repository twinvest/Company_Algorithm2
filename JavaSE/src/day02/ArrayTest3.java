package day02;

import java.util.Scanner;

public class ArrayTest3 {
	/**
	 * 2차원 배열의 갯수와 좌표를 입력받아서 해당좌표의 상하좌우에 1을 입력하고 배열을 출력하는 프로그램을 작성하세요 4 <= row <=
	 * 20, 4 <= col <= 20
	 * 10 * 10 배열에 길이가 3인 포탄을 3방을 랜덤으로 쏜다.
	 * 이 포탄은 8방으로 3길이만큼 ++ 증가하는데 가장 값이 큰 좌표를 출력하세요.
	 */
	public static boolean inside(int m, int n) {
		return (n >= 0 && n <= 20) && (m >= 0 && m <= 20);
	}

	public static void main(String[] args) {
		int dir[][] = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 }, {-1, -1},{1, 1},{-1, 1},{1, -1} }; // 위 밑 오른쪽 왼쪽

		int[][] arr = new int[20][20];
		Scanner scan = new Scanner(System.in);
		
		for(int k=0; k<3; k++)
		{			
			int dx = scan.nextInt();
			int dy = scan.nextInt();
			int num = 2;	
			arr[dy][dx]++;
			
			for (int i = 0; i < 8; ++i) 
			{
				int nx = dx + dir[i][0];
				int ny = dy + dir[i][1];
				
				if (!inside(nx, ny))
					continue;
				arr[ny][nx]++;
				
				for(int j=0; j<num; j++)
				{
					nx = nx + dir[i][0];
					ny = ny + dir[i][1];
					if (!inside(nx, ny))
						continue;
					arr[ny][nx]++;
				}
			}
		}
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
				
	}
}