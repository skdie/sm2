/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms2;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;   
import javax.swing.JFileChooser;
/**
 *
 * @author skdie
 */
public class staffEdit extends javax.swing.JFrame {
    String p,i;

    /**
     * Creates new form staffEdit
     */
    public staffEdit() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edit Staff");
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
           
                Connection con;
                PreparedStatement ps;
                ResultSet rs;
                Statement stmt;
                String path=("jdbc:mysql://localhost:3306/student");
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection(path,"root","");
                stmt=con.createStatement();
                ps=con.prepareStatement("Select * from `check`");
                rs=ps.executeQuery();    
                
                while(rs.next())
                {
                    p=rs.getString("id");
                    
                 //   JOptionPane.showMessageDialog(null, p+" "+i);
                  //  System.out.println(p+i);
                }
                                 
            }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Error" +E);

        }
        
         try
        {
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Statement stmt;
             String path=("jdbc:mysql://localhost:3306/student");
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(path,"root","");
            stmt=con.createStatement();
           // stmt=con.createStatement();
          ps=con.prepareStatement("SELECT * FROM `teacher` WHERE `id` LIKE '"+p+"' ") ;
           rs=ps.executeQuery();
          // JOptionPane.showMessageDialog(null, p+" ..."+i);
            
            
           while(rs.next())
         {
               
                   name.setText(rs.getString("name"));
                   id.setText(rs.getString("id"));
                   profession.setText(rs.getString("profession"));
                   address.setText(rs.getString("address"));
                   dob.setText(rs.getString("dob"));
                   contact.setText(rs.getString("contact"));
                   email.setText(rs.getString("email"));
                  
                   subject.setText(rs.getString("subject"));
                  
                                
            }
           
           if(profession.getText()!="Teacher")
           {
               System.out.println(profession.getText());
               subject.setEditable(false);
           }
            
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error "+e );
            
            System.out.println("error "+e);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        subject = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        qualification = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        profession = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miconMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miconMouseEntered(evt);
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

        jPanel3.setBackground(new java.awt.Color(242, 240, 230));

        jLabel3.setText("Staff ID");

        jLabel4.setText("Full name");

        jLabel5.setText("Address");

        jLabel6.setText("Date of birth");

        jLabel7.setText("Contact number");

        jLabel8.setText("Email");

        jLabel9.setText("Gender");

        jLabel10.setText("Preferred Subject");

        jLabel11.setText("Qualification");

        dob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobFocusLost(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SLC", "+2", "Bachelor", "Master", "Phd" }));

        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel12.setText("Edit Staff");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(address)
                            .addComponent(dob)
                            .addComponent(contact)
                            .addComponent(email)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 820, 480));

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms2/search_icon.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 43, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 820, 60));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 240, 30));

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
        NewJFrame aa=new NewJFrame();
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

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        
         try
        {
             Connection con;
            PreparedStatement ps;
            ResultSet rs;
            Statement stmt;
             String path=("jdbc:mysql://localhost:3306/student");
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(path,"root","");
            stmt=con.createStatement();
            System.out.println(p);
            stmt.executeUpdate("update `teacher` set `profession`='"+profession.getText()+"', `id`='"+id.getText()+"',`gender`= '"+gender.getSelectedItem()+"',`address`= '"+address.getText()+"',`dob`= '"+dob.getText()+"',`contact`= '"+contact.getText()+"',`email`= '"+email.getText()+"',`name`= '"+name.getText()+"',`subject`= '"+subject.getText()+"',`qualification`= '"+qualification.getSelectedItem()+"' where `id`='"+p+"' ");
            JOptionPane.showMessageDialog(null,"successful");
            staff_show aaaa=new staff_show();
            aaaa.setVisible(true);
            dispose();
        }
        catch(Exception e)
        {
            System.out.println("error "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusLost
        // TODO add your handling code here:
        if((dob.getText()).equals("")) {
            dob.setText("MM/DD/YYYY");
        }

    }//GEN-LAST:event_dobFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           mainwd a=new mainwd();
           dispose();
           a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobFocusGained
        // TODO add your handling code here:
        if((dob.getText().equals("MM/DD/YYYY")))
            dob.setText("");
            
    }//GEN-LAST:event_dobFocusGained

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
            java.util.logging.Logger.getLogger(staffEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton aicon;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dob;
    private javax.swing.JButton eicon;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton micon;
    private javax.swing.JTextField name;
    private javax.swing.JTextField profession;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JTextField search;
    private javax.swing.JTextField subject;
    private javax.swing.JButton uicon;
    // End of variables declaration//GEN-END:variables
}
