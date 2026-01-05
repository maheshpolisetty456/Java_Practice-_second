package com.mahesh.polisetty1;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		//OTP generated using java stream api 
		
//		int length =6;
//		SecureRandom  rand = new SecureRandom();
//		
//		String otp = rand.ints(length,0,10).mapToObj(f->String.valueOf(f))
//									.collect(Collectors.joining());
//		
//		System.out.println(otp);
		
		//find all even numbers in the list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
//		List<Integer> result =list.stream().filter(f->f%2 ==0 ).toList();
//		System.out.println(result);
		
		//find the duplicate elements from  the list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,3,2,4,5,6,7,8,9,7);
//		
//		List<Integer> set = list.stream().filter(f->Collections.frequency(list, f)>1).collect(Collectors.toList());
//		System.out.println(set);
		
		//find out the not repleating elements
//		List<Integer> list = Arrays.asList(1,2,3,4,3,2,4,5,6,7,8,9,7);
//		List<Integer> result = list.stream().filter(f->Collections.frequency(list, f)==1).toList();
//		System.out.println(result);
		
		
		//find the first non- repeating character from the string
//		String str = "stress";
//		
//		Character ch =str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new , Collectors.counting()))
//									.entrySet()
//									.stream()
//									.filter(f->f.getValue()==1)
//									.map(Map.Entry::getKey)
//									.skip(1)
//									.findFirst()
//									.get();
//		System.out.println(ch);
		
		//count the frequency of each elements
		
	/*	List<String> list = Arrays.asList("Apple","Banana","Kiwi","Apple","Apple");
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(map); */
		//after dinner will start the code
		
		
		
		

	}

}
