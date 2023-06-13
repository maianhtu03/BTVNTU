import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
public static void main(String[] args) {
	ArrayList<Object> al = new ArrayList<Object>();
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Them 1 so nguyen la: ");
	al.add(sc.nextInt());
	
	
	System.out.println("Them 1 so thuc la: ");
	al.add(sc.nextDouble());
	
	
	System.out.println("Them 1 gia tri boolean la: ");
	al.add(sc.nextBoolean());
	
	
	System.out.println("Them vao 1 chuoi la: ");
	sc.nextLine();
	al.add(sc.nextLine());
	
	System.out.println("In ra 4 gia tri tren: "+ al);
	
	
}
}
