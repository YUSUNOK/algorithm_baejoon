import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int n = scan.nextInt();
		
		int sum =0;
		for(int i =0; i < n; i++) {
			int price = scan.nextInt();
			int how = scan.nextInt();
			sum += price * how;
		}
		if(sum == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}