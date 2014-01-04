package day1230;

public class Exercise08 {

	public Exercise08() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 将以下代表网站资源的字符串分解为协议、主机地址、端口号和资源路径 String
	 * url="http://127.0.0.1:8080/elts/user.txt";
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://127.0.0.1:8080/elts/user.txt";
		if (url.startsWith("http://")) {//判断是否是HTTP协议
			String protocol = url.substring(0, url.indexOf("://"));
			//获取主机IP地址
			String host = url.substring(url.indexOf("://") + 3,
					url.lastIndexOf(":"));
			//获取端口号
			String port = url.substring(url.lastIndexOf(":") + 1);
			port = port.substring(0, port.indexOf("/"));
			String filename = url.substring(url.indexOf(port) + port.length()
					+ 1);//获取资源的文件名
			System.out.println(protocol);
			System.out.println(host);
			System.out.println(port);
			System.out.println(filename);
		}
	}

}
