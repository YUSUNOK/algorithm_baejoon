import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		
		int r1 =0;
		int r2 =0;
		int r3 =0;
		
		
		
		int result = 0;
		// 정렬 
		if(A >= B) { // B <= A
			if(C >= A) { // B <= A <= C
				r1 = B;
				r2 = A;
				r3 = C;
			}
			else if(C <= B) { // C <= B <= A
				r1 =C;
				r2 =B;
				r3 =A;
			}
			else { // B C A
				r1 = B;
				r2 = C;
				r3 = A;
			}
		}
		else { // A <= B
			if(C >= B) { // ABC
				r1=A;
				r2=B;
				r3=C;
			}
			else if(C <=A) { //C A B
				r1=C;
				r2=A;
				r3=B;
			}
			else { // A C B
				r1=A;
				r2=C;
				r3=B;
			}
		}
		
		if (r1 == r3) {
			result = 10000 + r3 * 1000;
		}
		else if((r1 == r2 && r2 != r3) || (r2 == r3 && r1 != r2)) {
			result = 1000 + r2* 100;
		}
		else {
			result =r3 * 100;
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}
}
