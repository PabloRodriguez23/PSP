
package Vista;

import Controlador.ControladorEmpresario;
import Modelo.Empresa;
import Modelo.Empresario;

public class JPanelUnaaUna extends javax.swing.JPanel {

    public Empresario empresario;
    public Empresario ultimo;
    public Empresario primero;
    public ControladorEmpresario ce;
    
    public JPanelUnaaUna(Empresa E){
        initComponents();
        ce =  new ControladorEmpresario(E.getNif());
        ultimo = ce.ultimo();
        primero = ce.primero();
        empresario = primero;
        pintar();
        btanterior.setEnabled(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btanterior)
                                .addGap(63, 63, 63)
                                .addComponent(btsiguiente)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btprimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                                .addComponent(btultimo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
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
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsiguiente)
                    .addComponent(btanterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btprimero)
                    .addComponent(btultimo))
                .addGap(46, 46, 46))
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

    public void pintar(){
        txtdni.setText(""+empresario.getDni());
        txtnombre.setText(empresario.getNombre());
        txtapellidos.setText(empresario.getApellido());
        txtfecha.setText(""+empresario.getFechaNacimiento());
        txtdinero.setText(""+empresario.getDineroBanco());
        txtapellidos.setEditable(false);
        txtdinero.setEditable(false);
        txtfecha.setEditable(false);
        txtnombre.setEditable(false);
        txtdni.setEditable(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btanterior;
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
