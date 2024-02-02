
package Vista;

import Controlador.ControladorEmpresario;
import Modelo.Empresario;
import javax.swing.table.DefaultTableModel;

public class JPanelTabla extends javax.swing.JPanel {
    ControladorEmpresario ce;
    JFramePrincipal JFP;
    DefaultTableModel dtm;
    public JPanelTabla(JFramePrincipal jfp) {
        initComponents();
        this.JFP = jfp;
        ce = new ControladorEmpresario(JFP.E.getNif());
        table();
    }
    
    public void table(){
        Object[] manolo = new Object[5];
        Empresario e;
        dtm = (DefaultTableModel) JTable.getModel();
        while(!ce.isLast()){
            e = ce.obtener();
            manolo[0] = e.getDni();
            manolo[1] = e.getNombre();
            manolo[2] = e.getApellido();
            manolo[3] = e.getFechaNacimiento();
            manolo[4] = e.getDineroBanco();
            dtm.addRow(manolo);
        }
        JTable.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Fecha nacimiento", "Dinero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
