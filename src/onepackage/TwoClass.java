package onepackage;

import java.util.Scanner;

public class TwoClass {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("输入字符串：");
		String str_in = in.next();
		System.out.println(str_in);
		
		String s="123";
		String s2="123";
		System.out.println(s==s2);//true
		
		String str = new String("123");
		String str2 = new String("123");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		int a = 012;
		System.out.println(a);
		String a1 = String.valueOf(a);
		System.out.println(a1);
		
		String str3 = "02";
		int inter = Integer.valueOf(str3);
		System.out.println(inter);
		System.out.println("adsfasdfasdfadsfasdfasdfadsfadsfasdfasdf");
		long l=8888888888L;
		float f=10.56F;
		System.out.println(l+"\t"+f);
		
	}
}
