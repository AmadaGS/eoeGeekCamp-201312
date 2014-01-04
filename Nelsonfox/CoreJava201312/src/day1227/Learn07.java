package day1227;

import java.util.Random;

public class Learn07 {

	public Learn07() {
		// TODO Auto-generated constructor stub
	}

	/**测试循环赋值与System.arraycopy赋值的效率
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
double[] a=new double[10000000];
double[] b=new double[10000000];
for(int i=0;i<a.length;i++){
	a[i]=random.nextInt(100000);
}
long start=System.currentTimeMillis();
for(int i=0;i<a.length;i++){
	b[i]=a[i];
}
long end=System.currentTimeMillis();
System.out.println("cost="+(end-start));
start=System.currentTimeMillis();
System.arraycopy(a, 0, b, 0, a.length);
end=System.currentTimeMillis();
System.out.println("cost="+(end-start));
	}

}
