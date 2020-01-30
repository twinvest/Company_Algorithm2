package day01;

import java.util.Random;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.print("점수를 입력하세요 : ");
		//int score = scan.nextInt();
		Random r = new Random();
		int score = r.nextInt(100) +1;
		
		if(score >= 90){
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score >=70){
			System.out.println("C");
		}else if(score >=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}