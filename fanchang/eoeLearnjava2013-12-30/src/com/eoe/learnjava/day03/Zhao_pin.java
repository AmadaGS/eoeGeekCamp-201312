package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Zhao_pin {

	/**��˾��Ƹ¼�ñ�׼��
	 * 1. java��android��sql��project�����ſγ̾����ڵ�ȥ90
	 * 2. java��project��90�����ϣ�sql��android������һ�Ŵ���90
	 * 3. java��project��sql��android������һ��90����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������java�ɼ���");
		int java = scanner.nextInt();
		System.out.println("������project�ĳɼ���");
		int project = scanner.nextInt();
		System.out.println("������android�ĳɼ���");
		int android = scanner.nextInt();
		System.out.println("������aql�ĳɼ���");
		int sql = scanner.nextInt();
		
		if(java>=90 && project>=90 && sql>=90 && android>=90){
			System.out.println("��ϲ��������¼ȡ�ˣ���н5k");
		}else if(java>=90 && project>=90 && (sql>=90 || android>=90)){
			System.out.println("��ϲ��������¼ȡ�ˣ���н4k");
		}else if(java>=90 || project>=90 && sql>=90 || android>=90){
			System.out.println("��ϲ��������¼ȡ�ˣ���н3K");
		}else{
			System.out.println("��֪ͨ�ɣ�");
		}
		
	}
}
