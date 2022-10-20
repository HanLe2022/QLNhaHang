package dao;

import model.NhanVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utils.XJdbc;

public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, VaiTro = ? WHERE MaNV = ?;";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien;";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?;";
    
    @Override
    public void insert(NhanVien entity) {
        Object args[] = 
        {
            entity.getMaNV(), 
            entity.getMatKhau(), 
            entity.getHoTen(), 
            entity.isVaiTro()
        };
        XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public void update(NhanVien entity) {
        Object args[] = 
        {
            entity.getMatKhau(), 
            entity.getHoTen(), 
            entity.isVaiTro(), 
            entity.getMaNV()
        };
        XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public void delete(String id) {
        XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

}
