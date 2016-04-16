
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class LoginForm extends javax.swing.JFrame {

     public String Username;
     public   String Password;
    public LoginForm() {
        initComponents();
        ButtonGroup obj=new ButtonGroup();
        obj.add(rbn_Male);
        obj.add(rbn_Female);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tv_Email = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        rbn_Male = new javax.swing.JRadioButton();
        rbn_Female = new javax.swing.JRadioButton();
        tv_User = new javax.swing.JTextField();
        tv_password = new javax.swing.JPasswordField();
        tv_Name = new javax.swing.JTextField();
        lb_Name = new javax.swing.JLabel();
        lb_Email = new javax.swing.JLabel();
        lb_User = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_Birthday = new javax.swing.JLabel();
        lb_Gender = new javax.swing.JLabel();
        lb_country = new javax.swing.JLabel();
        cmb_Country = new javax.swing.JComboBox();
        tv_Birthday = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Model = new javax.swing.JTable();
        lbMessg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tv_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tv_EmailActionPerformed(evt);
            }
        });

        btn_Login.setText("Log In");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        rbn_Male.setText("Male");
        rbn_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_MaleActionPerformed(evt);
            }
        });

        rbn_Female.setText("Female");
        rbn_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn_FemaleActionPerformed(evt);
            }
        });

        tv_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tv_UserActionPerformed(evt);
            }
        });

        tv_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tv_passwordActionPerformed(evt);
            }
        });

        lb_Name.setText("Name");

        lb_Email.setText("Email");

        lb_User.setText("User Name");

        lb_password.setText("Password");

        lb_Birthday.setText("Birthday");

        lb_Gender.setText("Gender");

        lb_country.setText("Country");

        cmb_Country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Country", "Bangladesh", "India", "Srilanka", "Pakistan", "Nepal", "Maldip" }));

        Table_Model.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "User Name", "Password", "Birthday", "Gender", "Country"
            }
        ));
        jScrollPane1.setViewportView(Table_Model);

        lbMessg.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbMessg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_signup)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_Birthday)
                                            .addComponent(lb_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_country))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lb_User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(33, 33, 33))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tv_Birthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tv_password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_Country, 0, 203, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tv_User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(rbn_Male)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbn_Female)
                                        .addGap(17, 17, 17))
                                    .addComponent(tv_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tv_Email, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(lbMessg, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tv_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Name))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Email)
                            .addComponent(tv_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_User)
                            .addComponent(tv_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_password)
                            .addComponent(tv_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_Birthday)
                            .addComponent(tv_Birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbn_Male)
                            .addComponent(lb_Gender)
                            .addComponent(rbn_Female))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_country))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Login)
                            .addComponent(btn_signup))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbMessg, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed

        SignupPage ob=new SignupPage(Username,Password);
        ob.setVisible(true);
        this.setVisible(false);
            
        
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void tv_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tv_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tv_EmailActionPerformed

    private void rbn_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbn_MaleActionPerformed

    private void rbn_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbn_FemaleActionPerformed
      
    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
       Username=tv_User.getText();
       Password=tv_password.getText();
        DefaultTableModel model= (DefaultTableModel) Table_Model.getModel();
       if(rbn_Male.isSelected())
       {
         model.addRow(new Object[]{
        tv_Name.getText(),tv_Email.getText(),tv_User.getText(),tv_password.getText(),
       tv_Birthday.getDate(),rbn_Male.getText(),cmb_Country.getSelectedItem()});
       }
       if(rbn_Female.isSelected())
       {
         model.addRow(new Object[]{
        tv_Name.getText(),tv_Email.getText(),tv_User.getText(),tv_password.getText() ,
        tv_Birthday.getDate(),rbn_Female.getText(),cmb_Country.getSelectedItem(),});
       }
       else
       {
           lbMessg.setText(" THE FROM MUST BE FILLUP FAST ");
       }
       
        
       
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void tv_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tv_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tv_UserActionPerformed

    private void tv_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tv_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tv_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LoginForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Model;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmb_Country;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMessg;
    private javax.swing.JLabel lb_Birthday;
    private javax.swing.JLabel lb_Email;
    private javax.swing.JLabel lb_Gender;
    private javax.swing.JLabel lb_Name;
    private javax.swing.JLabel lb_User;
    private javax.swing.JLabel lb_country;
    private javax.swing.JLabel lb_password;
    private javax.swing.JRadioButton rbn_Female;
    private javax.swing.JRadioButton rbn_Male;
    private com.toedter.calendar.JDateChooser tv_Birthday;
    private javax.swing.JTextField tv_Email;
    private javax.swing.JTextField tv_Name;
    private javax.swing.JTextField tv_User;
    private javax.swing.JPasswordField tv_password;
    // End of variables declaration//GEN-END:variables
}
