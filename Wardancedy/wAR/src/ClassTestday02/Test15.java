package ClassTestday02;

public class Test15 {

	/**
	 * 示例：int 转换为byte类型出现的数据位变符号位的现象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=129;
byte b=(byte) i;
System.out.println(Integer.toBinaryString(i)+" "+i);
System.out.println(Integer.toBinaryString(b)+" "+b);
	}

}
