package jdbcDemo;

public class StringDemo {

	public static void main(String[] args) {
		String s1="anshita";
		String s2=new String("anshita");
		String s3=s1;
		String s4="anshita";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}
}
