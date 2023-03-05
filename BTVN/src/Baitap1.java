import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
//Cau a
		int tong = a + b;
		System.out.println("Tong = "+ a+" + "+b+" = "+tong);
		int hieu = a - b;
		System.out.println("Hieu = "+ a+" - "+b+" = "+hieu);
		int tich = a * b;
		System.out.println("Tich = "+ a+" * "+b+" = "+tich);
		float thuong = (float)a / b;
		System.out.println("Thuong = "+a +" / "+b+" = "+thuong);
		int chialaydu = a % b;
		System.out.println("Chia lay du = "+a +" % "+b+" = "+chialaydu);
//cau b	
		System.out.println(a+ " == "+b+" : "+ (a == b));
		System.out.println(a+ " != "+b+" : "+ (a != b));
		System.out.println(a+ " > "+b+" : "+ (a > b));
		System.out.println(a+ " < "+b+" : "+ (a < b));
		System.out.println(a+ " >= "+b+" : "+ (a >= b));
		System.out.println(a+ " <= "+b+" : "+ (a <= b));
	}
}
