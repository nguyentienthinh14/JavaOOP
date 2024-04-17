package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public Float ChieuCao;
    public HinhTru(){
        Ten = "Hinh Tru";
    }
    public void NhapChieuCao(){
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu cao= ");
        ChieuCao = sc.nextFloat();
    }
    public void TinhTheTich(){
        TinhDienTich();
        TheTich = DienTich*ChieuCao;
    }
}
