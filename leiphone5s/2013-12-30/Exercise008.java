package com.fengleiit.work;
/*将以下代表网站资源的字符串分解为协议、主机地址、端口号和资源路径
String url="http://127.0.0.1:8080/elts/user.txt";*/
public class Exercise008 {
	public static void main(String[] args) {
		String url="http://127.0.0.1:8080/elts/user.txt";
		if(url.startsWith("http://")){
		String protocol=url.substring(0,url.indexOf("://"));
		String host=url.substring(url.indexOf("://")+3,url.indexOf("/"));
		String port=url.substring(url.indexOf("://")+13);
		port=port.substring(0,port.indexOf("/"));
		String filename=url.substring(url.lastIndexOf("/")+1);
		System.out.println(protocol+"protocol");
		System.out.println(host+"host");
		System.out.println(port+"port");
	}
}
}