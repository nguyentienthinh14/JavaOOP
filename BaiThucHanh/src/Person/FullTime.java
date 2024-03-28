package Person;

import java.util.Scanner;

public class FullTime extends Employer{
    public int Ngay;
    public float Cong,PhuCap,TongLuong;

    public FullTime(){

    }

    public void NhapThongTinF(){
        NhapThongTinNV();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay lam viec trong 1 thang: ");
        Ngay=sc.nextInt();
        System.out.print("Nhap so tien cong cho 1 ngay lam viec: ");
        Cong=sc.nextFloat();
    }
    public float TinhLuongCoBanF(){
        Luong= Ngay*Cong;
        return Luong;
    }
    public float TinhPhuCapF(){
        if(Ngay>30) {
            PhuCap=Luong*0.2f;
        } else {
            PhuCap=Luong*0.05f;
        }
        return PhuCap;
    }
    public float TongLuongF() {
        TongLuong=Luong+PhuCap;
        return TongLuong;
    }
    public void LuongFullTime(){
        XuatThongTinNV();
        System.out.println("Luong cua nhan vien FullTime la: "+TongLuong);
    }
}
