package model;

import model.util.Configs;

public class NhanVienFullTime extends NhanVien {
    protected int NgayLamThem;
    protected int LoaiChucVu;

    public NhanVienFullTime(String Ten){
        this.Ten=Ten;
    }

    public NhanVienFullTime(String Ten, int NgayLamThem){
        this.Ten=Ten;
        this.NgayLamThem=NgayLamThem;
    }

    public void setLoaiChucVu(int LoaiChucVu){
        this.LoaiChucVu=LoaiChucVu;
    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }

    public void Luong(){
        if (LoaiChucVu == 1) {
            Luong = Configs.LuongNhanVienFullTimeSep+Configs.LuongLamThemMoiNgay*NgayLamThem;
        }else if (LoaiChucVu == 2) {
            Luong = Configs.LuongNhanVienFullTimeLinh+Configs.LuongLamThemMoiNgay*NgayLamThem;
        }
        }              
    }   
