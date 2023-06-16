/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.*;
import Entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author extha
 */
public class VistaProveedores extends javax.swing.JInternalFrame {
    
    Proveedor proveedorActual = new Proveedor();
    ProveedorData provData = new ProveedorData();

    /**
     * Creates new form VistaProveedores
     */
    public VistaProveedores() {
        initComponents();
        setTitle("Formulario de Proveedores");
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

        jlblTelef = new javax.swing.JLabel();
        jrbtStado = new javax.swing.JRadioButton();
        jbtAgregar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jbtBuscar = new javax.swing.JButton();
        jtxtRazon = new javax.swing.JTextField();
        jtxtTelef = new javax.swing.JTextField();
        jlblStado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblIconito = new javax.swing.JLabel();
        jlblRazon = new javax.swing.JLabel();
        jlblDomi = new javax.swing.JLabel();
        jtxtDomi = new javax.swing.JTextField();
        jbtModificar = new javax.swing.JButton();

        jlblTelef.setText("Telefono");

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

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jlblStado.setText("Estado");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Proveedores");

        jlblIconito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/proveedor-default-mini.png"))); // NOI18N

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

        jlblRazon.setText("Razon Social");

        jlblDomi.setText("Domicilio");

        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblStado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtStado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlblTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlblDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jtxtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbtAgregar)
                                .addGap(43, 43, 43)
                                .addComponent(jbtModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSalir)))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRazon)
                    .addComponent(jtxtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDomi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelef)
                    .addComponent(jtxtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblStado)
                    .addComponent(jrbtStado))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAgregar)
                    .addComponent(jbtSalir)
                    .addComponent(jbtModificar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtStadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtStadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbtStadoActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        try {
            String nombre = jtxtRazon.getText();
            String domicilio = jtxtDomi.getText();
            String telefono = jtxtTelef.getText();
            if (nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
                return;

            }
            
            boolean estado = jrbtStado.isSelected();

            if (proveedorActual == null) {
                proveedorActual = new Proveedor(nombre, domicilio, telefono, estado);

                provData.guardarProveedor(proveedorActual);

            } else {
                JOptionPane.showMessageDialog(this, "No se puede modificar un proveedor de esta forma. Utilice el boton ''Modificar''.");
            }

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(this, "Algo ha salido mal. Codigo: " +ex.getLocalizedMessage());
        }
        limpiarFormulario();
        proveedorActual = null;
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        // TODO add your handling code here:
        try{
            String telefono = jtxtTelef.getText();
            proveedorActual = provData.buscarProveedorPorTelefono(telefono);

            if (proveedorActual != null) {
                //Cambiar int a string
                jtxtRazon.setText(proveedorActual.getRazonSocial());
                jtxtDomi.setText(proveedorActual.getDomicilio());
                jrbtStado.setSelected(proveedorActual.isEstado());
            } else {
                JOptionPane.showMessageDialog(this, "No se puede agregar un cliente a travez del boton ''Modificar''.\nUtilice el boton ''Agregar''.");
            }

        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Algo ha salido mal. Codigo: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        try {
            String nombre = jtxtRazon.getText();
            String domicilio = jtxtDomi.getText();
            String telefono = jtxtTelef.getText();
            
            if (nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
                return;

            }

            boolean estado = jrbtStado.isSelected();

            if (proveedorActual!=null) {
                proveedorActual.setRazonSocial(nombre);
                proveedorActual.setDomicilio(domicilio);
                proveedorActual.setTelefono(telefono);
                proveedorActual.setEstado(estado);
                provData.modificarProveedor(proveedorActual);
            }
        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(this, "Algo ha salido mal. Codigo: " +ex.getLocalizedMessage());
        }
        limpiarFormulario();
        proveedorActual = null;
    }//GEN-LAST:event_jbtModificarActionPerformed

        private void limpiarFormulario(){
        
        jtxtRazon.setText("");
        jtxtDomi.setText("");
        jtxtTelef.setText("");
        jrbtStado.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JLabel jlblDomi;
    private javax.swing.JLabel jlblIconito;
    private javax.swing.JLabel jlblRazon;
    private javax.swing.JLabel jlblStado;
    private javax.swing.JLabel jlblTelef;
    private javax.swing.JRadioButton jrbtStado;
    private javax.swing.JTextField jtxtDomi;
    private javax.swing.JTextField jtxtRazon;
    private javax.swing.JTextField jtxtTelef;
    // End of variables declaration//GEN-END:variables
}
