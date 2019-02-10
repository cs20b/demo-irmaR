package question_1;

public class SumofElements {

	public static int sum(int n)
	{
		int total = 0;
		for(int i = 1; i <= n; i++)
			total += i;
	    return total;
	}
	
	public static int sum2(int n)
	{
		return n*(n + 1)/2;
	}
	
	public static void main(String[] args)
	{
		int i = 10;
		
		System.out.println(sum(i));
		System.out.println(sum2(i));
		
	}
	
}

