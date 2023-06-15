/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import Entidades.*;
import AccesoADatos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author extha
 */
public class VistaProductos extends javax.swing.JInternalFrame {
    Producto productoActual = new Producto();
    ProductoData prodData = new ProductoData();

    /**
     * Creates new form VistaaProductos
     */
    public VistaProductos() {
        initComponents();
        setTitle("Formulario de Productos");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblNombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jlblCateg = new javax.swing.JLabel();
        jlblPrecio = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jlblStock = new javax.swing.JLabel();
        jtxtStock = new javax.swing.JTextField();
        jlblStado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblIconito = new javax.swing.JLabel();
        jrbtStado = new javax.swing.JRadioButton();
        jbtAgregar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jcmbCateg = new javax.swing.JComboBox<>();

        jlblNombre.setText("Nombre:");

        jlblCateg.setText("Categoria:");

        jlblPrecio.setText("Precio:");

        jlblStock.setText("Stock:");

        jlblStado.setText("Estado:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Productos");

        jlblIconito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/producto-default-mini.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(jlblIconito)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblIconito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jrbtStado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtStadoActionPerformed(evt);
            }
        });

        jbtAgregar.setText("Agregar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jcmbCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrodomestico", "Muebles", "Higiene", "Miscelaneo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbtAgregar)
                                .addComponent(jlblStado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(132, 132, 132)
                            .addComponent(jbtSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmbCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrbtStado)
                                .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblNombre)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmbCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCateg))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblPrecio)
                            .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblStock)
                            .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jlblStado))
                    .addComponent(jrbtStado))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAgregar)
                    .addComponent(jbtSalir))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtStadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtStadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbtStadoActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        try {
            String nombre = jtxtNombre.getText();
            String categoria = (String) jcmbCateg.getSelectedItem();
            double precio = Double.parseDouble(jtxtPrecio.getText());
            int stock = Integer.valueOf(jtxtStock.getText());
            
            if (nombre.isEmpty() || String.valueOf(precio).isEmpty() || String.valueOf(stock).isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
                return;

            }

            boolean estado = jrbtStado.isSelected();

            if (productoActual == null) {
                productoActual = new Producto(nombre, categoria, precio, stock, estado);

                prodData.registrarProducto(productoActual);

            } else {
                JOptionPane.showMessageDialog(this, "Accion prohibida.");
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Usted debe ingresar valores numericos para stock y precio.");
        }
        limpiarFormulario();
        productoActual = null;
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed

            private void limpiarFormulario(){
        
        jtxtNombre.setText("");
        jtxtPrecio.setText("");
        jtxtStock.setText("");
        jrbtStado.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JComboBox<String> jcmbCateg;
    private javax.swing.JLabel jlblCateg;
    private javax.swing.JLabel jlblIconito;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblStado;
    private javax.swing.JLabel jlblStock;
    private javax.swing.JRadioButton jrbtStado;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtStock;
    // End of variables declaration//GEN-END:variables
}
