package ClassTestday02;

public class Test12 {

	/**
	 * 示例 int类型转化为float类型丢失精度案例
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0x1000001;
System.out.println("int:"+Integer.toBinaryString(i)+" "+i);
float f=i;
System.out.println("float"+Integer.toBinaryString((int)f)+" "+f);
	}

}
