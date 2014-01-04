package day1230;

public class Exercise03 {

	public Exercise03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 用双重循环查找100～200之间的所有质数。 文件名：Exercise02.java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=100;i<=200;i++){
		// int count=2; for(int j=2;j<i;j++){if(i%j==0){
		// break;
		// }else{count++;}
		// }if(count==(i-3)){System.out.println(i);
		// }
		// }
		for (int i = 100; i <= 200; i++) {
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
