package exerciseday06;

public class Exercise01 {
	/**
	 * 
	 * 用双重循环查找100～200之间的所有质数。
	 */
	public static void main(String[] args) {
		for(int i=101;i<200;i+=2){
			boolean isPrime=true;
			int k=(int)Math.sqrt(i);
			for(int j=2;j<=k&&isPrime;j++){		
            isPrime=i%j!=0;
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}
