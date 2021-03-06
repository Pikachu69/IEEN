
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class ventanaNotificaciones extends javax.swing.JFrame {

    
    boolean validacion = true;
    conexion con;
    DefaultTableModel modelo;
    private String accion, id_actualizar,sql,mensaje;
    String campoconsulta;
    
    /**
     * Creates new form ventanaNotificaciones
     */
    public ventanaNotificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
         primerCargaNot();
    }
    
    public void  primerCargaNot(){
        String[] titulos={"ID","Nombre","Marca","Tipo","Motivo", "Departamento"};

        String[] registros= new String[6];
        modelo = new DefaultTableModel(null,titulos);
        try {
            //Mostrar registros en la tabla
            con = new conexion();
            ResultSet consulta= con.primerCargaNot();
            while(consulta.next()){
                registros[0] = consulta.getString("idproductos");
                registros[1] = consulta.getString("nom_pro");
                registros[2] = consulta.getString("mar_pro");
                registros[3] = consulta.getString("mot_sol");
                registros[4] = consulta.getString("tipo_sol");
                registros[5] = consulta.getString("depar");
                modelo.addRow(registros);               
            }
            //Mostrar titulos de la tabla
            tablaNoti.setModel(modelo);
            
        } catch (SQLException ex) {    
            JOptionPane.showMessageDialog(null,ex);
        }
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
        BarraLatera = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        atrasBtn = new javax.swing.JButton();
        inventarioBtn = new javax.swing.JButton();
        panelNotificaciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNoti = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        labelInventario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        BarraLatera.setBackground(new java.awt.Color(255, 255, 255));
        BarraLatera.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(150, 120));
        BarraLatera.add(logo);
        logo.setBounds(20, 70, 150, 120);

        atrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });
        BarraLatera.add(atrasBtn);
        atrasBtn.setBounds(0, 0, 40, 30);

        inventarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NotificacionesAct.png"))); // NOI18N
        BarraLatera.add(inventarioBtn);
        inventarioBtn.setBounds(0, 210, 190, 70);

        jPanel1.add(BarraLatera);
        BarraLatera.setBounds(0, 0, 190, 810);

        panelNotificaciones.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione una fila para poder acceder a la información de esa notificación.");
        panelNotificaciones.add(jLabel1);
        jLabel1.setBounds(20, 90, 480, 20);

        tablaNoti.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaNoti);

        panelNotificaciones.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 550, 650);

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Notificaciones");
        panelNotificaciones.add(jLabel22);
        jLabel22.setBounds(20, 10, 290, 90);

        labelInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BackgroundNotificaciones.png"))); // NOI18N
        panelNotificaciones.add(labelInventario);
        labelInventario.setBounds(0, 0, 588, 808);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Instituto Estatal Electoral de Nayarit");
        panelNotificaciones.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 40);

        jPanel1.add(panelNotificaciones);
        panelNotificaciones.setBounds(190, 0, 590, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        this.setVisible(false);
        new ventanaInicio().setVisible(true);
    }//GEN-LAST:event_atrasBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaNotificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaNotificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLatera;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JButton inventarioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInventario;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelNotificaciones;
    private javax.swing.JTable tablaNoti;
    // End of variables declaration//GEN-END:variables
}
