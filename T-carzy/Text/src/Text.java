import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Text{
	public static void main(String[] args)
    {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("王多英");
		arr.add("李伟");
		arr.add("侯亮");
		arr.add("冯蕾");
		arr.add("韩伟");
		arr.add("梁伟峰");
		arr.add("高珊");
		arr.add("樊昶");
		arr.add("沈少阳");
		System.out.println(arr.get((int)(Math.random()*arr.size())));
		//String[] people =new String[9];
		//String[9] people={"王多英","冯蕾","李伟","高珊","梁伟峰","韩亮","樊昶","沈少阳","侯亮"};
//		people[0]="王多英";
//		people[1]="冯蕾";
//		people[2]="李伟";
//		people[3]="侯亮";
//		people[4]="韩伟";
//		people[5]="梁伟峰";
//		people[6]="樊昶";
//		people[7]="高珊";
//		people[8]="沈少阳";
//		Random random=new Random();
//		for(int i=0;i<=people.length;i++){
//		people[i]=random.toString();	
//	}
//		System.out.println(people[i]);
    }
		  }