
import java.util.Scanner;
	
public class Main {
	
		public static void main(String[] args)  {
			
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] result = new int[n];
		
		
		for(int i =0 ; i<n; i++) {
			int sum =0;
			int plus =0;
			String input =scan.next();
			
			for(int k =0; k < input.length(); k++) {
				char point= input.charAt(k);
				if(point == 'O') {
					plus ++;
					sum+=plus;
				}
				else {
					plus=0;
				}
			}
			result[i] = sum;
			
			
		}
		
		for(int i =0 ; i<n; i++) {
			System.out.println(result[i]);
		}
		
		
		
			
		}
	}