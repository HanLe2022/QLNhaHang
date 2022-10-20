package dao;


import model.NguoiHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utils.XJdbc;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {
    
    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, GioiTinh, NgaySinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen = ?, GioiTinh = ?, NgaySinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, MaNV = ?, NgayDK = ? WHERE MaNH = ?;";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc;";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH = ?;";

    @Override
    public void insert(NguoiHoc entity) {
        Object args[] = 
        {
            entity.getMaNH(), 
            entity.getHoTen(), 
            entity.isGioiTinh(), 
            entity.getNgaySinh(), 
            entity.getDienThoai(), 
            entity.getEmail(), 
            entity.getGhiChu(), 
            entity.getMaNV(), 
            entity.getNgayDK()
        };
        XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public void update(NguoiHoc entity) {
        Object args[] = 
        {
            entity.getHoTen(), 
            entity.isGioiTinh(), 
            entity.getNgaySinh(), 
            entity.getDienThoai(), 
            entity.getEmail(), 
            entity.getGhiChu(), 
            entity.getMaNV(), 
            entity.getNgayDK(), 
            entity.getMaNH()};
        XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public void delete(String id) {
        XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public NguoiHoc selectById(String id) {
        List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    // Bô sung phuong thúc selectByKeyword(String) vào NguoiHocDAO
    public List<NguoiHoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    //public List<NguoiHoc> selectByKeyword(String keyword)   
    public List <NguoiHoc> selectNotInCourse(int makh, String keyword) {
    String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ? AND MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
    return this.selectBySql(sql,"%"+keyword+"%", makh);
}
}