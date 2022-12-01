import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =1; i <=n; i++) {
			for(int s =0; s+i <n ; s++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}
}