package Person;

public class main {
    public static void main(String[] args) {
        Employer em1 = new Employer() ; //employer
        em1.XuatTen("Employer");
        em1.NhapThongTinNV();
        em1.XuatThongTinNV();
        //FullTime
        FullTime f= new FullTime();
        f.XuatTen("FullTime");
        f.NhapThongTinF();
        f.TinhLuongCoBanF();
        f.TinhPhuCapF();
        f.TongLuongF();
        f.LuongFullTime();
        //PartTime
        PartTime p=new PartTime();
        p.XuatTen("PartTime");
        p.NhapThongTinP();
        p.TongLuongP();
        p.LuongNVPartTime(); 
    }
}
