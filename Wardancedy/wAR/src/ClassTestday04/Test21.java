package ClassTestday04;

public class Test21 {
	/**
	 * 判断语句
	 *无限循环中重复输出0～5之间的数字。解法(1)
	 */
	public static void main(String[] args) {
		int i=0;
		while(true){
			System.out.println(i%6);
			i++;
			//i=i<5?i+1:0;
//			if(i<5){
//				i++;
//			}else{
//				i=0;
//			}
		}
	}
}
