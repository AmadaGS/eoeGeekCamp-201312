package Exerciseday04;

public class Exercise02 {
public static void main(String[] args) {
	char c='A';
	while(c<='Z'){
		System.out.println(c+":"+(int)c);
	  c++;//将字符c的unicode码+1
	}
}
}
