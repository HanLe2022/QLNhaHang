package ui;

import dao.ChuyenDeDAO;
import dao.KhoaHocDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.ChuyenDe;
import model.KhoaHoc;
import utils.Auth;
import utils.MsgBox;

public class KhoaHocJDialog extends javax.swing.JDialog {

    public KhoaHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
        this.fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKhoaHoc = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        lblChuyenDe = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblNgayKG = new javax.swing.JLabel();
        txtNgayKG = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        txtNgayTao = new javax.swing.JTextField();
        lblNgayTao = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        pnlChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        lblChonChuyenDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblKhoaHoc.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblKhoaHoc.setForeground(new java.awt.Color(0, 0, 204));
        lblKhoaHoc.setText("QUẢN LÝ KHÓA HỌC ");

        lblChuyenDe.setText("Chuyên đề");

        lblHocPhi.setText("Học phí");

        lblNgayKG.setText("Ngày khai giảng");

        lblThoiLuong.setText("Thời lượng (giờ)");

        lblMaNV.setText("Người tạo");

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        lblNgayTao.setText("Ngày tạo");

        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChuyenDe)
                            .addComponent(lblHocPhi)
                            .addComponent(txtHocPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txtTenCD))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayKG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgayKG)
                                    .addComponent(lblThoiLuong))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblGhiChu))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaNV)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNgayTao)
                                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)))
                .addContainerGap())
        );

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHocPhi, txtMaNV, txtNgayKG, txtNgayTao, txtTenCD, txtThoiLuong});

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                        .addComponent(lblChuyenDe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                        .addComponent(lblNgayKG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNgayKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHocPhi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(lblThoiLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(lblNgayTao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnNext)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnLast)))
        );

        tabs.addTab("Cập Nhật", pnlCapNhat);

        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Thời Lương", "Học Phí", "Khai Giảng", "Tạo Bởi", "Ngày Tạo"
            }
        ));
        jScrollPane1.setViewportView(tblKhoaHoc);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        tabs.addTab("Danh Sách", pnlDanhSach);

        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlChuyenDeLayout = new javax.swing.GroupLayout(pnlChuyenDe);
        pnlChuyenDe.setLayout(pnlChuyenDeLayout);
        pnlChuyenDeLayout.setHorizontalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenDeLayout.createSequentialGroup()
                .addComponent(cboChuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlChuyenDeLayout.setVerticalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboChuyenDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblChonChuyenDe.setText("Chuyên Đề");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhoaHoc)
                            .addComponent(lblChonChuyenDe))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChonChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            this.insert();
        } catch (ParseException ex) {
            Logger.getLogger(KhoaHocJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            this.update();
        } catch (ParseException ex) {
            Logger.getLogger(KhoaHocJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhoaHocJDialog dialog = new KhoaHocJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChonChuyenDe;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNgayKG;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayKG;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    // Controller Code
    KhoaHocDAO daoKH = new KhoaHocDAO(); // Lam viêc voi bang KhoaHoc
    int row = -1; // Hang duoc chon hiên tai trên bang

    ChuyenDeDAO cddao = new ChuyenDeDAO();

    //  Bổ sung phương thức fillComboBoxChuyenDe() vào KhoaHocJDialog và gọi trong init() để đổ danh sách chuyên đề vào ComboBox
    void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
    }

    // [KhoaHoc]Dialog Open]
    void init() {
        this.setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();
    }

    // Đổ dữ liệu vào tblHocVien
    void fillTable() {

        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên JTable
        try {
            ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
            List<KhoaHoc> list = daoKH.selectByChuyenDe(chuyenDe.getMaCD()); // đọc dữ liệu từ CSDL
            for (KhoaHoc kh : list) {
                Object[] row = {kh.getMaCD(), kh.getThoiLuong(), kh.getHocPhi(), kh.getNgayKG(), kh.getMaNV(), kh.getNgayTao()};
                model.addRow(row);// thêm môt hàng vào JTable
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    // Hiên thi KhoaHoc lên form
    void setForm(KhoaHoc kh) {
//        kh.getMaCD(), kh.getThoiLuong(), kh.getHocPhi(), kh.getNgayKG(),kh.getMaNV() , kh.getNgayTao()

        txtTenCD.setText(kh.getMaCD());
        txtThoiLuong.setText(String.valueOf(kh.getThoiLuong()));
        txtMaNV.setText(kh.getMaNV());
        txtNgayKG.setText(String.valueOf(kh.getNgayKG()));
        txtNgayTao.setText(String.valueOf(kh.getNgayTao()));
        txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
        txtGhiChu.setText(kh.getGhiChu());

    }

    // Tao KhoaHoc từ form
    KhoaHoc getForm() throws ParseException {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaCD(txtTenCD.getText());
        kh.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        kh.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        // (new SimpleDateFormat("yyyy/mm/dd").parse(txtNgaySinh.getText()));
        kh.setMaNV(txtMaNV.getText());
        kh.setNgayKG(new SimpleDateFormat("yyyy/mm/dd").parse(txtNgayKG.getText()));
        kh.setNgayTao(new SimpleDateFormat("yyyy/mm/dd").parse(txtNgayTao.getText()));
        kh.setGhiChu(txtGhiChu.getText());
        return kh;
    }

    // [btnMoi]
    void clearForm() {
        KhoaHoc cd = new KhoaHoc();
        this.setForm(cd);
        this.row = -1;
        this.updateStatus();
    }

    // [btnThem]
    void insert() throws ParseException {
        KhoaHoc cd = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(kh.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoKH.insert(cd);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
//        }
    }

    // [btnSua]
    void update() throws ParseException {
        KhoaHoc cd = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(kh.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoKH.update(cd);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
//        }
    }

    // [btnXoa]
    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            Integer makh = Integer.valueOf(cboChuyenDe.getToolTipText());
            if (MsgBox.confirm(this, "Bạn thật sự muốn xóa khóa học này?"));
            try {
                daoKH.delete(String.valueOf(makh));
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại");
            }
        }
    }

    // [tblHocVien double click]
    void edit() {
        Integer makh = (Integer) tblKhoaHoc.getValueAt(this.row, 0);
        KhoaHoc cd = daoKH.selectById(String.valueOf(makh));
        if(cd != null){
        this.setForm(cd);
        tabs.setSelectedIndex(0);
        }
        this.updateStatus();
    }

    // [btnFirst]
    void first() {
        this.row = 0;
        this.edit();
    }

    // [btnPrev]
    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    // [btnNext]
    void next() {
        if (this.row < tblKhoaHoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    // [btnLast]
    void last() {
        this.row = tblKhoaHoc.getRowCount() - 1;
        this.edit();
    }

    // Câp nhât trang thái các nút
    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblKhoaHoc.getRowCount() - 1);
        // Trang thái form
        txtTenCD.setEditable(edit);
        btnThem.setEnabled(edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        // Trang thái dièu huong
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void chonChuyenDe() {
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        txtThoiLuong.setText(String.valueOf(chuyenDe.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(chuyenDe.getHocPhi()));
        txtTenCD.setText(chuyenDe.getTenCD());
        txtGhiChu.setText(chuyenDe.getTenCD());
        this.fillTable();
        this.row = -1;
        this.updateStatus();
        tabs.setSelectedIndex(1);
    }

    @Override
    public String toString() {
        String tenCD = (String) cboChuyenDe.getSelectedItem();
        return tenCD;
    }
//    @Override
//    public boolean equals(Object obj) {
//        ChuyenDe other = (ChuyenDe) obj;
//        return other.getMaCD().equals(this.getMaCD());
//    }
}
