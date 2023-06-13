import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
public static void main(String[] args) {
	int n,m;
	Stack<Integer> st = new Stack<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap mot day so nguyen la: ");
	
	n = sc.nextInt();

	int arr[] = new int[n];

	for(int i = 0;i < n;i++ ) {
		System.out.println("Nhap vao vao day so thu "+(i+ 1) + " la: ");
		arr[i] = sc.nextInt();
		st.add(arr[i]);
	}
	System.out.println("Nhap vao m de lay ra gia tri la: ");
	m = sc.nextInt();
	
	
	
	for(int i = 0;i< m;i++) {
	
		System.out.println(st.pop());
	
	}

}
}
