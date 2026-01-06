package com.mahesh.polisetty1;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println( "Enter the String value with number and special characters");
//		String str = sc.nextLine();
//		
//		int vowels = 0;
//		int consonents =0;
//		int digits =0;
//		int special =0;
//		
//		for( char c : str.toCharArray()) {
//			if(Character.isLetter(c)) {
//				if("AEIOUaeiou".indexOf(c)!= -1) {
//					vowels++;
//				}else {
//					consonents++;
//				}
//			}else if(Character.isDigit(c)) {
//				digits++;
//			}else if(!Character.isWhitespace(c)){
//				special++;
//			}
//		}
//		System.out.println("Vowels: "+vowels);
//		System.out.println("Consonents: "+consonents);
//		System.out.println("Digits: "+digits);
//		System.out.println("Special character: "+special);
		
		//find the duplicate elements from the array
		
//		int [] num = {1,2,3,4,5,4,3,2,};
//		
//		for(int i = 0; i<num.length;i++) {
//			for(int j=i+1 ; j<num.length;j++) {
//				if(num[i] == num[j]) {
//					System.out.println(num[i]);
//				}
//			}
//		}
		
		//Remove the duplicate character from the string
//		String str ="Mahesh";
//		
//		String result = str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
//		System.out.println(result);
		
		//move the negative numbers to the front
		
//		List<Integer> list = Arrays.asList(2,4,5,-4,3,-3,-2,4);
//		
//		List<Integer> result = Stream.concat(list.stream().filter(f1->f1<0), list.stream().filter(f2->f2>0)).toList();
//		System.out.println(result);

		//move to the zero's to last 
		
//		List<Integer> list = Arrays.asList(2,5,8,8,9,0,8,0,9,9,0,4);
//		
//		List<Integer> result = Stream.concat(list.stream().filter(f1->f1>0), list.stream().filter(f3->f3==0)).toList();
//		
//		System.out.println(result);
		
		//find the unique work in the list and sortd alphabets
		
//		String str = "Java is a programing language and Java is powerfull";
//		
//	String result =	Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().collect(Collectors.joining(" "));
//		System.out.println(result);
//		
		
		//otp generation using java 8
		
		int number = 6;
		
		SecureRandom rand = new SecureRandom();
		
		String result = rand.ints(number,0,10).mapToObj(f->String.valueOf(f)).collect(Collectors.joining());
		
		System.out.println(result);
		
		
		
		
		
	}

}
