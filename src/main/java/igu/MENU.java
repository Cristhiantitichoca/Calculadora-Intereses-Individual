package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

/**
 * La clase MENU proporciona una interfaz gráfica de usuario (GUI) para el menú principal
 * de la aplicación. Permite a los usuarios navegar entre opciones como calcular interés,
 * ver el historial, regresar a la pantalla de inicio de sesión y salir de la aplicación.
 * 
 * Esta clase inicializa el menú con botones que disparan diferentes acciones.
 * 
 * <p>Las opciones del menú incluyen:</p>
 * <ul>
 *   <li>Calcular Interés: Abre la interfaz para el cálculo.</li>
 *   <li>Historial: Abre la vista del historial.</li>
 *   <li>Regresar: Vuelve a la pantalla de inicio de sesión.</li>
 *   <li>Salir: Cierra la aplicación.</li>
 * </ul>
 * 
 * También proporciona la funcionalidad de cerrar la aplicación.
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Crea un nuevo marco de MENU.
     * Inicializa los componentes de la GUI y establece el comportamiento predeterminado de la ventana.
     */
    public MENU() {
         initComponents();
         setSize(500, 400);
         setLocationRelativeTo(null); // Centra la ventana en la pantalla.
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación cuando la ventana se cierra.
         setVisible(true); // Hace visible la ventana.
         Salir.addActionListener(new MENU.ButtonClickListener()); // Añade un listener para el botón "Salir".
    }

    /**
     * Inicializa los componentes de la interfaz gráfica.
     * Este método se genera automáticamente y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Historial = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Historial.setBackground(new java.awt.Color(255, 255, 51));
        Historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Historial.setText("HISTORIAL");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 230, 50));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 30));

        Calcular.setBackground(new java.awt.Color(255, 255, 102));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Calcular.setText("CALCULAR INTERES ");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 p.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 120));

        Regresar.setBackground(new java.awt.Color(255, 255, 0));
        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -60, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Maneja la acción cuando se hace clic en el botón "Historial".
     * Abre la ventana HISTORIAL y cierra la ventana actual del MENU.
     *
     * @param evt El evento generado por el clic en el botón.
     */
    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        HISTORIAL irHistorial = new HISTORIAL();
        irHistorial.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_HistorialActionPerformed
/**
     * Maneja la acción cuando se hace clic en el botón "Calcular".
     * Abre la ventana DATOS para el cálculo de interés y cierra la ventana actual del MENU.
     *
     * @param evt El evento generado por el clic en el botón.
     */
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
      DATOS datos = new DATOS();
      datos.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CalcularActionPerformed
/**
     * Maneja la acción cuando se hace clic en el botón "Regresar".
     * Regresa a la ventana LOGIN y cierra la ventana actual del MENU.
     *
     * @param evt El evento generado por el clic en el botón.
     */
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
        LOGIN login = new LOGIN();
        login.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

   

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    /**
     * Clase interna para manejar la acción cuando se hace clic en el botón "Salir".
     * Cierra la ventana actual y finaliza la aplicación.
     */
    private  class ButtonClickListener implements ActionListener {

      @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
           
           
              dispose();
        }
    } 
 }
