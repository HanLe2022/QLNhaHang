package dao;


import model.ChuyenDe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utils.XJdbc;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?);";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD = ?;";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD = ?;";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe;";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MaCD = ?;";

    @Override
    public void insert(ChuyenDe entity) {
        Object args[] = 
        {   
            entity.getMaCD(), 
            entity.getTenCD(), 
            entity.getHocPhi(), 
            entity.getThoiLuong(), 
            entity.getHinh(), 
            entity.getMoTa()
        };              
        XJdbc.updateData(INSERT_SQL, args);
    }

    @Override
    public void update(ChuyenDe entity) {
        Object args[] = 
        {
            entity.getTenCD(), 
            entity.getHocPhi(), 
            entity.getThoiLuong(), 
            entity.getHinh(), 
            entity.getMoTa(), 
            entity.getMaCD()
        };
        XJdbc.updateData(UPDATE_SQL, args);
    }

    @Override
    public void delete(String id) {
        XJdbc.updateData(DELETE_SQL, id);
    }

    @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.queryData(sql, args);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();

                entity.setMaCD(rs.getString("MaCD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocPhi(rs.getFloat("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            System.out.println("Lỗi selectBySql: " + ex);
            throw new RuntimeException(ex);
        }
    }

}
