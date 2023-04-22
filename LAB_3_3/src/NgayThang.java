import java.util.Scanner;

public class NgayThang extends HangThucPham{

 int ngay,thang,nam;


	

public void Nhap() {
	super.Nhap();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nahp vao ngay la: ");
	ngay = sc.nextInt();
	System.out.println("Nhap vao thang la: ");
	thang = sc.nextInt();
	System.out.println("Nhap vao nam la: ");
	nam = sc.nextInt();
	
}
@Override
public String toString() {
	return "ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", ngaySanXuat=" + ngaySanXuat
			+ ", ngayHetHan=" + ngayHetHan + ", maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanXuat="
			+ nhaSanXuat + ", gia=" + gia;
}


}
