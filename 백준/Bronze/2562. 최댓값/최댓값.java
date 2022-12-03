import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max =0;
		int index =-1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i< 9; i++) {
			int input=scan.nextInt();
			list.add(input);
			if(input > max) {
				max = input;
				index = (i+1);
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		
	}
}
