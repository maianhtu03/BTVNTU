import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.TableColumnModelListener;

public class Bai5 {
public static void main(String[] args) {
	int n;
	float A,dem;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao phan tu la: ");
	n = sc.nextInt();
	Set<Float> s  = new HashSet<Float>();
	for(int i = 0;i < n;i++) {
		System.out.println("Nhap vao so thuc "+(i + 1)+ " la: ");
		dem = sc.nextFloat();
		
		if(s.contains(dem) == false) {
			s.add(dem);
			
		}else
			s.remove(dem);
		
	}
	System.out.println("Moi nhap vao so thuc A: ");
	A = sc.nextFloat();
	if(s.contains(A) == true) {
		System.out.println("So thuc A co trong mang");
	}else
		System.out.println("So thuc A khong co trong mang");
	
	 Set<Float> s1 = new TreeSet<Float>(Comparator.reverseOrder());
     s1.addAll(s);
     System.out.println("");
     System.out.println(s1);
 
}
}
