package Exerciseday05;

import java.util.Random;

public class Exercise11 {
	/**
	 * 测试循环赋值与System.arraycopy赋值的效率
	 */
	public static void main(String[] args) {
		Random random = new Random();
		//创建两个数组，元素各有一千万个
		double[] a = new double[10000000];
		double[] b = new double[10000000];
		//用随机值给数组a赋值
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100000);
		}
		//通过循环数组元素依次赋值的时间
		long start = System.currentTimeMillis();
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		long end = System.currentTimeMillis();
		System.out.println("cost=" + (end - start));
		//System.arraycopy()方式赋值的时间
		start = System.currentTimeMillis();
		System.arraycopy(a, 0, b, 0, a.length);
		end = System.currentTimeMillis();
		System.out.println("cost=" + (end - start));
	}
}
