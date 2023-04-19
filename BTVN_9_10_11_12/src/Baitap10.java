import java.util.Scanner;

public class Baitap10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s;
	char a;
	int dem = 0;
//	System.out.println("Nhap vao mot chuoi khong qua 80 ky tu la: ");
//	s = sc.nextLine();
	
	do {
		System.out.println("Nhap vao mot chuoi khong qua 80 ky tu la: ");
		s = sc.nextLine();
	}
	while(s.length() > 80); 
		System.out.println("Nhap vao mot ky tu bat ky la: ");
		a = sc.next().charAt(0);
	
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == a) {
			dem++;
		}
	}
	System.out.println(dem);
	
}
}
