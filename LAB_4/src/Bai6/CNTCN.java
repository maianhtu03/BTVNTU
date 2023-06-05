package Bai6;

import java.util.Scanner;

public class CNTCN extends CongNhan{
	private double luongCoBan;
	private int heSoLuong,soNgayCong;
	
	public CNTCN(String hoTen, String diaChi, int loaiCongNhan, double luongCoBan, int heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, loaiCongNhan);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao luong co ban: ");
		luongCoBan = sc.nextDouble();
		System.out.println("Nhap vao he so luong: ");
		heSoLuong = sc.nextInt();
		System.out.println("Nhap so ngay cong: ");
		soNgayCong = sc.nextInt();
		
	}
	@Override
	public double tinhLuong() {
		if(soNgayCong < 20) {
			return luongCoBan* heSoLuong;
			
		}else
		return (luongCoBan* heSoLuong)+(1.2 *luongCoBan);
	}
	public void inThongTin() {
		super.nhapThongTin();	
		System.out.println("Luong thang: "+tinhLuong());
	}
	

}
