package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    public Float Dai;
    public Float Rong;
    public HinhChuNhat() {
        Ten = "Hinh Chu Nhat" ;
    }
    public void NhapCanhHCN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai HCN= ");
        Dai = sc.nextFloat();
        System.out.print("Chieu rong HCN= ");
        Rong = sc.nextFloat();
    }
    public void TinhChuVi(){
        ChuVi = (Dai+Rong)*2;
    }
    public void TinhDienTich(){
        DienTich = Dai*Rong;
    }
}
