
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class ventanaUsuario extends javax.swing.JFrame {
    /**
     * Creates new form ventanaUsuario
     */
    public ventanaUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelModificar.setVisible(false);
        panelRegistrar.setVisible(false);
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
        darDeBajaBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        darDeAltaBtn = new javax.swing.JButton();
        inventarioBtn = new javax.swing.JButton();
        areaAccion = new javax.swing.JPanel();
        panelModificar = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        guardarAltaBtn1 = new javax.swing.JButton();
        guardarAltaBtn2 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        marcaAltaField1 = new javax.swing.JTextField();
        modeloAltaField1 = new javax.swing.JTextField();
        fechaComAltaField1 = new javax.swing.JTextField();
        idAltaField1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        noFacAltaField1 = new javax.swing.JTextField();
        motorAltaField1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        subcatAltaField1 = new javax.swing.JTextField();
        noSerieAltaField1 = new javax.swing.JTextField();
        numeralAltaField1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        nombreAltaField1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        colorAltaField1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        placaAltaField1 = new javax.swing.JTextField();
        importeAltaField1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        colorAltaField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        panelRegistrar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        guardarAltaBtn3 = new javax.swing.JButton();
        guardarAltaBtn4 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        marcaAltaField2 = new javax.swing.JTextField();
        modeloAltaField2 = new javax.swing.JTextField();
        fechaComAltaField2 = new javax.swing.JTextField();
        idAltaField2 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        noFacAltaField2 = new javax.swing.JTextField();
        motorAltaField2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        subcatAltaField2 = new javax.swing.JTextField();
        noSerieAltaField2 = new javax.swing.JTextField();
        numeralAltaField2 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        nombreAltaField2 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        colorAltaField3 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        placaAltaField2 = new javax.swing.JTextField();
        importeAltaField2 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        colorAltaField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        labelInventario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1310, 820));
        setPreferredSize(new java.awt.Dimension(1310, 820));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1327, 803));
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

        darDeBajaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Baja.png"))); // NOI18N
        BarraLatera.add(darDeBajaBtn);
        darDeBajaBtn.setBounds(0, 420, 190, 70);

        modificarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        BarraLatera.add(modificarBtn);
        modificarBtn.setBounds(0, 350, 190, 70);

        darDeAltaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registrar.png"))); // NOI18N
        darDeAltaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darDeAltaBtnActionPerformed(evt);
            }
        });
        BarraLatera.add(darDeAltaBtn);
        darDeAltaBtn.setBounds(0, 280, 190, 70);

        inventarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuariosAct_1.png"))); // NOI18N
        BarraLatera.add(inventarioBtn);
        inventarioBtn.setBounds(0, 210, 190, 70);

        jPanel1.add(BarraLatera);
        BarraLatera.setBounds(0, 0, 190, 810);

        areaAccion.setBackground(new java.awt.Color(255, 255, 255));
        areaAccion.setLayout(null);

        panelModificar.setOpaque(false);
        panelModificar.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Modificar Información de Usuario");
        panelModificar.add(jLabel23);
        jLabel23.setBounds(70, 40, 620, 90);

        guardarAltaBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarAltaBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        panelModificar.add(guardarAltaBtn1);
        guardarAltaBtn1.setBounds(740, 470, 125, 40);

        guardarAltaBtn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarAltaBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        panelModificar.add(guardarAltaBtn2);
        guardarAltaBtn2.setBounds(900, 470, 125, 40);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setText("Nombre:");
        panelModificar.add(jLabel45);
        jLabel45.setBounds(70, 220, 110, 30);
        panelModificar.add(marcaAltaField1);
        marcaAltaField1.setBounds(150, 370, 200, 30);
        panelModificar.add(modeloAltaField1);
        modeloAltaField1.setBounds(440, 370, 240, 30);
        panelModificar.add(fechaComAltaField1);
        fechaComAltaField1.setBounds(440, 320, 240, 30);
        panelModificar.add(idAltaField1);
        idAltaField1.setBounds(150, 170, 130, 30);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("CURP:");
        panelModificar.add(jLabel53);
        jLabel53.setBounds(700, 320, 80, 30);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setText("Código Postal:");
        panelModificar.add(jLabel51);
        jLabel51.setBounds(700, 370, 120, 30);
        panelModificar.add(noFacAltaField1);
        noFacAltaField1.setBounds(470, 430, 210, 30);
        panelModificar.add(motorAltaField1);
        motorAltaField1.setBounds(250, 320, 130, 30);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setText("RFC:");
        panelModificar.add(jLabel54);
        jLabel54.setBounds(390, 320, 50, 30);
        panelModificar.add(subcatAltaField1);
        subcatAltaField1.setBounds(510, 220, 170, 30);
        panelModificar.add(noSerieAltaField1);
        noSerieAltaField1.setBounds(830, 370, 180, 30);
        panelModificar.add(numeralAltaField1);
        numeralAltaField1.setBounds(150, 220, 200, 30);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setText("ID:");
        panelModificar.add(jLabel44);
        jLabel44.setBounds(70, 170, 80, 30);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setText("Fecha de Nacimiento:");
        panelModificar.add(jLabel52);
        jLabel52.setBounds(70, 320, 170, 30);
        panelModificar.add(nombreAltaField1);
        nombreAltaField1.setBounds(840, 220, 170, 30);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setText("No. INE:");
        panelModificar.add(jLabel56);
        jLabel56.setBounds(70, 430, 120, 30);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Calle:");
        panelModificar.add(jLabel48);
        jLabel48.setBounds(70, 370, 110, 30);
        panelModificar.add(colorAltaField1);
        colorAltaField1.setBounds(150, 270, 200, 30);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setText("Telefono:");
        panelModificar.add(jLabel50);
        jLabel50.setBounds(70, 270, 130, 30);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Apellido Paterno:");
        panelModificar.add(jLabel47);
        jLabel47.setBounds(360, 220, 140, 30);
        panelModificar.add(placaAltaField1);
        placaAltaField1.setBounds(770, 320, 240, 30);
        panelModificar.add(importeAltaField1);
        importeAltaField1.setBounds(150, 430, 200, 30);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Colonia:");
        panelModificar.add(jLabel49);
        jLabel49.setBounds(360, 370, 110, 30);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Apellido Materno:");
        panelModificar.add(jLabel46);
        jLabel46.setBounds(690, 220, 150, 30);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setText("No. Licencia:");
        panelModificar.add(jLabel55);
        jLabel55.setBounds(360, 430, 120, 30);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setText("Celular:");
        panelModificar.add(jLabel57);
        jLabel57.setBounds(360, 270, 80, 30);
        panelModificar.add(colorAltaField2);
        colorAltaField2.setBounds(440, 270, 240, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Modifica los siguientes campos para editar la informacion de Perfil de un Usuario del Sistema.");
        panelModificar.add(jLabel1);
        jLabel1.setBounds(70, 120, 880, 20);

        areaAccion.add(panelModificar);
        panelModificar.setBounds(0, 0, 1110, 810);

        panelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        panelUsuarios.setOpaque(false);
        panelUsuarios.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        panelUsuarios.add(jScrollPane1);
        jScrollPane1.setBounds(70, 180, 1000, 580);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelUsuarios.add(jTextField1);
        jTextField1.setBounds(70, 120, 270, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        panelUsuarios.add(jButton1);
        jButton1.setBounds(380, 120, 125, 40);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Usuarios del Sistema");
        panelUsuarios.add(jLabel22);
        jLabel22.setBounds(70, 40, 480, 90);

        areaAccion.add(panelUsuarios);
        panelUsuarios.setBounds(0, 0, 1110, 810);

        panelRegistrar.setOpaque(false);
        panelRegistrar.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Registrar Perfil de Usuario");
        panelRegistrar.add(jLabel24);
        jLabel24.setBounds(70, 40, 620, 90);

        guardarAltaBtn3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarAltaBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        panelRegistrar.add(guardarAltaBtn3);
        guardarAltaBtn3.setBounds(740, 470, 125, 40);

        guardarAltaBtn4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarAltaBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        panelRegistrar.add(guardarAltaBtn4);
        guardarAltaBtn4.setBounds(900, 470, 125, 40);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setText("Nombre:");
        panelRegistrar.add(jLabel58);
        jLabel58.setBounds(70, 220, 110, 30);
        panelRegistrar.add(marcaAltaField2);
        marcaAltaField2.setBounds(150, 370, 200, 30);
        panelRegistrar.add(modeloAltaField2);
        modeloAltaField2.setBounds(440, 370, 240, 30);
        panelRegistrar.add(fechaComAltaField2);
        fechaComAltaField2.setBounds(440, 320, 240, 30);
        panelRegistrar.add(idAltaField2);
        idAltaField2.setBounds(150, 170, 130, 30);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setText("CURP:");
        panelRegistrar.add(jLabel59);
        jLabel59.setBounds(700, 320, 80, 30);

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Código Postal:");
        panelRegistrar.add(jLabel60);
        jLabel60.setBounds(700, 370, 120, 30);
        panelRegistrar.add(noFacAltaField2);
        noFacAltaField2.setBounds(470, 430, 210, 30);
        panelRegistrar.add(motorAltaField2);
        motorAltaField2.setBounds(250, 320, 130, 30);

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setText("RFC:");
        panelRegistrar.add(jLabel61);
        jLabel61.setBounds(390, 320, 50, 30);
        panelRegistrar.add(subcatAltaField2);
        subcatAltaField2.setBounds(510, 220, 170, 30);
        panelRegistrar.add(noSerieAltaField2);
        noSerieAltaField2.setBounds(830, 370, 180, 30);
        panelRegistrar.add(numeralAltaField2);
        numeralAltaField2.setBounds(150, 220, 200, 30);

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("ID:");
        panelRegistrar.add(jLabel62);
        jLabel62.setBounds(70, 170, 80, 30);

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setText("Fecha de Nacimiento:");
        panelRegistrar.add(jLabel63);
        jLabel63.setBounds(70, 320, 170, 30);
        panelRegistrar.add(nombreAltaField2);
        nombreAltaField2.setBounds(840, 220, 170, 30);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setText("No. INE:");
        panelRegistrar.add(jLabel64);
        jLabel64.setBounds(70, 430, 120, 30);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setText("Calle:");
        panelRegistrar.add(jLabel65);
        jLabel65.setBounds(70, 370, 110, 30);
        panelRegistrar.add(colorAltaField3);
        colorAltaField3.setBounds(150, 270, 200, 30);

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setText("Telefono:");
        panelRegistrar.add(jLabel66);
        jLabel66.setBounds(70, 270, 130, 30);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setText("Apellido Paterno:");
        panelRegistrar.add(jLabel67);
        jLabel67.setBounds(360, 220, 140, 30);
        panelRegistrar.add(placaAltaField2);
        placaAltaField2.setBounds(770, 320, 240, 30);
        panelRegistrar.add(importeAltaField2);
        importeAltaField2.setBounds(150, 430, 200, 30);

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setText("Colonia:");
        panelRegistrar.add(jLabel68);
        jLabel68.setBounds(360, 370, 110, 30);

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setText("Apellido Materno:");
        panelRegistrar.add(jLabel69);
        jLabel69.setBounds(690, 220, 150, 30);

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setText("No. Licencia:");
        panelRegistrar.add(jLabel70);
        jLabel70.setBounds(360, 430, 120, 30);

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setText("Celular:");
        panelRegistrar.add(jLabel71);
        jLabel71.setBounds(360, 270, 80, 30);
        panelRegistrar.add(colorAltaField4);
        colorAltaField4.setBounds(440, 270, 240, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Rellena los campos siguientes para registrar un usuario nuevo dentro del sistema.");
        panelRegistrar.add(jLabel9);
        jLabel9.setBounds(70, 120, 880, 20);

        areaAccion.add(panelRegistrar);
        panelRegistrar.setBounds(0, 0, 1140, 810);

        labelInventario.setBackground(new java.awt.Color(255, 255, 255));
        labelInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BackgroundGeneral.png"))); // NOI18N
        areaAccion.add(labelInventario);
        labelInventario.setBounds(0, 0, 1110, 810);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Instituto Estatal Electoral de Nayarit");
        areaAccion.add(jLabel4);
        jLabel4.setBounds(70, 0, 630, 40);

        jPanel1.add(areaAccion);
        areaAccion.setBounds(190, 0, 1110, 810);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1327, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        this.setVisible(false);
        new ventanaInicio().setVisible(true);
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        panelRegistrar.setVisible(false);
        panelUsuarios.setVisible(false);
        panelModificar.setVisible(true);     
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void darDeAltaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darDeAltaBtnActionPerformed
        panelRegistrar.setVisible(true);
        panelUsuarios.setVisible(false);
        panelModificar.setVisible(false); 
    }//GEN-LAST:event_darDeAltaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaUsuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLatera;
    private javax.swing.JPanel areaAccion;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JTextField colorAltaField1;
    private javax.swing.JTextField colorAltaField2;
    private javax.swing.JTextField colorAltaField3;
    private javax.swing.JTextField colorAltaField4;
    private javax.swing.JButton darDeAltaBtn;
    private javax.swing.JButton darDeBajaBtn;
    private javax.swing.JTextField fechaComAltaField1;
    private javax.swing.JTextField fechaComAltaField2;
    private javax.swing.JButton guardarAltaBtn1;
    private javax.swing.JButton guardarAltaBtn2;
    private javax.swing.JButton guardarAltaBtn3;
    private javax.swing.JButton guardarAltaBtn4;
    private javax.swing.JTextField idAltaField1;
    private javax.swing.JTextField idAltaField2;
    private javax.swing.JTextField importeAltaField1;
    private javax.swing.JTextField importeAltaField2;
    private javax.swing.JButton inventarioBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelInventario;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField marcaAltaField1;
    private javax.swing.JTextField marcaAltaField2;
    private javax.swing.JTextField modeloAltaField1;
    private javax.swing.JTextField modeloAltaField2;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField motorAltaField1;
    private javax.swing.JTextField motorAltaField2;
    private javax.swing.JTextField noFacAltaField1;
    private javax.swing.JTextField noFacAltaField2;
    private javax.swing.JTextField noSerieAltaField1;
    private javax.swing.JTextField noSerieAltaField2;
    private javax.swing.JTextField nombreAltaField1;
    private javax.swing.JTextField nombreAltaField2;
    private javax.swing.JTextField numeralAltaField1;
    private javax.swing.JTextField numeralAltaField2;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JTextField placaAltaField1;
    private javax.swing.JTextField placaAltaField2;
    private javax.swing.JTextField subcatAltaField1;
    private javax.swing.JTextField subcatAltaField2;
    // End of variables declaration//GEN-END:variables
}
