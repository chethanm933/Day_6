import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
	
		System.out.println("enter a value");
		Scanner scanner = new Scanner(System.in);
		int userip = scanner.nextInt();
		scanner.close();
			
		int sum = 0;
		
		if(userip > 0) {
			PerfectNumber perfectnumber = new PerfectNumber();
			perfectnumber.abc(userip, sum);
		}  else {
			System.out.println("the number is invalid");
		}
					
	}
		public   int abc(int a, int b) {
		int devisor = 0;
		int sum2 = 0;
			for (int i = 1; i <= a/2 ; i++) {
				if(a % i == 0) {
				devisor = i;
				sum2 = devisor + sum2;
				System.out.println("devisors :"+devisor);
				}
			}
			System.out.println("the sum of the devisors\t"+sum2);
			if(sum2 == a) {
				System.out.println("the number is perfect number");
			} else {
				System.out.println("the number is not perfect");
			}	return (devisor);	
			
		}

}
		



