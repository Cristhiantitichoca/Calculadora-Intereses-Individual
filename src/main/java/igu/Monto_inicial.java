package igu;

/**
 * Esta clase representa la interfaz gráfica de usuario (GUI) para el cálculo del monto inicial
 * de una inversión. Permite al usuario ingresar un monto final, un porcentaje de interés
 * y seleccionar un tipo de interés (mensual, semestral, o anual). También se puede seleccionar
 * el tipo de periodo de tiempo para calcular el monto inicial.
 * 
 * <p>Incluye opciones de selección de interés y tiempo, y un botón para realizar el cálculo.
 * Los resultados se muestran en la misma interfaz.</p>
 * 
 * <p>Esta clase hereda de {@link javax.swing.JFrame}, por lo que utiliza componentes 
 * gráficos de la biblioteca Swing.</p>
 * 
 * <p><strong>Autor:</strong> Dylan</p>
 * 
 * @since 1.0
 */
public class Monto_inicial extends javax.swing.JFrame {

    /**
     * Constructor que crea una nueva ventana de la interfaz gráfica "Monto_inicial".
     * Inicializa los componentes de la interfaz.
     */
    public Monto_inicial() {
        initComponents();
    }

    /**
     * Método generado automáticamente para inicializar los componentes de la interfaz gráfica.
     * No se recomienda modificar este método manualmente, ya que es gestionado por el
     * editor de formularios de NetBeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 3, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Monto final      :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 40));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 3, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Interes (%)      :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 50));

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Maiandra GD", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tipo de interes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 50));

        jCheckBox1.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox1.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox1.setText("Meses");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        jCheckBox2.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox2.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox2.setText("Semestral");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 120, 30));

        jCheckBox3.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox3.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox3.setText("Anual ");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 120, 30));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tipo de tiempo ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 50));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 3, 18)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 140, 50));

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jButton2.setText("Salir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 80, 30));

        jCheckBox4.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox4.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox4.setText("Meses");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 30));

        jCheckBox5.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox5.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox5.setText("Semestral");
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 30));

        jCheckBox6.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox6.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jCheckBox6.setText("Anual ");
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 120, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Monto Inicial ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 200, 50));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Cantidad de tiempo      :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 40));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, 20));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, 20));

        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imagenes/PATOJP.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 490, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método main para ejecutar la aplicación.
     * Inicializa y muestra la ventana de la interfaz gráfica "Monto_inicial".
     * 
     * @param args argumentos de la línea de comandos (no utilizados en esta aplicación).
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
            java.util.logging.Logger.getLogger(Monto_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monto_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monto_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monto_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monto_inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
