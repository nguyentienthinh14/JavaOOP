package Person;

import java.util.Scanner;

public class PartTime extends Employer {
    public int Gio;
    public PartTime (){

    }
    public void NhapThongTinP(){
        NhapThongTinNV();
        Scanner sc = new Scanner(System.in);
        System.out.print("So gio lam viec la: ");
        Gio=sc.nextInt();
    }
    public float TongLuongP(){
        Luong=Gio*25.f;
        return Luong;
    }
    public void LuongNVPartTime(){
        XuatThongTinNV();
        System.out.println("Luong cua nhan vien parttime la: "+Luong);
    }
}
