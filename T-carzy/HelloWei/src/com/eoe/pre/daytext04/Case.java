package com.eoe.pre.daytext04;

public class Case {
	public static boolean isPrime(int n){
		boolean isPrime=true;
		int k=(int)Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;isPrime=n%i!=0,i++){}
		return isPrime;
	}

}
