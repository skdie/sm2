/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms2;
import java.awt.Image;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author skdie
 */
public class search_wd2 extends javax.swing.JFrame {

    /**
     * Creates new form search_wd2
     */
    public search_wd2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Search Staff");
         micon.setOpaque(false);
        micon.setContentAreaFilled(false);
        micon.setBorderPainted(false);
        aicon.setOpaque(false);
        aicon.setContentAreaFilled(false);
        aicon.setBorderPainted(false);
        uicon.setOpaque(false);
        uicon.setContentAreaFilled(false);
        uicon.setBorderPainted(false);
       
        eicon.setOpaque(false);
        eicon.setContentAreaFilled(false);
        eicon.setBorderPainted(false);
         try{
            //JOptionPane.showConfirmDialog(null,"executed");
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Statement stmt;
            String path=("jdbc:mysql://localhost:3306/student");
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(path,"root","");
            stmt=con.createStatement();
            stmt.executeUpdate("truncate `search`");
            
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Error" +e);
             
         }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        micon = new javax.swing.JButton();
        aicon = new javax.swing.JButton();
        uicon = new javax.swing.JButton();
        eicon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        select = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        srch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        micon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/icon123.png"))); // NOI18N
        micon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                miconFocusGained(evt);
            }
        });
        micon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miconMouseExited(evt);
            }
        });
        micon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miconActionPerformed(evt);
            }
        });
        jPanel1.add(micon, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 100, 47, 40));

        aicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/icon212.png"))); // NOI18N
        aicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aiconMouseExited(evt);
            }
        });
        aicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiconActionPerformed(evt);
            }
        });
        jPanel1.add(aicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 50, 40));

        uicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/icon3.png"))); // NOI18N
        uicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uiconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uiconMouseExited(evt);
            }
        });
        jPanel1.add(uicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 50, 40));

        eicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/icon5.png"))); // NOI18N
        eicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eiconMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eiconMouseEntered(evt);
            }
        });
        eicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eiconActionPerformed(evt);
            }
        });
        jPanel1.add(eicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 540));

        jPanel2.setBackground(new java.awt.Color(218, 232, 202));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 43, -1));

        search.setBackground(new java.awt.Color(218, 232, 202));
        search.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        search.setText("Search Student Full Name");
        search.setBorder(null);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 28, 230, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 240, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/search_icon.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 43, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 820, 60));

        jPanel3.setBackground(new java.awt.Color(242, 240, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "profession", "id", "name" }));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 42, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/srch.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 636, -1));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel3.setText("Search for");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 33, 110, 43));

        jButton1.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 40));

        srch.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel3.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 820, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miconFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_miconFocusGained
        // TODO add your handling code here:
        //   micon.setBackground(Color.GRAY);
    }//GEN-LAST:event_miconFocusGained

    private void miconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miconMouseEntered
        // TODO add your handling code here:
        //  micon.setBackground(Color.GRAY);
        try {
            Image img = ImageIO.read(getClass().getResource("icon10.png"));
            micon.setIcon(new ImageIcon(img));
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_miconMouseEntered

    private void miconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miconMouseExited
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon123.png"));
            micon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_miconMouseExited

    private void miconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miconActionPerformed
        // TODO add your handling code here:
        mainwd aa=new mainwd();
        aa.setVisible(true);
        dispose();
    }//GEN-LAST:event_miconActionPerformed

    private void aiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aiconMouseEntered
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon13.png"));
            aicon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_aiconMouseEntered

    private void aiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aiconMouseExited
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon212.png"));
            aicon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_aiconMouseExited

    private void aiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiconActionPerformed
        // TODO add your handling code here:
        mainwd aa=new mainwd();
        aa.setVisible(true);
        dispose();
    }//GEN-LAST:event_aiconActionPerformed

    private void uiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uiconMouseEntered
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon9.png"));
            uicon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

    }//GEN-LAST:event_uiconMouseEntered

    private void uiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uiconMouseExited
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon3.png"));
            uicon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_uiconMouseExited

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        String a=(String)select.getSelectedItem();
        String b=srch.getText();
        System.out.println(b);

        try{

            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Statement stmt;
            String path=("jdbc:mysql://localhost:3306/student");
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(path,"root","");
            stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO `search` (`prefer`, `item`) VALUES ('"+a+"', '"+b+"')");
            JOptionPane.showMessageDialog(null,"executed");
            searchshow2 aa=new searchshow2();
            aa.setVisible(true);
            dispose();

        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Error" +E);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchActionPerformed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        // TODO add your handling code here:
        if(search.getText().equals("Search Student Full Name"))
        search.setText("");
    }//GEN-LAST:event_searchMousePressed

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
        //search.setText("Search");
        if(search.getText().equals(""))
        search.setText("Search Student Full Name");
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseEntered

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String a ="name";
        String b=search.getText();
        System.out.println(b);

        try{

            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Statement stmt;
            String path=("jdbc:mysql://localhost:3306/student");
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(path,"root","");
            stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO `search` (`prefer`, `item`) VALUES ('"+a+"', '"+b+"')");
            JOptionPane.showMessageDialog(null,"executed from main");
            searchshow aaa=new searchshow();
            aaa.setVisible(true);
            dispose();

        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Error" +E);

        }
        searchshow aa=new searchshow();
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        if(search.getText().equals("Search Student Full Name"))
        search.setText("");
    }//GEN-LAST:event_searchKeyPressed

    private void eiconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eiconMouseExited
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon5.png"));
            eicon.setIcon(new ImageIcon(img));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_eiconMouseExited

    private void eiconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eiconMouseEntered
        // TODO add your handling code here:
        try {
            Image img = ImageIO.read(getClass().getResource("icon7.png"));
            eicon.setIcon(new ImageIcon(img));
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_eiconMouseEntered

    private void eiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eiconActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_eiconActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search_wd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_wd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_wd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_wd2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_wd2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aicon;
    private javax.swing.JButton eicon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton micon;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JTextField srch;
    private javax.swing.JButton uicon;
    // End of variables declaration//GEN-END:variables
}
