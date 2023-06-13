package Bai6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SinhVien {
private String msv,hoVaTen,lop;
 
  public SinhVien() { 
		
  }
public SinhVien(String msv, String hoVaTen, String lop) {

	this.msv = msv;
	this.hoVaTen = hoVaTen;
	this.lop = lop;
}
public String getMsv() {
	return msv;
}
public void setMsv(String msv) {
	this.msv = msv;
}
public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public String getLop() {
	return lop;
}
public void setLop(String lop) {
	this.lop = lop;
}
  public void nhapThongTin() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Nhap vao ma sinh vien: ");
	  msv = sc.nextLine();
	  System.out.println("Nhap vao ho va ten: ");
	  hoVaTen = sc.nextLine();
	  System.out.println("Nhap vao lop: ");
	  lop = sc.nextLine();
	  
  }
@Override
public String toString() {
	return "Ma sinh vien: " + msv + "\n"+"Ho va ten: "+hoVaTen+"\n"+"Lop: "+lop ;
}


  

}


	

