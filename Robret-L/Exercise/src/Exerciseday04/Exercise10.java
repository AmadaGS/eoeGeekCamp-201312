package Exerciseday04;

public class Exercise10 {
public static void main(String[] args) {
	for(int i=1;;i++){
		if(i<=20){
		System.out.println("做俯卧撑："+i+"次");
		continue;
		}
		if(i<100){
			System.out.println("呼哧、、、呼哧！");
			continue;
		}
		break;
		
		}
	System.out.println("体力不支，最终Over!");
		
}
}
