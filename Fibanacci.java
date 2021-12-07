import java.util.Scanner;

public class Fibanacci {
	public static void main(String[] args) {
	int  begin = 0;
	int next = 1;
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		scanner.close();
			
			if(value>1) {
				System.out.println(begin+"\t");
			 for (int i = 1 ; i <= value; i++) {
				 System.out.println(next+"\t");
				 Fibanacci fbnc = new Fibanacci();
				 int temp = fbnc.seriesPrint(begin, next);
				 begin = next;
				 next = temp;
				 

			}
				
			} else {
				System.out.println("invalid value");
			}
			
	}
		public  int seriesPrint(int current, int previous) {
		return current + previous;
			
			
		}
	}



