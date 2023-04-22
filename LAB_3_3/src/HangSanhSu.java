import java.util.Scanner;

public class HangSanhSu extends HangHoa {
 String loaiNguyenLieu;


public void Nhap() {
	super.Nhap();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao loai nguyen lieu la: ");
	loaiNguyenLieu = sc.nextLine();
	
		
	
}
@Override
public String toString() {
	return "loaiNguyenLieu=" + loaiNguyenLieu + ", maHang=" + maHang + ", tenHang=" + tenHang
			+ ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia;
}



}
