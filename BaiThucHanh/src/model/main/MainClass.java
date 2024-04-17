package model.main;

import model.NhanVienFullTime;
import model.NhanVienPartTime;
import model.util.Configs;

public record MainClass() {
    public static void main(String[] args) {
        NhanVienFullTime Sep = new NhanVienFullTime("Nguyen Tien Thinh");
        Sep.setLoaiChucVu(1);

        NhanVienFullTime linh1= new NhanVienFullTime("Nguyen Tien");
        linh1.setLoaiChucVu(2);
        NhanVienFullTime linh2= new NhanVienFullTime("Nguyen Thinh", 3);
        linh2.setLoaiChucVu(2);
        NhanVienPartTime thoivu = new NhanVienPartTime("Nguyen Thinh Tien", 240);

        Sep.Luong();
        linh1.Luong();
        linh2.Luong();
        thoivu.Luong();

        Sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        thoivu.XuatThongTin();
        
    }

}
