package Bai4;

import java.util.Scanner;

public abstract class Hocvien {
protected String hoTen,diaChi,loaiChuongTrinh;
protected int loaiUuTien;
public Hocvien(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien) {
	super();
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.loaiChuongTrinh = loaiChuongTrinh;
	this.loaiUuTien = loaiUuTien;
}
public void nhapThongTin() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ho ten la: ");
	hoTen = sc.nextLine();
	System.out.println("Nhap vao dia chi la: ");
	diaChi = sc.nextLine();
	System.out.println("Nhap vao loai chuong  trinh la: ");
	loaiChuongTrinh = sc.nextLine();
	System.out.println("Nhap vao loai uu tien la: ");
	loaiUuTien = sc.nextInt();
	
}
public abstract double hocPhi();
public void inThongTin() {
	System.out.println("Ho ten: "+hoTen);
	System.out.println("Dia chi: "+diaChi);
	System.out.println("Loai chuong trinh dang ky hoc: "+loaiChuongTrinh);
	System.out.println("Loai uu tien: "+loaiUuTien);
	System.out.println("Hoc phi: "+ hocPhi());
}
}
