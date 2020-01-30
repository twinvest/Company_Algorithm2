package day0123;

import java.util.Arrays;

public class 베이비진 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3};
		//카운트 배열을 준비해서 각 카드가 몇장씩 있는지 빈도를 기록
		int[] cnt = new int[10];
		for(int i = 0; i < arr.length; i++)
			cnt[ arr[i] ]++;
		
		//run 이나 triplet이 발견될때마다 ++ 시켜줄 결과변수. 얘가 2 이면 베이비진
		int result = 0;
		for(int i = 0; i < cnt.length; i++) {
			//트리플릿인지 검사
			if( cnt[i] >= 3 ) {
				cnt[i] -= 3;
				result++;
				i--;
				continue;
			}
			//해당 번호로 시작되는 run이 있는지 검사
			if( i <= 7 && cnt[i] >= 1 && cnt[i+1] >= 1 && cnt[i+2] >= 1 ) {
				cnt[i]--;
				cnt[i+1]--;
				cnt[i+2]--;
				result++;
				i--;
				continue;
			}
		}
		System.out.println(result==2?"베이비진":"아님");
		
		
		
		
		
		
//		boolean isBabygin = isBabygin(arr);
//		System.out.println(isBabygin ? "베이비진입니다" : "베이비진이 아닙니다");
	}
	
	static boolean isBabygin(int[] arr) {
		//현재 arr 배열의 카드 나열이 베이비진이라면 true 아니라면 false를 리턴하도록 작성
		//앞에 세개와 뒤에 세개로 나눠서
		int[] front = Arrays.copyOfRange(arr, 0, 3);
		int[] back = Arrays.copyOfRange(arr, 3, 6);
		//앞쪽이 런 이거나 트리플릿인지 검사 → 1
		boolean frontOk = isTriplet(front) || isRun(front);
		boolean backOk = isTriplet(back) || isRun(back);
		//뒷쪽이 런 이거나 트리플릿인지 검사 → 2
		//1과2가 모두 참이면 true
		return frontOk && backOk;
	}
	static boolean isTriplet(int[] arr) {
		if( arr[0] == arr[1] && arr[1] == arr[2])
			return true;
		return false;
	}
	static boolean isRun(int[] arr) {
		if( arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2] )
			return true;
		return false;
	}
	
}