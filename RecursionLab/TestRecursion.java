
public class TestRecursion {

	public static void main(String[] args) {
		
		/* Factorial practice */
		System.out.println(Recursion.fact(3));
		System.out.println(Recursion.fact(-1)); // Should be able to handle this case

		/* String reversal practice */
		Recursion.reverse("catfish");
		
		System.out.println();
		
		/* Rabbit pair problem */
		System.out.println(Recursion.rabbitPairCt(-1)); // Should be able to deal with negatives
		System.out.println(Recursion.rabbitPairCt(7));
	}

}
