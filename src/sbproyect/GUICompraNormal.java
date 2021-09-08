package sbproyect;

import javax.swing.table.DefaultTableModel;

public class GUICompraNormal extends javax.swing.JFrame {
    
    DefaultTableModel datos;
    CompraNormal compraNormal;
    /**
     * Creates new form GUISalaNormal
     */
    public GUICompraNormal() {
        initComponents();
        datos = new DefaultTableModel();
        datos.addColumn("");
        char f = 65;
        for(int i=0 ; i < SalaNormal.getCOLUMNAS() ; i++){
            datos.addColumn((char)(f+i));
        }
        tblAsientosNormal.setModel(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEscogerAsientos = new javax.swing.JButton();
        cmbFila = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblNumeroSala = new javax.swing.JLabel();
        cmbHorarioFuncion = new javax.swing.JComboBox<>();
        cmbNumeroSala = new javax.swing.JComboBox<>();
        lblHorarioFuncion = new javax.swing.JLabel();
        btnVerAsientos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsientosNormal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInformacion = new javax.swing.JTextArea();
        cmbColumna = new javax.swing.JComboBox<>();
        btnRegistrarCompra = new javax.swing.JButton();

        setTitle("COMPRA SALA NORMAL");

        btnEscogerAsientos.setText("Escoger Asientos");
        btnEscogerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientosActionPerformed(evt);
            }
        });

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "" }));
        cmbFila.setSelectedIndex(-1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNumeroSala.setText("Sala:");

        cmbHorarioFuncion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Tarde: (4 pm)", "Noche: (10 pm)" }));
        cmbHorarioFuncion.setSelectedIndex(-1);

        cmbNumeroSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cmbNumeroSala.setSelectedIndex(-1);

        lblHorarioFuncion.setText("Horario de la función");

        btnVerAsientos.setText("Ver Asientos");
        btnVerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAsientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHorarioFuncion)
                    .addComponent(lblNumeroSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbHorarioFuncion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbNumeroSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnVerAsientos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroSala)
                    .addComponent(cmbNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorarioFuncion)
                    .addComponent(cmbHorarioFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnVerAsientos)
                .addGap(20, 20, 20))
        );

        tblAsientosNormal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAsientosNormal);

        txaInformacion.setColumns(20);
        txaInformacion.setRows(5);
        jScrollPane2.setViewportView(txaInformacion);

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));
        cmbColumna.setSelectedIndex(-1);

        btnRegistrarCompra.setText("Registrar Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnEscogerAsientos)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnRegistrarCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscogerAsientos)
                    .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarCompra)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerAsientosActionPerformed

        int fila = cmbFila.getSelectedIndex();
        int columna = cmbColumna.getSelectedIndex();
        if(cmbNumeroSala.getSelectedIndex()==0){
            if(cmbHorarioFuncion.getSelectedIndex()==0){
                MenuPrincipal.salasNormales[0].asientos[fila][columna + 1] = "OCUPADO";
            }
            if(cmbHorarioFuncion.getSelectedIndex()==1){
                MenuPrincipal.salasNormales[1].asientos[fila][columna + 1] = "OCUPADO";
            }
            if(cmbHorarioFuncion.getSelectedIndex()==2){
                MenuPrincipal.salasNormales[2].asientos[fila][columna + 1] = "OCUPADO";
            }
        }else{
        if(cmbNumeroSala.getSelectedIndex()==1){
            if(cmbHorarioFuncion.getSelectedIndex()==0){
                MenuPrincipal.salasNormales[3].asientos[fila][columna + 1] = "OCUPADO";
            }
            if(cmbHorarioFuncion.getSelectedIndex()==1){
                MenuPrincipal.salasNormales[4].asientos[fila][columna + 1] = "OCUPADO";
            }
            if(cmbHorarioFuncion.getSelectedIndex()==2){
                MenuPrincipal.salasNormales[5].asientos[fila][columna + 1] = "OCUPADO";
            }            
          }
        } 
        tblAsientosNormal.setValueAt("OCUPADO", fila, columna + 1);
    }//GEN-LAST:event_btnEscogerAsientosActionPerformed

    private void btnVerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAsientosActionPerformed
        // TODO add your handling code here:
        datos.setRowCount(0);
        if(cmbNumeroSala.getSelectedIndex()==0){
            if(cmbHorarioFuncion.getSelectedIndex()==0){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[0].asientos[i]);
            }
            if(cmbHorarioFuncion.getSelectedIndex()==1){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[1].asientos[i]);
            }
            if(cmbHorarioFuncion.getSelectedIndex()==2){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[2].asientos[i]);
            }
        }else{
        if(cmbNumeroSala.getSelectedIndex()==1){
            if(cmbHorarioFuncion.getSelectedIndex()==0){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[3].asientos[i]);
            }
            if(cmbHorarioFuncion.getSelectedIndex()==1){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[4].asientos[i]);
            }
            if(cmbHorarioFuncion.getSelectedIndex()==2){
                for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                    datos.addRow(MenuPrincipal.salasNormales[5].asientos[i]);
            }            
          }
        } 
    }//GEN-LAST:event_btnVerAsientosActionPerformed

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
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompraNormal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscogerAsientos;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JButton btnVerAsientos;
    private javax.swing.JComboBox<String> cmbColumna;
    private javax.swing.JComboBox<String> cmbFila;
    private javax.swing.JComboBox<String> cmbHorarioFuncion;
    private javax.swing.JComboBox<String> cmbNumeroSala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JLabel lblNumeroSala;
    private javax.swing.JTable tblAsientosNormal;
    private javax.swing.JTextArea txaInformacion;
    // End of variables declaration//GEN-END:variables
}
