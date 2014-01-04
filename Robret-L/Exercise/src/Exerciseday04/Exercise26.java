package Exerciseday04;

public class Exercise26 {

	/**
	 * substring
	 */
	public static void main(String[] args) {
		String text="abcdefg";
//		System.out.println(text);
//		String subText=text.substring(1);
//		System.out.println(subText);
//		subText=text.substring(2, 5);
//		System.out.println(subText);
		
		String text1=text+"";
		if(text.equals(text1)){
			System.out.println("相同");
		}else{
			System.out.println("不同");
		}
	}

}
