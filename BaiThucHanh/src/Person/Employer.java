package Person;

import java.util.Scanner;

public class Employer extends Person{
    public String CongViec;
    public String MaNV;
    public Float Luong,PhuCap;
    
    public  Employer(){

    }
    public void NhapThongTinNV(){
        NhapThongTin();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap cong viec: ");
        CongViec=sc.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        MaNV=sc.nextLine();
   }
    public void XuatThongTinNV(){
        XuatThongTin();
        System.out.println("\nCong viec cua nhan vien "+FullName+" la "+CongViec);
        System.out.println("Ma nhan vien la: "+MaNV);
   }
    
}
