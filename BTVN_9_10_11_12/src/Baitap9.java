import java.util.Scanner;

public class Baitap9 {
public static void main(String[] args) {
	String s;
	int thuong = 0;
	int hoa = 0;
	int so =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao chuoi la: ");
	s = sc.next();
//	System.out.println(s.length());
	int dodai = s.length();
for (int i = 0; i < dodai; i++) {
	if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
		thuong++;
	} if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
		hoa++;
	}if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
		so++;
	}
	
	}
     System.out.println("so ky tu thuong la: "+ thuong);
     System.out.println("so ky tu hoa "+ hoa);
     System.out.println("so ky tu so la: "+ so);
}
}
