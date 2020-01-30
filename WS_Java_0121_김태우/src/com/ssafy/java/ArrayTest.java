package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest {
	static int[] list = {34, 23, 64, 25, 12, 75, 22, 88, 53, 37};
	
	
	public static void main(String[] args) 
	{
		print();
		total();
		average();
		minimum();
	}
	
	public static void print()
	{
		for(int n : list) System.out.print(n+" ");
		System.out.println();
		
	}
	
	public static void total()
	{
		int sum = 0;
		for(int n : list) sum += n;
		System.out.println("배열의 합 : " + sum);
	}
	
	public static void average()
	{
		int sum=0, avg = 0;
		for(int n : list) sum += n;
		avg = sum / list.length;
		System.out.println("배열의 평균 : " + avg);
	}
	public static void minimum()
	{
		int min = list[0];
		for(int n : list)
			if(n < min) min = n;
		System.out.println("배열의 최소값 : " + min);
	}
}
