import java.util.Scanner;

public class Baitap6 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so nguyen n vao ban phim: ");
	n = sc.nextInt();
	int giaithua =  1;
	for (int i = 1;i <=n ; i++) {
		giaithua = giaithua*i;
	}
	System.out.println("Ket qua giai thua cua so vua nhap la: "+giaithua);
}
}
