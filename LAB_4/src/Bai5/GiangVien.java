package Bai5;

import java.util.Scanner;

public abstract class GiangVien {
protected String hoTen,diaChi;
protected int loaiGiangVien;
public GiangVien(String hoTen, String diaChi, int loaiGiangVien) {
	super();
	this.hoTen = hoTen;
	this.diaChi = diaChi;
	this.loaiGiangVien = loaiGiangVien;
}
public GiangVien() {
	
}
public void nhapThongTin() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ho ten la: ");
	hoTen = sc.nextLine();
	System.out.println("Nhap dia chi la: ");
	diaChi = sc.nextLine();
	System.out.println("Nhap loai giang vien la: ");
	loaiGiangVien = sc.nextInt();
	

}
public abstract double tinhLuong();
	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai giang vien: "+loaiGiangVien);
		System.out.println("LuongThang: "+tinhLuong());
	}

}