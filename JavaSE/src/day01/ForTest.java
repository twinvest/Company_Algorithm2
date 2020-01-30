package day01;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i<9; ++i)
		{
			System.out.println(i+"단 시작!!");
			for(int j = 1; j<10; ++j)
			{
				if(j == 5) continue;
				System.out.println(i + " * " +j+ " = " + i*j);	
			}
			
		}
		
	}

}
