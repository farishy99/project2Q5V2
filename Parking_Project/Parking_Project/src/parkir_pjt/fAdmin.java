/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir_pjt;


import parkir_pjt.UserID;
import parkir_pjt.utama;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class fAdmin extends javax.swing.JFrame {

    private static class Controller {

        public Controller() {
        }
    }
    private Connection Con;
    private Statement stm;

    /**
     * Creates new form formlogin
     */
    public fAdmin() {
        initComponents();
        open_db();
    setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Edito    r.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24.png"))); // NOI18N
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });
        getContentPane().add(btok, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 163, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2sa.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 314, -1, -1));

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuserKeyReleased(evt);
            }
        });
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 267, 40));

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 267, 38));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gs.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dsa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 268, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
cari_user();// TODO add your handling code here:
    }//GEN-LAST:event_btokActionPerformed

    private void txtuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyReleased
        // TODO add your handling code here:
         if (evt.getKeyCode() == 10){
     txtpass.requestFocus();}
    }//GEN-LAST:event_txtuserKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
         if (evt.getKeyCode() == 10){
     btok.doClick();}
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new fAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

    private void open_db() {
         try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_parkir","root","");
            stm = Con.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }

    private void cari_user() {
        try{
        open_db();
        String sql =  "Select * from user where username='"+txtuser.getText()+"' and password='" + txtpass.getText() + "'";
        stm =   Con.createStatement();
        ResultSet RUser = stm.executeQuery(sql);
        if (RUser.next())
        {
        JOptionPane.showMessageDialog(null, "Access diterima, anda login sebagai: "+txtuser.getText()+"","Informasi",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        utama utama = new utama();
        utama.setVisible(true);
        UserID.setUserLogin(txtuser.getText());
         } 
        else {
        JOptionPane.showMessageDialog(null, "Access Di Tolak! Periksa User ID dan Password Anda!","Peringatan",JOptionPane.WARNING_MESSAGE);}
        }catch (Exception e){}
        
        txtuser.setText("");
        txtpass.setText("");
        txtuser.requestFocus();
       
    }
}
    
    











