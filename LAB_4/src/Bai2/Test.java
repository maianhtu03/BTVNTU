package Bai2;

public class Test {
public static void main(String[] args) {
	Truong t = new Truong("Dai hoc mo dia chat","Pho vien", "Mai Van A");
	SinhVien sv = new SinhVien("Mai Anh Tu", 20, 'N', "DCCTCT66F2", "CNTT", t );
	System.out.println(sv.toString());
}
}
