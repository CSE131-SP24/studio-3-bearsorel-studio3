package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("To what number would you like to compute primes?");
		int primesUntil = in.nextInt(); 
		int[]numberList = new int[primesUntil+1];
		for (int i = 0 ; i < (numberList.length); i++) {
			numberList [i] = i;
			
		}
		for(int i = 2; i<numberList.length; i++) {
			for(int pMultiple=2;i*pMultiple <= primesUntil;pMultiple+=1) {
				
				numberList[i*pMultiple] = 0;
			}
		}
		
		int pp = 0;
		for (int element:numberList) {
			if (element!=0){
			System.out.println(numberList[pp]);
			}
		pp++;
		}
	}

}
