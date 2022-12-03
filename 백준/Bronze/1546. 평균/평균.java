
import java.util.Scanner;
	
public class Main {
	
		public static void main(String[] args)  {
			
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		int[] score = new int[n];
		double[] newScore = new double[n];
		int max = -1;
		for(int i =0; i < n; i ++) {
			score[i] = scan.nextInt();
			if(score[i] > max) {
				max = score[i];
			}
		}
		
		for(int i =0; i < n; i++) {
			newScore[i] = (double)score[i] / max * 100;
			sum += newScore[i];
		}
		System.out.println(sum / n);
		
	
		
		
		
		
		
			
		}
	}