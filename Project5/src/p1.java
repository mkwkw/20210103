//���� 1546
//���� ����
//1.�ִ� ���� 
//2.��� ������ ����/M*100���� ��ġ��
//3.���ο� ��� ���ϱ�
import java.io.*;
public class p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr1 [] = br.readLine().split(" ");
		int arr2[] = new int [n]; //���� ����
		double arr3[] = new double [n]; //��ģ ����
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
