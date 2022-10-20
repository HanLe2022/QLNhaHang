package dao;


import model.KhoaHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utils.XJdbc;

public class KhoaHocDAO extends EduSysDAO<KhoaHoc, String> {

    String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV = ?, NgayTao = ? WHERE MaKH = ?;";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc;";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhoaHoc WHERE MaKH = ?;";

    @Override
    public void insert(KhoaHoc entity) {
        Object args[] = 
        {
            entity.getMaCD(), 
            entity.getHocPhi(), 
            entity.getThoiLuong(), 
            entity.getNgayKG(), 
            entity.getGhiChu(), 
            entity.getMaNV(), 
            entity.getNgayTao()
        };
        XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public void update(KhoaHoc entity) {
        Object args[] = 
        {
            entity.getMaCD(), 
            entity.getHocPhi(), 
            entity.getThoiLuong(), 
            entity.getNgayKG(), 
            entity.getGhiChu(), 
            entity.getMaNV(), 
            entity.getNgayTao(), 
            entity.getMaKH()
        };
        XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public void delete(String id) {
        XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public KhoaHoc selectById(String id) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                KhoaHoc entity = new KhoaHoc();
                
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }
//    public List<Integer> selectYears()
    public List<KhoaHoc> selectByChuyenDe(String macd) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaCD = ?";
        return this.selectBySql(sql, macd);
    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(NgayKG) FROM KhoaHoc ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
//            rs.getStatement().getConnection().close();
                return list;
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
