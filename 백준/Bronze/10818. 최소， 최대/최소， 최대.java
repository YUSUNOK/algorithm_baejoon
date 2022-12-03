import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = -2147483648;
		int min =  2147483647;
		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = scan.nextInt();
		for(int i =0; i < n ; i++) {
			int input = scan.nextInt();
			a.add(input);
			if(max < a.get(i)) {
				max = a.get(i);
			}
			if(min > a.get(i)) {
				min = a.get(i);
			}
		}
		System.out.println(min+" "+max);
		
	}
}
