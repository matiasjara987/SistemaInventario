package vista;

import diseño.TextField;
import javax.swing.JTextField;



public class Crear extends javax.swing.JFrame {

    public Crear() {
        initComponents();
         this.setLocationRelativeTo(this);
         rsscalelabel.RSScaleLabel.setScaleLabel(boximg, "src/img/box_1.png");
     JTextField field = new TextField(15);
     
    this.add(field);
    this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        creacuenta = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        fieldemail = new diseño.JERoundTextField();
        fieldNombre = new diseño.JERoundTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldApellido = new diseño.JERoundTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldrut = new diseño.JERoundTextField();
        btn_sig = new diseño.Boton();
        btn_atras = new diseño.Boton();
        boximg = new javax.swing.JLabel();
        bgfont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        creacuenta.setBackground(new java.awt.Color(255, 255, 255));
        creacuenta.setFont(new java.awt.Font("Poppins", 1, 25)); // NOI18N
        creacuenta.setForeground(new java.awt.Color(0, 0, 0));
        creacuenta.setText("Crear Cuenta");

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        header1.setForeground(new java.awt.Color(0, 0, 0));
        header1.setText("Bienvenido a Tu Inventario Viewer");

        fieldemail.setBackground(new java.awt.Color(217, 217, 217));
        fieldemail.setForeground(new java.awt.Color(0, 0, 0));
        fieldemail.setText("Correo electrónico");
        fieldemail.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N
        fieldemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldemailMouseClicked(evt);
            }
        });
        fieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldemailActionPerformed(evt);
            }
        });

        fieldNombre.setBackground(new java.awt.Color(217, 217, 217));
        fieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        fieldNombre.setText("Nombres");
        fieldNombre.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldNombreMouseClicked(evt);
            }
        });
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos Personales");

        fieldApellido.setBackground(new java.awt.Color(217, 217, 217));
        fieldApellido.setForeground(new java.awt.Color(0, 0, 0));
        fieldApellido.setText("Apellidos");
        fieldApellido.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        fieldApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldApellidoMouseClicked(evt);
            }
        });
        fieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellidoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo Electrónico");

        fieldrut.setBackground(new java.awt.Color(217, 217, 217));
        fieldrut.setForeground(new java.awt.Color(0, 0, 0));
        fieldrut.setText("RUT");
        fieldrut.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        fieldrut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carnet.png"))); // NOI18N
        fieldrut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldrutMouseClicked(evt);
            }
        });
        fieldrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldrutActionPerformed(evt);
            }
        });

        btn_sig.setBackground(new java.awt.Color(255, 184, 29));
        btn_sig.setForeground(new java.awt.Color(255, 184, 29));
        btn_sig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siguiente.png"))); // NOI18N
        btn_sig.setRadius(100);
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });

        btn_atras.setBackground(new java.awt.Color(255, 184, 29));
        btn_atras.setForeground(new java.awt.Color(255, 184, 29));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        btn_atras.setRadius(100);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(creacuenta)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(header1)
                        .addGap(98, 98, 98))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldrut, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)))
                                .addGap(173, 173, 173))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sig, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(fieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(creacuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldrut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_sig, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 400, 510));

        boximg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box_1.png"))); // NOI18N
        boximg.setText("jLabel1");
        boximg.setPreferredSize(new java.awt.Dimension(400, 400));
        bg.add(boximg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        bgfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        bgfont.setText("jLabel1");
        bg.add(bgfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 544, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldemailActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void fieldrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldrutActionPerformed

    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
        CrearUser crus = new CrearUser();
        crus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sigActionPerformed

    private void fieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldNombreMouseClicked
        fieldNombre.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreMouseClicked

    private void fieldApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldApellidoMouseClicked
        fieldApellido.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoMouseClicked

    private void fieldrutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldrutMouseClicked
        fieldrut.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldrutMouseClicked

    private void fieldemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldemailMouseClicked
        fieldemail.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldemailMouseClicked

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
    Logeo log = new Logeo();
    log.setVisible(true);
    this.dispose();
 // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgfont;
    private javax.swing.JLabel boximg;
    private diseño.Boton btn_atras;
    private diseño.Boton btn_sig;
    private javax.swing.JLabel creacuenta;
    private diseño.JERoundTextField fieldApellido;
    private diseño.JERoundTextField fieldNombre;
    private diseño.JERoundTextField fieldemail;
    private diseño.JERoundTextField fieldrut;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
