//백준 1546
//점수 조작
//1.최댓값 고르기 
//2.모든 점수를 점수/M*100으로 고치기
//3.새로운 평균 구하기
import java.io.*;
public class p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr1 [] = br.readLine().split(" ");
		int arr2[] = new int [n]; //현재 성적
		double arr3[] = new double [n]; //고친 성적
		int m = 0;
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			arr2[i] = Integer.parseInt(arr1[i]);
			
			if(m<arr2[i])
				m=arr2[i];
			else
				continue;
		}
		
		for(int i=0; i<n; i++) {
			arr3[i] = Double.parseDouble(arr1[i])/m*100;
			
			sum+=arr3[i];
		}
		
		double result = sum/n;
		System.out.println(result);
		
		

	}

}
