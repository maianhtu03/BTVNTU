import java.util.Scanner;

public class HangDienMay extends HangHoa {
 String thoiGianBaoHanh;
 int dienAp;
 double congSuat;


public void Nhap() {
	super.Nhap();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao thoi gian bao hanh la: ");
	thoiGianBaoHanh = sc.nextLine();
	System.out.println("Nhap vao dien ap la: ");
	dienAp = sc.nextInt();
	System.out.println("Nhap vao cong suat la: ");
	congSuat =  sc.nextDouble();
	
	
	
}
@Override
public String toString() {
	return "thoiGianBaoHanh=" + thoiGianBaoHanh + ", dienAp=" + dienAp + ", congSuat=" + congSuat
			+ ", maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia ;
}

}



