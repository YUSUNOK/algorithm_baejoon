import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int A = scan.nextInt();
			char result;
			if(A >= 90 && A <=100) {
				result ='A';
			}
			else if(A>= 80 && A <= 89) {
				result ='B';
			}
			else if(A>=70 && A <= 79) {
				result = 'C';
			}
			else if(A >= 60 && A <= 69) {
				result ='D';
			}
			else {
				result= 'F';
			}
			System.out.println(result);
		
			
		}

}
