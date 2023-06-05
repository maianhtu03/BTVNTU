package Bai5;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien{
	private int soTietDay;
	private double donGia;
	public GVThinhGiang(String hoTen, String diaChi, int loaiGiangVien, int soTietDay, double donGia) {
		super(hoTen, diaChi, loaiGiangVien);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so tiet day: ");
		soTietDay = sc.nextInt();
		System.out.println("Nhap vao don gia: ");
		donGia = sc.nextDouble();
		
	}
	@Override
	public double tinhLuong() {
		
		return (soTietDay * donGia) - (15 * ((soTietDay * donGia) / 100)) ;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("So tiet day: "+soTietDay);
		System.out.println("Don gia: "+donGia);
		System.out.println("Luong thang: "+tinhLuong());
		
	}
	

}
