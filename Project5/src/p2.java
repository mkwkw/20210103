//백준 8958
//O가 3개 연속 ->1+2+3 = 10점
//1. 문자열을 하나씩 쪼갠다.
//2. 차례대로 방문하면서 O인지 O이면 연속인지 확인
//3. 점수 계산

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String [n]; //OX표시
		
		int score[] = new int [n];  //점수
		
		
	
		for(int i=0; i<n; i++) {
			
			arr[i]= sc.nextLine();
			
		}
		
		for(int i=0; i<n; i++) {
			score[i]=0;
		}
		
		for(int i=0; i<n; i++) {
			int count = 0; //누적 횟수
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O')
					count++;
				else
					count=0;
				
				score[i] += count;
			}
			
		}
		
		
		for(int i=0; i<n; i++) {
			System.out.println(score[i]);
		}
		
		sc.close();
	}

}
