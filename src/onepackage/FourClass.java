package onepackage;

import java.util.Random;
import java.util.Scanner;
/*石头剪刀布*/
public class FourClass {
	public static void main(String[] args) {
		/*int[] arry_int = new int[10];
		arry_int[3] = 22;
		System.out.println(arry_int[3]);
		
		int[] arry = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arry[arry.length-1]);
		
		for(int i=0; i<arry.length; i++) {
			System.out.print(arry[i]+"  ");
		}
		
		for(int j : arry) {
			System.out.println(j);
		}*/
		
		/*String[][] str1 = {{"aa"},{"bb","cc"},{"dd","ee","ff"}};
		for(String[] str : str1) {
			System.out.println(str.length);
			for(String str2 : str) {
				System.out.print(str2+"  ");
			}
			System.out.println();
		}*/
		
		/*String str3 = String.valueOf("dfghjkl");
		char[] c = new char[6];
		System.out.println(str3.charAt(2));
		str3.getChars(3, 5, c, 4);
		
		for(char c1 : c) {
			System.out.print(c1+"++");
		}
		System.out.println('\n'+"------------------------------------");
		System.out.println(str3.equals(c));
		System.out.println(str3.compareTo("asdasd"));
		System.out.println(str3.indexOf('k'));
		System.out.println(str3.lastIndexOf('f'));
		System.out.println(str3.concat("9999"));
		System.out.println(str3.substring(3, 6));
		System.out.println(str3.substring(4));
		System.out.println('\n'+"------------------------------------");
		
		String[] str6 = str3.split("h");
		for(String str7 : str6) {
			System.out.println(str7);
		}
		System.out.println('\n'+"------------------------------------");
		
		str3 = str3.replace('j', '8');
		System.out.println(str3);
		System.out.println('\n'+"------------------------------------");
		
		System.out.println(str3.startsWith("d"));
		
		String str8 = String.valueOf(4444.4444);
		System.out.println(str8);
		System.out.println('\n'+"------------------------------------");
		
		char[] c4 = str3.toCharArray();
		for(char c5 : c4) {
			System.out.print(c5+"++");
		}
		System.out.println('\n'+"------------------------------------");
		
		String str9 = "      dfsds";
		str9 = str9.trim();
		System.out.println(str9);
		str9 = str9.toUpperCase();
		System.out.println(str9);*/
		
		
		/*StringBuffer stbf = new StringBuffer("qwertyuiop");
		stbf.setCharAt(3,'4');
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		stbf.insert(5, '*');
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		stbf.append("0000");
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		stbf.reverse();
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		stbf.delete(5, 6);
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		stbf.replace(3, 8, "12345");
		System.out.println(stbf);
		System.out.println("--------------------------");
		
		System.out.println(stbf.substring(5,8));*/
		
//		String str = "qwert";
//		str = str.toUpperCase();
//		System.out.println(str);
		
//		String str = String.valueOf("qwert");
//		str = str.toUpperCase();
//		System.out.println(str);
		
		/*对StringBuffer进行操作,是在原来的对象之上进行改变. 而对String进行操作,是
		创建新的对象.*/
		
		/*double m = Math.E;
		System.out.println(m);
		
		System.out.println(Math.abs(-4.5666));
		System.out.println(Math.ceil(3.456666));
		System.out.println(Math.floor(3.4445566));
		System.out.println(Math.max(3.435, 5.456));
		System.out.println(Math.min(3.55, 4));
		System.out.println("-----------------------------");
		System.out.println((int)Math.floor(Math.random()*10));
		System.out.println("-----------------------------");
		Random random = new Random();
		int rd = random.nextInt(10);
		System.out.println(rd);
		System.out.println("-----------------------------");
		System.out.println(Math.round(3.845));
		System.out.println(Math.sqrt(49));
		System.out.println(Math.pow(2, 3));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(50));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextGaussian());
		System.out.println(random.nextLong());*/
		
		Random random = new Random();
		
		while(true) {
			int cq = random.nextInt(4);
			//cq == 1 ---石头
			//cq == 2 ---剪刀
			//cq == 3 ---布
			Scanner in = new Scanner(System.in);
			System.out.println("请输入“石头”、“剪刀”、“布”：");
			
			String str = in.next();
			
			if(str.equals("石头")) {
				if(cq == 1) {
					System.out.println("咱们都是石头");
				}else if(cq == 2) {
					System.out.println("唉，我输了，我是剪刀");
				}else {
					System.out.println("哈哈，我赢了，我是布");
				}
			}else if(str.equals("剪刀")) {
				if(cq == 1) {
					System.out.println("哈哈，我赢了，我是石头");
				}else if(cq == 2) {
					System.out.println("咱们都是剪刀");
				}else {
					System.out.println("唉，我输了，我是布");
				}
			}else if(str.equals("布")) {
				if(cq == 1) {
					System.out.println("唉，我输了，我是石头");
				}else if(cq == 2) {
					System.out.println("哈哈，我赢了，我是剪刀");
				}else {
					System.out.println("咱们都是布");
				}
			}else {
				System.out.println("别乱打字，请重新输入");
				
			}
		}
		
		
	}
}
