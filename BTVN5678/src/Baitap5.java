import java.util.Scanner;

public class Baitap5 {
public static void main(String[] args) {
	int n,tong = 0;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Nhap vao cac so nguyen la: ");
		n  = sc.nextInt();
		tong  = tong + n;
	} while(tong < 100);
		
	System.out.println("Tong cua cac so nguyen nhap la: "+ tong);
}
}