package ClassTestday02;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Byte类的常用方法和常量
System.out.println("byte的数据总数："+Math.pow(2, 8));
System.out.println("byte的取值范围："+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
byte bMax=Byte.parseByte("127");
System.out.println(bMax);
//Short类的常用方法和常量
System.out.println("short的数据总数:"+Math.pow(2, 16));
System.out.println("short的取值范围:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
short shortValue=Short.parseShort("1000");
System.out.println(shortValue);
//Integer类的常用方法和常量
System.out.println("int的数据总数:"+Math.pow(2, 32));
System.out.println("int的数据范围:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
int intValue=Integer.parseInt("2000000");
System.out.println(intValue);
String binaryValue=Integer.toBinaryString(16);
String hexValue=Integer.toHexString(16);
String octalvalue=Integer.toOctalString(16);
System.out.println("16转换为二级制:"+binaryValue);
System.out.println("16转换为十六进制数："+hexValue);
System.out.println("16转换为把进制数："+octalvalue);

//Float类的常用方法和常量

System.out.println("float的数据总数："+Math.pow(2, 32));
System.out.println("float的取值范围："+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
float floatValue=Long.parseLong("2000000");
System.out.println(floatValue);
hexValue=Float.toHexString(16);
System.out.println("16转换为十六进制数："+hexValue);

//Double类的常用方法和常量
System.out.println("double的数据总数："+Math.pow(2, 64));
System.out.println("double的取值范围："+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
double doubleValue=Long.parseLong("2000000");
System.out.println(doubleValue);
binaryValue=Long.toBinaryString(16);
hexValue=Long.toHexString(16);
octalvalue=Long.toOctalString(16);
System.out.println("16转换为二进制："+binaryValue);
System.out.println("16转换为十六进制数："+hexValue);
System.out.println("16转换为八进制数："+octalvalue);



	}

}
