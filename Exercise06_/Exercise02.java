package Exercise06_;

public class Exercise02 {
	/**
	 * 用双重循环查找100～200之间的所有质数。
	 */
		public static void main(String[] args) {
			int a=2;
			for(int i=101;i<200;i++){
				for(a=2;a<i;a++){
					if(i%a==0)
						break;	
				}
				if(i==a&&i>=101)
					System.out.println(i+" ");
			}
		}
}
