package vista;

import dao.tbPersonaDAO;
import entity.Tbpersona;
import javax.swing.JOptionPane;

/**
 *
 * @author Marlon
 */
public class frmPersona extends javax.swing.JFrame {

    private tbPersonaDAO pdao = new tbPersonaDAO();

    /**
     * Creates new form frmPersona
     */
    public frmPersona() {
        initComponents();
        this.setTitle("Persona");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        limpiar();
        listarTabla("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPersonaDatos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnBuscarId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("TELEFONO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("FORMULARIO PERSONA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("NOMBRES:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("APELLIDOS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("EDAD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, 30));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, 30));

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 300, 30));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 300, 30));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 30));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        tbPersonaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPersonaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPersonaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 410, 190));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        btnBuscarId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarId.setText("BUSCAR");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombres.getText().equals("")
                || txtApellidos.getText().equals("")
                || txtEdad.getText().equals("")
                || txtTelefono.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");

        } else {
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String telefono = txtTelefono.getText();

            String mensaje = "";
            mensaje = pdao.insertarPersona(nombres, apellidos, edad, telefono);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiar();
            listarTabla("");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "solo ingresar numeros");
        }

    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (txtId.getText().equals("")
                || txtNombres.getText().equals("")
                || txtApellidos.getText().equals("")
                || txtEdad.getText().equals("")
                || txtTelefono.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
        } else {
            int id = Integer.parseInt(txtId.getText());
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String telefono = txtTelefono.getText();

            String mensaje = "";
            mensaje = pdao.actualizarPersona(id, nombres, apellidos, edad, telefono);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiar();
            listarTabla("");

        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtId.getText().equals("")
                || txtNombres.getText().equals("")
                || txtApellidos.getText().equals("")
                || txtEdad.getText().equals("")
                || txtTelefono.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
        } else {

            String mensaje = "";
            int id = Integer.parseInt(txtId.getText());
            mensaje = pdao.eliminarPersona(id);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiar();
            listarTabla("");

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbPersonaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonaDatosMouseClicked

        int select = tbPersonaDatos.getSelectedRow();
        txtId.setText((String) tbPersonaDatos.getValueAt(select, 0));
        txtNombres.setText((String) tbPersonaDatos.getValueAt(select, 1));
        txtApellidos.setText((String) tbPersonaDatos.getValueAt(select, 2));
        txtEdad.setText((String) tbPersonaDatos.getValueAt(select, 3));
        txtTelefono.setText((String) tbPersonaDatos.getValueAt(select, 4));

    }//GEN-LAST:event_tbPersonaDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        listarTabla("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        listarTabla(txtNombres.getText());
    }//GEN-LAST:event_txtNombresKeyReleased

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed

        if (txtId.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "El campo id esta vacio");
        } else {

            int id = Integer.parseInt(txtId.getText());//pasamos el id
            Tbpersona persona = pdao.buscarPersonaId(id);//pasmos el objeto a un objeto persona
            //aqui es donde pasaremos los datos a los txt
            txtNombres.setText(persona.getNombres());
            txtApellidos.setText(persona.getApellidos());
            txtEdad.setText(persona.getEdad() + "");
            txtTelefono.setText(persona.getTelefono());

        }


    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void limpiar() {

        txtId.setText(pdao.idIncrementable());
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");

    }

    private void listarTabla(String nombres) {

        pdao.listarPersonas(tbPersonaDatos, nombres);

    }

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPersonaDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
