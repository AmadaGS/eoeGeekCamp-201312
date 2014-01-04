package ClassTestday02;

public class Test16 {

	/**
	 * 大范围类型的数据超过了小范围类型的位置，则超过的位数会自动舍弃
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=257;
byte bytei;
byte b=(byte)i;
System.out.println("int:"+Integer.toBinaryString(i)+" "+i);
System.out.println("byte:"+Integer.toBinaryString(b)+" "+b);
	}

}
