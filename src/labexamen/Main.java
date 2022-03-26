

package labexamen;

import ExamenParcial.Cientifico;
import ExamenParcial.Gaseoso;
import ExamenParcial.Planeta;
import ExamenParcial.Terrestre;
import java.awt.Color;
import static java.awt.MouseInfo.getPointerInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Main extends javax.swing.JFrame {
 double tiempo;
    double energia;
    double energiaMax = 0;
    DefaultMutableTreeNode raiz;
    DefaultTreeModel model;
    ArrayList<Planetas> defecto;
    ArrayList<Planetas> planetas;
    ArrayList<Cientificos> cientificos;
    int distancia = 0;
    Planeta planeta1;
    Planeta planeta2;

    public Main() {

        planetas = new ArrayList<>();
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        cientificos = new ArrayList<>();
        defecto = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        planetasDefault();

        cargarCientificos();
        llenarComboBox();
        model = (DefaultTreeModel) tree_planetas.getModel();
        raiz = new DefaultMutableTreeNode("Planetas");

        if (cb_cientificos.getSelectedItem() != null) {
            cientificoSeleccionado = buscarCientifico(String.valueOf(cb_cientificos.getSelectedItem()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Planeta1 = new javax.swing.JMenuItem();
        Planeta2 = new javax.swing.JMenuItem();
        pb_colision = new javax.swing.JProgressBar();
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
        pb_energia = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        popupMenu.setMinimumSize(new java.awt.Dimension(80, 50));

        Planeta1.setText("Paneta 1");
        Planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta1ActionPerformed(evt);
            }
        });
        popupMenu.add(Planeta1);

        Planeta2.setText("Planeta 2");
        Planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta2ActionPerformed(evt);
            }
        });
        popupMenu.add(Planeta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(750, 630));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree_planetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_planetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_planetasMouseClicked(evt);
            }
        });
        tree_planetas.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_planetasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tree_planetas);

        tf_planeta1.setEditable(false);

        tf_planeta2.setEditable(false);

        cb_cientificos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_cientificosMouseClicked(evt);
            }
        });

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
        btn_colisionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colisionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Clic Izquierdo para ver PopupMenu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pb_energia, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pb_colision, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(cb_publicos))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
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
                            .addComponent(btn_colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pb_colision, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pb_energia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_planeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_publicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_publicosItemStateChanged
        if (cb_publicos.isSelected()) {
            clearTree();
            llenarJTreeDefault();
        } else {
            clearTree();
            if (cb_cientificos.getSelectedItem() != null) {
                cientificoSeleccionado = buscarCientifico(String.valueOf(cb_cientificos.getSelectedItem()));
            }
            llenarJTreeCient(cientificoSeleccionado);
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
    String selectedPlaneta = "";
    private void tree_planetasValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_planetasValueChanged
        String planeta = "";
        try {
            if ((planeta = tree_planetas.getSelectionPath().toString()) != null) {
                popupMenu.setVisible(true);
                popupMenu.setLocation(getPointerInfo().getLocation());
                selectedPlaneta = planeta.replace("[Planetas, ", "").replace("]", "");
            }
        } catch (Exception ex) {

        }


    }//GEN-LAST:event_tree_planetasValueChanged

    private void Planeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta1ActionPerformed
        tf_planeta1.setText(selectedPlaneta);
        popupMenu.setVisible(false);

    }//GEN-LAST:event_Planeta1ActionPerformed

    private void Planeta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Planeta2ActionPerformed
        tf_planeta2.setText(selectedPlaneta);
        popupMenu.setVisible(false);
    }//GEN-LAST:event_Planeta2ActionPerformed
    Cientificos cientificoSeleccionado;

    ;
    private void cb_cientificosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_cientificosMouseClicked
        if (cb_cientificos.getSelectedItem() != null) {
            cientificoSeleccionado = buscarCientifico(String.valueOf(cb_cientificos.getSelectedItem()));
            clearTree();
        }
        if (cb_publicos.isSelected()) {
            clearTree();
            llenarJTreeDefault();
        } else {
            clearTree();
            llenarJTreeCient(cientificoSeleccionado);
        }

    }//GEN-LAST:event_cb_cientificosMouseClicked
   
    private void btn_colisionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colisionarActionPerformed
        planeta1 = buscarPlaneta(tf_planeta1.getText());
        planeta2 = buscarPlaneta(tf_planeta2.getText());
        double distanciaD = Math.sqrt(Math.pow((planeta1.x - planeta2.x), 2) + Math.pow((planeta1.y - planeta2.y), 2));
        distancia = (int) distanciaD;
        hilo hilo = new hilo();
        hilo.start();
    }//GEN-LAST:event_btn_colisionarActionPerformed

    private void tree_planetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_planetasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tree_planetasMouseClicked

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

        }
    }

    private void cargarCientificos() {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./cientificos.dr"));
            Cientificos cientifico;
            while ((Cientificos = (cientificos) os.readObject()) != null) {
                Cientificos.add(cientificos);
                for (Planetas plan : cientifico.planetas) {
                    planetas.add(plan);
                }
            }

        } catch (Exception ex) {

        }
    }

    public void llenarJTreeDefault() {

        for (Planetas plan : defecto) {
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(planetas.nombre);
            raiz.add(hijo);
        }

        model.setRoot(raiz);
    }

    public void llenarJTreeCient(Cientificos cient) {
        for (Planetas plan : cient.planetas) {
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(plan.getNombre());
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

    public Cientificos buscarCientifico(String nombre) {
        for (Cientificos scien : cientificos) {
            if (scien.nombreC.equals(nombre)) {
                return scien;
            }
        }
        return null;
    }

    
    public Planetas buscarPlaneta(String nombre) {
        for (Planetas plan :planetas) {
            if (plan.nombre.equals(nombre)) {
                return plan;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Planeta1;
    private javax.swing.JMenuItem Planeta2;
    private javax.swing.JButton btn_addCientifico;
    private javax.swing.JButton btn_colisionar;
    private javax.swing.JComboBox<String> cb_cientificos;
    private javax.swing.JCheckBox cb_publicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pb_colision;
    private javax.swing.JProgressBar pb_energia;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JTextField tf_nombreCientifico;
    private javax.swing.JTextField tf_planeta1;
    private javax.swing.JTextField tf_planeta2;
    private javax.swing.JTree tree_planetas;
    // End of variables declaration//GEN-END:variables

    public void planetasDefault() {
        defecto.add(new Terrestre(5000, 13000, "Mercurio", 400, 300));
        defecto.add(new Terrestre(100000, 15000, "Venus", 640, 260));
        defecto.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        defecto.add(new Terrestre(90000, 12000, "Marte", 360, 360));
        defecto.add(new Gaseoso(400000, 40000, "Jupiter", 340, 310));
        defecto.add(new Gaseoso(300000, 30000, "Saturno", 560, 450));
        defecto.add(new Gaseoso(200000, 20000, "Urano", 670, 690));
        defecto.add(new Gaseoso(200000, 20000, "Neptuno", 840, 900));
        defecto.add(new Gaseoso(100000, 150000, "Planeta Vegeta", 900, 850));
        planetas.add(new Terrestre(5000, 13000, "Mercurio", 400, 300));
        planetas.add(new Terrestre(100000, 15000, "Venus", 640, 260));
        planetas.add(new Terrestre(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Terrestre(90000, 12000, "Marte", 360, 360));
        planetas.add(new Gaseoso(400000, 40000, "Jupiter", 340, 310));
        planetas.add(new Gaseoso(300000, 30000, "Saturno", 560, 450));
        planetas.add(new Gaseoso(200000, 20000, "Urano", 670, 690));
        planetas.add(new Gaseoso(200000, 20000, "Neptuno", 840, 900));
        planetas.add(new Gaseoso(100000, 150000, "Planeta Vegetta", 900, 850));
    }

    class hilo extends Thread {

        public void run() {

            pb_colision.setVisible(true);
            pb_colision.setMaximum(distancia);
            tiempo = 0;
            // while(true){
            try {
                for (int i = 0; i <= distancia; i++) {
                    pb_colision.setValue(i);
                    Thread.sleep(5);
                    tiempo += 5;
                }

                Planetas crear = colaneta1.colision(planeta2);

                if (crear != null) {
                    planetas.add(crear);
                    buscarCientifico(String.valueOf(cb_cientificos.getSelectedItem())).planetas.add(crear);
                    guardarCientifico();

                }

                BONO();
                hilo2 hilo2 = new hilo2();
                hilo2.start();

            } catch (InterruptedException e) {
            }

        }

    }
   


    public void BONO() {
        double tiempoSec = tiempo / 1000;
        double velocidad = distancia / tiempoSec;
        energia = (0.5 * ((planeta1.peso + planeta2.peso) / 2) * Math.pow(velocidad, 2));
        Random r = new Random();
        double energiaMax = ThreadLocalRandom.current().nextDouble(energia, 2 * energia);
        System.out.println("Tiempo = " + tiempoSec + "s");
        System.out.println("Distancia = " + distancia);
        System.out.println("Velocidad = " + velocidad);
        System.out.println("Energía = " + energia);
        System.out.println("Energía Máxima= " + energiaMax);

    }

    class hilo2 extends Thread {

        public void run() {
            pb_energia.setVisible(true);
            pb_energia.setMaximum((int) energiaMax);

            // while(true){
            try {
                for (int i = 0; i <= energia; i++) {
                    pb_energia.setValue(i);
                    pb_energia.repaint();
                    double porcentaje = (i * 100 / energiaMax);
                    if (porcentaje < 50) {
                        pb_energia.setForeground(Color.GREEN);
                    } else if (porcentaje < 75) {
                        pb_energia.setForeground(Color.YELLOW);
                    } else if (porcentaje < 90) {
                        pb_energia.setForeground(Color.RED);
                    } else {
                        pb_energia.setForeground(Color.BLACK);
                    }

                    Thread.sleep(5);

                }

            } catch (InterruptedException e) {

            }

        }

    }

}
