package ClassTestday02;

public class Test11 {

	/**
	 * 示例：int类型转换为long类型。
	 * 超过32位的高位自动补0或1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i=-2;
  long l=i;
  System.out.println("int类型的-2："+Integer.toBinaryString(i));
  System.out.println("long类型的-2："+Long.toBinaryString(l));
	}

}
