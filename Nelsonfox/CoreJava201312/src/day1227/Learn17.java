package day1227;

public class Learn17 {

	public Learn17() {
		// TODO Auto-generated constructor stub
	}

	/**startWidth()实例
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url="http://127.0.0.1:8080/elts/user.txt";
if(url.startsWith("http://")){
	String protocol=url.substring(0,url.indexOf("://"));
	String host=url.substring(url.indexOf("://")+3,url.lastIndexOf(":"));
	String port=url.substring(url.lastIndexOf(":")+1);
	port=port.substring(0,port.indexOf("/"));
	String filename=url.substring(url.indexOf(port)+port.length()+1);
	System.out.println("protocol:"+protocol);
	System.out.println("host:"+host);
	System.out.println("port:"+port);
	System.out.println("path:"+filename);
}
	}

}
