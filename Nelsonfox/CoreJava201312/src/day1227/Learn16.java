package day1227;

public class Learn16 {

	public Learn16() {
		// TODO Auto-generated constructor stub
	}

	/**indexOf()和lastIndexOf()实例
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String url="http://www.tarean.com/loge.gif";
  int pos=url.indexOf("://");
  String protocol=url.substring(0,pos);
  System.out.println("协议名称:"+protocol);
  pos=url.lastIndexOf("/");
  String filename=url.substring(pos+1);
  System.out.println("文件名:"+filename);
	}

}
