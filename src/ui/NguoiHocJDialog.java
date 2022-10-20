package ui;

import dao.NguoiHocDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.NguoiHoc;
import utils.Auth;
import utils.MsgBox;

public class NguoiHocJDialog extends javax.swing.JDialog {

    public NguoiHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
        this.fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblNguoiHoc = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        lblMaNH = new javax.swing.JLabel();
        txtMaNH = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        lblDienThoai = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        pnlFind = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblFind = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNguoiHoc.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblNguoiHoc.setForeground(new java.awt.Color(0, 0, 204));
        lblNguoiHoc.setText("QUẢN LÝ NGƯỜI HỌC ");

        lblMaNH.setText("Mã Người Học");

        lblHoTen.setText("Họ & Tên");

        lblGioiTinh.setText("Giới Tính");

        rdoNam.setText("Nam");

        rdoNu.setText("Nữ");

        lblNgaySinh.setText("Ngày sinh");

        lblEmail.setText("Địa chỉ email");

        lblDienThoai.setText("Điện thoại");

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        btnLast.setText(">|");
        btnLast.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen)
                    .addComponent(txtMaNH)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu))
                            .addComponent(lblHoTen)
                            .addComponent(lblMaNH)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblGioiTinh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNgaySinh)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDienThoai)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(lblGhiChu)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
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
                                .addComponent(btnLast)))))
                .addContainerGap())
        );

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDienThoai, txtEmail, txtNgaySinh});

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(lblNgaySinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(lblDienThoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDienThoai, txtEmail, txtNgaySinh});

        tabs.addTab("Cập Nhật", pnlCapNhat);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "Họ Và Tên", "Giới Tính", "Ngày Sinh", "Điện Thoại", "Email", "Mã NV", "Ngày ĐK"
            }
        ));
        jScrollPane1.setViewportView(tblNguoiHoc);

        pnlFind.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnFind.setText("Tìm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachLayout.createSequentialGroup()
                        .addComponent(lblFind)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlFind, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        tabs.addTab("Danh Sách", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNguoiHoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            this.update();
        } catch (ParseException ex) {
            Logger.getLogger(NguoiHocJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            this.insert();
        } catch (ParseException ex) {
            Logger.getLogger(NguoiHocJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_btnFindActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NguoiHocJDialog dialog = new NguoiHocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDienThoai;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNH;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNguoiHoc;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlFind;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNH;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables

    // Controller Code
    NguoiHocDAO daoNH = new NguoiHocDAO(); // Lam viêc voi bang NguoiHoc

    int row = -1; // Hang duoc chon hiên tai trên bang
    // [NguoiHoc]Dialog Open]

    void init() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    // Đổ dữ liệu vào tblHocVien
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên JTable
        try {
            String keyword = txtFind.getText();
            List<NguoiHoc> list = daoNH.selectByKeyword(keyword); // đọc dữ liệu từ CSDL
            for (NguoiHoc nh : list) {
                Object[] row = {nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh(), nh.getNgaySinh(),
                    nh.getDienThoai(), nh.getEmail(), nh.getMaNV(), nh.getNgayDK()};
                model.addRow(row);// thêm môt hàng vào JTable
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    // Hiên thi NguoiHoc lên form
    void setForm(NguoiHoc nh) {
        txtMaNH.setText(nh.getMaNH());
        txtHoTen.setText(nh.getHoTen());
        txtNgaySinh.setText(String.valueOf(nh.getNgaySinh()));
        txtDienThoai.setText(nh.getDienThoai());
        txtEmail.setText(nh.getEmail());
        rdoNam.setSelected(nh.isGioiTinh());
        rdoNu.setSelected(nh.isGioiTinh());
        txtGhiChu.setText(nh.getGhiChu());
//        txtMaNV.setText(nh.getMaNV());
//        txtNgayDK.setText(nh.getNgayDK());
    }

    // Tao NguoiHoc từ form
    NguoiHoc getForm() throws ParseException {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(txtMaNH.getText());
        nh.setHoTen(txtHoTen.getText());
        nh.setNgaySinh(new SimpleDateFormat("yyyy/mm/dd").parse(txtNgaySinh.getText()));
        nh.setDienThoai(txtDienThoai.getText());
        nh.setEmail(txtEmail.getText());
        nh.setGioiTinh(rdoNam.isSelected());
        nh.setGhiChu(txtGhiChu.getText());
        
        
        
        return nh;
    }

    // [btnMoi]
    void clearForm() {
        NguoiHoc nh = new NguoiHoc();
        this.setForm(nh);
        this.row = -1;
        this.updateStatus();
    }

    // [btnThem]
    void insert() throws ParseException {
        NguoiHoc nh = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(nh.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoNH.insert(nh);
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
        NguoiHoc nh = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(nh.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoNH.update(nh);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
//        }
    }

    // [btnXoa]nh
    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String manh = txtMaNH.getText();
            if (MsgBox.confirm(this, "Bạn thật sự muốn xóa nhân viên này?"));
            try {
                daoNH.delete(manh);
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
        String manh = (String) tblNguoiHoc.getValueAt(this.row, 0);
        NguoiHoc nh = daoNH.selectById(manh);
        this.setForm(nh);
        tabs.setSelectedIndex(0);
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
        if (this.row < tblNguoiHoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    // [btnLast]
    void last() {
        this.row = tblNguoiHoc.getRowCount() - 1;
        this.edit();
    }

    // Câp nhât trang thái các nút
    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNguoiHoc.getRowCount() - 1);
        // Trang thái form
        txtMaNH.setEditable(edit);
        btnThem.setEnabled(edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        // Trang thái dièu huong
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }

}
