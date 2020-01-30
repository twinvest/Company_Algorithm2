package day01;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j =1;
		
		while(i<9)
		{
			System.out.println("");
			i++;
			if(i == 8) continue;
			
			
			j=0;
			while(j<9)
			{
				j++;
				if(j==3) continue;
				System.out.println(i +"*"+j+ "="+ i*j);
				
			}
		}
		
		
	}

}
