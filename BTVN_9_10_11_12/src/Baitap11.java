import java.util.Scanner;

public class Baitap11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao phan tu nguyen n la: ");
	int n;
	n = sc.nextInt();
	int A[];
	A = new int[n];
	int mid;
	for (int i = 0; i < n; i++) {
		System.out.println("Nhap vao gia tri phan tu thu "+ i + " la: " );
		A[i] = sc.nextInt();
	}	
	for (int i = 0; i < n; i++) {
		System.out.println(A[i]);
	}
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if(A[i] > A[j]) {
				mid = A[j];
				A[j] = A[i];
				A[i] = mid;
			}
		}
	}
	System.out.println("Mang tang dan la: ");
	for (int i = 0; i < n; i++) {
		System.out.println(A[i]);
		
	}
}
}


