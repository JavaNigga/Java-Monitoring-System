/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;


/**
 *
 * @author merli
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        cabezera = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        parteArriba = new javax.swing.JPanel();
        menuProcesador = new javax.swing.JPanel();
        procesador = new javax.swing.JLabel();
        procesadorActivo = new javax.swing.JPanel();
        procesadorInfo = new javax.swing.JPanel();
        cpuNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cpuLogicos = new javax.swing.JLabel();
        cpuVendedor1 = new javax.swing.JLabel();
        cpuFisicos1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 884, 525));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabezera.setBackground(new java.awt.Color(33, 32, 32));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\merli\\Desktop\\Devs\\Java Thinks\\JavaMonitoringSystem\\src\\main\\java\\imagenes\\swing desing.png")); // NOI18N

        parteArriba.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout parteArribaLayout = new javax.swing.GroupLayout(parteArriba);
        parteArriba.setLayout(parteArribaLayout);
        parteArribaLayout.setHorizontalGroup(
            parteArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        parteArribaLayout.setVerticalGroup(
            parteArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parteArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(362, 362, 362))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabezeraLayout.createSequentialGroup()
                .addComponent(parteArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo.add(cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        menuProcesador.setBackground(new java.awt.Color(72, 71, 71));

        procesador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        procesador.setForeground(new java.awt.Color(255, 255, 255));
        procesador.setText("PROCESADOR");

        procesadorActivo.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout procesadorActivoLayout = new javax.swing.GroupLayout(procesadorActivo);
        procesadorActivo.setLayout(procesadorActivoLayout);
        procesadorActivoLayout.setHorizontalGroup(
            procesadorActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        procesadorActivoLayout.setVerticalGroup(
            procesadorActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuProcesadorLayout = new javax.swing.GroupLayout(menuProcesador);
        menuProcesador.setLayout(menuProcesadorLayout);
        menuProcesadorLayout.setHorizontalGroup(
            menuProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProcesadorLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(procesador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuProcesadorLayout.createSequentialGroup()
                .addComponent(procesadorActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 655, Short.MAX_VALUE))
        );
        menuProcesadorLayout.setVerticalGroup(
            menuProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProcesadorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(procesador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(procesadorActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondo.add(menuProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 890, 70));

        procesadorInfo.setBackground(new java.awt.Color(255, 255, 255));

        cpuNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpuNombre.setForeground(new java.awt.Color(102, 102, 102));
        cpuNombre.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("VENDEDOR:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPU LOGICOS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CPU FISICOS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NOMBRE:");

        cpuLogicos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpuLogicos.setForeground(new java.awt.Color(102, 102, 102));
        cpuLogicos.setText("NOMBRE:");

        cpuVendedor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpuVendedor1.setForeground(new java.awt.Color(102, 102, 102));
        cpuVendedor1.setText("NOMBRE:");

        cpuFisicos1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpuFisicos1.setForeground(new java.awt.Color(102, 102, 102));
        cpuFisicos1.setText("NOMBRE:");

        javax.swing.GroupLayout procesadorInfoLayout = new javax.swing.GroupLayout(procesadorInfo);
        procesadorInfo.setLayout(procesadorInfoLayout);
        procesadorInfoLayout.setHorizontalGroup(
            procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procesadorInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpuNombre)
                    .addComponent(cpuLogicos)
                    .addComponent(cpuVendedor1)
                    .addComponent(cpuFisicos1))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        procesadorInfoLayout.setVerticalGroup(
            procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, procesadorInfoLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpuNombre))
                .addGap(18, 18, 18)
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpuVendedor1))
                .addGap(18, 18, 18)
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpuLogicos))
                .addGap(18, 18, 18)
                .addGroup(procesadorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpuFisicos1))
                .addGap(54, 54, 54))
        );

        fondo.add(procesadorInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 690, 260));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel cabezera;
    public javax.swing.JLabel cpuFisicos1;
    public javax.swing.JLabel cpuLogicos;
    public javax.swing.JLabel cpuNombre;
    public javax.swing.JLabel cpuVendedor1;
    public javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel logo;
    public javax.swing.JPanel menuProcesador;
    public javax.swing.JPanel parteArriba;
    public javax.swing.JLabel procesador;
    public javax.swing.JPanel procesadorActivo;
    public javax.swing.JPanel procesadorInfo;
    // End of variables declaration//GEN-END:variables
}