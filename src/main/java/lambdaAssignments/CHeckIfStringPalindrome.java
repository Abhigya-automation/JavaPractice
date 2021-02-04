package lambdaAssignments;

public class CHeckIfStringPalindrome {
	
	public static void main(String[] args) {
		
		CheckPalindrome palindrome=s->
		{
			 boolean flag=true;
	         for(int i=0;i<s.length()/2;i++){
	            if(s.charAt(i)!=s.charAt(s.length()-(i+1))){
	               flag=false;
	               break;
	            }
	         }
	         return flag;
		};
		String str="abcba";
		
		System.out.println(palindrome.isStringPalindrome(str));
		
	}

}
