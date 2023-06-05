package Bai1;

public class BenhNhan extends Nguoi {
private String tienSu,chuanDoan;
private BenhVien benhVien;
public BenhNhan(String ten,int tuoi,char gioiTinh,String chuanDoan, BenhVien benhVien, String tienSu) {
	super( ten, tuoi,gioiTinh);
	this.chuanDoan = chuanDoan;
	this.benhVien = benhVien;
	this.tienSu = tienSu;
}
public String getTienSu() {
	return tienSu;
}
public void setTienSu(String tienSu) {
	this.tienSu = tienSu;
}
public String getChuanDoan() {
	return chuanDoan;
}
public void setChuanDoan(String chuanDoan) {
	this.chuanDoan = chuanDoan;
}
public BenhVien getBenhVien() {
	return benhVien;
}
public void setBenhVien(BenhVien benhVien) {
	this.benhVien = benhVien;
}
@Override
public String toString() {
	return super.toString()+ ", tienSu = " + tienSu + ", chuanDoan = " + chuanDoan + ", benhVien = " + benhVien;
}


}
