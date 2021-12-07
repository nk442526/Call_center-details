/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calldata;




import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha
 */
public class CallFrame extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement stmt=null;
            
    
    
    /**
     * Creates new form CallFrame
     */
    public CallFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        call_number = new javax.swing.JTextField();
        datetime2 = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        datetime1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("START_TIME");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("NUMBER");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("END_TIME");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("DURATION");

        call_number.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        call_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call_numberActionPerformed(evt);
            }
        });

        datetime2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        datetime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetime2ActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        duration.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("CALL CENTER DATA");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        datetime1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        datetime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetime1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 242, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datetime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(call_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datetime2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(call_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datetime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datetime2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(102, 102, 102)
                .addComponent(jButton1)
                .addGap(132, 132, 132))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void call_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_call_numberActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/call_details";
            String uname="root";
            String password="Neha@123";
            
            String query="INSERT into details values(?,?,?,?,?)";
            conn=DriverManager.getConnection(url,uname,password);
            stmt=conn.prepareStatement(query);
            stmt.setString(1,id.getText());
            stmt.setString(2,call_number.getText());
            stmt.setString(3,datetime1.getText());
            stmt.setString(4,datetime2.getText());
            stmt.setString(5,duration.getText());            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"CALL DATA SAVED");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datetime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetime2ActionPerformed

    private void datetime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetime1ActionPerformed

    
      
    /***\
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
             try {
             
             Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/call_details", "root", "Neha@123");
                Statement mystatement = con.createStatement();             
                /*ResultSet z=mystatement.executeQuery("select datetime1, max(abs(timestampdiff(minute,datetime1,datetime2))) as abc from details;");               
                while(z.next())
                {
                  System.out.println("Maximum "+" "+ z.getString("abc"));                  
                }
                */                    
                ResultSet y=mystatement.executeQuery("select HOUR(DATE_FORMAT(datetime1, '%H:%i:%s'))as exacttime1, HOUR(DATE_FORMAT(datetime2, '%H:%i:%s')) as exacttime2, max(duration) as xyz from details;");
                 while(y.next())
                {
                  System.out.println("Hour of the day when the calls are longest"+" "+y.getString("exacttime1")+"-"+y.getString("exacttime2"));
                }                  
                
                 
                ResultSet z=mystatement.executeQuery("select DATE_FORMAT(datetime1, '%Y-%m-%d')as exactdate1, max(duration) pqr from details ;");
                 while(z.next())
                {
                  System.out.println("Day of the week when the calls are longest"+" "+z.getString("exactdate1"));
                } 
                
                ResultSet a=mystatement.executeQuery("SELECT  HOUR(DATE_FORMAT(datetime1, '%H:%i:%s'))as time1, HOUR(DATE_FORMAT(datetime2, '%H:%i:%s'))as time2 , COUNT(*) FROM details GROUP BY HOUR(DATE_FORMAT(datetime1, '%H:%i:%s')), HOUR(DATE_FORMAT(datetime2, '%H:%i:%s'))  as lmn from details;");                
                while(a.next())
                {
                  System.out.println("Hour of the day when the call volumn is highest"+" "+a.getString("time1")+"-"+a.getString("time2"));                  
                }
                
               /* ResultSet b=mystatement.executeQuery("select  DATE_FORMAT(datetime1, '%H:%i:%s') OnlyYourtime, DATE_FORMAT(datetime2, '%H:%i:%s') OnlyYourtime ,max(abs(timestampdiff(minute,datetime1,datetime2)))  as abc from details;");                
                while(b.next())
                {
                  System.out.println("Day of the week when the call volumn is highest"+" "+ b.getString("abc"));                  
                }*/
            }   
            catch (Exception e){
               System.out.println(e);
             }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CallFrame().setVisible(true);
            }
        });
        

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField call_number;
    private javax.swing.JTextField datetime1;
    private javax.swing.JTextField datetime2;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
