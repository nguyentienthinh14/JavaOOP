import java.util.Scanner;

public class employee {
    public String name;
    public int age;
    public String ID;
    public float Luong, PhuCap, GioLam, TongLuong;

    //Nhap thong tin 
    void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten NV: ");
        name = sc.nextLine();

        System.out.print("Ma NV: ");
        ID= sc.nextLine();

        System.out.print("So gio lam: ");
        GioLam = sc.nextFloat();

        System.out.print("Nhap tuoi NV: ");
        age = sc.nextInt();

    }
    public float TinhLuongCoBan() {
        Luong = GioLam*30f; 
        return Luong;
    }
    public float TinhPhuCap() {
        if(GioLam>240){
            PhuCap=Luong*0.2f;
        } else {
            PhuCap=Luong*0.1f;
        }
        return PhuCap;
    }
    public float TongLuong() {
        TongLuong = Luong + PhuCap;
        return TongLuong;
    }
    void XuatThongTin()
    {
        System.out.println(ID+"-"+name+"-"+age);
        System.out.println("So gio lam: " +GioLam);
        System.out.println("Luong Co Ban: "+Luong);
        System.out.println("Phu Cap:"+PhuCap );
        System.out.println("Tong Luong:" +TongLuong);
    }
}
