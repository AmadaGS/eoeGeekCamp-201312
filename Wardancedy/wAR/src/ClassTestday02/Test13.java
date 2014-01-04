package ClassTestday02;

public class Test13 {

	/**
	 * 示例：long类型转换为double类型的精度丢失现象.
	 */
	public static void main(String[] args) {
long l=0X200000001l;
double d=1;
/*以下是该数的二进制形式，总共54位
100000,00000000,00000000,00000000,00000000,00000000,00000001 long
10000,00000000,00000000,00000000,00000000,00000000,000100000 double
*  存放至double变量中将丢失最后1位数据。
*/
System.out.println("long:"+Long.toBinaryString(l)+" "+l);
System.out.println("double"+Long.toBinaryString((long)d)+""+d);
	}

}
