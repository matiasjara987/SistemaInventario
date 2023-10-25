package vista;

import controlador.TextField;
import javax.swing.JTextField;



public class Logeo extends javax.swing.JFrame {

    public Logeo() {
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
        boximg = new javax.swing.JLabel();
        txtLOGIN = new javax.swing.JLabel();
        bgfont = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jERoundTextField1 = new controlador.JERoundTextField();
        jERoundTextField2 = new controlador.JERoundTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boximg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/box_1.png"))); // NOI18N
        boximg.setText("jLabel1");
        boximg.setPreferredSize(new java.awt.Dimension(400, 400));
        bg.add(boximg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        txtLOGIN.setBackground(new java.awt.Color(255, 255, 255));
        txtLOGIN.setFont(new java.awt.Font("Poppins", 1, 25)); // NOI18N
        txtLOGIN.setForeground(new java.awt.Color(0, 0, 0));
        txtLOGIN.setText("LOGIN");
        bg.add(txtLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        bgfont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        bgfont.setText("jLabel1");
        bg.add(bgfont, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 560, 510));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setText("Bienvenido a Tu Inventario Viewer");
        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jERoundTextField1.setBackground(new java.awt.Color(217, 217, 217));
        jERoundTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jERoundTextField1.setText("Password");
        jERoundTextField1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jERoundTextField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jERoundTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jERoundTextField1ActionPerformed(evt);
            }
        });
        bg.add(jERoundTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 40));

        jERoundTextField2.setBackground(new java.awt.Color(217, 217, 217));
        jERoundTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jERoundTextField2.setText("Username");
        jERoundTextField2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jERoundTextField2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jERoundTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jERoundTextField2ActionPerformed(evt);
            }
        });
        bg.add(jERoundTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jERoundTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jERoundTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jERoundTextField1ActionPerformed

    private void jERoundTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jERoundTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jERoundTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgfont;
    private javax.swing.JLabel boximg;
    private javax.swing.JLabel header;
    private controlador.JERoundTextField jERoundTextField1;
    private controlador.JERoundTextField jERoundTextField2;
    private javax.swing.JLabel txtLOGIN;
    // End of variables declaration//GEN-END:variables
}
