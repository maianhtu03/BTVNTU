package Bai4;

public class Main {
public static void main(String[] args) {
	HocvienDH hv = new HocvienDH(null, null, null, 0, 0, 0);
	hv.nhapThongTin();
	System.out.println("-------------");
	System.out.println("+++++ Hoc vien do hoa ++++++");
	hv.inThongTin();
	HocvienLT hv1 = new HocvienLT(null, null, null, 0, 0, 0);
	hv1.nhapThongTin();
	System.out.println("--------------");
	System.out.println("-------Hoc vien lap trinh------");
	hv1.inThongTin();
	
}
}
