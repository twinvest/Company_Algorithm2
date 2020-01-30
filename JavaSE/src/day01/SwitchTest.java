package day01;

import java.util.Random;
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		Random r = new Random();
		int score = r.nextInt(100) +1;
		
		char a = 'a';
		String s = "";
		
		//스위치문은 동등비교만 가능. 
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A 등급입니다.");
				break;
			case 8:
				System.out.println("B 등급입니다.");
				break;
			case 7:
				System.out.println("C 등급입니다.");
				break;
			case 6:
				System.out.println("D 등급입니다.");
				break;
			
			default:
				System.out.println("F 등급입니다.");
				break;
		}
	}
}