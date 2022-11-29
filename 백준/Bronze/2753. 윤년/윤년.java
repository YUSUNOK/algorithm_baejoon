import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year =scan.nextInt();
		int result;
		if((year % 4 == 0) && (year % 100 != 0) || (year % 4 ==0) && (year % 400 ==0)) {
			result = 1;
			
			
		}
		else {
			result=0;
		}
			System.out.println(result);
		}

}
