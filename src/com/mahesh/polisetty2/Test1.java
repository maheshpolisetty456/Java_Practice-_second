package com.mahesh.polisetty2;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		//OTP generation using java 8
		
//		int length = 6;
		
//		SecureRandom rand = new SecureRandom();
//		
//		String str = rand.ints(length,0,10).mapToObj(f->String.valueOf(f)).collect(Collectors.joining());
//		System.out.println(str);
		
		//count the frequency of each word in the string
		
//		String str = "mahesh is a good boy and mahesh is a inteligent";
//		
//		Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		System.out.println(map);
		
		
		//Remove the dplicate elementes while pesenting the order
		
//		int[] number  = {1,2,3,4,2,3,1,6,7};
//		
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//		
//		for(int n : number) {
//			set.add(n);
//		}
//		System.out.println(set);
		
		
		//find the first not repeating character
		
		String str = "stress";
		
		Character result = str.chars().mapToObj(c->(char)c)
						.collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
								.entrySet()
								.stream()
								.filter(f->f.getValue()==1)
								.map(Map.Entry::getKey)
								.findFirst()
								.get();
		System.out.println(result);
		
		
		
		
		
		
		System.out.println("checking the main pull");
		
		
		
		
		
		
		
		
		
		
	}

}
