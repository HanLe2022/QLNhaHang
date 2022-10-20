package model;

import java.util.Date;

public class NhanVien {
    /*
    Mã nhân viên 
    Mật khẩu
    Họ và tên
    Vai trò
    */

    String maNV;
    String matKhau;
    String hoTen;
    boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String matKhau, boolean vaiTro) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean getVaiTro(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
