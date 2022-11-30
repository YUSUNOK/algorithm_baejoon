import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int HOUR= scan.nextInt();
		int MINUTE = scan.nextInt();
		
		if(MINUTE >= 45) {
			System.out.println(HOUR+" "+(MINUTE-45));
		}
		else {
			if(HOUR == 0) {
				System.out.println(23 +" "+ (MINUTE + 15));
			}
			else {
				System.out.println(HOUR-1 +" "+ (MINUTE + 15));
			}
		}
		
		
		
		
		
		
		
	}
}
