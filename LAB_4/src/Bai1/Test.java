package Bai1;

public class Test {


public static void main(String[] args) {
	
	BenhVien benhVien = new BenhVien("Nam Dinh", "Xuan Truong", "Mai Anh A");
	BenhNhan benhNhan = new BenhNhan("Mai Anh Tu", 20, 'N', "dau da day", benhVien, "Khong");
	System.out.println(benhNhan.toString());
}
}
