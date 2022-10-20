package dao;


import model.HocVien;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utils.XJdbc;

public class HocVienDAO extends EduSysDAO<HocVien, String> {

    String INSERT_SQL = "INSERT INTO HocVien (MaKH, MaNH, Diem) VALUES (?, ?, ?);";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH = ?, MaNH = ?, Diem = ? WHERE MaHV = ?;";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien;";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV = ?;";


    @Override
    public void insert(HocVien entity) {
        Object args[] = 
        {
            entity.getMaKH(), 
            entity.getMaNH(), 
            entity.getDiem()
        };
        XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public void update(HocVien entity) {
        Object args[] = 
        {
            entity.getMaKH(), 
            entity.getMaNH(), 
            entity.getDiem(), 
            entity.getMaHV()
        };
        XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public void delete(String id) {
        XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public HocVien selectById(String id) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getFloat("Diem"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

    public List<HocVien> selectByKhoaHoc(int maKH) {
        String sql = "SELECT * FROM HocVien WHERE MakH=?";
        return this.selectBySql(sql, maKH);
    }
}
