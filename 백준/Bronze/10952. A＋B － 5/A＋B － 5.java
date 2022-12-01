import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		int aa =1;
		int a =0;
		int b =0;
		while(aa==1) {
			a=scan.nextInt();
			b = scan.nextInt();
			
			if(a ==0 && b ==0) {
				break;
			}
			else {
				System.out.println((a+b));
			}
			
		}
	}
}