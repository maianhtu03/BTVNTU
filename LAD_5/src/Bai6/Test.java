package Bai6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Map<Integer, SinhVien> M = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap danh sach n sinh vien la: ");
	int n;
	n = sc.nextInt();
	for(int i = 0;i< n;i++) {
		SinhVien sv = new SinhVien();
		System.out.println("Nhap vao sinh vien thu "+(i + 1)+ " la: ");
		sv.nhapThongTin();
		M.put(i, sv);
		
		
	}
	System.out.println("\nDanh sach sinh viên: ");
    for (SinhVien temp : M.values()) {
        System.out.println(temp);
    }
    


    System.out.println("\nDanh sach sinh viên: ");
    for (SinhVien temp : M.values()) {
        System.out.println(temp);
    }
	 sc.nextLine();
     String lop;
     System.out.print("\nNhap lop can tim: ");
     lop = sc.nextLine();
     int dem = 0;
     for (SinhVien temp : M.values()){
         dem++;
         if(temp.getLop().equals(lop)){
             System.out.println(temp);
             break;
         }
         else if(dem>=n) System.out.println("Khong tim thay");
     }
 
     String msv;
     System.out.println("\nNhap ma sinh vien can tim: ");
     msv = sc.nextLine();
     int t =0;
     for (SinhVien temp : M.values()){
         t++;
         if(temp.getMsv().equals(msv)){
             System.out.println(temp);
             break;
         }
         else if(t >= n)
        	 System.out.println("Khong tim thay");
     }
}
}
