import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
	int luachon;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Nhap vao lua chon la: ");
		luachon = sc.nextInt();
		
		switch (luachon) {
		case 1:{
			HangDienMay dienMay = new HangDienMay(); 
			dienMay.Nhap();
			dsHH.add(dienMay);
			break;
			}
		case 2: {
			HangSanhSu hangSanhSu = new HangSanhSu();
			hangSanhSu.Nhap();
			dsHH.add(hangSanhSu);
			break;
		}
		case 3: {
			HangThucPham hangThucPham = new HangThucPham();
			hangThucPham.Nhap();
			dsHH.add(hangThucPham);
			break;
			}
		case 4:{
			if(dsHH.size() == 0) {
				System.out.println("Danh sach nay rong");
				break;
			}else
				for (HangHoa hangHoa : dsHH) {
					System.out.println(hangHoa);
					System.out.println();
				}
			break;
		}
			
		default:{
			System.out.println("Thoat");
			break;
		}
		}
	} while (luachon != 0);
	
}
}
