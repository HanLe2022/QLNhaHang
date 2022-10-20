package ui;

import dao.ChuyenDeDAO;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import model.ChuyenDe;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

public class ChuyenDeJDialog extends javax.swing.JDialog {

    public ChuyenDeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
        this.fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        lblChuyenDe = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        lblMaCD = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        lblTenCD = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edusys - Quản Lý Chuyên Đề");

        lblChuyenDe.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblChuyenDe.setForeground(new java.awt.Color(0, 0, 204));
        lblChuyenDe.setText("QUẢN LÝ CHUYÊN ĐỀ");

        lblMaCD.setText("Mã chuyên đề");

        lblTenCD.setText("Tên chuyên đề");

        lblHocPhi.setText("Học phí");

        lblThoiLuong.setText("Thời lượng (giờ)");

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

        lblLogo.setText("Hình Logo");

        lblHinh.setForeground(new java.awt.Color(51, 51, 255));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Favourites.png"))); // NOI18N
        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        lblMoTa.setText("Mô Tả Chuyên Đề");

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane2.setViewportView(txtMota);

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                        .addComponent(lblMaCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(35, 35, 35))
                                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                        .addComponent(lblTenCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(63, 63, 63))
                                    .addComponent(lblHocPhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                        .addComponent(lblThoiLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(63, 63, 63)))
                                .addGap(153, 153, 153))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(txtHocPhi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenCD, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaCD, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addComponent(btnLast))
                            .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMoTa)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFirst, btnLast, btnNext, btnPrev});

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMoi, btnSua, btnThem, btnXoa});

        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaCD)
                    .addComponent(lblLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHocPhi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMoTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaCD", "TenCD", "HocPhi", "ThoiLuong", "Hinh"
            }
        ));
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChuyenDe);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        tabs.addTab("Danh Sách", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChuyenDe)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
        this.chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
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

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        row = tblChuyenDe.getSelectedRow();
        System.out.println(row);
        this.edit();
        btnThem.setEnabled(false);
        
    }//GEN-LAST:event_tblChuyenDeMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChuyenDeJDialog dialog = new ChuyenDeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMaCD;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    // Controller Code
    ChuyenDeDAO daoCD = new ChuyenDeDAO(); // Lam viêc voi bang ChuyenDe

    int row = -1; // Hang duoc chon hiên tai trên bang
    // [ChuyenDe]Dialog Open]

    void init() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    // Đổ dữ liệu vào tblHocVien
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0); // xóa tất cả các hàng trên JTable
        try {
            List<ChuyenDe> list = daoCD.selectAll(); // đọc dữ liệu từ CSDL
            for (ChuyenDe cd : list) {
                Object[] row = {cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(), cd.getThoiLuong(), cd.getHinh()};
                model.addRow(row);// thêm môt hàng vào JTable
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    // Hiên thi ChuyenDe lên form
    void setForm(ChuyenDe cd) {
        txtMaCD.setText(cd.getMaCD());
        txtTenCD.setText(cd.getTenCD());
        txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        txtMota.setText(cd.getMoTa());
        // Hiển thị hình và ghi tên hình vào tooltip của Label chứa hình
        if (cd.getHinh() != null) {
            lblHinh.setToolTipText(cd.getHinh());
        }
        lblHinh.setIcon(XImage.read(cd.getHinh()));
    }

    // Tao ChuyenDe từ form
    ChuyenDe getForm() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(txtMaCD.getText());
        cd.setTenCD(txtTenCD.getText());
        cd.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        cd.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        cd.setMoTa(txtMota.getText());
        cd.setHinh(lblHinh.getToolTipText());
        return cd;
    }

    // [btnMoi]
    void clearForm() {
        ChuyenDe cd = new ChuyenDe();
        this.setForm(cd);
        this.row = -1;
        this.updateStatus();
    }

    // [btnThem]
    void insert() {
        ChuyenDe cd = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(cd.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoCD.insert(cd);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
//        }
    }

    // [btnSua]
    void update() {
        ChuyenDe cd = getForm();
//        String xacNhan = new String(txtXacNhan.getText());
//        if (!xacNhan.equals(cd.getMatKhau())) {
//            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
//        } else {
        try {
            daoCD.update(cd);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
        fillTable();
//        }
    }

    // [btnXoa]cd
    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề!");
        } else {
            String macd = txtMaCD.getText();
            if (MsgBox.confirm(this, "Bạn thật sự muốn xóa chuyên đề này?"));
            try {
                daoCD.delete(macd);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại");
            }
        }
        fillTable();
    }

    // [tblHocVien click]
    void edit() {
        String macd = (String) tblChuyenDe.getValueAt(this.row, 0);
        ChuyenDe cd = daoCD.selectById(macd);
        this.setForm(cd);
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
        if (this.row < tblChuyenDe.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    // [btnLast]
    void last() {
        this.row = tblChuyenDe.getRowCount() - 1;
        this.edit();
    }

    // Câp nhât trang thái các nút
    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblChuyenDe.getRowCount() - 1);
        // Trang thái form
//      txtMaCD.setEditable(edit);
        btnThem.setEnabled(edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        // Trang thái dièu huong
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // luu hinh vao thu muc logos
            ImageIcon icon = XImage.read(file.getName()); // doc hinh tu logos
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(file.getName()); // giu ten hinh trong tooltip

        }
    }
}
