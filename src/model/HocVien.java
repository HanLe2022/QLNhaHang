package model;

public class HocVien {
    /*
    Mã học viên
    Mã khóa học 
    Mã người học
    Điểm trung bình
    */
    int maHV;
    int maKH;
    String maNH;
    double diem;

    public HocVien() {
    }

    public HocVien(int maHV, int maKH, String maNH, double diem) {
        this.maHV = maHV;
        this.maKH = maKH;
        this.maNH = maNH;
        this.diem = diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
