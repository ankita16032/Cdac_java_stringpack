package stringpack;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("Purva and Ankita");
		sb.append(" belongs to pune");
		System.out.println(sb);
		
		int i =sb.indexOf("r");
		System.out.println("i is : "+i);
		int i1=sb.lastIndexOf("a");
		System.out.println("li1 is : "+i1);
		sb.replace(6, 9, " new");
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
