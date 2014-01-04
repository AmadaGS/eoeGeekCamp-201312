package Exerciseday05;

public class Exercise03 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			if(i*j<10){
				System.out.print(i+"*"+j+"= "+i*j+" ");
			}else{
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
		}
		System.out.println();
		}
	}

}
