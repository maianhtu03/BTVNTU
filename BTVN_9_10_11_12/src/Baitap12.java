import java.util.Iterator;
import java.util.Scanner;

public class Baitap12 {
public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao gia tri a: ");
	a = sc.nextInt();
	System.out.println("Nhap vao gia tri b: ");
	b = sc.nextInt();
	int m1[][];
	m1 = new int[a][b];
	
	for (int i = 0; i < m1.length; i++) {
		for (int j = 0; j < m1.length; j++) {
		System.out.println("Nhap vao gia tri phan tu la: ");
			m1[i][j] = sc.nextInt();
		}
	}
	int max = m1[0][0];
	for (int i = 0; i < m1.length; i++) {
		for (int j = 0; j < m1.length; j++) {
			if(m1[i][j] > max) {
				max = m1[i][j];
			}
		}
	}
	System.out.println("Phan tu co gia tri lon nhat trong ma tran la: "+ max);
}
}
