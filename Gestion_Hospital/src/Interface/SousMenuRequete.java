/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Connexion_Transformation.Question_reponse;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JPanel;
import jdbc2014.Connexion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Florian
 */
public class SousMenuRequete extends javax.swing.JFrame {

    /**
     * Creates new form SousMenuRequete
     */
    /*private  String LoginECE;
    private  String PasswordECE;
    private  String LoginBDD;
    private  String PasswordBDD;*/
    
   private String LoginECE;
   private String PasswordECE;
   private String LoginBDD;
   private String PasswordBDD;
   private Connexion connect;
    
    public SousMenuRequete(String LoginECE, String PasswordECE, String LoginBDD, String PasswordBDD)  {
        
        this.LoginECE = LoginECE;
        this.PasswordECE = PasswordECE;
        this.LoginBDD= LoginBDD;
        this.PasswordBDD = PasswordBDD;
          try {
            connect = new Connexion(LoginECE, PasswordECE, LoginBDD, PasswordBDD);
        } catch (SQLException ex) { 
           Logger.getLogger(SousMenuRequete.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(SousMenuRequete.class.getName()).log(Level.SEVERE, null, ex);
       } 
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
        BoutonNouvelleRecherche = new javax.swing.JButton();
        BoutonRetourPrinc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SousMenuReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SousMenuReq.setText("Sous Menu requête");
        SousMenuReq.setPreferredSize(new java.awt.Dimension(336, 84));

        ListeDeroulanteRequete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mutuelles des malades", "Spécialisation des médecins" }));
        ListeDeroulanteRequete.setPreferredSize(new java.awt.Dimension(420, 42));

        BoutonOk.setText("OK");
        BoutonOk.setPreferredSize(new java.awt.Dimension(49, 42));

        BoutonNouvelleRecherche.setText("Créer Chart");
        BoutonNouvelleRecherche.setPreferredSize(new java.awt.Dimension(168, 30));
        BoutonNouvelleRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonNouvelleRechercheActionPerformed(evt);
            }
        });

        BoutonRetourPrinc.setText("Retour menu principal");
        BoutonRetourPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourPrincActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

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
                            .addGap(182, 182, 182)
                            .addComponent(BoutonRetourPrinc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BoutonNouvelleRecherche, BoutonRetourPrinc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SousMenuReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListeDeroulanteRequete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonNouvelleRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonRetourPrinc))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BoutonOk, ListeDeroulanteRequete});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BoutonNouvelleRecherche, BoutonRetourPrinc});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonRetourPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourPrincActionPerformed
        // TODO add your handling code here:
         this.dispose();
        Menu_principal menu_princ = new Menu_principal(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        menu_princ.setVisible(true);
           try {    
            connect.Disconnect();
        } catch (Throwable ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }        
          
       
    }//GEN-LAST:event_BoutonRetourPrincActionPerformed

    private void BoutonNouvelleRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonNouvelleRechercheActionPerformed
        // TODO add your handling code here:        
        ArrayList<String> reponse;
        int[] resultat;
        Question_reponse trf = new Question_reponse();
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        String intitule_requete;
        
        //pour la requête 1
        if(ListeDeroulanteRequete.getSelectedIndex()==0){
            intitule_requete=ListeDeroulanteRequete.getSelectedItem().toString();
            //requête sur la BD
            System.out.println(LoginECE+" "+PasswordECE+" "+LoginBDD+" "+ PasswordECE+" ");
            reponse = trf.methodechiante(LoginECE,PasswordECE,LoginBDD,PasswordECE,
                    "select mutuelle from malade ");
            

            ArrayList<String> dif_mutuelle = new ArrayList<String>();
         
            //on trouve les différentes mutuelles
           
            for(String s:reponse){
                    for(int i=0;i<dif_mutuelle.size();i++)
                    {
                        if(s.equals(dif_mutuelle.get(i)))System.out.println(s);
                        else
                            dif_mutuelle.add(s);
                    }
            }
            //on associe le nombre de personne à chaque mutuelle
            resultat = new int[dif_mutuelle.size()];
            for(String s:reponse){
                for(int i=0;i<dif_mutuelle.size();i++){
                    if(s.equals(dif_mutuelle.get(i)))
                        resultat[i]++;
                }
            }
            
            //création de la base du graph
            for(int i=0;i<dif_mutuelle.size();i++){
                pieDataset.setValue(dif_mutuelle.get(i), new Integer(resultat[i]));
            }

        }
        //pour la requête 2
        else
        {
            reponse = trf.methodechiante(LoginECE,PasswordECE,LoginBDD,PasswordBDD,
                    "select specialite from docteur");
            intitule_requete=ListeDeroulanteRequete.getSelectedItem().toString();
            ArrayList<String> dif_spe = null;
            dif_spe.add(reponse.get(0));
            //on trouve les différentes mutuelles
            for(String s:reponse){
                    for(int i=1;i<dif_spe.size();i++)
                    {
                        if(s.equals(dif_spe.get(i)));
                        else
                            dif_spe.add(s);
                    }
            }
            //on associe le nombre de personne à chaque mutuelle
            resultat = new int[dif_spe.size()];
            for(String s:reponse){
                for(int i=0;i<dif_spe.size();i++){
                    if(s.equals(dif_spe.get(i)))
                        resultat[i]++;
                }
            }
            
            //création de la base du graph
            for(int i=0;i<dif_spe.size();i++){
                pieDataset.setValue(dif_spe.get(i), new Integer(resultat[i]));
            }
        }

        /* pieDataset.setValue("Valeur1", new Integer(27));
        pieDataset.setValue("Valeur2", new Integer(10));
        pieDataset.setValue("Valeur3", new Integer(50));
        pieDataset.setValue("Valeur4", new Integer(5));*/
        //affichage du graph
        JFreeChart pieChart = ChartFactory.createPieChart(intitule_requete,pieDataset, true, true, true);
        ChartPanel cPanel = new ChartPanel(pieChart);
        cPanel.setSize(jPanel1.getWidth(), jPanel1.getHeight());
        cPanel.setVisible(true);
        jPanel1.add(cPanel);
        jPanel1.repaint();

    }//GEN-LAST:event_BoutonNouvelleRechercheActionPerformed

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
                new SousMenuRequete("ducrocq","KlrIT05A@","ducrocq-rw","KlrIT05A@").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonNouvelleRecherche;
    private javax.swing.JButton BoutonOk;
    private javax.swing.JButton BoutonRetourPrinc;
    private javax.swing.JComboBox ListeDeroulanteRequete;
    private javax.swing.JLabel SousMenuReq;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
