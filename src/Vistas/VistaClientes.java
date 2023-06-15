/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import javax.swing.JOptionPane;
import Entidades.*;
import AccesoADatos.*;

/**
 *
 * @author extha
 */
public class VistaClientes extends javax.swing.JInternalFrame {
    private ClienteData clidData = new ClienteData();
    private Cliente clienteActual = null;
    

    /**
     * Creates new form VistaClientes
     */
    public VistaClientes() {
        initComponents();
        setTitle("Formulario de Clientes");
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

        jlblDocum = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jlblApell = new javax.swing.JLabel();
        jlblDomicilio = new javax.swing.JLabel();
        jlblTelef = new javax.swing.JLabel();
        jlblStado = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApell = new javax.swing.JTextField();
        jtxtDomi = new javax.swing.JTextField();
        jtxtDNI = new javax.swing.JTextField();
        jtxtTelef = new javax.swing.JTextField();
        jrbtStado = new javax.swing.JRadioButton();
        jbtBuscar = new javax.swing.JButton();
        jbtAgregar = new javax.swing.JButton();
        jbtModif = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlblIconito = new javax.swing.JLabel();
        jlblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblIdCliente = new javax.swing.JLabel();
        jtxtIdCliente = new javax.swing.JTextField();

        jlblDocum.setText("Documento:");

        jlblNombre.setText("Nombre:");

        jlblApell.setText("Apellido:");

        jlblDomicilio.setText("Domicilio:");

        jlblTelef.setText("Telefono");

        jlblStado.setText("Estado");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jtxtApell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellActionPerformed(evt);
            }
        });

        jtxtDomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDomiActionPerformed(evt);
            }
        });

        jtxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNIActionPerformed(evt);
            }
        });

        jtxtTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefActionPerformed(evt);
            }
        });

        jrbtStado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtStadoActionPerformed(evt);
            }
        });

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jbtAgregar.setText("Agregar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jbtModif.setText("Modificar");
        jbtModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModifActionPerformed(evt);
            }
        });

        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jlblIconito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/usuario-default-mini.png"))); // NOI18N

        jlblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlblTitulo.setText("Administracion de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblIconito)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jlblTitulo))
                    .addComponent(jlblIconito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlblIdCliente.setText("ID Cliente:");

        jtxtIdCliente.setEditable(false);
        jtxtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblNombre)
                            .addComponent(jlblApell)
                            .addComponent(jlblDomicilio)
                            .addComponent(jlblDocum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblStado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtModif)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtApell, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbtStado)
                                        .addComponent(jtxtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jbtBuscar)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblApell))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDomicilio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDocum)
                    .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelef)
                    .addComponent(jtxtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblStado)
                    .addComponent(jrbtStado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIdCliente)
                    .addComponent(jtxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAgregar)
                    .addComponent(jbtModif)
                    .addComponent(jbtEliminar)
                    .addComponent(jbtSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtApellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellActionPerformed

    private void jtxtDomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDomiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDomiActionPerformed

    private void jtxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDNIActionPerformed

    private void jtxtTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefActionPerformed

    private void jrbtStadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtStadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbtStadoActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        // TODO add your handling code here:
        try{
            int dni = Integer.parseInt(jtxtDNI.getText());
            clienteActual = clidData.buscarClientePorDni(dni);

            if (clienteActual != null) {
                
                jtxtNombre.setText(clienteActual.getNombre());
                jtxtApell.setText(clienteActual.getApellido());
                jtxtDomi.setText(clienteActual.getDomicilio());
                jtxtTelef.setText(clienteActual.getTelefono());
                jrbtStado.setSelected(clienteActual.isEstado());
                jtxtIdCliente.setText(String.valueOf(clienteActual.getId_cliente()));

            }

        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento válido");
            return;
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        try {
            int documento = Integer.parseInt(jtxtDNI.getText());
            String nombre = jtxtNombre.getText();
            String apellido = jtxtApell.getText();
            String domicilio = jtxtDomi.getText();
            String telefono = jtxtTelef.getText();
            if (nombre.isEmpty() || apellido.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() || String.valueOf(documento).isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
                return;

            }
            boolean estado = jrbtStado.isSelected();

            if (clienteActual == null) {
                clienteActual = new Cliente(nombre, apellido, domicilio, documento, telefono, estado);

                clidData.guardarCliente(clienteActual);

            } else {
                clienteActual.setNombre(nombre);
                clienteActual.setApellido(apellido);
                clienteActual.setDomicilio(domicilio);
                clienteActual.setDni(documento);
                clienteActual.setTelefono(telefono);
                clienteActual.setEstado(estado);
                clidData.modificarCliente(clienteActual);
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Usted debe ingresar un dni valido.");
        }
        limpiarFormulario();
        clienteActual = null;
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jbtModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModifActionPerformed
        // TODO add your handling code here:
        
        String nombre = jtxtNombre.getText();
        String apellido = jtxtApell.getText();
        String domicilio = jtxtDomi.getText();
        String telefono = jtxtTelef.getText();
        int documento = Integer.parseInt(jtxtDNI.getText());
        
        if (nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar tanto nombre como apellido del cliente.");
            return;
        } 
        if (domicilio.isEmpty()){
            JOptionPane.showMessageDialog(this, "El domicilio no puede estar vacio.");
            return;
        }
        if (telefono.isEmpty()){
            JOptionPane.showMessageDialog(this, "Es necesario un numero de telefono para contactar el cliente.");
            return;
        }
        
        if (String.valueOf(documento) == null){
            JOptionPane.showMessageDialog(this, "El documento no puede estar vacio.");
        }
        
        boolean estado = jrbtStado.isSelected();

        if (clienteActual == null) {
            JOptionPane.showMessageDialog(this,"Usted no puede eliminar un cliente de esta forma.");

        } else {
            clienteActual.setNombre(nombre);
            clienteActual.setApellido(apellido);
            clienteActual.setDomicilio(domicilio);
            clienteActual.setDni(documento);
            
            
            
            clienteActual.setEstado(estado);
            clidData.modificarCliente(clienteActual);
        }
    }//GEN-LAST:event_jbtModifActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        // TODO add your handling code here:

        if(clienteActual!=null){

            clidData.eliminarCliente(clienteActual.getId_cliente());
            clienteActual=null;
            limpiarFormulario();
        }else {

            JOptionPane.showMessageDialog(this, "No hay un cliente seleccionado");
        }
    }//GEN-LAST:event_jbtEliminarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jtxtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdClienteActionPerformed

    private void limpiarFormulario(){
        
        jtxtNombre.setText("");
        jtxtApell.setText("");
        jtxtDomi.setText("");
        jtxtDNI.setText("");
        jtxtTelef.setText("");
        jrbtStado.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtModif;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JLabel jlblApell;
    private javax.swing.JLabel jlblDocum;
    private javax.swing.JLabel jlblDomicilio;
    private javax.swing.JLabel jlblIconito;
    private javax.swing.JLabel jlblIdCliente;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblStado;
    private javax.swing.JLabel jlblTelef;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JRadioButton jrbtStado;
    private javax.swing.JTextField jtxtApell;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDomi;
    private javax.swing.JTextField jtxtIdCliente;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelef;
    // End of variables declaration//GEN-END:variables
}
