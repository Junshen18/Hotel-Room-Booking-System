/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import assignment.manager.FileManager;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        HotelName = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        SignInBtn = new javax.swing.JButton();
        success = new javax.swing.JLabel();
        fail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(215, 212, 154));
        setFont(new java.awt.Font("Encode Sans Medium", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(800, 250));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        LoginPanel.setBackground(new java.awt.Color(239, 234, 206));
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotellogo.png"))); // NOI18N
        LoginPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        PasswordLabel.setFont(new java.awt.Font("Encode Sans SemiBold", 0, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(51, 51, 51));
        PasswordLabel.setText("Password :");
        LoginPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        UsernameLabel.setFont(new java.awt.Font("Encode Sans SemiBold", 0, 12)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        UsernameLabel.setText("Username : ");
        LoginPanel.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        Title.setFont(new java.awt.Font("Encode Sans ExtraBold", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 51));
        Title.setText("Login");
        LoginPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        HotelName.setFont(new java.awt.Font("Encode Sans ExtraBold", 1, 20)); // NOI18N
        HotelName.setForeground(new java.awt.Color(51, 51, 51));
        HotelName.setText("Hotel Me-Why Booking System");
        LoginPanel.add(HotelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        UsernameText.setBackground(new java.awt.Color(255, 255, 255));
        UsernameText.setFont(new java.awt.Font("Encode Sans Medium", 0, 12)); // NOI18N
        UsernameText.setForeground(new java.awt.Color(102, 102, 102));
        UsernameText.setSelectionColor(new java.awt.Color(204, 255, 255));
        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        LoginPanel.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, -1));

        PasswordText.setBackground(new java.awt.Color(255, 255, 255));
        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });
        LoginPanel.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, -1));

        SignInBtn.setBackground(new java.awt.Color(110, 110, 73));
        SignInBtn.setFont(new java.awt.Font("Encode Sans SemiBold", 0, 14)); // NOI18N
        SignInBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn.setText("Sign In");
        SignInBtn.setBorderPainted(false);
        SignInBtn.setFocusPainted(false);
        SignInBtn.setFocusable(false);
        SignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HoverMounseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HoverMouseExit(evt);
            }
        });
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        LoginPanel.add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, 30));

        success.setFont(new java.awt.Font("Encode Sans SemiBold", 0, 14)); // NOI18N
        success.setForeground(new java.awt.Color(102, 102, 0));
        LoginPanel.add(success, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        fail.setFont(new java.awt.Font("Encode Sans SemiBold", 0, 14)); // NOI18N
        fail.setForeground(new java.awt.Color(204, 0, 0));
        LoginPanel.add(fail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        getContentPane().add(LoginPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
        
        try{
            
            String user = UsernameText.getText();
            String password = PasswordText.getText();

            String[] adminData = FileManager.FiletoArray("admin.txt");

            
            if(user.equals(adminData[0])&& password.equals(adminData[1])){
                success.setText("Login successful!");
                fail.setText("");
                if (!success.getText().equals("")){
                        //pause 1 second before login
                        Timer timer = new Timer(1000, (ActionEvent e) -> {
                            try {
                                hotelroompage = new HotelRoomPage();
                            } catch (IOException ex) {
                                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        hotelroompage.setVisible(true);
                        this.dispose();
                    });
                    //make sure it only execute once
                    timer.setRepeats(false);
                    timer.start();
                }
                

            }else{
                UsernameText.setText("");
                PasswordText.setText("");
                success.setText("");
                fail.setText("Login failed! Please try again!");
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void HoverMounseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverMounseEnter
        SignInBtn.setBackground(new java.awt.Color(182, 159, 118));
    }//GEN-LAST:event_HoverMounseEnter

    private void HoverMouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoverMouseExit
        SignInBtn.setBackground(new java.awt.Color(110, 110, 73));
    }//GEN-LAST:event_HoverMouseExit

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private HotelRoomPage hotelroompage;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HotelName;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel fail;
    private javax.swing.JLabel success;
    // End of variables declaration//GEN-END:variables
}
