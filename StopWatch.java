import java.util.Scanner;

public class StopWatch {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	StopWatch stopwatch = new StopWatch();
	stopwatch.startStop();
	
	}
		
		public void startStop() {
			System.out.println("press any key");
//			sc.nextDouble();
			sc.next();
			double start = System.currentTimeMillis();
			System.out.println("wait a moment and press any key");
			sc.next();
			double stop = System.currentTimeMillis();
			this.elapsedTime(start, stop);
		}	
		public double elapsedTime(double start, double stop) {
			double elapsedtime = (stop - start)/1000;
			System.out.println("elapsed time between start and stop :"+elapsedtime);
			return elapsedtime;
		}
	}
	

