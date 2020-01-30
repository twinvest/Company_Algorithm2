package day04;

import java.util.ArrayList;
import java.util.Scanner;



class Position
{
	int y;
	int x;
	Position(int y, int x)
	{
		this.y = y;
		this.x = x;
	}
}

public class 총잡이 {
	static int[][] dir = {
			{0,1},  //오른쪽
			{0,-1}, //왼쪽
			{1,0},  //아래
			{-1,0}, //위
			};

	static boolean inside(int y, int x, int N)
	{
		return (y>=0 && y<N) && (x>=0 && x<N); 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase =scan.nextInt();
		ArrayList<Position> list= new ArrayList<>();
		for(int t=1; t<=testcase; ++t)
		{
			int ans = 0;
			int Y = scan.nextInt();
			int X = scan.nextInt();
			String[][] arr = new String[Y][X];
			boolean[][] flag = new boolean[Y][X];
			
			for(int i=0; i<Y; ++i)
				for(int j=0; j<X; ++j)
					arr[i][j] = scan.next();
			
			for(int i=0; i<Y; ++i)
				for(int j=0; j<X; ++j)
					if(arr[i][j].equals("G"))
						list.add(new Position(i,j));
			
			//총잡이의 개수만큼 시행될 for문
			for(int k=0; k<list.size(); ++k)
			{
				int y = list.get(k).y;
				int x =list.get(k).x;
				//오른쪽
				for(int i=x+1; i<X; ++i)
				{
					if(arr[y][i].equals("W") || arr[y][i].equals("G"))
						break;
					if(arr[y][i].equals("T"))
					{
						flag[y][i] = true;
						break;
					}
				}
				//왼쪽
				for(int i=x-1; i>=0; --i)
				{
					if(arr[y][i].equals("W") || arr[y][i].equals("G"))
						break;
					if(arr[y][i].equals("T"))
					{
						flag[y][i] = true;
						break;
					}
				}
				//위로
				for(int i=y-1; i>=0; --i)
				{
					if(arr[i][x].equals("W") || arr[i][x].equals("G"))
						break;
					if(arr[i][x].equals("T"))
					{
						flag[i][x] = true;
						break;
					}
						
				}
				//아래로
				for(int i=y+1; i<Y; ++i)
				{
					if(arr[i][x].equals("W") || arr[i][x].equals("G"))
						break;
					if(arr[i][x].equals("T"))
					{
						flag[i][x] = true;
						break;
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
