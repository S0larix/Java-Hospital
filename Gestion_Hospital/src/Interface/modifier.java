/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Mise_a_jour.modif;
import Mise_a_jour.suppr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2014.*;
import jdbc2014.Connexion;

/**
 *
 * @author Lisa
 */
public class modifier extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ajouter
     */
    public modifier(String nomECE, String mdpECE, String nomBDD, String mdpBDD) throws SQLException {
        initComponents();
        this.table.addActionListener(this);
        this.modif2.addActionListener(this);
        this.aa.addActionListener(this);
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
        this.aa.addActionListener(this);
        this.pa1.setVisible(false);
        this.pa2.setVisible(false);
        this.pa3.setVisible(false);
        this.pa4.setVisible(false);
        this.pa5.setVisible(false);
        this.pa6.setVisible(false);
        this.pm1.setVisible(false);
        this.pm2.setVisible(false);
        this.pm3.setVisible(false);
        this.pm4.setVisible(false);
        this.pm5.setVisible(false);
        this.pm6.setVisible(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        modifi = new javax.swing.JTextArea();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        p4 = new javax.swing.JTextField();
        p5 = new javax.swing.JTextField();
        p6 = new javax.swing.JTextField();
        modif2 = new javax.swing.JButton();
        m = new javax.swing.JLabel();
        aa = new javax.swing.JToggleButton();
        pa1 = new javax.swing.JTextField();
        pa2 = new javax.swing.JTextField();
        pa3 = new javax.swing.JTextField();
        pa4 = new javax.swing.JTextField();
        pa5 = new javax.swing.JTextField();
        pa6 = new javax.swing.JTextField();
        pm1 = new javax.swing.JLabel();
        pm2 = new javax.swing.JLabel();
        pm3 = new javax.swing.JLabel();
        pm4 = new javax.swing.JLabel();
        pm5 = new javax.swing.JLabel();
        pm6 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mise à jour de la base - modifiacation");
        jLabel1.setAutoscrolls(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(336, 84));

        table.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "chambre", "docteur", "hospitalisation", "infirmier", "malade", "personne", "service" }));
        table.setPreferredSize(new java.awt.Dimension(414, 42));

        modifi.setColumns(20);
        modifi.setRows(5);
        jScrollPane1.setViewportView(modifi);

        a1.setText("jLabel2");

        a2.setText("jLabel2");

        a3.setText("jLabel2");

        a4.setText("jLabel2");

        a5.setText("jLabel2");

        a6.setText("jLabel2");

        p1.setText("jTextField1");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.setText("jTextField1");

        p3.setText("jTextField1");

        p4.setText("jTextField1");

        p5.setText("jTextField1");

        p6.setText("jTextField1");

        modif2.setText("Modifier");

        m.setText("Entitéà modifier");

        aa.setText("Entité à modifier");

        pa1.setText("jTextField1");

        pa2.setText("jTextField1");

        pa3.setText("jTextField1");

        pa4.setText("jTextField1");

        pa5.setText("jTextField1");

        pa6.setText("jTextField1");

        pm1.setText("jLabel2");

        pm2.setText("jLabel3");

        pm3.setText("jLabel4");

        pm4.setText("jLabel5");

        pm5.setText("jLabel6");

        pm6.setText("jLabel7");

        m1.setText("Modification");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(a1)
                        .addGap(139, 139, 139)
                        .addComponent(a2)
                        .addGap(127, 127, 127)
                        .addComponent(a3)
                        .addGap(137, 137, 137)
                        .addComponent(pm1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(a4)
                        .addGap(143, 143, 143)
                        .addComponent(a5)
                        .addGap(130, 130, 130)
                        .addComponent(a6)
                        .addGap(134, 134, 134)
                        .addComponent(pm4)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pm3)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(pm5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pm6)
                        .addGap(129, 129, 129))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(aa, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(modif2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pa4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pa5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pa6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pa1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pa2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pa3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m)
                    .addComponent(m1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(pm1)
                    .addComponent(pm2)
                    .addComponent(pm3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2)
                    .addComponent(p3)
                    .addComponent(pa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a4)
                    .addComponent(a5)
                    .addComponent(a6)
                    .addComponent(pm4)
                    .addComponent(pm5)
                    .addComponent(pm6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(p5)
                    .addComponent(p6)
                    .addComponent(p4)
                    .addComponent(pa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(aa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modif2)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private Connexion connect;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JToggleButton aa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel m;
    private javax.swing.JLabel m1;
    private javax.swing.JButton modif2;
    private javax.swing.JTextArea modifi;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField pa1;
    private javax.swing.JTextField pa2;
    private javax.swing.JTextField pa3;
    private javax.swing.JTextField pa4;
    private javax.swing.JTextField pa5;
    private javax.swing.JTextField pa6;
    private javax.swing.JLabel pm1;
    private javax.swing.JLabel pm2;
    private javax.swing.JLabel pm3;
    private javax.swing.JLabel pm4;
    private javax.swing.JLabel pm5;
    private javax.swing.JLabel pm6;
    private javax.swing.JComboBox table;
    // End of variables declaration//GEN-END:variables
private String fin;
    private String requete;

    @Override
    public void actionPerformed(ActionEvent e) {
        String mot = "";
        ArrayList<String> champs = null, resultat = null;
        String[] tab;
        char a[];
        modif modifier = new modif();

        requete = "UPDATE " + (String) table.getSelectedItem() + " SET ";
        fin = " ";
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

        for (int i = 0; i < champs.size(); i++) {
            if (i == 0) {
                a1.setText(champs.get(i));
                this.a1.setVisible(true);
                this.p1.setVisible(true);
                pm1.setText(champs.get(i));
                this.pm1.setVisible(true);
                this.pa1.setVisible(true);
            } else if (i == 1) {
                a2.setText(champs.get(i));
                this.a2.setVisible(true);
                this.p2.setVisible(true);
                pm2.setText(champs.get(i));
                this.pm2.setVisible(true);
                this.pa2.setVisible(true);
            } else if (i == 2) {
                a3.setText(champs.get(i));
                this.a3.setVisible(true);
                this.p3.setVisible(true);
                pm3.setText(champs.get(i));
                this.pm3.setVisible(true);
                this.pa3.setVisible(true);
            } else if (i == 3) {
                a4.setText(champs.get(i));
                this.a4.setVisible(true);
                this.p4.setVisible(true);
                pm4.setText(champs.get(i));
                this.pm4.setVisible(true);
                this.pa4.setVisible(true);
            } else if (i == 4) {
                a5.setText(champs.get(i));
                this.a5.setVisible(true);
                this.p5.setVisible(true);
                pm5.setText(champs.get(i));
                this.pm5.setVisible(true);
                this.pa5.setVisible(true);
            } else if (i == 5) {
                a6.setText(champs.get(i));
                this.a6.setVisible(true);
                this.p6.setVisible(true);
                pm6.setText(champs.get(i));
                this.pm6.setVisible(true);
                this.pa6.setVisible(true);
            }
        }

        mot = "Modification:\n";

        mot = mot + champs.toString() + "\n";

        for (int i = 0; i < resultat.size(); i++) {
            mot = mot + resultat.toString() + "\n";
        }

        a = mot.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ',' || a[i] == '[' || a[i] == ']' || a[i] == ';') {
                a[i] = ' ';
            }
            mot = mot + a[i];
        }

        modifi.setText(mot);
        if (e.getSource() == aa) {
            m.setText("Saisir les nouvelles valeures");

            for (int i = 0; i < champs.size(); i++) {
                if (i == 0) {
                    mot =  champs.get(i).toString() + " = '" + pa1.getText();
                } else if (i == 1) {
                    mot = champs.get(i).toString() + " = '" + pa2.getText();
                } else if (i == 2) {
                    mot = champs.get(i).toString() + " = '" + pa3.getText();
                } else if (i == 3) {
                    mot = champs.get(i).toString() + " = '" + pa4.getText();
                } else if (i == 4) {
                    mot = champs.get(i).toString() + " = '" + pa5.getText();
                } else if (i == 5) {
                    mot = champs.get(i).toString() + " = '" + pa6.getText();
                }
                if (mot.charAt(0) < 48 || 57 < mot.charAt(0)) {
                    requete = requete + mot + "'";
                } else {
                    requete = requete + mot;
                }
                if (i != (champs.size() - 1)) {
                    requete = requete + ", ";
                }
            }
            
            for (int i = 0; i < champs.size(); i++) {
                if (i == 0) {
                    mot = champs.get(i).toString() + " = '" + p1.getText();
                } else if (i == 1) {
                    mot = champs.get(i).toString() + " = '" + p2.getText();
                } else if (i == 2) {
                    mot = champs.get(i).toString() + " = '" + p3.getText();
                } else if (i == 3) {
                    mot = champs.get(i).toString() + " = '" + p4.getText();
                } else if (i == 4) {
                    mot = champs.get(i).toString() + " = '" + p5.getText();
                } else if (i == 5) {
                    mot = champs.get(i).toString() + " = '" + p6.getText();
                }
                if (i != (champs.size() - 1)) {
                    fin = fin  + mot + "' AND ";
                } else {
                    fin = fin  + mot + "'";
                }
            }
        }
        System.out.println(fin);
        requete = requete + " WHERE " + fin + ";";
        System.out.println(requete);

        try {
            modifier.modif((String) table.getSelectedItem(), requete, connect);
        } catch (SQLException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            resultat = connect.remplirChampsRequete("SELECT * FROM " + (String) table.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }
        mot = "Vérification:\n";
        for (int i = 0; i < champs.size(); i++) {
            mot = mot + champs.toString() + "\n";
        }
        for (int i = 0; i < resultat.size(); i++) {
            mot = mot + resultat.toString() + "\n";
        }

        a = mot.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ',' || a[i] == '[' || a[i] == ']' || a[i] == ';') {
                a[i] = ' ';
            }
            mot = mot + a[i];
        }

        modifi.setText(mot);

    }
}
