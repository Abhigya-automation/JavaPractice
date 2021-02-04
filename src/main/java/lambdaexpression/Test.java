package lambdaexpression;

public class Test {

	public static void main(String[] args) {
		
		/*Parent p= (a,b)-> System.out.println(a+b);
		p.add(10, 20);	*/	
		
		/*Parent p= (s)-> s.length();
		System.out.println(p.getLength("abcd"));*/
		
		Parent p= x-> x*x;
		System.out.println(p.squareIT(5));
	}
}
