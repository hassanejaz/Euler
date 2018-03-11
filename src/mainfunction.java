
public class mainfunction {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (num%3 == 0 || num%5 == 0)
			{					
				num++;
			}
		}
		System.out.println("sum: " + sum);
	}

}
