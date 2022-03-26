/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen;

import java.awt.Color;
import static java.awt.MouseInfo.getPointerInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Colicionador extends javax.swing.JFrame {

    ArrayList<Planetas> planetas;
    ArrayList<Cientificos> cientificos;
    DefaultMutableTreeNode raiz;
    DefaultTreeModel model;
    double distancia;
    String elegirplan = "";
    Cientificos cientificoelg;
    Planetas planeta1;
    Planetas planeta2;

    public Colicionador() {
        cientificos = new ArrayList<>();
        planetas = new ArrayList<>();
        initComponents();
        cargarCientificos();
        actualizarComboBox();
        this.setVisible(true);

        this.setLocationRelativeTo(null);
        planetas();
        agregarcombo();
        model = (DefaultTreeModel) Jtree.getModel();
        raiz = new DefaultMutableTreeNode("Planetas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        plan1 = new javax.swing.JMenuItem();
        plan2 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtree = new javax.swing.JTree();
        Cbcientificos = new javax.swing.JComboBox<>();
        Cientificos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        publico = new javax.swing.JCheckBox();
        nombreC = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        colisionar = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        planetas2 = new javax.swing.JTextField();
        planetas1 = new javax.swing.JTextField();

        plan1.setText("jMenuItem1");
        plan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(plan1);

        plan2.setText("jMenuItem2");
        plan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(plan2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Jtree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JtreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Jtree);

        Cbcientificos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbcientificosMouseClicked(evt);
            }
        });
        Cbcientificos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbcientificosActionPerformed(evt);
            }
        });

        Cientificos.setText("Científicos");

        jLabel2.setText("Nombre");

        publico.setText("Publico");
        publico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                publicoItemStateChanged(evt);
            }
        });
        publico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicoActionPerformed(evt);
            }
        });

        agregar.setText("Agregar Cientifico");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        colisionar.setText("Colisionar");
        colisionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colisionarActionPerformed(evt);
            }
        });

        planetas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(Cientificos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Cbcientificos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(135, 135, 135)))))
                        .addComponent(colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(publico)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cientificos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cbcientificos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addGap(5, 5, 5)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(publico)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_publicoItemStateChanged
        if (publico.isSelected()) {
            remover();
            llenarJTreeDefault();
        } else {
            remover();

        }
    }//GEN-LAST:event_publicoItemStateChanged

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (!nombreC.getText().equals("")) {
            cientificos.add(new Cientificos(nombreC.getText()));

            agregarcombo();
            AgregarCientificos();
            nombreC.setText("");
            guardarCientifico();
        }
    }//GEN-LAST:event_agregarActionPerformed


    private void colisionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colisionarActionPerformed
        planeta1 =  buscarPlaneta(planetas1.getText());
       planeta2 =  buscarPlaneta(planetas2.getText());
        System.out.println(planeta1);
       double DistanciaEntrePlanetas = Math.sqrt(Math.pow((planeta1.x-planeta2.x),2)+Math.pow((planeta1.y-planeta2.y),2));
        DistanciaEntrePlanetas = (int) DistanciaEntrePlanetas;
        hilo hilo = new hilo();
        hilo.start();
    }//GEN-LAST:event_colisionarActionPerformed

    private void publicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicoActionPerformed

    private void planetas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetas2ActionPerformed

    }//GEN-LAST:event_planetas2ActionPerformed

    private void JtreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JtreeValueChanged
        String planeta="";
        try{
    if((planeta = Jtree.getSelectionPath().toString())!=null){
    jPopupMenu1.setVisible(true);
        jPopupMenu1.setLocation(getPointerInfo().getLocation());
        planeta = Jtree.getSelectionPath().toString();
        elegirplan = planeta.replace("[Planetas, ", "").replace("]", "");
}
        }catch(Exception x){
            
        }
            
                
            
        

    }//GEN-LAST:event_JtreeValueChanged

    private void plan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan1ActionPerformed
        plan1.setText(elegirplan);
        jPopupMenu1.setVisible(true);
    }//GEN-LAST:event_plan1ActionPerformed

    private void plan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan2ActionPerformed
        plan2.setText(elegirplan);
        jPopupMenu1.setVisible(true);
    }//GEN-LAST:event_plan2ActionPerformed

    private void CbcientificosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbcientificosActionPerformed
      
        
    }//GEN-LAST:event_CbcientificosActionPerformed

    private void CbcientificosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbcientificosMouseClicked
       if(Cbcientificos.getSelectedItem()!=null){
        cientificoelg = buscarC(String.valueOf(Cbcientificos.getSelectedItem()));
        remover();
        llenarJTreeCient(cientificoelg);
        }
    }//GEN-LAST:event_CbcientificosMouseClicked

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
            java.util.logging.Logger.getLogger(Colicionador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colicionador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colicionador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colicionador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colicionador().setVisible(true);
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

    public void remover() {
        raiz.removeAllChildren();
        model.reload();
    }

    public void agregarcombo() {
        Cbcientificos.removeAllItems();
        for (Cientificos c : cientificos) {
            Cbcientificos.addItem(c.nombreC);
        }
    }

    private void planetas() {
        planetas.add(new Terrestre(5000, 13000, "Mercurio", 400, 300));
        planetas.add(new Terrestre(100000, 15000, "Venus", 640, 260));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Gaseoso(400000, 40000, "Jupiter", 340, 310));
        planetas.add(new Gaseoso(300000, 30000, "Saturno", 560, 450));
        planetas.add(new Gaseoso(200000, 20000, "Urano", 670, 690));
        planetas.add(new Gaseoso(200000, 20000, "Neptuno", 840, 900));
        planetas.add(new Terrestre(150000, 16000, "Planeta Vegeta", 760, 400));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbcientificos;
    private javax.swing.JLabel Cientificos;
    private javax.swing.JTree Jtree;
    private javax.swing.JButton agregar;
    private javax.swing.JButton colisionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreC;
    private javax.swing.JMenuItem plan1;
    private javax.swing.JMenuItem plan2;
    private javax.swing.JTextField planetas1;
    private javax.swing.JTextField planetas2;
    private javax.swing.JCheckBox publico;
    // End of variables declaration//GEN-END:variables

    private void AgregarCientificos() {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./franklin.vegeta"));
            for (Cientificos cienti : cientificos) {
                os.writeObject(cienti);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void cargarCientificos() {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./franklin.vegeta"));
            Cientificos cientifico;
            while ((cientifico = (Cientificos) os.readObject()) != null) {
                cientificos.add(cientifico);
            }

        } catch (Exception x) {

            System.out.println(x);
        }
    }

    private void actualizarComboBox() {
        Cbcientificos.removeAllItems();
        for (Cientificos cien : cientificos) {
            Cbcientificos.addItem(cien.nombreC);
        }
    }

    private void agregarPlaneta(Planetas plan) {
        for (Cientificos science : cientificos) {
            if (Cbcientificos.getSelectedItem().toString().equals(science.getNombreC())) {
                science.getPlanetas().add(plan);
            }
        }
    }
    public Cientificos buscarC(String nombre){
        for(Cientificos science: cientificos){
            if(science.nombreC.equals(nombre)){
                return science;
            }
        }
        return null;
    }
    public void llenarJTreeCient(Cientificos scien){
        for(Planetas plan: scien.planetas){
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(plan.nombre);
            raiz.add(hijo);
        }
        model.setRoot(raiz);
    }

   class hilo extends Thread{
    boolean colisiono = false;

    public void run() {
        jProgressBar2.setForeground(Color.magenta);
        while (colisiono == false) {
            try {
                for (int i = 0; i < (int) distancia + 1; i++) {
                    jProgressBar2.setValue(i);
                    Thread.sleep(5);
                }
                colisiono = true;
                jProgressBar2.setValue(0);
                JOptionPane.showMessageDialog(null, "Kaboom!!!");
            } catch (Exception x) {
                System.out.println(x);
            }
        }
        colisiono = false;
    }

    private Planetas returnPlanet(String name) {
        for (Planetas plane : planetas) {
            if (name.equals(plane.getNombre())) {
                return plane;
            }
        }
        return null;
    }

}
   public Planetas buscarPlaneta(String nombre){
        for(Planetas plan: planetas){
            if(plan.nombre.equals(nombre)){
                return plan;
            }
        }
        return null;
    }}

