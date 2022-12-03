import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = -1;
		int n =0;
		
		int a = input;
		while(true) {
		
			if(a < 10) { // 한자리
				result = a * 10 + a;


			}
			else{ // 두자리
				result=(a%10) *10+((a % 10) + (a /10))%10;
				
			}
			n+=1;
			
		
		
			if(result == input) {
				break;
			}
			else {
				a =result;
			}
		
		}
			
		
		System.out.println(n);
	}
}
