
import java.util.Scanner;

public class Sach {
private String ma,ten,tg;
private int trang,tap,gia;
private String loai,nxb;
Scanner sc = new Scanner(System.in);

public void NHAPSACH() {
	System.out.println("Nhap ma sach la: ");
	ma = sc.nextLine();
	System.out.println("Nhap ten sach la: ");
	ten = sc.nextLine();
	System.out.println("Nhap ten tac gia la: ");
	tg = sc.nextLine();
	System.out.println("Nhap so trang la: ");
	trang = sc.nextInt();
	System.out.println("Nhap so tap la: ");
	tap = sc.nextInt();
	System.out.println("Nhap so gia la: ");
	gia = sc.nextInt(); sc.nextLine();
	System.out.println("Nhap loai sach la: ");
	loai = sc.nextLine();
	System.out.println("Nhap nha xuat ban la: ");
	nxb = sc.nextLine();
	
}

public void INSACH() {
	System.out.println("Ma sach: "+ma);
	System.out.println("Ten sach: "+ten);
	System.out.println("Ten tac gia: "+tg);
	System.out.println("So trang: "+trang);
	System.out.println("So tap: "+tap);
	System.out.println("Gia: "+gia);
	System.out.println("Loai sach: "+loai);
	System.out.println("Nha xuat ban: "+nxb);
}

public static void main(String[] args) {
	 Scanner a=new Scanner(System.in);        
     System.out.println("nhap so luong sach: ");
     int n=a.nextInt();
     Sach Arr[]= new Sach[n];
     for(int i=0;i<n;i++){
         Arr[i]=new Sach();
         Arr[i].NHAPSACH();
     }
     for(int i=0;i<n;i++){
        Arr[i].INSACH();
     }
}
}
