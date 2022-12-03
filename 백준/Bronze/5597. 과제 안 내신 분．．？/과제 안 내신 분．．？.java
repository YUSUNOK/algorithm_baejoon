import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public class Main {
	
		public static void main(String[] args)  {
			
		Scanner scan = new Scanner(System.in);
		List<Integer> total = new ArrayList<Integer>();
		
		for(int j = 1; j<=30; j++) {
			total.add(j);
		}
		for(int k = 0; k <28; k++) {
			int submit =scan.nextInt();
			
			for(int o = 0; o < total.size(); o++) {
				if(submit == total.get(o)) {
					total.remove(o);
				}
			}
			
			
		}
		
		if(total.get(0) < total.get(1)) {
			System.out.println(total.get(0));
			System.out.println(total.get(1));
			
			
			
			
			
		}
		else {
			System.out.println(total.get(1));
			System.out.println(total.get(0));
		}
		
		
		
		
			
		}
	}