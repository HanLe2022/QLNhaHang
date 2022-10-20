package ui;

import dao.NhanVienDAO;
import utils.Auth;
import utils.MsgBox;

public class DoiMatKhauJDialog extends javax.swing.JDialog {

    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblMatKhauMoi = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhauCu = new javax.swing.JLabel();
        lblXacNhan = new javax.swing.JLabel();
        btnHuyBo = new javax.swing.JButton();
        btnDongY = new javax.swing.JButton();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtMatKhauCu = new javax.swing.JPasswordField();
        txtXacNhan = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 51));
        lblTitle.setText("ĐỔI MẬT KHẨU ");

        lblMaNV.setText("Tên đăng nhập");

        lblMatKhauMoi.setText("Mật khẩu mới");

        txtMaNV.setText("Han");

        lblMatKhauCu.setText("Mật khẩu cũ");

        lblXacNhan.setText("Xác nhận lại mật khẩu");

        btnHuyBo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/No.png"))); // NOI18N
        btnHuyBo.setText("Hủy Bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        btnDongY.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnDongY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        btnDongY.setText("Đồng ý");
        btnDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhauCu)
                            .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMatKhauMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblXacNhan)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDongY)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuyBo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMaNV, txtMatKhauCu, txtMatKhauMoi, txtXacNhan});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMaNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMatKhauCu)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMatKhauMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblXacNhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyBo)
                    .addComponent(btnDongY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMaNV, txtMatKhauCu, txtMatKhauMoi, txtXacNhan});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        // TODO add your handling code here:
        doiMatKhau();
    }//GEN-LAST:event_btnDongYActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        huyBo();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDongY;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhauCu;
    private javax.swing.JLabel lblMatKhauMoi;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblXacNhan;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtXacNhan;
    // End of variables declaration//GEN-END:variables

    // Controller
    NhanVienDAO daoNV = new NhanVienDAO();

    private void doiMatKhau() {
        String manv = txtMaNV.getText();
        String matKhau = new String(txtMatKhauCu.getPassword());
        String matKhauMoi = new String(txtMatKhauMoi.getPassword());
        String xacNhan = new String(txtXacNhan.getPassword());
        if (!manv.equalsIgnoreCase(Auth.user.getMaNV())) {
            MsgBox.alert(this, "Sai tên đăng nhâp!");
        } else if (!matKhau.equals(Auth.user.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
        } else if (!matKhauMoi.equals(xacNhan)) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            Auth.user.setMatKhau(matKhauMoi);
            daoNV.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
        }
    }

    private void huyBo() {
        this.dispose();
    }
}
