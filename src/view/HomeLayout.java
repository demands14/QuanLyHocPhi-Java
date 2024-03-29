/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;


public class HomeLayout extends javax.swing.JFrame {

    NhapHocLayout jPannelNhaphoc;
    DsSinhVienLayout jPanelDSsv;
    ThongBaoNopTienLayout jpannelThongBao;
    XuatBaoCaoLayout jpannelXuatBaoCao;
    NopHocPhiLayout jpannelNopHocPhi;

    /**
     * Creates new form HomeLayout
     */
    public HomeLayout() {
        initComponents();
        setSize(1275, 650);
        // init jpanel and add to container

        jPanelDSsv = new DsSinhVienLayout();
        jPanelContainer.add(jPanelDSsv);
        jPanelDSsv.setVisible(true);
        jPanelDSsv.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
                jPanelDSsv.updateDSSV();
            }

            public void componentHidden(ComponentEvent e) {

            }
        });
        jPannelNhaphoc = new NhapHocLayout();
        jPanelContainer.add(jPannelNhaphoc);
        jPannelNhaphoc.setVisible(false);
        jpannelThongBao = new ThongBaoNopTienLayout();
        jPanelContainer.add(jpannelThongBao);
        jpannelThongBao.setVisible(false);
        jpannelXuatBaoCao = new XuatBaoCaoLayout();
        jPanelContainer.add(jpannelXuatBaoCao);
        jpannelXuatBaoCao.setVisible(false);
        jpannelNopHocPhi = new NopHocPhiLayout();
        jPanelContainer.add(jpannelNopHocPhi);
        jpannelNopHocPhi.setVisible(false);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeLayout().setVisible(true);
            }
        });
    }

    public void showJpanel(JPanel panel) {
        jPannelNhaphoc.setVisible(false);
        jPanelDSsv.setVisible(false);
        jpannelThongBao.setVisible(false);
        jpannelXuatBaoCao.setVisible(false);
        jpannelNopHocPhi.setVisible(false);
        panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanelMenu = new javax.swing.JPanel();
        btnNophocphi = new javax.swing.JButton();
        btnXuatBaoCao = new javax.swing.JButton();
        btnNhapHoc = new javax.swing.JButton();
        btnDSSV = new javax.swing.JButton();
        btnThongbao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanelContainer = new javax.swing.JPanel();
        txtHeader = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuDangXuat = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý học phí sinh viên HaUI");
        setBackground(new java.awt.Color(232, 240, 254));

        jPanelMenu.setBackground(new java.awt.Color(232, 240, 254));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(250, 420));

        btnNophocphi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNophocphi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pay.png"))); // NOI18N
        btnNophocphi.setText("Đóng học phí");
        btnNophocphi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNophocphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNophocphiActionPerformed(evt);
            }
        });

        btnXuatBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXuatBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        btnXuatBaoCao.setText("Xuất Báo Cáo");
        btnXuatBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXuatBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatBaoCaoActionPerformed(evt);
            }
        });

        btnNhapHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhapHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admission.png"))); // NOI18N
        btnNhapHoc.setText("Nhập Học");
        btnNhapHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhapHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHocActionPerformed(evt);
            }
        });

        btnDSSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDSSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.png"))); // NOI18N
        btnDSSV.setText("Danh sách Sinh viên");
        btnDSSV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDSSV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSSVActionPerformed(evt);
            }
        });

        btnThongbao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongbao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/notification-icon.png"))); // NOI18N
        btnThongbao.setText("Thông báo Nộp Tiền");
        btnThongbao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongbaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Phần mềm quản lý học phí ");
        jLabel1.setToolTipText("");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXuatBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnDSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhapHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNophocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo)
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhapHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNophocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXuatBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanelContainer.setBackground(new java.awt.Color(204, 204, 204));
        jPanelContainer.setPreferredSize(new java.awt.Dimension(629, 450));

        txtHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtHeader.setText("DANH SÁCH SINH VIÊN");

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("Hệ thống");

        menuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        menuDangXuat.setText("Đăng xuất");
        menuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDangXuatActionPerformed(evt);
            }
        });
        jMenu2.add(menuDangXuat);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHocActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("NHẬP HỌC SINH VIÊN");
        showJpanel(jPannelNhaphoc);
    }//GEN-LAST:event_btnNhapHocActionPerformed

    private void btnNophocphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNophocphiActionPerformed
        txtHeader.setText("NỘP HỌC PHÍ");
        showJpanel(jpannelNopHocPhi);
    }//GEN-LAST:event_btnNophocphiActionPerformed

    private void btnXuatBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatBaoCaoActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("XUẤT BÁO CÁO");
        showJpanel(jpannelXuatBaoCao);
    }//GEN-LAST:event_btnXuatBaoCaoActionPerformed

    private void btnDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSSVActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("DANH SÁCH SINH VIÊN");
        showJpanel(jPanelDSsv);

    }//GEN-LAST:event_btnDSSVActionPerformed

    private void btnThongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongbaoActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("THÔNG BÁO NỘP TIỀN HỌC PHÍ");
        showJpanel(jpannelThongBao);
    }//GEN-LAST:event_btnThongbaoActionPerformed

    private void menuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDangXuatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DangNhapLayOut jpannelDangNhap = new DangNhapLayOut();
        jpannelDangNhap.setVisible(true);
    }//GEN-LAST:event_menuDangXuatActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSSV;
    private javax.swing.JButton btnNhapHoc;
    private javax.swing.JButton btnNophocphi;
    private javax.swing.JButton btnThongbao;
    private javax.swing.JButton btnXuatBaoCao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuItem menuDangXuat;
    private javax.swing.JLabel txtHeader;
    // End of variables declaration//GEN-END:variables

}
