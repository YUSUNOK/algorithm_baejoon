import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1 1 2 2 2 8
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int r1 = (A+B)%C;
		int r2 = ((A%C) + (B%C))%C;
		int r3 = (A*B)%C;
		int r4 = ((A%C) * (B%C))%C;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		
	}

}