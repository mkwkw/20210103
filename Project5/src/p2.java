//���� 8958
//O�� 3�� ���� ->1+2+3 = 10��
//1. ���ڿ��� �ϳ��� �ɰ���.
//2. ���ʴ�� �湮�ϸ鼭 O���� O�̸� �������� Ȯ��
//3. ���� ���

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String [n]; //OXǥ��
		
		int score[] = new int [n];  //����
		
		
	
		for(int i=0; i<n; i++) {
			
			arr[i]= sc.nextLine();
			
		}
		
		for(int i=0; i<n; i++) {
			score[i]=0;
		}
		
		for(int i=0; i<n; i++) {
			int count = 0; //���� Ƚ��
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
