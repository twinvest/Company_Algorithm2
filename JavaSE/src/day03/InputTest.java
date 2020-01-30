package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputTest {
	//scanner 이용
	//숫자 : nextInt();
	//문자 : next();
	//위 두개는 공백문자 전까지 읽음
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/input.txt")); //인풋스트림을 설정
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		System.out.println(input);
		
		int input2 = scan.nextInt();
		System.out.println(input2);
		
		System.out.println(scan.next());
		 
		
		int T = scan.nextInt();
		char str = scan.next().charAt(0);
		System.out.println(str);
		System.out.println((int)str);
		if(str == '5')
		{
			
		}
		if(str == 53)
		{
			
		}
		
	}
}