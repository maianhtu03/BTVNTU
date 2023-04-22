import java.util.Scanner;

public class HangHoa {
	String maHang,tenHang,nhaSanXuat;
	double gia;


public void Nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ma hang la: ");
	maHang = sc.nextLine();
	System.out.println("Nhap ten hang la: ");
	tenHang = sc.nextLine();
	System.out.println("Nhap nha san xuat la: ");
	nhaSanXuat = sc.nextLine();
	System.out.println("Nhap gia la: ");
	gia = sc.nextDouble();
}
@Override
public String toString() {
	return "maHang = " + maHang + ", tenHang = " + tenHang + ", nhaSanXuat = " + nhaSanXuat + ", gia = " + gia;
}
}
