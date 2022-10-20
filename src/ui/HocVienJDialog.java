package ui;

import dao.ChuyenDeDAO;
import dao.HocVienDAO;
import dao.KhoaHocDAO;
import dao.NguoiHocDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.ChuyenDe;
import model.HocVien;
import model.KhoaHoc;
import model.NguoiHoc;
import utils.Auth;
import utils.MsgBox;

public class HocVienJDialog extends javax.swing.JDialog {

    public HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChonChuyenDe = new javax.swing.JLabel();
        pnlChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnlHocVien = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnCapNhat = new javax.swing.JButton();
        btnXoaKhoaHoc = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        pnlFind = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblFind = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        lblHocVien = new javax.swing.JLabel();
        pnlKhoaHoc = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        lblChonKhoaHoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edusys - Quản Lý Học Viên");

        lblChonChuyenDe.setText("Chuyên Đề");

        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlChuyenDeLayout = new javax.swing.GroupLayout(pnlChuyenDe);
        pnlChuyenDe.setLayout(pnlChuyenDeLayout);
        pnlChuyenDeLayout.setHorizontalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlChuyenDeLayout.setVerticalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboChuyenDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TT", "MaHV", "MaNH", "HoTen", "Diem"
            }
        ));
        jScrollPane2.setViewportView(tblHocVien);

        btnCapNhat.setText("Cập Nhật Điểm");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaKhoaHoc.setText("Xóa Khỏi Khóa Học");
        btnXoaKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHocVienLayout = new javax.swing.GroupLayout(pnlHocVien);
        pnlHocVien.setLayout(pnlHocVienLayout);
        pnlHocVienLayout.setHorizontalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHocVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaKhoaHoc)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addContainerGap())
        );
        pnlHocVienLayout.setVerticalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoaKhoaHoc))
                .addContainerGap())
        );

        tabs.addTab("Học Viên", pnlHocVien);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MãNH", "Họ và Tên", "Giới Tính", "Ngày Sinh", "Điện Thoại", "Email"
            }
        ));
        jScrollPane1.setViewportView(tblNguoiHoc);

        pnlFind.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnFind.setText("Tìm");

        javax.swing.GroupLayout pnlFindLayout = new javax.swing.GroupLayout(pnlFind);
        pnlFind.setLayout(pnlFindLayout);
        pnlFindLayout.setHorizontalGroup(
            pnlFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFindLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFindLayout.setVerticalGroup(
            pnlFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFindLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind)))
        );

        lblFind.setText("Tìm Kiếm");

        btnThem.setText("Thêm vào khóa học");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(lblFind)
                    .addComponent(pnlFind, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)))
                .addContainerGap())
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnThem))
        );

        tabs.addTab("Người Học", pnlNguoiHoc);

        lblHocVien.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHocVien.setForeground(new java.awt.Color(0, 0, 204));
        lblHocVien.setText("QUẢN LÝ HỌC VIÊN KHÓA HỌC ");

        pnlKhoaHoc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlKhoaHocLayout = new javax.swing.GroupLayout(pnlKhoaHoc);
        pnlKhoaHoc.setLayout(pnlKhoaHocLayout);
        pnlKhoaHocLayout.setHorizontalGroup(
            pnlKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlKhoaHocLayout.setVerticalGroup(
            pnlKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboKhoaHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblChonKhoaHoc.setText("Khóa Học");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHocVien)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChonChuyenDe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChonKhoaHoc))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChonChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChonKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.addHocVien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoaHocActionPerformed
        // TODO add your handling code here:
        this.removeHocVien();
    }//GEN-LAST:event_btnXoaKhoaHocActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        this.updateDiem();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HocVienJDialog dialog = new HocVienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaKhoaHoc;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChonChuyenDe;
    private javax.swing.JLabel lblChonKhoaHoc;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblHocVien;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlFind;
    private javax.swing.JPanel pnlHocVien;
    private javax.swing.JPanel pnlKhoaHoc;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    HocVienDAO hvdao = new HocVienDAO();

    void init() {
        this.setLocationRelativeTo(null);
        fillComboBoxChuyenDe();
    }

    void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillComboBoxKhoaHoc();
    }

    void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        if (khoaHoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoaHoc.getMaKH());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoten = nhdao.selectById(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{i + 1,
                    hv.getMaHV(),
                    hv.getMaNH(), hoten,
                    hv.getDiem()
                });
            }
            this.fillTableNguoiHoc();
        }
    }

    void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        String keyword = txtFind.getText();
        List<NguoiHoc> list = nhdao.selectNotInCourse(khoaHoc.getMaKH(), keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{
                nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nữ",
                nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()});
        }

    }

    void addHocVien() {
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        for (int row : tblNguoiHoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(khoaHoc.getMaKH());
            hv.setDiem(0);
            hv.setMaNH((String) tblNguoiHoc.getValueAt(row, 0));
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        this.tabs.setSelectedIndex(0);
    }

    void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Ban khöng có quyên xóa hoc viên!");
        } else {
            if (MsgBox.confirm(this, "Ban muon xóa các hoc viên được chọn?")) {
                for (int row : tblHocVien.getSelectedRows()) {
                    int mahv = (Integer) tblHocVien.getValueAt(row, 0);
                    hvdao.delete(String.valueOf(mahv));
                }
                this.fillTableHocVien();
            }

        }
    }

    void updateDiem() {
        for (int i = 0; i < tblHocVien.getRowCount(); i++) {
            int mahv = (Integer) tblHocVien.getValueAt(i, 1);
            HocVien hv = hvdao.selectById(String.valueOf(mahv));
            hv.setDiem((Double) tblHocVien.getValueAt(i, 4));
            hvdao.update(hv);
        }
        MsgBox.alert(this, "Câp nhât diem thänh cong!");
    }

    void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model
                = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        if (chuyenDe != null) {
            List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD());
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
            this.fillTableHocVien();
        }
    }

}
