package model;

public class NhanVien {
    protected String Ten;
    protected long Luong;

    public NhanVien(){

    }

    public NhanVien(String ten){
        this.Ten=Ten;
    }

    protected String loaiNhanVien(){
        return "";
    }

    public void XuatThongTin(){
        System.out.println("\n==== Nhan Vien: "+Ten+" ====");
        System.out.println("- Loai nhan vien: " + loaiNhanVien());
        System.out.println("- Luong: "+Luong+" VND");
    }
}
