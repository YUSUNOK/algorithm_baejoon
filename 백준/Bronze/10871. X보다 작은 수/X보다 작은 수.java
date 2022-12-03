import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int n =scan.nextInt();
		int x =scan.nextInt();
		
		for(int i =0; i< n; i++) {
			int input=scan.nextInt();
			a.add(input);
		}
		
		for(int i =0; i < n; i++) {
			if(a.get(i) < x) {
				b.add(a.get(i));
			}
		}
		
		for(int i =0; i < b.size(); i++) {
			System.out.print( b.get(i)+" ");
		}
		
	}
}
