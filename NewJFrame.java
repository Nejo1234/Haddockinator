
package Paquetón;


import java.util.Random;

public class NewJFrame extends javax.swing.JFrame {

    /*Declaración de arrays y random*/
    
    private static String a [] = new String [12];
    private static String b [] = new String [12];
    private static String c [] = new String [12];
    private static String d [] = new String [12];
    private static String e [] = new String [12];
    private static String f [] = new String [12]; 
    
     Random z = new Random();
    
    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paquetón/Images/Dunsas.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Que me lleven los demonios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Largar amarras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jTextArea1.setText("¡" + a[z.nextInt(11)] + ", " + b[z.nextInt(11)] + ", " + c[z.nextInt(11)] + ", " + d[z.nextInt(11)] + ", "  + e[z.nextInt(11)] + ", " + f[z.nextInt(11)] + "!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*Se inicializan los arrays en el main*/
        
                a[0] ="Bandidos";
                a[1] = "Iconoclastas";
                a[2] = "Piratas";
                a[3] = "Vendedores de guano";
                a[4] = "Bárbaros";
                a[5] = "Salvajes";
                a[6] = "Miserables";
                a[7] = "Apaches";
                a[8] = "Sinvergüenzas";
                a[9] = "Canallas";
                a[10] = "Bestias";
                a[11] = "Alcornoques";
                
      
        
                b[0] = "Mercaderes de alfombras";
                b[1] = "Imbéciles";
                b[2] = "Antropopitecos";
                b[3] = "Momias";
                b[4] = "Espantapájaros";
                b[5] = "Gusanos";
                b[6] = "Zapotecos";
                b[7] = "Berzotas";
                b[8] = "Ectoplasmas";
                b[9] = "Cobardes";
                b[10] = "Insectos";
                b[11] = "Indios";
        
  
        
                c[0] = "Terroristas";
                c[1] = "Bachi-buzucs";
                c[2] = "Mamelucos";
                c[3] = "Vampiros";
                c[4] = "Macrocéfalos";
                c[5] = "Anfitriones";
                c[6] = "Megalómanos";
                c[7] = "Rocamboles";
                c[8] = "Caníbales";
                c[9] = "Majaderos";
                c[10] = "Logaritmos";
                c[11] = "Pirómanos";
    
                      
                d[0] = "Energúmenos";
                d[1] = "Brutos";
                d[2] = "Matones";
                d[3] = "Emplastos";
                d[4] = "Trogloditas";
                d[5] = "Desarrapados";
                d[6] = "Aztecas";
                d[7] = "Sapos";
                d[8] = "Zulús";
                d[9] = "Ganapanes";
                d[10] = "Piratas de agua dulce";
                d[11] = "Holgazanes";
                

                
                e[0] = "Parásitos";
                e[1] = "Papanatas";
                e[2] = "Antracitas";
                e[3] = "Zuavos";
                e[4] = "Anacolutos";
                e[5] = "Invertebrados";
                e[6] = "Chinches";
                e[7] = "Monigotes";
                e[8] = "Cebollinos";
                e[9] = "Gusanos";
                e[10] = "Piratas de carnaval";
                e[11] = "Analfabetos";
                
     
                
                f[0] = "Chupatintas";
                f[1] = "Marinos de agua dulce";
                f[2] = "Gitanos";
                f[3] = "Monos";
                f[4] = "Cafres";
                f[5] = "Archipámpanos";
                f[6] = "Viviseccionistas";
                f[7] = "Torturadores";
                f[8] = "Antropófagos";
                f[9] = "Coleópteros";
                f[10] = "Caraduras";
                f[11] = "Octoplasmas";
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
