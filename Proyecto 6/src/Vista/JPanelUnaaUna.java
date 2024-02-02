
package Vista;

import Controlador.ControladorCuenta;
import Controlador.ControladorEmpresario;
import Controlador.MyException;
import Modelo.Cuenta;
import Modelo.Empresa;
import Modelo.Empresario;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class JPanelUnaaUna extends javax.swing.JPanel {

    public Empresario empresario;
    public Empresario ultimo;
    public Empresario primero;
    public ControladorEmpresario ce;
    public ControladorCuenta cc;
    public Empresa Empresa;
    
    public JPanelUnaaUna(Empresa E){
        initComponents();
        ce =  new ControladorEmpresario(E.getNif());
        ultimo = ce.ultimo();
        primero = ce.primero();
        empresario = primero;
        pintar();
        btanterior.setEnabled(false);
        Empresa = E;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        btsiguiente = new javax.swing.JButton();
        btanterior = new javax.swing.JButton();
        btprimero = new javax.swing.JButton();
        btultimo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtdinero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btañadir = new javax.swing.JButton();
        btconfirmar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btborrar = new javax.swing.JButton();

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Fecha nacimiento");

        btsiguiente.setText("Siguiente");
        btsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiguienteActionPerformed(evt);
            }
        });

        btanterior.setText("Anterior");
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });

        btprimero.setText("Primero");
        btprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprimeroActionPerformed(evt);
            }
        });

        btultimo.setText("Ultimo");
        btultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btultimoActionPerformed(evt);
            }
        });

        jLabel5.setText("Dinero");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btañadir.setText("Añadir");
        btañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btañadirActionPerformed(evt);
            }
        });

        btconfirmar.setText("Confirmar");
        btconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmarActionPerformed(evt);
            }
        });

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btborrar.setText("Borrar");
        btborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btprimero, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btanterior, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btcancelar)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btañadir)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btultimo))
                                    .addComponent(btsiguiente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btborrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btconfirmar)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(65, 65, 65))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(97, 97, 97)))
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfecha)
                                    .addComponent(txtdinero))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btanterior)
                    .addComponent(btsiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimero)
                    .addComponent(btañadir)
                    .addComponent(btultimo))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmar)
                    .addComponent(btcancelar)
                    .addComponent(btborrar))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
        empresario = ce.previus();
        pintar();
        btsiguiente.setEnabled(true);
        if(empresario.equals(primero)){
            btanterior.setEnabled(false);
        }
    }//GEN-LAST:event_btanteriorActionPerformed

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed
        empresario = ce.next();
        pintar();
        btanterior.setEnabled(true);
        if(empresario.equals(ultimo)){
            btsiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btsiguienteActionPerformed

    private void btprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprimeroActionPerformed
        empresario = ce.primero();
        pintar();
    }//GEN-LAST:event_btprimeroActionPerformed

    private void btultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btultimoActionPerformed
        empresario = ce.ultimo();
        pintar();
    }//GEN-LAST:event_btultimoActionPerformed

    private void btañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btañadirActionPerformed
        txtapellidos.setText("");
        txtfecha.setText("");
        txtnombre.setText("");
        txtdni.setText("");
        txtapellidos.setEditable(true);
        txtfecha.setEditable(true);
        txtnombre.setEditable(true);
        txtdni.setEditable(true);
        btsiguiente.setEnabled(false);
        btanterior.setEnabled(false);
        btultimo.setEnabled(false);
        btprimero.setEnabled(false);
        btconfirmar.setEnabled(true);
        btcancelar.setEnabled(true);
    }//GEN-LAST:event_btañadirActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        pintar();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmarActionPerformed
        int dni = Integer.parseInt(txtdni.getText());
        String nombre = txtnombre.getText();
        String apellido = txtapellidos.getText();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(txtfecha.getText());
        } catch (ParseException ex) {
            Logger.getLogger(JPanelUnaaUna.class.getName()).log(Level.SEVERE, null, ex);
        }
        int nif_empresa = Empresa.getNif();
        
        try {
            ce.insertar(dni, nombre, apellido, fecha);
        } catch (MyException ex) {
            Logger.getLogger(JPanelUnaaUna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btconfirmarActionPerformed

    private void btborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btborrarActionPerformed
        int dni = Integer.parseInt(txtdni.getText());
        try {
            ce.eliminar(dni);
        } catch (MyException ex) {
            Logger.getLogger(JPanelUnaaUna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btborrarActionPerformed

    public void pintar(){
        cc = new ControladorCuenta(empresario.getDni());
        txtdni.setText(""+empresario.getDni());
        txtnombre.setText(empresario.getNombre());
        txtapellidos.setText(empresario.getApellido());
        txtfecha.setText(""+empresario.getFechaNacimiento());
        txtapellidos.setEditable(false);
        txtdinero.setEditable(false);
        txtfecha.setEditable(false);
        txtnombre.setEditable(false);
        txtdni.setEditable(false);
        btconfirmar.setEnabled(false);
        btcancelar.setEnabled(false);
        btultimo.setEnabled(true);
        btprimero.setEnabled(true);
        lista();
    }
    
    public void lista(){
        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Cuenta> cuentas = null;
        try {
            cuentas = cc.cuentas();
        } catch (MyException ex) {
            Logger.getLogger(JPanelUnaaUna.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList s = new ArrayList();
        txtdinero.setText(""+cc.obtenerdinero(cuentas));
        cuentas.forEach((e) -> {
            s.add(e.toString());
        });
        
        jList1.setModel(modelo);
        
        for(int i = 0; i < s.size(); i++){
            modelo.addElement(s.get(i));
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btanterior;
    private javax.swing.JButton btañadir;
    private javax.swing.JButton btborrar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirmar;
    private javax.swing.JButton btprimero;
    private javax.swing.JButton btsiguiente;
    private javax.swing.JButton btultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdinero;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
