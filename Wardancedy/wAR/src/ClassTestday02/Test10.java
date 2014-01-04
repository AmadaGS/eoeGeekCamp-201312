package ClassTestday02;

public class Test10 {

	/**
	 * 编写一个是不是通过考试的代码
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean pass;//表示是不是通过考试
pass=true;//表示通过考试
System.out.println("考试通过"+pass);
pass=false;//表示没通过考试
System.out.println("考试没通过"+pass);
int score=65;//设置考试分数
pass=score>60;//将score>=60的结果保存在pass变量中
System.out.println("考试通过："+pass);
	}

}
