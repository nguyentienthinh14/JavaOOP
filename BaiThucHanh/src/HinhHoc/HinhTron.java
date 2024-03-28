package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bk;

    public HinhTron() {
        Ten= "Hinh Tron";
    }
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh = ");
        bk = sc.nextFloat();
    }
    public void TinhChuVi() {
        ChuVi = 2*PI*bk;
    }
    public void TinhDienTich() {
        DienTich = PI*bk*bk;
    }
}
