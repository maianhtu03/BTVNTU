package Bai5;

public class Main {
public static void main(String[] args) {
	 GVCoHuu ch = new GVCoHuu(null, null, 0, 0, 0, 0);
	 ch.nhapThongTin();
	 System.out.println("------------");
	 System.out.println("++++++ Giang vien co huu ++++++++");
	 ch.inThongTin();
	 GVThinhGiang tg = new GVThinhGiang(null, null, 0, 0, 0);
	 tg.nhapThongTin();
	 System.out.println("------------");
	 System.out.println("------- Giang vien thinh giang --------");
	 tg.inThongTin();
}
}
