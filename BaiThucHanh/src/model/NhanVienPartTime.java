package model;

import model.util.Configs;

public class NhanVienPartTime extends NhanVien {

    private int GioLamViec;

    public NhanVienPartTime(String Ten, int GioLamViec){
        this.Ten=Ten;
        this.GioLamViec=GioLamViec;
    }
    
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }

    public void Luong(){
        Luong= Configs.LuongNhanVienPartTimeMoiGio*GioLamViec;
    }
}
