package com.mahesh.polisetty1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
//find the all even number from the list
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		
//		List<Integer> result = list.stream().filter(f->f%2==0).toList();
//		System.out.println(result);
		
	//find the duplicate elements in the list
//		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,2,7,8);
//		
//		Set<Integer> result = list.stream().filter(f->Collections.frequency(list,f)>1).collect(Collectors.toSet());
//		
//		System.out.println(result);
		
//		List<String>list = Arrays.asList("Apple","Banana","Apple","Mango","Banana","Kiwi");
//		Set<String> sey= list.stream().filter(f->Collections.frequency(list, f)==1).collect(Collectors.toSet());
//		System.out.println(sey);
		
		//find first non repleating characterf from the string
		
//		String str = "swiss";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String value ");
//		String str = sc.next();
//		
//		Character chars = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(f->f,LinkedHashMap::new,Collectors.counting()))
//								.entrySet()
//								.stream()
//								.filter(f->f.getValue()==1)
//								.map(Map.Entry::getKey)
//								.findFirst()
//								.get();
//		System.out.println("First non repeating character: "+chars);
		//count the frequency of elements
//		List<String>list = Arrays.asList("Apple","Banana","Apple","Mango","Banana","Kiwi");
//		
//		Map<String, Long> result =  list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
//		System.out.println(result);
		
		//sort a list string by length
		
//		List<String>  list = Arrays.asList("a1111","a11","a111","a11111","a1");
//		
//	List<String> result = 	list.stream().sorted(Comparator.comparing(String::length)).toList();
//	System.out.println(result);
		
		//find the maximum and minimum number of list
		
//		List<Integer> list = Arrays.asList(1,4,6,7,8,3);
//		
//		int min = list.stream().min(Integer::compare).get();
//		int max = list.stream().max(Integer::compare).get();
//		 
//		 System.out.println("Min:"+min+" Max: "+max);
		
		//find the second highest number in the list
//		List<Integer> list = Arrays.asList(4,2,3,5,7,8,9);
//		
//		int i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println("Second highest number: "+i);
		
		
		//merge two list and remove the duplciate values
//		List<Integer> list1 = Arrays.asList(2,3,4,5,5);
//		List<Integer> list2 = Arrays.asList(3,4,7,8);
//		
//		List<Integer> result = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
//	
//		System.out.println(result);
		
		//find the word with maximun length in the sentence 
		
//		String str = "java is a programing language";
//		
//		String result = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
//		System.out.println(result);
		
		//rever words in a sentece
		
//		String str = "java is a programing language";
//		
//		String result = Arrays.stream(str.split(" ")).map(f->new StringBuffer(f).reverse().toString()).collect(Collectors.joining(" "));
//		System.out.println(result);
//		
//		String[] arrStr = str.split(" ");
//		String output = "";
//		
//		for(int i = arrStr.length-1 ;i>=0;i--) {
//			output+=arrStr[i]+" ";
//		}
//		System.out.println(output.trim());

	}

}
