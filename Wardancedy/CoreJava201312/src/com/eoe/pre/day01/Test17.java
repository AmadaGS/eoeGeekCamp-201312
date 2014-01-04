package com.eoe.pre.day01;

public class Test17 {

	/**continue;跳过本次循环之后的命令，执行下一循环内容
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;;i++){
			if(i<=20){
				System.out.println("罚做俯卧撑"+i+"次");
			}else if(i<=100){
				System.out.println("呼哧..呼哧..."+i+"次");
			}else{
				System.out.println("体力不支，最终Over!");
				break;
			}
		}
	}

}
