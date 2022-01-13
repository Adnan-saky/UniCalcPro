package Mainpackage;
import java.awt.Toolkit;

public class ErrorWindow extends javax.swing.JFrame {
    
    public ErrorWindow() {
        initComponents();
        
        //Setting the icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/AppIcons/erroricon.png")));
        //Setting the popup Error window in the middle of the screen
        setLocationRelativeTo(null);
        
    }
    //A function for disposing the window after clicking close button
    public void closeWindow(){
        setVisible(false);
        dispose();
    }
    
    //A function for setting Error message in the Error Window
    public void setErrorText(String str){
        ErrorTextField.setText(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ErrorPanel = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        ErrorTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Error:404");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(500, 200));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setResizable(false);

        ErrorPanel.setBackground(new java.awt.Color(238, 238, 238));
        ErrorPanel.setMaximumSize(new java.awt.Dimension(500, 200));
        ErrorPanel.setMinimumSize(new java.awt.Dimension(500, 200));
        ErrorPanel.setLayout(null);

        CloseButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        ErrorPanel.add(CloseButton);
        CloseButton.setBounds(210, 140, 80, 25);

        ErrorTextField.setEditable(false);
        ErrorTextField.setBackground(new java.awt.Color(238, 238, 238));
        ErrorTextField.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        ErrorTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ErrorTextField.setBorder(null);
        ErrorPanel.add(ErrorTextField);
        ErrorTextField.setBounds(0, 60, 500, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        //action performed after ckicking the close button
        closeWindow();
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErrorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ErrorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel ErrorPanel;
    private javax.swing.JTextField ErrorTextField;
    // End of variables declaration//GEN-END:variables
}
