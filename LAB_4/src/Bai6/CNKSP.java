package Bai6;

import java.util.Scanner;

public class CNKSP extends CongNhan{
	private int soSanPham;
	private double donGiaSanPham;
	public CNKSP(String hoTen, String diaChi, int loaiCongNhan, int soSanPham, double donGiaSanPham) {
		super(hoTen, diaChi, loaiCongNhan);
		this.soSanPham = soSanPham;
		this.donGiaSanPham = donGiaSanPham;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so san pham: ");
		soSanPham = sc.nextInt();
		System.out.println("Nhap vao don gia san pham: ");
		donGiaSanPham = sc.nextDouble();
		
	}
	@Override
	public double tinhLuong() {
		int mucQuyDinh = 1000;
		if(soSanPham - mucQuyDinh >= 100 && soSanPham - mucQuyDinh < 150) {
			return (soSanPham*donGiaSanPham) + 1000000;
			
		}else if(soSanPham - mucQuyDinh >= 150) {
			return (soSanPham*donGiaSanPham) + 1500000;
		}else
		return soSanPham*donGiaSanPham;
	}
	public void inThongTin() {
		super.inThongTin();
		
		System.out.println("Luong thang: "+tinhLuong());
	}

}
