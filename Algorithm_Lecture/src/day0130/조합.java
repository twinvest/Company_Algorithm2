package day0130;

import java.util.Arrays;

public class 조합 {
	static int[] arr = {1,2,3};
	static int[] sel = new int[2];
	public static void main(String[] args) {
		combination(0, 0);
	}
	static void combination(int idx, int s_idx) {
		if( s_idx == sel.length ) 
		{
			//다고른곳
			System.out.println(Arrays.toString(sel));
			return;
		}
		//더이상 고를게 없는것
		if( idx == arr.length )
			return;
		
		sel[s_idx] = arr[idx];
		combination(idx+1, s_idx+1);
		combination(idx+1, s_idx);
	}
}
