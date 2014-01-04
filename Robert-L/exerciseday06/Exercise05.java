package exerciseday06;

public class Exercise05 {
public static void main(String[] args) {
	int n=3;
	int y=f(3);
 	System.out.println(y);
}

static int f(int n) {
	if(n==1){
		return 1;
	}
	int y=n+f(n-2);
	return y;
}
}
