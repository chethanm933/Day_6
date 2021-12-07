import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rever = 0;
		int remainder = 0;
		sc.close();
		
		ReverseNumber reversenumber = new ReverseNumber();
		reversenumber.reverse(num, rever, remainder );
//		System.out.println(remainder+"\t");
	}
	
	public void reverse(int num, int rever, int remainder) {
		while(num!=0) {
			remainder = num % 10;
			rever = rever * 10 + remainder;
			num = num/10;
			System.out.println(remainder+"\t");
		}
	}
}
