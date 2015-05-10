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
public class MenuRecherche extends javax.swing.JFrame {

    /**
     * Creates new form MenuRecherche
     * 
     * 
     * 
     */
    
    private  String LoginECE;
    private  String PasswordECE;
    private  String LoginBDD;
    private  String PasswordBDD;
    

  
    public MenuRecherche(String LoginECE, String PasswordECE, String LoginBDD, String PasswordBDD)
    {
        
        this.LoginECE = LoginECE;
        this.PasswordECE = PasswordECE;
        this.LoginBDD= LoginBDD;
        this.PasswordBDD = PasswordBDD;
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

        Recherche = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BoutonTri = new javax.swing.JButton();
        BoutonReporting = new javax.swing.JButton();
        BoutonRetourMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Recherche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recherche.setText("Recherche");
        Recherche.setPreferredSize(new java.awt.Dimension(336, 84));

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 140));

        BoutonTri.setText("Tri Requete");
        BoutonTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonTriActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonTri);

        BoutonReporting.setText("Reporting");
        BoutonReporting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoutonReporting.setPreferredSize(new java.awt.Dimension(168, 42));
        BoutonReporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonReportingActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonReporting);

        BoutonRetourMenu.setText("Retour menu");
        BoutonRetourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonRetourMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonRetourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourMenuActionPerformed
        // TODO add your handling code here:
        System.out.println("PETIT FDP TU VAS MARCHER");
        this.dispose();
        Menu_principal menu_princ = new Menu_principal(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        menu_princ.setVisible(true);
    }//GEN-LAST:event_BoutonRetourMenuActionPerformed

    private void BoutonReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonReportingActionPerformed
        // TODO add your handling code here:
        System.out.println("PETIT FDP TU VAS MARCHER");
        this.dispose();
        SousMenuRequete sous_menu_requete = new SousMenuRequete(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        sous_menu_requete.setVisible(true);
    }//GEN-LAST:event_BoutonReportingActionPerformed

    private void BoutonTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonTriActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SousMenutri sous_menu_tri = new SousMenutri(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        sous_menu_tri.setVisible(true);
        
    }//GEN-LAST:event_BoutonTriActionPerformed


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
                new MenuRecherche("a","b","c","d").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonReporting;
    private javax.swing.JButton BoutonRetourMenu;
    private javax.swing.JButton BoutonTri;
    private javax.swing.JLabel Recherche;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
