package onepackage;


import java.util.Scanner;

public class ThreeClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		for(int j=1;j<=10;j++) {
			System.out.println("请输入1--10之间的数字：");
			int i = in.nextInt();
			if(i>1 & i<5) {
				System.out.println("此数小于5");
			}else if(i>5 & i<10) {
				System.out.println("此数大于5");
			}else if(i==5) {
				System.out.println("此数等于5");
			}else {
				System.out.println("超出1--10范围 ");
			}
		}*/
		
		/*Scanner in = new Scanner(System.in);
		System.out.println("请输入一个1--10之间的数字：");
		int i = in.nextInt();
		switch (i) {
		case 1:System.out.println("是1");break;
		case 2:System.out.println("是2");break;
		case 3:System.out.println("是3");break;
		case 4:System.out.println("是4");break;
		case 5:System.out.println("是5");break;
		case 6:System.out.println("是6");break;
		case 7:System.out.println("是7");break;
		case 8:System.out.println("是8");break;
		case 9:System.out.println("是9");break;
		case 10:System.out.println("是10");break;
		default:System.out.println("超出1--10范围");
		}*/
		
		/*Scanner in = new Scanner(System.in);
		int max = -1; //存放最高成绩
		int score = -1; //存放输入的成绩
		int count = 1;   //计数器
		do {
			System.out.println("请输入第"+count+"位同学的成绩：");
			score =in.nextInt();
			count++;
			if(score > max) {
				max = score;
			}
			System.out.println("最高成绩是"+max);
		}while(score != -1);*/
		
		/*for(int i=1; i<=10; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}System.out.println();
		}
		Boolean  bool = Boolean.valueOf("7657");
		System.out.println(bool);
		
		Byte bt = Byte.valueOf((byte) 999);
		System.out.println(bt);
		
		Character ct = Character.valueOf('e');
		System.out.println(ct);
		
		Short st = Short.valueOf((short) 94);
		System.out.println(st);
		
		Integer it = Integer.valueOf(254);
		System.out.println(it);
		
		Long lg = Long.valueOf(2355);
		System.out.println(lg);
		
		Float ft= Float.valueOf((float) 234235.45);
		System.out.println(ft);
		
		Double db = Double.valueOf(234.3333333333333333233333333);
		System.out.println(db);*/
		
		/*int a = 1, result = 0;
		while(true) {
			result += a++;
			if(a ==101)break;
		}System.out.println(result);*/
		
		/*int result=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)continue;
			else result+=i;
		}
		System.out.println(result);*/
		
		int result=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0)continue;
			else result+=i;
		}
		System.out.println(result);
	}
	
}
