package com.mahesh.polisetty1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Compression;

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
		//Login again
		
		//sort a list of String  by length
		
//		List<String> list = Arrays.asList("Apple","Kiwiuuu","Banana","Orange");
//		
//		List<String> result = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//		System.out.println(result);
		
		//find the maximum and minimum
		
		
//		List<Integer> list = Arrays.asList(5,4,6,3,2,8,1,9);
		
//		int a = list.stream().min(Integer::compare).get();
//		int b =list.stream().max(Integer::compare).get();
//		System.out.println(a);
//		System.out.println(b);
		
		//Filter  and print  names  starting M
		
//		List<String> list  =  Arrays.asList("Apple","Kiwi","Mango","Mosambi","Banana");
//		
//		List<String> result =list.stream().filter(f->f.startsWith("M")).toList();
//		
//		System.out.println(result);
		
//		List<String> list1 = new ArrayList<String>(Arrays.asList("Apple","Banana","Manago"));
//		
//		List<String> list2 = Arrays.asList("Kiwi","Banana","Berry");
//		
//		list1.retainAll(list2);
//		
//		System.out.println(list1);
		
		//find the word  with maximuam lenght  in the  sentendce
		
//		String str = "java is a programming language";
//		
//		
//		String result =Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
//		
//		System.out.println(result);
//		
		//Reverse  word in a sentence
		
//		String str = "java is a programming language";
		
//		String[] arrStr = str.split(" ");
//		String output ="";
//		
//		for(int i = arrStr.length-1;i>=0;i--) {
//			output =output+arrStr[i]+ " ";
//		}
//		
//		System.out.println(output.trim());
		
//		 String result =Arrays.stream(str.split(" ")).map(f->new StringBuilder(f).reverse().toString()).collect(Collectors.joining(" "));
//		 
//		 System.out.println(result);
		
		//convert list of string to upper case
		
//		String result = Arrays.stream(str.split(" ")).map(String::toUpperCase).collect(Collectors.joining(" "));
//		System.out.println(result);
		//Remove the duplciate elements from  the String
		
		String str = "java is a programming language and java is a powerfull";
		
//		String result = Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
//		System.out.println(result);
		
		//find the frequency of each character (ignore white spaces)
		
		Map<Character, Long> result = str.replace(" ", "").chars().mapToObj(v->(char)v).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(result);
		
		
		
		
		

	}

}
