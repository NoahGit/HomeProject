package onepackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OneClass {
	final static int HRLLL = 2;
	/*所谓访问控制器就是控制属性的读写权限。
一个java bean的特点就是，属性私有，用公有的set,get方法访问私有属性。
*/
	private String name;
	private int age;
	private char sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*有参构造方法*/
	public OneClass(String name, int age, char sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	/*无参构造方法*/
	public OneClass() {
		
	}
	
	private static String name2 = "piter";
	public static void sayHI() {
		System.out.print("holl");
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int width = 7;
		int height = 5;
		double result = width*height/(double)2;
		/*
		 * DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(width*height/(float)2);
		 */
		
		OneClass oc = new OneClass("张三",20,'男');
		System.out.println(oc.name+'\t'+oc.age+'\t'+oc.sex+HRLLL);
		System.out.println(OneClass.name2);
		OneClass.sayHI();
		System.out.println("------------------");
		System.out.println(result);
		
		int a = 10;
		int b = a++;
		System.out.println(b);
		
		int b1 = a+1;
		System.out.println(b1);
		
		System.out.println("3"+"4");
		System.out.println("3+4="+3+4);
		System.out.println(3+4+"=3+4");

		//隐式转换
		int a1=1;
		String c=String.valueOf(a1+1.2);
		//显示转换
		double d1=1.2d;
		int c1=1+ (int) d1; 
		int c2= (int) (1+1.2);
		
		System.out.println(c+"  "+c1+"  "+c2);
		
		String str = "24324";
		int strint = Integer.valueOf(str);
		System.out.println(strint);
		
		System.out.println("------------------");
		
		System.out.print("输入姓名：  ");
		String name = in.next();
		System.out.println("您的姓名是： "+name);
	}
}

