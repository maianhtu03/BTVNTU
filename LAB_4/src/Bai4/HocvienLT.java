package Bai4;

import java.util.Scanner;

public class HocvienLT extends Hocvien{
	private int soBuoi;
	private double donGiaLT;
	public HocvienLT(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int soBuoi, double donGiaLT) {
		super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so buoi: ");
		soBuoi = sc.nextInt();
		System.out.println("Nhap vao don gia: ");
		donGiaLT = sc.nextDouble();
		
		
	}
	@Override
	public double hocPhi() {
		if(loaiUuTien == 1) {
			return (soBuoi*donGiaLT) - 1000000;
			
		}else
			
		return (soBuoi*donGiaLT) - 800000;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Hoc phi la: "+hocPhi());
	}
	

}
