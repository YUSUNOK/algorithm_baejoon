import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int plus = scan.nextInt();
		
		int plusHour = plus / 60;
		int plusMinute = plus % 60;
		
		minute += plusMinute;
		if(minute >= 60) {
			plusHour += (minute /60);
			minute %=60;
		}
		
		hour += plusHour;
		hour %= 24;
			
			
			
			
			
			
		
		
		System.out.println(hour+" "+minute);
		
		}
}
