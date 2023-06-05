package Bai6;

import java.util.Scanner;

public abstract class CongNhan {
protected String hoTen,diaChi,ngaySinh;
protected int loaiCongNhan;
public CongNhan(String hoTen, String diaChi, int loaiCongNhan) {
	super();
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.loaiCongNhan = loaiCongNhan;
}
public void nhapThongTin() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao ho ten: ");
	hoTen = sc.nextLine();
	System.out.println("Nhap vao dia chi: ");
	diaChi = sc.nextLine();
	System.out.println("Nhap vao ngay sinh: ");
	ngaySinh = sc.nextLine();
	System.out.println("Nhap vao loai cong nhan: ");
	loaiCongNhan = sc.nextInt();
	
	
	
	
}
public abstract double tinhLuong();
public void inThongTin() {
	System.out.println("Ho ten: "+hoTen);
	System.out.println("Dia chi: "+diaChi);
	System.out.println("Ngay sinh: "+ngaySinh);
	System.out.println("Loai cong nhan: "+loaiCongNhan);
	System.out.println("Luong thang: "+tinhLuong());
}
}
