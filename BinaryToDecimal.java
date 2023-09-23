package com.sonu;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
//		int[] arr= {1100,1010,0011,1110,1111};
//		for(int i=0;i<=arr.length-1;i++) {
			
      Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int dec=0;
		int t=n;
		int i=0;
		while(t>0) {
			int rem=t%10;
			t=t/10;
			dec=dec+rem*(int)Math.pow(2, i++);
		}
		System.out.println("Decimal Number for"+n+"is"+dec);
	}

	}

