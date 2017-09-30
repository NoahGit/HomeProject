package onepackage;

public class OneClass {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneClass oc = new OneClass("张三",20,'男');
		System.out.println(oc.name+'\n'+oc.age+'\n'+oc.sex);
	}
}

