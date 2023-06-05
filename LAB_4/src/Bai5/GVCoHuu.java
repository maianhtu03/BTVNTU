package Bai5;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
private double luongCoBan;
private int heSoLuong,thamNienCongTac;



public GVCoHuu(String hoTen, String diaChi, int loaiGiangVien, double luongCoBan, int heSoLuong, int thamNienCongTac) {
	super(hoTen, diaChi, loaiGiangVien);
	this.luongCoBan = luongCoBan;
	this.heSoLuong = heSoLuong;
	this.thamNienCongTac = thamNienCongTac;
}
public void nhapThongTin() {
	super.nhapThongTin();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao luong co ban: ");
	luongCoBan = sc.nextDouble();
	System.out.println("Nhap vao he so luong: ");
	heSoLuong = sc.nextInt();
	System.out.println("Nhap vao tham nien cong tac: ");
	thamNienCongTac = sc.nextInt();
}
@Override
public double tinhLuong() {
	if(thamNienCongTac < 5){
		return luongCoBan * heSoLuong;
	}else
	return (luongCoBan * heSoLuong) + ((float)thamNienCongTac / 100)*luongCoBan;
}
public void inThongTin() {
	super.inThongTin();
	System.out.println("Luong co ban: "+luongCoBan);
	System.out.println("He so luong: "+heSoLuong);
	System.out.println("Tham nien cong tac: "+thamNienCongTac);
	System.out.println("Luong thang: "+tinhLuong());
}

}
