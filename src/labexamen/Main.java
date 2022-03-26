package labexamen;

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
   Cintificos cientificoSeleccionado;
  int distancia = 0;
    Planetas planeta1;
    Planetas planeta2;
    DefaultMutableTreeNode raiz;
    DefaultTreeModel model;
    ArrayList<Planetas> planetasDefault;
    ArrayList<Planetas> planetas;
    ArrayList<Cintificos> cientificos;
    double tiempo;
    double energia;
    double energiaMax = 0;

    public Main() {

        planetas = new ArrayList<>();
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        cientificos = new ArrayList<>();
        planetasDefault = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        planetasDefault();

        cargarCientificos();
        cb();
        model = (DefaultTreeModel) Jtree.getModel();
        raiz = new DefaultMutableTreeNode("Planetas");

        if (cajacientifica.getSelectedItem() != null) {
            cientificoSeleccionado = buscarCientifico(String.valueOf(cajacientifica.getSelectedItem()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menus = new javax.swing.JPopupMenu();
        plan1 = new javax.swing.JMenuItem();
        plan2 = new javax.swing.JMenuItem();
        simulador = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtree = new javax.swing.JTree();
        planetas1 = new javax.swing.JTextField();
        planetas2 = new javax.swing.JTextField();
        cajacientifica = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        publico = new javax.swing.JCheckBox();
        nombrecientifico = new javax.swing.JTextField();
        cientificob = new javax.swing.JButton();
        Colisionadorb = new javax.swing.JButton();
        nrg = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        menus.setMinimumSize(new java.awt.Dimension(80, 50));

        plan1.setText("Paneta 1");
        plan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan1ActionPerformed(evt);
            }
        });
        menus.add(plan1);

        plan2.setText("Planeta 2");
        plan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan2ActionPerformed(evt);
            }
        });
        menus.add(plan2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(750, 630));

        simulador.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Jtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtreeMouseClicked(evt);
            }
        });
        Jtree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JtreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Jtree);

        planetas1.setEditable(false);

        planetas2.setEditable(false);

        cajacientifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajacientificaMouseClicked(evt);
            }
        });

        jLabel1.setText("Cientifico");

        jLabel2.setText("Nombre");

        publico.setText("Públicos");
        publico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                publicoItemStateChanged(evt);
            }
        });

        cientificob.setText("Añadir Científico");
        cientificob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cientificobActionPerformed(evt);
            }
        });

        Colisionadorb.setText("Colisionar");
        Colisionadorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColisionadorbActionPerformed(evt);
            }
        });

        nrg.setForeground(new java.awt.Color(153, 255, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labexamen/xd_1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrecientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajacientifica, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cientificob, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(publico)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Colisionadorb, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(simulador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(nrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simulador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(publico)
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cajacientifica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nombrecientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(Colisionadorb, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(cientificob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_publicoItemStateChanged
        if (publico.isSelected()) {
            clearTree();
            defecto();
        } else {
            clearTree();
            if (cajacientifica.getSelectedItem() != null) {
                cientificoSeleccionado = buscarCientifico(String.valueOf(cajacientifica.getSelectedItem()));
            }
            llenarJTreeCient(cientificoSeleccionado);
        }
    }//GEN-LAST:event_publicoItemStateChanged

    private void cientificobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cientificobActionPerformed
        if (!nombrecientifico.getText().equals("")) {

            cientificos.add(new Cintificos(nombrecientifico.getText()));
            cb();
            nombrecientifico.setText("");
            guardarCientifico();
        }
    }//GEN-LAST:event_cientificobActionPerformed
    String selectedPlaneta = "";
    private void JtreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JtreeValueChanged
        String planeta = "";
        try {
            if ((planeta = Jtree.getSelectionPath().toString()) != null) {
                menus.setVisible(true);
                menus.setLocation(getPointerInfo().getLocation());
                selectedPlaneta = planeta.replace("[Planetas, ", "").replace("]", "");
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_JtreeValueChanged

    private void plan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan1ActionPerformed
        planetas1.setText(selectedPlaneta);
        menus.setVisible(false);
    }//GEN-LAST:event_plan1ActionPerformed

    private void plan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan2ActionPerformed
        planetas2.setText(selectedPlaneta);
        menus.setVisible(false);
    }//GEN-LAST:event_plan2ActionPerformed

    private void cajacientificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajacientificaMouseClicked
        if (cajacientifica.getSelectedItem() != null) {
            cientificoSeleccionado = buscarCientifico(String.valueOf(cajacientifica.getSelectedItem()));
            clearTree();
        }
        if (publico.isSelected()) {
            clearTree();
            defecto();
        } else {
            clearTree();
            llenarJTreeCient(cientificoSeleccionado);
        }

    }//GEN-LAST:event_cajacientificaMouseClicked
  
    private void ColisionadorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColisionadorbActionPerformed
        planeta1 = buscarPlaneta(planetas1.getText());
        planeta2 = buscarPlaneta(planetas2.getText());
        double distanciaD = Math.sqrt(Math.pow((planeta1.x - planeta2.x), 2) + Math.pow((planeta1.y - planeta2.y), 2));
        distancia = (int) distanciaD;
        hilo hilo = new hilo();
        hilo.start();
    }//GEN-LAST:event_ColisionadorbActionPerformed

    private void JtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtreeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JtreeMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    public void planetasDefault() {
        planetasDefault.add(new Terrestres(5000, 13000, "Mercurio", 400, 300));
        planetasDefault.add(new Terrestres(100000, 15000, "Venus", 640, 260));
        planetasDefault.add(new Terrestres(140000, 17000, "Tierra", 760, 570));
        planetasDefault.add(new Terrestres(90000, 12000, "Marte", 360, 360));
        planetasDefault.add(new Gaseosos(400000, 40000, "Jupiter", 340, 310));
        planetasDefault.add(new Gaseosos(300000, 30000, "Saturno", 560, 450));
        planetasDefault.add(new Gaseosos(200000, 20000, "Urano", 670, 690));
        planetasDefault.add(new Gaseosos(200000, 20000, "Neptuno", 840, 900));
        planetasDefault.add(new Gaseosos(100000, 150000, "Planeta Vegetta", 900, 850));
        planetas.add(new Terrestres(5000, 13000, "Mercurio", 400, 300));
        planetas.add(new Terrestres(100000, 15000, "Venus", 640, 260));
        planetas.add(new Terrestres(140000, 17000, "Tierra", 760, 570));
        planetas.add(new Terrestres(90000, 12000, "Marte", 360, 360));
        planetas.add(new Gaseosos(400000, 40000, "Jupiter", 340, 310));
        planetas.add(new Gaseosos(300000, 30000, "Saturno", 560, 450));
        planetas.add(new Gaseosos(200000, 20000, "Urano", 670, 690));
        planetas.add(new Gaseosos(200000, 20000, "Neptuno", 840, 900));
        planetas.add(new Gaseosos(100000, 150000, "Planeta Vegetta", 900, 850));
    } 
    public void defecto() {

        for (Planetas planeta : planetasDefault) {
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(planeta.nombre);
            raiz.add(hijo);
        }

        model.setRoot(raiz);
    }
    private void guardarCientifico() {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./Tenepiedad.plis"));
            for (Cintificos c : cientificos) {
                os.writeObject(c);
            }
        } catch (Exception ex) {

        }
    }
    private void cargarCientificos() {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./Tenepiedad.plis"));
            Cintificos cientifico;
            while ((cientifico = (Cintificos) os.readObject()) != null) {
                cientificos.add(cientifico);
                for (Planetas p : cientifico.planetas) {
                    planetas.add(p);
                }
            }
        } catch (Exception ex) {
        }
    }

   

    public void llenarJTreeCient(Cintificos cient) {
        for (Planetas p : cient.planetas) {
            DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(p.nombre);
            raiz.add(hijo);
        }
        model.setRoot(raiz);
    }

    public void clearTree() {
        raiz.removeAllChildren();
        model.reload();
    }

    public void cb() {
        cajacientifica.removeAllItems();
        for (Cintificos c : cientificos) {
            cajacientifica.addItem(c.nombreCientifico);
        }
    }

    public Cintificos buscarCientifico(String nombre) {
        for (Cintificos c : cientificos) {
            if (c.nombreCientifico.equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    //Buscar Planetas
    public Planetas buscarPlaneta(String nombre) {
        for (Planetas p : planetas) {
            if (p.nombre.equals(nombre)) {
                return p;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Colisionadorb;
    private javax.swing.JTree Jtree;
    private javax.swing.JComboBox<String> cajacientifica;
    private javax.swing.JButton cientificob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menus;
    private javax.swing.JTextField nombrecientifico;
    private javax.swing.JProgressBar nrg;
    private javax.swing.JMenuItem plan1;
    private javax.swing.JMenuItem plan2;
    private javax.swing.JTextField planetas1;
    private javax.swing.JTextField planetas2;
    private javax.swing.JCheckBox publico;
    private javax.swing.JProgressBar simulador;
    // End of variables declaration//GEN-END:variables

    class hilo extends Thread {

        public void run() {

            simulador.setVisible(true);
            simulador.setMaximum(distancia);
            tiempo = 0;
          
            try {
                for (int i = 0; i <= distancia; i++) {
                    simulador.setValue(i);
                    Thread.sleep(5);
                    tiempo += 5;
                }
                Planetas creacion = planeta1.explotacion(planeta2);
                if (creacion != null) {
                    planetas.add(creacion);
                    buscarCientifico(String.valueOf(cajacientifica.getSelectedItem())).planetas.add(creacion);
                    guardarCientifico();
                }
                ManotadasDeAHOGADO();
                th2 hilo2 = new th2();
                hilo2.start();
            } catch (InterruptedException e) {
          }} }
    public void ManotadasDeAHOGADO() {
        double tiempoSec = tiempo / 1000;
        double velocidad = distancia / tiempoSec;
        energia = (0.5 * ((planeta1.peso + planeta2.peso) / 2) * Math.pow(velocidad, 2));
        Random r = new Random();
        double nrgx = ThreadLocalRandom.current().nextDouble(energia, 2 * energia);
        System.out.println("t = " + tiempoSec + "s");
        System.out.println("D = " + distancia);
        System.out.println("V = " + velocidad);
        System.out.println("E = " + energia);
        System.out.println("EMx= " + nrgx);
    }
    class th2 extends Thread {
        public void run() {
            nrg.setVisible(true);
            nrg.setMaximum((int) energiaMax);

            try {
                for (int i = 0; i <= energia; i++) {
                    nrg.setValue(i);
                    nrg.repaint();
                    double porcentaje = (i * 100 / energiaMax);
                    if (porcentaje < 50) {
                        nrg.setForeground(Color.GREEN);
                    } else if (porcentaje < 75) {
                        nrg.setForeground(Color.YELLOW);
                    } else if (porcentaje < 90) {
                        nrg.setForeground(Color.RED);
                    } else {
                        nrg.setForeground(Color.BLACK);
                    }
                    Thread.sleep(5);
                }
            } catch (InterruptedException e) {
            }
        }  }}
