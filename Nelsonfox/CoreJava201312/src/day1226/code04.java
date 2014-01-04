package day1226;

public class code04 {

	public code04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 用双重循环打印九九表
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=1;
		// for(int j=1;j<=9;j++){
		// if(i*j<10){
		// System.out.print(i+"*"+j+"= "+i*j+" ");
		// }else{
		// System.out.print(i+"*"+j+"="+i*j+" ");
		// }
		// }
		// System.out.println();
		// i++;//i=2
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j < 10) {// 如果i*j<10，个位数前加个空格
					System.out.print(i + "*" + j + "=  " + i * j + " ");
				} else {// 正常输出
					System.out.print(i + "*" + j + "=" + i * j + " ");
				}
			}
			System.out.println();// 换行
		}
	}

}
