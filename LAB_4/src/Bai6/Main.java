package Bai6;

public class Main {
public static void main(String[] args) {
	 CNKSP cnksp = new CNKSP(null, null, 0, 0, 0);
	 cnksp.nhapThongTin();
	 System.out.println("------------");
	 System.out.println("++++++ Cong nhan khoan san pham ++++++");
	 cnksp.inThongTin();
	 CNTCN cntcn = new CNTCN(null, null, 0, 0, 0, 0);
	 cntcn.nhapThongTin();
	 System.out.println("------------");
	 System.out.println("------ Cong nhan tinh cong nhan ------");
	 cntcn.inThongTin();
	 
	 
}
}
