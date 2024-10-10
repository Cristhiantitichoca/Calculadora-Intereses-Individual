package igu;

import igu.MENU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 * Clase RESULTADO es una interfaz gráfica de usuario (GUI) que muestra el resultado del cálculo de interés simple.
 * Esta clase permite visualizar el valor calculado y ofrece un botón para volver a la pantalla de entrada de datos.
 */

public class RESULTADO extends javax.swing.JFrame {

    /**
     * Constructor que inicializa la ventana de resultados y su configuración básica,
     * como el tamaño, posición y visibilidad.
     */
   public RESULTADO() {
    initComponents();
    setSize(300, 190);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
     /**
     * Este método es llamado dentro del constructor para inicializar los componentes gráficos de la ventana.
     * Los componentes incluyen etiquetas, botones y la configuración del fondo.
     */
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        salidaresultado = new javax.swing.JLabel();
        Okey = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EL INTERES SIMPLE CALCULADO ES :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 60));

        salidaresultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salidaresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(salidaresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 40));

        Okey.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Okey.setText("OK");
        Okey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeyActionPerformed(evt);
            }
        });
        getContentPane().add(Okey, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -20, 420, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Acción que ocurre cuando se presiona el botón "OK". 
     * Este método cierra la ventana actual y abre la ventana de ingreso de datos.
     *
     * @param evt Evento de acción generado por el botón "OK".
     */
    private void OkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeyActionPerformed
       DATOS datos = new DATOS();
       datos.setVisible(true);
       this.dispose(); // Cierra la ventana actual.
    }//GEN-LAST:event_OkeyActionPerformed
 
/**
     * Método para mostrar el resultado calculado en la etiqueta de la ventana.
     * Este método toma un valor de tipo double y lo convierte a texto para mostrarlo.
     *
     * @param resultado_del_calculo Resultado del cálculo de interés simple.
     */
public void mostrarResultado(double resultado_del_calculo) {
    salidaresultado.setText(String.valueOf(resultado_del_calculo));
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Okey;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel salidaresultado;
    // End of variables declaration//GEN-END:variables
}
