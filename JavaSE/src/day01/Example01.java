package day01;

public class Example01 {

	public static void main(String[] args) {
		
		int[] lotto = {-1, -1,-1,-1,-1,-1};
		int index = 0;
		
		while(true)
		{
			if(lotto[5]!=-1)
				break;
			
			int num = (int)(Math.random() * 100) + 1;
			int tmp = num % 45 +1;
			
			boolean bool = checkdup(lotto, tmp);
			if(bool) lotto[index++] = tmp;
		}
		
		for(int i=0; i<lotto.length; ++i)
			System.out.println(lotto[i]);
		
	}
	
	public static boolean checkdup(int[] lotto, int tmp)
	{
		for(int s : lotto)
		{
			if(tmp == s)
				return false;
		}
		return true;
	}
}
