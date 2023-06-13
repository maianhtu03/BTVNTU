
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Bai4 {
public static void main(String[] args) {
	Set<Float> s  = new HashSet<Float>();
	Map<Integer, Float> m = new HashMap<Integer,Float>();
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Moi nhap vao phan tu trong mang la: ");
	n = sc.nextInt();
	for(int i = 0;i<n;i++) {
		System.out.println("Moi nhap vao cac phan tu "+(i + 1)+ " la: ");
		float dem = sc.nextFloat();
		if(s.contains(dem) == false) {
			s.add(dem);
			
		}else
			s.remove(dem);
		
	}
	int i = 0;
	for(float dem : s) {
		m.put((n -i ), dem);
		i++;
	}
	System.out.println("Danh sach liet ke cac phan tu set xuat hien 1 lan la: ");
	System.out.println(s);
	System.out.println("Danh sach liet ke cac phan tu map xuat hien 1 lan la: ");
	for(Entry<Integer, Float> kq : m.entrySet()) {
        System.out.print(kq.getValue()+" ");
    }
	
}
}
