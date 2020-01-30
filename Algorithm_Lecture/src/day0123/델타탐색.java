package day0123;


public class 델타탐색 {
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,2,1},
				{2,1,3}
		};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				//저 각 칸에 대해서, 상하좌우 중 존재하는 칸들과 나와의 절대값을 구하자
				//내 상하좌우 위치 (내 위치에 dr dc를 더하면 인덱스에 따라 상하좌우 )
				int sum = 0;
				for(int d = 0; d < 4; d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					//밖으로 나가지 않은 위치에 대해서만
					if( nr >= 0 && nc >= 0 && nr < arr.length && nc < arr[nr].length ) {
						sum += Math.abs(arr[i][j] - arr[nr][nc]);
					}
				}
				System.out.printf("%2d ", sum);
			}
			System.out.println();
		}
	}
}
