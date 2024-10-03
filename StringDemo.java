package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("   Ankita");
		String str1=new String("  Gadge");
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,8));
		
		System.out.println(str.trim());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim().toUpperCase());
		System.out.println(str.indexOf("t"));
		System.out.println(str.replace("k", "v"));
		System.out.println(str.concat(str1));
		if(str.equals(str1))
			System.out.println("same");
		String[] arr=str.split(" ");
		for(String s : arr)
		{
			System.out.println(s);
		}
	}

}
