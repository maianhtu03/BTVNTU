import java.util.Scanner;

public class DuongTron extends Diem {
	float r;
	public void NHAPDT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh la: ");
		r  = sc.nextFloat();
		
	}
public void InDuongTron() {
	System.out.println("Ban kinh duoc nhap la: "+r);
}
public void CHUVI() {
	System.out.println("Chu vi hinh tron la: "+r*2*Math.PI);
}
public void DIENTICH() {
	System.out.println("Dien tich hinh tron la: "+Math.PI*Math.pow(r,2));
		
	
}
}
