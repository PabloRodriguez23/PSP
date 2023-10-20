/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA03;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 *
 * @author Pablo
 */
public class Vista1 extends javax.swing.JFrame {

    /**
     * Creates new form Vista1
     */
    MyList Lista;
    boolean modificar=false;
    public Vista1() {
        
        initComponents();
        Lista = new MyList();
        Empleado emp1 =new Empleado("Pablo",0,"Manolo lama",954717171,2023,8,12);
        Empleado emp2 =new Empleado("Alba",1,"Kiko rivera",954710000,1945,5,25);
        Empleado emp3 =new Empleado("Abel",2,"Isabel Pantoja",954711111,2003,2,19);
        Lista.add(emp1);
        Lista.add(emp2);
        Lista.add(emp3);
        inicio(Lista);
    }

    @SuppressWarnings("unchecked")
    
    public void inicio(MyList Lista){
        Empleado aux = (Empleado) Lista.getActual().getMain();
        txtnumero.setEditable(false);
        txtnombre.setEditable(false);
        txtfechaalta.setEditable(false);
        txtdireccion.setEditable(false);
        txttelefono.setEditable(false);
        txtnumero.setText(""+aux.getNumero());
        txtnombre.setText(""+aux.getNombre());
        txtfechaalta.setText(""+(aux.getFechaalta()).get(DAY_OF_MONTH)+"/"+(aux.getFechaalta()).get(MONTH)+"/"+(aux.getFechaalta()).get(YEAR));
        txtdireccion.setText(""+aux.getDireccion());
        txttelefono.setText(""+aux.getTelefono());
        Bconfirmar.setEnabled(false);
        Bcancelar.setEnabled(false);
    }
    
    public void crear(){
        txtnumero.setText("");
        txtnombre.setText("");
        txtfechaalta.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        Bconfirmar.setEnabled(true);
        Bcancelar.setEnabled(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLNumero = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLfechaalta = new javax.swing.JLabel();
        JLdireccion = new javax.swing.JLabel();
        JLtelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtfechaalta = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        Banterior = new javax.swing.JButton();
        Bcancelar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        Bcrear = new javax.swing.JButton();
        Bsiguiente = new javax.swing.JButton();
        Bconfirmar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        CBfiltrar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLNumero.setText("Numero");

        JLNombre.setText("Nombre");

        JLfechaalta.setText("fechaalta");

        JLdireccion.setText("Direccion");

        JLtelefono.setText("telefono");

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        Banterior.setText("Anterior");
        Banterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanteriorActionPerformed(evt);
            }
        });

        Bcancelar.setText("Cancelar");
        Bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelarActionPerformed(evt);
            }
        });

        Bmodificar.setText("Modificar");
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });

        Bcrear.setText("Crear");
        Bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcrearActionPerformed(evt);
            }
        });

        Bsiguiente.setText("Siguiente");
        Bsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsiguienteActionPerformed(evt);
            }
        });

        Bconfirmar.setText("Confirmar");
        Bconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconfirmarActionPerformed(evt);
            }
        });

        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        CBfiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBfiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNumero)
                            .addComponent(JLNombre)
                            .addComponent(JLfechaalta)
                            .addComponent(JLdireccion)
                            .addComponent(JLtelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre)
                            .addComponent(txtfechaalta)
                            .addComponent(txtdireccion)
                            .addComponent(txtnumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Banterior)
                                .addGap(30, 30, 30)
                                .addComponent(Bcrear))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bcancelar)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Beliminar)
                                    .addComponent(Bmodificar))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bconfirmar)
                            .addComponent(Bsiguiente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfechaalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLfechaalta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLdireccion)))
                    .addComponent(JLNumero))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLtelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Banterior)
                    .addComponent(Bcrear)
                    .addComponent(Bsiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bconfirmar)
                    .addComponent(Bmodificar)
                    .addComponent(Bcancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Beliminar)
                    .addComponent(CBfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void BanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanteriorActionPerformed
        if(!Lista.esprimero()){
            Bsiguiente.setEnabled(true);
            Banterior.setEnabled(true);
            Lista.anterior();
            inicio(Lista);
        }else{
            Bsiguiente.setEnabled(true);
            Banterior.setEnabled(false);
            Lista.anterior();
            inicio(Lista);
        }
    }//GEN-LAST:event_BanteriorActionPerformed

    private void BsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsiguienteActionPerformed
        if(!Lista.esultimo()){
            Bsiguiente.setEnabled(true);
            Banterior.setEnabled(true);
            Lista.siguiente();
            inicio(Lista);
        }else{
            Bsiguiente.setEnabled(false);
            Banterior.setEnabled(true);
            Lista.siguiente();
            inicio(Lista);
        }
    }//GEN-LAST:event_BsiguienteActionPerformed

    private void BcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcrearActionPerformed
        crear();
        txtnumero.setEditable(true);
        txtnombre.setEditable(true);
        txtdireccion.setEditable(true);
        txttelefono.setEditable(true);
        Bsiguiente.setEnabled(false);
        Banterior.setEnabled(false);
    }//GEN-LAST:event_BcrearActionPerformed

    private void BconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconfirmarActionPerformed
        if(modificar==true){
            String num=txtnumero.getText();
            String nom=txtnombre.getText();
            String dir=txtdireccion.getText();
            String tel=txttelefono.getText();
            int nume = Integer.parseInt(num);
            int tele = Integer.parseInt(tel);
            Empleado aux = (Empleado) Lista.getActual().getMain();
            aux.setNombre(nom);
            aux.setNumero(nume);
            aux.setDireccion(dir);
            aux.setTelefono(tele);
            modificar = false;
            inicio(Lista);
            Bsiguiente.setEnabled(true);
            Banterior.setEnabled(true);
        }else{
        String num=txtnumero.getText();
        String nom=txtnombre.getText();
        String dir=txtdireccion.getText();
        String tel=txttelefono.getText();
        int nume = Integer.parseInt(num);
        int tele = Integer.parseInt(tel);
        Empleado nuevo = new Empleado(nom,nume,dir,tele);
        Lista.add(nuevo);
        inicio(Lista);
        Bsiguiente.setEnabled(true);
        Banterior.setEnabled(true);
        }
    }//GEN-LAST:event_BconfirmarActionPerformed

    private void BcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelarActionPerformed
        inicio(Lista);
    }//GEN-LAST:event_BcancelarActionPerformed

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        txtnumero.setEditable(true);
        txtnombre.setEditable(true);
        txtdireccion.setEditable(true);
        txttelefono.setEditable(true);
        Bsiguiente.setEnabled(false);
        Banterior.setEnabled(false);
        Bconfirmar.setEnabled(true);
        Bcancelar.setEnabled(true);
        modificar=true;
    }//GEN-LAST:event_BmodificarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
        Lista.remove();
        inicio(Lista);
    }//GEN-LAST:event_BeliminarActionPerformed

    private void CBfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBfiltrarActionPerformed
        
    }//GEN-LAST:event_CBfiltrarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Banterior;
    private javax.swing.JButton Bcancelar;
    private javax.swing.JButton Bconfirmar;
    private javax.swing.JButton Bcrear;
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JButton Bsiguiente;
    private javax.swing.JComboBox<String> CBfiltrar;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLNumero;
    private javax.swing.JLabel JLdireccion;
    private javax.swing.JLabel JLfechaalta;
    private javax.swing.JLabel JLtelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfechaalta;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
