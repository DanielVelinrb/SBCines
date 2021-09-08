package sbproyect;

import javax.swing.table.DefaultTableModel;

public class GUICompraAsistida extends javax.swing.JFrame {

    DefaultTableModel datos;
    CompraAsistida compraAsistida;
    
    public GUICompraAsistida() {
        initComponents();
        datos = new DefaultTableModel();
        datos.addColumn("");
        char f = 65;
        for (int i=0;i<SalaAsistida.getCOLUMNAS();i++){
            datos.addColumn((char)(f+i));
        }
        
        tblAsientosAsistidos.setModel(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHorarioFuncion = new javax.swing.JLabel();
        cmbHorarios = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnEscogerAsientos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsientosAsistidos = new javax.swing.JTable();
        btnRegistrarCompra = new javax.swing.JButton();
        cmbFila = new javax.swing.JComboBox<>();
        lblFila = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        cmbColumna = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInformacion = new javax.swing.JTextArea();

        setTitle("COMPRA SALA ASISTIDA");

        lblHorarioFuncion.setText("Horario de la función");

        cmbHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Tarde: (4 pm)", "Noche: (10 pm)" }));
        cmbHorarios.setSelectedIndex(-1);
        cmbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorariosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alimentos"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        btnEscogerAsientos.setText("Escoger Asientos");
        btnEscogerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientosActionPerformed(evt);
            }
        });

        tblAsientosAsistidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAsientosAsistidos);

        btnRegistrarCompra.setText("Registrar Compra");

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbFila.setSelectedIndex(-1);
        cmbFila.setToolTipText("");

        lblFila.setText("Fila:");

        lblColumna.setText("Columna:");

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));
        cmbColumna.setSelectedIndex(-1);

        txaInformacion.setColumns(20);
        txaInformacion.setRows(5);
        jScrollPane2.setViewportView(txaInformacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnRegistrarCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHorarioFuncion)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblFila)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblColumna)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnEscogerAsientos))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorarioFuncion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscogerAsientos)
                    .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFila)
                    .addComponent(lblColumna)
                    .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRegistrarCompra)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerAsientosActionPerformed

        int fila = cmbFila.getSelectedIndex();
        int columna = cmbColumna.getSelectedIndex();
        if(cmbHorarios.getSelectedIndex()==0)
            MenuPrincipal.salasAsistidas[0].asientos[fila][columna+1] = "OCUPADO";
        if(cmbHorarios.getSelectedIndex()==1)
            MenuPrincipal.salasAsistidas[1].asientos[fila][columna+1] = "OCUPADO";
        if(cmbHorarios.getSelectedIndex()==2)
            MenuPrincipal.salasAsistidas[2].asientos[fila][columna+1] = "OCUPADO";
        
        tblAsientosAsistidos.setValueAt("OCUPADO", fila, columna+1);
    }//GEN-LAST:event_btnEscogerAsientosActionPerformed

    private void cmbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorariosActionPerformed
        datos.setRowCount(0);
        if(cmbHorarios.getSelectedIndex() == 0){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[0].asientos[i]);
            }
        }
        if(cmbHorarios.getSelectedIndex()==1){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[1].asientos[i]);
            }
        }
        if(cmbHorarios.getSelectedIndex()==2){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[2].asientos[i]);
            }
        }
    }//GEN-LAST:event_cmbHorariosActionPerformed

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
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompraAsistida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscogerAsientos;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JComboBox<String> cmbColumna;
    private javax.swing.JComboBox<String> cmbFila;
    private javax.swing.JComboBox<String> cmbHorarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JTable tblAsientosAsistidos;
    private javax.swing.JTextArea txaInformacion;
    // End of variables declaration//GEN-END:variables
}
