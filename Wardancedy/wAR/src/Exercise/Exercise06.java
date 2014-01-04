package Exercise;

public class Exercise06 {

	/**编写Exercise06类，计算3712秒是几小时、几分、几秒。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds=3712;
		int hours=seconds/3600;
		seconds=seconds%3600;
		int minutes=seconds/60;
		seconds=seconds%60;
		int second=seconds;
		System.out.println("时间是："+hours+"小时"+minutes+"分钟"+second+"秒");
	}

}
