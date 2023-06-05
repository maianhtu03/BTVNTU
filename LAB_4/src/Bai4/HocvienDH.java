package Bai4;

import java.util.Scanner;

public class HocvienDH extends Hocvien{
private int soBuoi;
private double donGiaDH;


	
public HocvienDH(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int soBuoi, double donGiaDH) {
	super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien);
	this.soBuoi = soBuoi;
	this.donGiaDH = donGiaDH;
}
public void nhapThongTin() {
	super.nhapThongTin();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao so buoi: ");
	soBuoi = sc.nextInt();
	System.out.println("Nhap vao don gia: ");
	donGiaDH = sc.nextDouble();
}
	@Override
	public double hocPhi() {
	if(loaiUuTien == 1) {
		return (soBuoi*donGiaDH) - 1000000;
	}else
		return (soBuoi*donGiaDH) - 500000;
	}
	public void inThongTin() {
	super.inThongTin();
	System.out.println("Hoc phi la: "+hocPhi());
	}

}
