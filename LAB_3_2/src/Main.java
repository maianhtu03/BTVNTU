import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int luachon;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap lua chon: ");
    luachon = sc.nextInt();
    switch(luachon){
    case 1:
    Diem diem = new Diem();
    diem.NHAPDIEM();
    diem.INDIEM();
    break;
    case 2:
    TamGiac tg = new TamGiac();
    tg.NHAPTG();
    tg.INTAMGIAC();
    tg.KIEMTRA(); 
    tg.CHUVI();
    tg.DIENTICH();
    break;
    case 3:
    DuongTron dt = new DuongTron();
    dt.NHAPDT();
    dt.InDuongTron();
    dt.CHUVI();
    dt.DIENTICH();
    break;
    }
    
}
}
