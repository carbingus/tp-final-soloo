package Vistas;

import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuStock = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuVentas = new javax.swing.JMenuItem();
        jMenuPlatin = new javax.swing.JMenu();
        jMenuPedidos = new javax.swing.JMenuItem();
        jMenuVender = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jMenuSalsita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jMenuAdmin.setText("Administracion");

        jMenuProductos.setText("Productos");
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuProductos);

        jMenuClientes.setText("Clientes");
        jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuClientes);

        jMenuProveedores.setText("Proveedores");
        jMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProveedoresActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuProveedores);

        barraMenu.add(jMenuAdmin);

        jMenuConsulta.setText("Consultas");

        jMenuStock.setText("Consultar Stock");
        jMenuStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuStockActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuStock);

        jMenuItem1.setText("Modificar/Eliminar productos");
        jMenuConsulta.add(jMenuItem1);

        jMenuVentas.setText("Consultar Ventas");
        jMenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVentasActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuVentas);

        barraMenu.add(jMenuConsulta);

        jMenuPlatin.setText("Transacciones");

        jMenuPedidos.setText("Realizar Pedidos");
        jMenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPedidosActionPerformed(evt);
            }
        });
        jMenuPlatin.add(jMenuPedidos);

        jMenuVender.setText("Realizar Ventas");
        jMenuVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVenderActionPerformed(evt);
            }
        });
        jMenuPlatin.add(jMenuVender);

        barraMenu.add(jMenuPlatin);

        jMenuSalir.setText("Salir");

        jMenuSalsita.setText("Salir del sistema");
        jMenuSalsita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalsitaActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuSalsita);

        barraMenu.add(jMenuSalir);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaProductos vp = new VistaProductos();
        centrarVentana(vp);
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jMenuStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuStockActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaStock vs = new VistaStock();
        centrarVentana(vs);
        
    }//GEN-LAST:event_jMenuStockActionPerformed

    private void jMenuSalsitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalsitaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalsitaActionPerformed

    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaClientes vc = new VistaClientes();
        centrarVentana(vc);
    }//GEN-LAST:event_jMenuClientesActionPerformed

    private void jMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProveedoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaProveedores vp = new VistaProveedores();
        centrarVentana(vp);
    }//GEN-LAST:event_jMenuProveedoresActionPerformed

    private void jMenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVentasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaVentas vv = new VistaVentas();
        centrarVentana(vv);
    }//GEN-LAST:event_jMenuVentasActionPerformed

    private void jMenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPedidosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaCompras vc = new VistaCompras();
        centrarVentana(vc);
    }//GEN-LAST:event_jMenuPedidosActionPerformed

    private void jMenuVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVenderActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaVender vvr = new VistaVender();
        centrarVentana(vvr);
    }//GEN-LAST:event_jMenuVenderActionPerformed

    public void centrarVentana(JInternalFrame ventana) {
        int x = escritorio.getWidth()/2 - ventana.getWidth()/2;
        int y = escritorio.getHeight()/2 - ventana.getHeight()/2;
        if (ventana.isShowing()) {
            ventana.setLocation(x, y);
        } else {
            escritorio.add(ventana);
            ventana.setLocation(x, y);
            ventana.show();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuItem jMenuClientes;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuPedidos;
    private javax.swing.JMenu jMenuPlatin;
    private javax.swing.JMenuItem jMenuProductos;
    private javax.swing.JMenuItem jMenuProveedores;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenuItem jMenuSalsita;
    private javax.swing.JMenuItem jMenuStock;
    private javax.swing.JMenuItem jMenuVender;
    private javax.swing.JMenuItem jMenuVentas;
    // End of variables declaration//GEN-END:variables
}
