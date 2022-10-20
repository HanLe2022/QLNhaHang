package ui;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import utils.Auth;
import utils.MsgBox;

public class GiaoDienChinh extends javax.swing.JFrame {

    public GiaoDienChinh() {
        initComponents();
        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        tbrMenu = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlEnd = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniTKBangDiem = new javax.swing.JMenuItem();
        mniTKKhoaHoc = new javax.swing.JMenuItem();
        mniTKNguoiHoc = new javax.swing.JMenuItem();
        mniTKDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ");

        tbrMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbrMenu.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        tbrMenu.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        tbrMenu.add(btnKetThuc);
        tbrMenu.add(jSeparator1);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên Đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        tbrMenu.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        btnNguoiHoc.setText("Người Học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        tbrMenu.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa Học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        tbrMenu.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unknown person.png"))); // NOI18N
        btnHocVien.setText("Học Viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        tbrMenu.add(btnHocVien);
        tbrMenu.add(jSeparator2);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        tbrMenu.add(btnHuongDan);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        pnlEnd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        lblTrangThai.setText("Hệ quản lý đào tạo");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("10:55 PM");

        javax.swing.GroupLayout pnlEndLayout = new javax.swing.GroupLayout(pnlEnd);
        pnlEnd.setLayout(pnlEndLayout);
        pnlEndLayout.setHorizontalGroup(
            pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEndLayout.createSequentialGroup()
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEndLayout.setVerticalGroup(
            pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnuHeThong.setText("Hệ thống");

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator5);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi Mật Khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator6);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết Thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên đề");
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa Học");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        mniNguoiHoc.setText("Người Học");
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Unknown person.png"))); // NOI18N
        mniHocVien.setText("Học Viên");
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mniNhanVien.setText("Nhân Viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        menuBar.add(mnuQuanLy);

        mnuThongKe.setText("Thống Kê");

        mniTKBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniTKBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Card file.png"))); // NOI18N
        mniTKBangDiem.setText("Bảng điểm");
        mniTKBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKBangDiem);

        mniTKKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniTKKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        mniTKKhoaHoc.setText("Điểm Chuyên Đề");
        mniTKKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKKhoaHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKKhoaHoc);

        mniTKNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniTKNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mniTKNguoiHoc.setText("Lượng người học");
        mniTKNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKNguoiHoc);

        mniTKDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniTKDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mniTKDoanhThu.setText("Doanh thu");
        mniTKDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniTKDoanhThu);

        menuBar.add(mnuThongKe);

        mnuTroGiup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mnuTroGiup.setText("Trợ Giúp");

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        menuBar.add(mnuTroGiup);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbrMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbrMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("EduSysJFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        // TODO add your handling code here:
        this.openNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniTKBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKBangDiemActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_mniTKBangDiemActionPerformed

    private void mniTKKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKKhoaHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTKKhoaHocActionPerformed

    private void mniTKNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_mniTKNguoiHocActionPerformed

    private void mniTKDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKDoanhThuActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_mniTKDoanhThuActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
        this.openHuongDan();
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        this.openGioiThieu();
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        this.openHuongDan();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniTKBangDiem;
    private javax.swing.JMenuItem mniTKDoanhThu;
    private javax.swing.JMenuItem mniTKKhoaHoc;
    private javax.swing.JMenuItem mniTKNguoiHoc;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlEnd;
    private javax.swing.JToolBar tbrMenu;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
        
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();

        this.openWelcome();
        this.openLogin();
    }

    void startDongHo() {
        
    }

    void openLogin(){
        new DangNhapJDialog(this, true).setVisible(true);
    }
    void openDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void dangXuat() {
        Auth.clear();
        new DangNhapJDialog(this, true).setVisible(true);
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm viêc?")) {
            System.exit(0);
        }
    }

    void openNhanVien() {
        new NhanVienJDialog(this, true).setVisible(true);
    }

    void openKhoaHoc() {
        new KhoaHocJDialog(this, true).setVisible(true);
    }

    void openChuyenDe() {
        new ChuyenDeJDialog(this, true).setVisible(true);
    }

    void openNguoiHoc() {
        new NguoiHocJDialog(this, true).setVisible(true);
    }

    void openHocVien() {
        new HocVienJDialog(this, true).setVisible(true);
    }

    void openThongKe(int index) {
        // Phải là trưởng phòng
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "Ban không có quyền xem thông tin doanh thu");
            } else {
                ThongKeJDialog tkwin = new ThongKeJDialog(this, true);
                tkwin.setVisible(true);
                tkwin.selectTab(index);
            }
        } else {
            MsgBox.alert(this, "Vui long đăng nhập!");
        }

    }

    void openWelcome(){
        new ChaoJDialog(this, true).setVisible(true);
    } 
    
    void openGioiThieu() {
        new GioiThieuJDialog(this, true).setVisible(true);
        
    }

    void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (IOException ex) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }
}
