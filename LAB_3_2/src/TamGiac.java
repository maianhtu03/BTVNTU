import java.util.Scanner;

public class TamGiac {
private int a,b,c;
public void NHAPTG() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao a: ");
	a = sc.nextInt();
	System.out.println("Nhap vao b: ");
	b = sc.nextInt();
	System.out.println("Nhap vao c: ");
	c = sc.nextInt();
	
}
public void INTAMGIAC() {
	System.out.println("Diem a la: "+a);
    System.out.println("Diem b la: "+b);
    System.out.println("Diem c la: "+c);
}
public boolean KIEMTRA() {
    if(a+b>c && a+c>b && b+c>a)
    return true;
    else return false;
}
public void CHUVI() {
	
	 System.out.println("Chu vi cua tam giac la: "+(a+b+c));
}
public void DIENTICH() {
	 double p = (a+b+c)/2.0;
     System.out.println("Dien tich cua tam giac la: "+(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
}
}
