package ClassTestday02;

public class Test19 {

	/**
	 * 示例：Java对char类型的数据底层是按int类型来处理的
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ca='a';
int i=ca+1;
char cb=(char)(ca+1);
System.out.println(cb+":"+i);
	}

}
