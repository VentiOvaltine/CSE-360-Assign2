package assign1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome a = new Palindrome(" a d da'");
		System.out.println(a.isPalindrome());
		
		
		
		
		Palindrome b = new Palindrome("a");
		System.out.println(b.isPalindrome());
		
		
		
		
		
		Palindrome c = new Palindrome("aSdsa");
		System.out.println(c.isPalindrome());
		
		
		
		Palindrome d = new Palindrome("1234321");
		System.out.println(d.isPalindrome());
	}

}
