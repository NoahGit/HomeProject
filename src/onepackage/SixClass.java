package onepackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class SixClass {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int[] arry_int = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arry_int.length; i++) {
			l.add(i, arry_int[i]);
		}
		System.out.println(l.size());
		l.add(11);
		System.out.println(l.size());
		l.remove(10);
		System.out.println(l.size());
		System.out.println("----------------------------------");
		
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+"  ");
		}
		
		
		System.out.println();
		System.out.println("----------------------------------");
		
		Object[] arry_int2 = l.toArray();
		for(int i=0; i<arry_int2.length; i++) {
			System.out.println(arry_int2[i]);
		}
		
		System.out.println("----------------------------------");
		
		LinkedList<String> ldl = new LinkedList<String>();
		String[] str = {"a","bb","cc","ddd","eeee","fffff","g","hhhhh","ii","ii","ii"};
		for(int i=0; i<str.length; i++) {
			ldl.add(i,str[i]);
		}
		System.out.println(ldl.size());
		for(int i=0; i<ldl.size(); i++) {
			System.out.print(ldl.get(i)+"  ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		ldl.addFirst("33");
		ldl.addLast("66");
		for(int i=0; i<ldl.size(); i++) {
			System.out.print(ldl.get(i)+"  ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(ldl.getFirst());
		System.out.println(ldl.getLast());
		ldl.removeFirst();
		ldl.removeLast();
		for(int i=0; i<ldl.size(); i++) {
			System.out.print(ldl.get(i)+"  ");
		}
		System.out.println();
		System.out.println("*****************************************");
		
		Vector<String> vt = new Vector<>();
		for(int i=0; i<str.length; i++) {
			vt.add(i,str[i]);
		}
		for(int i=0; i<vt.size(); i++){
			System.out.print(vt.get(i)+"  ");
		}
		System.out.println();
		System.out.println(vt.isEmpty());
		
		System.out.println();
		System.out.println("*****************************************");
		Stack<String> st = new Stack<String>();
		for(int i=0; i<str.length; i++) {
			st.add(i,str[i]);
		}
		for(int i=0; i<st.size(); i++){
			System.out.print(st.get(i)+"  ");
		}
		System.out.println();
		System.out.println(st.empty());
		System.out.println(st.peek());
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.search("ii"));
		System.out.println("*****************************************");
		
		Set<String> hashset = new HashSet<String>();
		for(int i=0; i<str.length; i++) {
			hashset.add(str[i]);
		}
		System.out.println(hashset.size());
		System.out.println(hashset.contains("bb"));
		
		Iterator<String> itrt = hashset.iterator();
		while(itrt.hasNext()) {
			String itrt_str = itrt.next();
			System.out.print(itrt_str+"  ");
		}
		System.out.println();
		System.out.println("*****************************************");
		
		Map<String, String> hashtable = new Hashtable<String,String>();
		String[] hashstr = {"1","2","3","4","5","6","7","8","9","10","11"};
		for(int i=0; i<str.length; i++) {
			hashtable.put(hashstr[i], str[i]);
		}
		System.out.println(hashtable.size());
		
		for(int j=0; j<hashtable.size(); j++) {
			System.out.print(hashtable.get(hashstr[j])+"  ");
		}
		System.out.println();
		System.out.println("###############################################");
		hashset = hashtable.keySet();
		Iterator<String> itrt1 = hashset.iterator();
		while(itrt1.hasNext()) {
			String itrt_str = itrt1.next();
			System.out.println(itrt_str);
		}
		
	}
}
