package exerciseday06;
/**
 * fact()递归的方式求n!
 * 
 * 
 */
public class Exercise03 {
public static void main(String[] args) {
	double result=fact(4);
	System.out.println("4!="+result);
}

 static double fact(int n) {
	if(n==1){
		return 1;
	}
	double result=n*fact(n-1);
	return result;
	
}
}
