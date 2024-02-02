
package Vista;

import Controlador.ControladorEmpresa;
import Controlador.Controlador_log;
import Controlador.MyException;
import Modelo.Empresa;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JPanelPerfil extends javax.swing.JPanel {
    Empresa E;
    ControladorEmpresa ce = new ControladorEmpresa();
    public JPanelPerfil(Empresa e){
        initComponents();
        E = e;
        formato = new SimpleDateFormat("yyyy-MM-dd");
        
         Date fecha;
            try {
                String n = ""+ E.getFundacion();
                fecha = formato.parse(n);
                txtfundacion.setDate(fecha);
            } catch (ParseException ex) {
                Controlador_log n = new Controlador_log(ex);
            }
        
        /*String fecha = null;
        Date fecha2 = null;
        try{
           fecha = formato.format(E.getFundacion());
           fecha2 = formato.parse(fecha);
        }catch(ParseException ex){
             System.err.println("Error al analizar la fecha: " + ex.getMessage());
        }
        txtfundacion.setDate(fecha2);*/
        
        txtnif.setText(""+E.getNif());
        
        txtcontraseña.setText(""+E.getContrasena());
        txtnumsocios.setText(""+E.getNumsocios());
        mostarimagen();
    }
    
    public void mostarimagen(){
        img.setSize(168,168);
        ImageIcon image = new ImageIcon("src/fotos/"+E.getFoto());
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT)
        );
        img.setIcon(icon);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        txtnif = new javax.swing.JTextField();
        txtnumsocios = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtfundacion = new org.jdesktop.swingx.JXDatePicker();
        btmodificar = new javax.swing.JButton();

        jLabel1.setText("Nif");

        jLabel2.setText("Fundacion");

        jLabel3.setText("Num socios");

        txtnif.setEditable(false);

        txtnumsocios.setEditable(false);

        jLabel4.setText("Contraseña");

        txtfundacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfundacionActionPerformed(evt);
            }
        });

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnif)
                            .addComponent(txtfundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontraseña)
                            .addComponent(txtnumsocios))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btmodificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnumsocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(27, 27, 27)
                .addComponent(btmodificar)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfundacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfundacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfundacionActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        Date fecha = txtfundacion.getDate();
        int contraseña = Integer.parseInt(txtcontraseña.getText());
        try {
            ce.actualizar2(E.getNif(), fecha, contraseña);
        } catch (MyException ex) {
            Logger.getLogger(JPanelPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmodificar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtcontraseña;
    private org.jdesktop.swingx.JXDatePicker txtfundacion;
    private javax.swing.JTextField txtnif;
    private javax.swing.JTextField txtnumsocios;
    // End of variables declaration//GEN-END:variables

    SimpleDateFormat formato;
}
