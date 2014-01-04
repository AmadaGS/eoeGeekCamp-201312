package exerciseday06;

public class Exercise15 {
	public static void main(String[] args) {
		//创建二维数组对象
		int[][] a=new int[3][];
		//创建一维数组对象，由a[0]引用
		a[0]=new int[]{5,3,2,6};
		//创建一维数组对象，由a[1]引用
		a[1]=new int[]{10,20};
		//创建一维数组对象，由a[2]引用
		a[2]=new int[]{100,200,300};
		//打印所有数组元素值
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]<10){
				System.out.print(" ");
				}else if(a[i][j]<100){
					System.out.print(" ");
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
