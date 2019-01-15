package com.accolite.au.practice;
import java.util.HashMap;
public class Maptest {
	public static void main(String args[])
	{
		HashMap<Integer,Character> hs = new HashMap<>();
		for(char c='a';c <= 'z'; c++)
		{
			hs.put((int)(c),c);
		}
		for(Character c : hs.values())
		{
			System.out.println(c);
		}
	}

}
