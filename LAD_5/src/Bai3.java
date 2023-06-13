import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bai3 {
public static void main(String[] args) {
	int n,m;
	System.out.println("Moi nhap vao day so nguyen la: ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int arr[] = new int[n];
	Queue<Integer> q = new LinkedList<Integer>();
	for(int i = 0;i< n;i++) {
		System.out.println("Nhap vao cac so nguyen "+(i +1)+ " la: ");
		arr[i] = sc.nextInt();
		q.offer(arr[i]);
		
	}
	System.out.println("Nhap vao m phan tu la: ");
	m = sc.nextInt();
	for(int i = 0;i < m;i++) {
		System.out.println(q.poll());
	}
}
}
