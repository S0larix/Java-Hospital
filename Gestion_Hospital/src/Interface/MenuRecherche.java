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
    
    

        
       
    public MenuRecherche(String LoginECE, String PasswordECE, String LoginBDD, String PasswordBDD) {
        
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
        BoutonRecherchePref = new javax.swing.JButton();
        BoutonRetourMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Recherche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Recherche.setText("Recherche");
        Recherche.setPreferredSize(new java.awt.Dimension(336, 84));

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 140));

        BoutonTri.setText("Tri croissant / alphabétique");
        jPanel1.add(BoutonTri);

        BoutonRecherchePref.setText("Recherches prédéfinies");
        BoutonRecherchePref.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoutonRecherchePref.setPreferredSize(new java.awt.Dimension(168, 42));
        jPanel1.add(BoutonRecherchePref);

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
        this.dispose();
        Menu_principal menu_princ = new Menu_principal(LoginECE,PasswordECE,LoginBDD,PasswordBDD);
        menu_princ.setVisible(true);
    }//GEN-LAST:event_BoutonRetourMenuActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonRecherchePref;
    private javax.swing.JButton BoutonRetourMenu;
    private javax.swing.JButton BoutonTri;
    private javax.swing.JLabel Recherche;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
