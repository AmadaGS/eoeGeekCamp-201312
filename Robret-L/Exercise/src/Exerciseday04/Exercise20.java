package Exerciseday04;

public class Exercise20 {
	/**
	 *编写程序计算公式：
	 *(∑10+∑5)*(∑8+∑4)/(pow(2,8)-5!)+4!-pow(3,4)
	 */
	public static void main(String[] args) {
		double result=(add(10)+add(5))*(add(8)+add(4))/(myPow(2,8)-fact(5))+fact(4)-myPow(3,4);
		System.out.println("(∑10+∑5)*(∑8+∑4)/(pow(2,8)-5!)+4!-pow(3,4)=");
		System.out.println(result);
		
	}
	//计算m的n次方
	    static double myPow(double m,int n){
	    	double result=1;
	    	for(int i=1;i<=n;i++){
	    		result*=m;
	    	}
	    	return result;
	    }
	    //计算n!
	    static double fact(int n){
	    	double result=1;
	    	for(int i=1;i<=n;i++){
	    		result*=i;
	    	}
	    	return result;
	    }
	    //计算∑n
	    static double add(int n){
	    	int result=0;
	    	for(int i=1;i<=n;i++){
	    		result+=i;
	    	}
	    	return result;
	    		
	    }
}
