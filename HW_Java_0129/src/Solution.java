

import java.util.Scanner;


public class Solution {
	
	static int[] cols;
	static int N;		//N*N할때의 N;
	
	static public void back_tracking(int level)
	{
		if(level == N)
		{
			for(int i=0; i<N; ++i)
				System.out.println(cols[i]);
			System.out.println("");
		}
		else
		{
			for(int i =0; i<N; ++i)
			{
				cols[level] = i;
				if(isPossible(level))
				{
					back_tracking(level + 1);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			N = scan.nextInt();
			cols = new int[N]; //i행에 들어갈 퀸의 좌표.
			back_tracking(0);
		}	
	}		
	
	static public boolean isPossible(int level){
		
		for(int i=0;i<level;i++){
			//level 위치에 현재 시험할 퀸이 놓여져 있는 상태이고
			//우리는 그 퀸과 i= 0 ~ level-1 에 놓여있는 퀸이 문제를 일으키는지만 보면 된다.
	
			if(cols[i]==cols[level] || Math.abs(level-i)== Math.abs(cols[level]-cols[i])){
				//i번째 퀸의 위치와 level위치의 퀸이 같은 일직선상에 있는경우
				//또는
				//i번째 퀸의 위치와 level위치의 퀸이 대각선상에 있는 경우. 
				//밑변과 높이가 같으면 대각선상에 있다고 볼수 있다.
				return false;
				//이 경우는 불가능 하므로 false를 리턴
			}
		}
		return true;
		//위의 경우를 제외하면 가능하므로 true 리턴
	}

}
