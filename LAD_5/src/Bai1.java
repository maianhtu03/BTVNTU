
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Moi nhap vao so tu nhien la: ");
	n = sc.nextInt();
	List<Integer> l = new ArrayList<Integer>();
	while(n != 0) {
		l.add(n % 10);
		n = n / 10;
	}
	for(int i = 0;i < l.size()- 1;i++) {
		int temp  = l.remove(l.size()- 1);
		l.add(i,temp);
		
	}
	for(int i = 0;i < l.size()- 1;i++) {
		if((l.get(i) != l.get(l.size()- 1 - i))){
			System.out.println("n khong phai la so thuan nghich");
			return;
		}
	}
	System.out.println("n la so thuan nghich");
}
}
