package day0130;

import java.util.Scanner;

public class 햄버거 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		for(int t=1; t<=testcase; ++t)
		{
			int max = 0;
			int N = scan.nextInt(); //재료의 수
			int limit = scan.nextInt(); //냅색의 한계
			
			int[] arr=new int[N];  //재료의 가치
			int[] arr2=new int[N];  //재료의 칼로리
			
			//입력받기
			for(int i=0; i<N; ++i)
			{
				arr[i] = scan.nextInt();
				arr2[i] = scan.nextInt();
			}
			
			for(int i = 0; i < (1 << arr.length); i++) {
				//현 상태에서 각 원소들이 포함되는지 검사
				int sum = 0; //재료의 가치를 더할 sum
				int sum2 = 0; //재료의 칼로리를 더할 sum
				
				for(int j = 0; j < arr.length; j++) {
					if( ( i & ( 1 << j ) ) != 0 ) {
						sum += arr[j];
						sum2 += arr2[j]; //맛이랑 칼로리 모두 선택된 재료만큼 더해서
					}
				}
				if( sum2 < limit  )//칼로리가 얼마 이하일때의 맛의 최대값
					max = Math.max(max, sum);
			}			
			System.out.println("#"+t+" "+max);
		}
	}
}
