package com.ssafy.java;
import java.util.HashSet;
public class Lotto {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while(set.size() != 6) set.add(((int)(Math.random() * 100) + 1) % 45 + 1);
		for(int num:set) System.out.println(num);
	}
}