package HinhHoc.main;
import HinhHoc.HinhTron;
import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTru;
import HinhHoc.HinhVuong;

public class main {
  public static void main(String[] args) {
    //Ket qua hinh tron 
    HinhTron ht = new HinhTron();
    ht.XuatTen();
    ht.nhapBanKinh();
    ht.TinhChuVi();
    ht.InChuVi();
    ht.TinhDienTich();
    ht.InDienTich();
   //Ket qua hinh chu nhat 
   HinhChuNhat hcn = new HinhChuNhat();
   hcn.XuatTen();
   hcn.NhapCanhHCN();
   hcn.TinhChuVi();
   hcn.InChuVi();
   hcn.TinhDienTich();
   hcn.InDienTich();
   //ket qua hinh tru 
   HinhTru htr = new HinhTru();
   htr.XuatTen();
   htr.NhapChieuCao();
   htr.TinhTheTich();
   htr.InTheTich();
   //ket qua hinh vuong
   HinhVuong hv = new HinhVuong();
   hv.XuatTen();
   hv.NhapCanhHV();
   hv.TinhChuVi();
   hv.InChuVi();
   hv.TinhDienTich();
   hv.InDienTich();
 }
    
}
