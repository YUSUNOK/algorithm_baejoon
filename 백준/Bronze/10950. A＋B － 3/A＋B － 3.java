

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i =0; i<N ; i++) {
			int inputA = scan.nextInt();
			int inputB = scan.nextInt();
			result.add((inputA + inputB));
		}
		
		for(int i =0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		
		
		
		
		
		
		
	}
}
