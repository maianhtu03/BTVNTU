import java.util.Scanner;

public class Diem {
private int x,y;


public void NHAPDIEM() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao x: ");
	x = sc.nextInt();
	System.out.println("Nhap vao y: ");
	y = sc.nextInt();
}
public void INDIEM() {
	System.out.println("Diem x la: "+x);
    System.out.println("Diem y la: "+y);
}
}
