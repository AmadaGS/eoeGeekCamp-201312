package Exerciseday05;

public class Exercise07 {
	/**
	 * 用三重循环找出水仙花数。
	 */
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
		for(int j=0;j<=9;j++){
		for(int m=0;m<=9;m++){
			int value=i*100+j*10+m;
			if(i*i*i+j*j*j+m*m*m==value){
				System.out.println(value);
				
			}
		}	
		}	
			
		}
		
	}

}
