import java.util.Scanner;

public class HangThucPham extends HangHoa{

 int ngaySanXuat,ngayHetHan;


public void Nhap() {
	super.Nhap();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao ngay san xuat la: ");
	ngaySanXuat = sc.nextInt();
	System.out.println("Nhap vao ngay het han la: ");
	ngayHetHan = sc.nextInt();
	
}

@Override
public String toString() {
	return "ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + ", maHang=" + maHang
			+ ", tenHang=" + tenHang + ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia ;
}



}
