	import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args)  {
			
			Scanner scan = new Scanner(System.in);
			int n =scan.nextInt();
			int count =0;
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i =0; i < n; i++) {
				int input =scan.nextInt();
				list.add(input);
			}
			
			int foundN=scan.nextInt();
			
			for(int i =0; i < n; i++) {
				if(list.get(i) == foundN) {
					count ++;
				}
			}
			
			System.out.println(count);
			
		}
	}