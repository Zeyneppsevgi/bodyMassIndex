/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeynepsevgi
 */
public class Hesapla extends javax.swing.JFrame {

    /**
     * Creates new form Hesapla
     */
    public Hesapla() {
        initComponents();
        //getContentPane().getComponents().length();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_boy = new javax.swing.JLabel();
        lbl_kilo = new javax.swing.JLabel();
        txt_boy = new javax.swing.JTextField();
        txt_kilo = new javax.swing.JTextField();
        btn_hesapla = new javax.swing.JButton();
        lbl_aciklama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_boy.setText("Boy :");

        lbl_kilo.setText("Kilo :");

        btn_hesapla.setText("Hesapla");
        btn_hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hesaplaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_boy)
                            .addComponent(lbl_kilo))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_boy, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txt_kilo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_aciklama)
                            .addComponent(btn_hesapla))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_boy)
                    .addComponent(txt_boy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_kilo)
                    .addComponent(txt_kilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_hesapla)
                .addGap(56, 56, 56)
                .addComponent(lbl_aciklama)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hesaplaActionPerformed
        double kilo = Double.parseDouble(txt_kilo.getText());
        double boy = Double.parseDouble(txt_boy.getText());
        
      //  float boy = scan.nextFloat();
        //float kilo = scan.nextFloat();
        
        double bki = kilo / (boy*boy);
        lbl_aciklama.setText("Beden Kitle ??ndeksiniz = " + bki);
        
        if(bki <= 18) {
            lbl_aciklama.setText("Zay??f");
        }
        else if(bki>18 && bki <= 25) {
            lbl_aciklama.setText("Normal");
        }
        else if(bki>25 && bki <= 30) {
            lbl_aciklama.setText("Hafif ??i??man");
        }
        else if(bki>30 && bki <= 35) {
            lbl_aciklama.setText("Sisman");
        }
        else {
           lbl_aciklama.setText("Obez");
        }
        
        //double deger = kilo /boy;
        
        //if(deger > 2){
         //   lbl_aciklama.setText("zay??fs??n??z");
        //}else{
          //  lbl_aciklama.setText("??i??mans??n??z");
       // }
    }//GEN-LAST:event_btn_hesaplaActionPerformed

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
            java.util.logging.Logger.getLogger(Hesapla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hesapla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hesapla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hesapla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hesapla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hesapla;
    private javax.swing.JLabel lbl_aciklama;
    private javax.swing.JLabel lbl_boy;
    private javax.swing.JLabel lbl_kilo;
    private javax.swing.JTextField txt_boy;
    private javax.swing.JTextField txt_kilo;
    // End of variables declaration//GEN-END:variables
}
