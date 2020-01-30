package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class 총잡이2 {
	static int[][] dir = {

			{ 0, 1 }, // 오른쪽
			{ 0, -1 }, // 왼쪽
			{ 1, 0 }, // 아래
			{ -1, 0 }, // 위

	};

	static boolean inside(int y, int x, int Y, int X) {
		return (y >= 0 && y < Y) && (x >= 0 && x < X);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/inputtest.txt")); //인풋스트림을 설정
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt();
		ArrayList<Position> list = new ArrayList<>();
		for (int t = 1; t <= testcase; ++t) {
			int ans = 0;
			int Y = scan.nextInt();
			int X = scan.nextInt();
			String[][] arr = new String[Y][X];
			boolean[][] flag = new boolean[Y][X];

			for (int i = 0; i < Y; ++i)
				for (int j = 0; j < X; ++j)
					arr[i][j] = scan.next();

			for (int i = 0; i < Y; ++i)
				for (int j = 0; j < X; ++j)
					if (arr[i][j].equals("G"))
						list.add(new Position(i, j));

			// 총잡이의 개수만큼 시행될 for문
			for (int l = 0; l < list.size(); ++l) 
			{
				int y = list.get(l).y;
				int x = list.get(l).x;
				
				for (int k = 0; k < 4; ++k) 
				{					
					for (int j = 1; j < 20; j++) 
					{
						int ny = y + dir[k][0] * j;
						int nx = x + dir[k][1] * j;						
						if(!inside(ny, nx, Y, X))
							break;
						if(arr[ny][nx].equals("W") || arr[ny][nx].equals("G"))
							break;
						if(arr[ny][nx].equals("T"))
						{
							flag[ny][nx] = true;
							break;
						}
					}
				}
			}
			
			for(int i=0; i<Y; ++i)
				for(int j=0; j<X; ++j)
					if(flag[i][j] == true)
						++ans;
			System.out.println("#"+t+" "+ans);
		}
	}
}
