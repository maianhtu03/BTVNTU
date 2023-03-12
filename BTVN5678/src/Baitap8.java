import java.util.Scanner;

public class Baitap8 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao so nguyen n la: ");
	n = sc.nextInt();
	int arr[];
	arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Nhap so thu tu: ");
		arr[i] = sc.nextInt();
	}
	double tbc = 0;
	for (int i = 0; i < arr.length; i++) {
		tbc+=arr[i];
	}
	System.out.println("Trung binh cong = "+(tbc / n));
}
}
