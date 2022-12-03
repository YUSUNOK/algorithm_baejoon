import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	for(int i =0; i < n ; i++) {
		ArrayList<Integer> rowScore = new ArrayList<Integer>();
		int rowN =scan.nextInt(); // 한줄에 몇개의 데이터?
		int sum =0;
		int count =0;
		for(int j =0; j < rowN; j++) { 
			int score=scan.nextInt(); // 한줄안에서 개별적 데이터 입력
			sum+=score;
			rowScore.add(score);
		
		}
		double mean=(double)sum/rowN; // 평균 
		
		for(int k =0; k < rowScore.size(); k++) {
			if(rowScore.get(k) > mean) {
				count++;
			}

		}
		
		double percent=(double)count / rowN * 100 * 1000; // 한줄 당 평균을 넘는 학생들의 비율
		
		double plus_result= (double)(Math.round(percent)) / 1000;
		
		System.out.println(String.format("%.3f%%", plus_result));
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
				
				
				
	
	}
}
