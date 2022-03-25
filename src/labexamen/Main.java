/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {
  ArrayList<Planetas> planetas;
    ArrayList<Cientificos> cientificos;
    DefaultMutableTreeNode raiz;
    DefaultTreeModel model;
  

    public Main() {
        cientificos = new ArrayList<>();
        planetas = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        planetas();
        model = (DefaultTreeModel) tree_planetas.getModel();
        raiz = new DefaultMutableTreeNode("Planetas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree_planetas = new javax.swing.JTree();
        tf_planeta1 = new javax.swing.JTextField();
        tf_planeta2 = new javax.swing.JTextField();
        cb_cientificos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_publicos = new javax.swing.JCheckBox();
        tf_nombreCientifico = new javax.swing.JTextField();
        btn_addCientifico = new javax.swing.JButton();
        btn_colisionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree_planetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree_planetas);

        tf_planeta1.setEditable(false);

        tf_planeta2.setEditable(false);

        jLabel1.setText("Científicos");

        jLabel2.setText("Nombre");

        cb_publicos.setText("Públicos");
        cb_publicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_publicosItemStateChanged(evt);
            }
        });

        btn_addCientifico.setText("Añadir Científico");
        btn_addCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCientificoActionPerformed(evt);
            }
        });

        btn_colisionar.setText("Colisionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_planeta1)
                            .addComponent(tf_planeta2)
                            .addComponent(cb_cientificos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombreCientifico)
                            .addComponent(btn_addCientifico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(btn_colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cb_publicos)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_planeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_colisionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_cientificos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_addCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cb_publicos)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_publicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_publicosItemStateChanged
        if (cb_publicos.isSelected()) {
            clearTree();
            llenarJTreeDefault();
        } else {
            clearTree();
        }
    }//GEN-LAST:event_cb_publicosItemStateChanged

    private void btn_addCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCientificoActionPerformed
        if (!tf_nombreCientifico.getText().equals("")) {

            cientificos.add(new Cientificos(tf_nombreCientifico.getText()));
            llenarComboBox();
            tf_nombreCientifico.setText("");
            guardarCientifico();
        }
    }//GEN-LAST:event_btn_addCientificoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void guardarCientifico() {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./cientificos.dr"));
            for (Cientificos c : cientificos) {
                os.writeObject(c);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void llenarJTreeDefault() {

        for (Planetas planeta : planetas) {
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(planeta.nombre);
            raiz.add(hijo);
        }

        model.setRoot(raiz);
    }

    public void clearTree() {
        raiz.removeAllChildren();
        model.reload();
    }

    public void llenarComboBox() {
        cb_cientificos.removeAllItems();
        for (Cientificos c : cientificos) {
            cb_cientificos.addItem(c.nombreC);
        }
    }
 public void planetas() {
        planetas.add(new Terrestre(5000, 13000, "Mercurio", 400, 300));
        planetas.add(new Terrestre(100000, 15000, "Venus", 640, 260));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Gaseoso(400000, 40000, "Jupiter", 340, 310));
        planetas.add(new Gaseoso(300000, 30000, "Saturno", 560, 450));
        planetas.add(new Gaseoso(200000, 20000, "Urano", 670, 690));
        planetas.add(new Gaseoso(200000, 20000, "Neptuno", 840, 900));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCientifico;
    private javax.swing.JButton btn_colisionar;
    private javax.swing.JComboBox<String> cb_cientificos;
    private javax.swing.JCheckBox cb_publicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_nombreCientifico;
    private javax.swing.JTextField tf_planeta1;
    private javax.swing.JTextField tf_planeta2;
    private javax.swing.JTree tree_planetas;
    // End of variables declaration//GEN-END:variables

   

}
