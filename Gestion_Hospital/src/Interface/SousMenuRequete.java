/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Florian
 */
public class SousMenuRequete extends javax.swing.JFrame {

    /**
     * Creates new form SousMenuRequete
     */
    public SousMenuRequete() {
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

        SousMenuReq = new javax.swing.JLabel();
        ListeDeroulanteRequete = new javax.swing.JComboBox();
        BoutonOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultReq = new javax.swing.JTextArea();
        BoutonNouvelleRecherche = new javax.swing.JButton();
        BoutonRetourRecherche = new javax.swing.JButton();
        BoutonRetourPrinc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SousMenuReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SousMenuReq.setText("Sous Menu requête");
        SousMenuReq.setPreferredSize(new java.awt.Dimension(336, 84));

        ListeDeroulanteRequete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListeDeroulanteRequete.setPreferredSize(new java.awt.Dimension(420, 42));

        BoutonOk.setText("OK");
        BoutonOk.setPreferredSize(new java.awt.Dimension(49, 42));

        ResultReq.setColumns(20);
        ResultReq.setRows(5);
        ResultReq.setPreferredSize(new java.awt.Dimension(980, 400));
        jScrollPane1.setViewportView(ResultReq);

        BoutonNouvelleRecherche.setText("Nouvelle recherche");
        BoutonNouvelleRecherche.setPreferredSize(new java.awt.Dimension(168, 30));

        BoutonRetourRecherche.setText("Retour Menu recherche");
        BoutonRetourRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourRechercheActionPerformed(evt);
            }
        });

        BoutonRetourPrinc.setText("Retour menu principal");
        BoutonRetourPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourPrincActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(381, 381, 381)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(SousMenuReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ListeDeroulanteRequete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(BoutonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BoutonNouvelleRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(BoutonRetourRecherche)
                            .addGap(7, 7, 7)
                            .addComponent(BoutonRetourPrinc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BoutonNouvelleRecherche, BoutonRetourPrinc, BoutonRetourRecherche});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SousMenuReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListeDeroulanteRequete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonNouvelleRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonRetourRecherche)
                    .addComponent(BoutonRetourPrinc))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BoutonOk, ListeDeroulanteRequete});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BoutonNouvelleRecherche, BoutonRetourPrinc, BoutonRetourRecherche});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonRetourRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonRetourRechercheActionPerformed

    private void BoutonRetourPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonRetourPrincActionPerformed

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
            java.util.logging.Logger.getLogger(SousMenuRequete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SousMenuRequete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SousMenuRequete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SousMenuRequete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SousMenuRequete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonNouvelleRecherche;
    private javax.swing.JButton BoutonOk;
    private javax.swing.JButton BoutonRetourPrinc;
    private javax.swing.JButton BoutonRetourRecherche;
    private javax.swing.JComboBox ListeDeroulanteRequete;
    private javax.swing.JTextArea ResultReq;
    private javax.swing.JLabel SousMenuReq;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
