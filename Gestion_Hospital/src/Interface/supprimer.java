/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2014.Connexion;
import Mise_a_jour.*;

/**
 *
 * @author Lisa
 */
public class supprimer extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ajouter
     */
    private  String LoginECE;
    private  String PasswordECE;
    private  String LoginBDD;
    private  String PasswordBDD;
    
    
    public supprimer(String nomECE, String mdpECE, String nomBDD, String mdpBDD) throws SQLException {
        initComponents();
         this.LoginECE = nomECE;
         this.PasswordECE = mdpECE;
         this.LoginBDD= nomBDD;
         this.PasswordBDD = mdpBDD;
        this.table.addActionListener(this);
        this.suppr.addActionListener(this);
        this.a1.setVisible(false);
        this.a2.setVisible(false);
        this.a3.setVisible(false);
        this.a4.setVisible(false);
        this.a5.setVisible(false);
        this.a6.setVisible(false);
        this.p1.setVisible(false);
        this.p2.setVisible(false);
        this.p3.setVisible(false);
        this.p4.setVisible(false);
        this.p5.setVisible(false);
        this.p6.setVisible(false);

        try {
            connect = new Connexion(nomECE, mdpECE, nomBDD, mdpBDD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setVisible(true);
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
        table = new javax.swing.JComboBox();
        suppr = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        BoutonRetourPrinc = new javax.swing.JButton();
        BoutonRetourMaj = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a2 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        p3 = new javax.swing.JTextField();
        a3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        p4 = new javax.swing.JTextField();
        a4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        p5 = new javax.swing.JTextField();
        a5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        p6 = new javax.swing.JTextField();
        a6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mise à jour de la base - ajout");
        jLabel1.setAutoscrolls(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(168, 42));

        table.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "chambre", "docteur", "employe", "generique", "infirmier", "malade", "service" }));
        table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableActionPerformed(evt);
            }
        });

        suppr.setText("supprimer");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Saisir les champs à supprimer");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BoutonRetourPrinc.setText("Menu Principal");
        BoutonRetourPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourPrincActionPerformed(evt);
            }
        });

        BoutonRetourMaj.setText("Menu Maj");
        BoutonRetourMaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourMajActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 84));

        p1.setText("jTextField2");

        a1.setText("Champ1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 84));

        a2.setText("Champ 2");

        p2.setText("jTextField2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 84));

        p3.setText("jTextField2");

        a3.setText("Champ 3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p3)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 84));

        p4.setText("jTextField2");

        a4.setText("Champ 4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(200, 84));

        p5.setText("jTextField2");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        a5.setText("Champ 5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(a5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(200, 84));

        p6.setText("jTextField2");

        a6.setText("Champ 6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p6)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suppr, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(table, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BoutonRetourMaj)
                .addGap(235, 235, 235)
                .addComponent(BoutonRetourPrinc)
                .addGap(329, 329, 329))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BoutonRetourMaj, BoutonRetourPrinc, suppr, table});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(suppr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonRetourMaj)
                    .addComponent(BoutonRetourPrinc))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BoutonRetourMaj, BoutonRetourPrinc, suppr, table});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5ActionPerformed

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

    private void BoutonRetourMajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourMajActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Mise_a_jour mise_a_jour =  new Mise_a_jour(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        mise_a_jour.setVisible(true);
        try {
            connect.Disconnect();
        } catch (Throwable ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BoutonRetourMajActionPerformed

    private Connexion connect;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonRetourMaj;
    private javax.swing.JButton BoutonRetourPrinc;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JButton suppr;
    private javax.swing.JComboBox table;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String requete = "DELETE FROM ", mot = null, mots;
        ArrayList<String> champs = null, resultat = null;
        String[] tab;
        char a[];
        suppr supprimer = new suppr();

        try {
            champs = connect.remplirChampsTable((String) table.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            resultat = connect.remplirChampsRequete("SELECT * FROM " + (String) table.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }
            mots="Vérification:\n";

            
            mots=mots+champs.toString()+"\n";
            
           
            mots=mots+resultat.toString()+"\n";
            
            
            a=mots.toCharArray();
            
            for(int i=0; i<a.length; i++)
            {
                if(a[i]==',' || a[i]=='[' || a[i]==']' || a[i]==';')
                {
                     mot=mots+a[i];
                     mot=mot.substring(0, mot.length()-1);
                     mot=mot+" ";
                }else mot=mots+a[i];
            }
            

        jTextArea1.setText(mot);

        for (int i = 0; i < champs.size(); i++) {
            if (i == 0) {
                a1.setText(champs.get(i));
                this.a1.setVisible(true);
                this.p1.setVisible(true);
            } else if (i == 1) {
                a2.setText(champs.get(i));
                this.a2.setVisible(true);
                this.p2.setVisible(true);
            } else if (i == 2) {
                a3.setText(champs.get(i));
                this.a3.setVisible(true);
                this.p3.setVisible(true);
            } else if (i == 3) {
                a4.setText(champs.get(i));
                this.a4.setVisible(true);
                this.p4.setVisible(true);
            } else if (i == 4) {
                a5.setText(champs.get(i));
                this.a5.setVisible(true);
                this.p5.setVisible(true);
            } else if (i == 5) {
                a6.setText(champs.get(i));
                this.a6.setVisible(true);
                this.p6.setVisible(true);
            }
        }

        requete = requete + (String) table.getSelectedItem() + " WHERE ";

        try {
            champs = connect.remplirChampsTable((String) table.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(supprimer.class.getName()).log(Level.SEVERE, null, ex);
        }

        

        if (e.getSource() == suppr) {

            for (int i = 0; i < champs.size(); i++) {
                requete = requete + champs.get(i) + "=";
                if (i == 0) {
                    mot = p1.getText();
                } else if (i == 1) {
                    mot = p2.getText();
                } else if (i == 2) {
                    mot = p3.getText();
                } else if (i == 3) {
                    mot = p4.getText();
                } else if (i == 4) {
                    mot = p5.getText();
                } else if (i == 5) {
                    mot = p6.getText();
                }
                if(i != (champs.size()-1))
                {
                requete = requete + "'" + mot + "' AND ";
                }else requete = requete + "'" + mot + "'";
            }

            requete = requete + ";";
            try {
                supprimer.suppr((String) table.getSelectedItem(), requete, connect);
            } catch (SQLException ex) {
                Logger.getLogger(supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(requete);
            try {
                resultat = connect.remplirChampsRequete("SELECT * FROM " + (String) table.getSelectedItem());
            } catch (SQLException ex) {
                Logger.getLogger(supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }

            mots="Vérification:\n";

            
            mots=mots+champs.toString()+"\n";
            
           
            mots=mots+resultat.toString()+"\n";
            
            
            a=mots.toCharArray();
            
            for(int i=0; i<a.length; i++)
            {
                if(a[i]==',' || a[i]=='[' || a[i]==']' || a[i]==';')
                {
                     mot=mots+a[i];
                     mot=mot.substring(0, mot.length()-1);
                     mot=mot+" ";
                }else mot=mots+a[i];
            }
            

            jTextArea1.setText(mot);

        }
    }
}
