package day1227;

import java.util.Random;

public class Learn04 {

	public Learn04() {
		// TODO Auto-generated constructor stub
	}

	/**随机产生10个60~100之间的分数，找出最大数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random=new Random();
//步骤一随机产生10分数，保存至数组中
int[] score=new int[10];
for(int i=0;i<score.length;i++){
	score[i]=random.nextInt(41)+60;
	System.out.println(score[i]+"  ");
}
//步骤二找最高分
//徐泽排序的方式：将最高分交换到score[0]中
for(int j=1;j<score.length;j++){
	if(score[0]<score[j]){
		//交换score[0]和score[j]
		int t= score[0];
		score[0]=score[j];
		score[j]=t;
	}
}
System.out.println("最高分:"+score[0]);
	}

}
