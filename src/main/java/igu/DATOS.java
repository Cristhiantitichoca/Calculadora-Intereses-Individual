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
 * Clase que representa la ventana para el ingreso de datos relacionados a un prestamo.
 * Permite calcular el interes simple y guardar los datos en un archivo de texto.
 * @author USUARIO
 */



public class DATOS extends javax.swing.JFrame {

    /**
     * Constructor que inicializa la interfaz gráfica y establece el comportamiento de la ventana.
     */
   public DATOS() {
    initComponents();
    agruparBotones();
    setSize(500, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
    /**
     * Método generado automáticamente para inicializar los componentes de la interfaz gráfica.
     */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ingresarprestamista = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        ingresartiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ingresarmontoinicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ingresartasadeinteres = new javax.swing.JTextField();
        Tiempoaños = new javax.swing.JRadioButton();
        Tiempomeses = new javax.swing.JRadioButton();
        Interesanual = new javax.swing.JRadioButton();
        Interesmensual = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ingresarcliente = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIEMPO A PAGAR :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        ingresarprestamista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarprestamista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarprestamista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamistaActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarprestamista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 210, 30));

        Cancelar.setBackground(new java.awt.Color(255, 255, 51));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 343, 120, -1));

        ingresartiempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartiempoActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("    PRESTAMISTA :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 50));

        Calcular.setBackground(new java.awt.Color(255, 255, 0));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcular.setText("CALCULAR");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 343, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" MONTO INICIAL (Bs)  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 50));

        ingresarmontoinicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarmontoinicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarmontoinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarmontoinicialActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarmontoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" TASA DE INTERES (%) :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        ingresartasadeinteres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartasadeinteres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartasadeinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartasadeinteresActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartasadeinteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, 30));

        Tiempoaños.setText("Años");
        Tiempoaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoañosActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempoaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        Tiempomeses.setText("Meses");
        Tiempomeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempomesesActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempomeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        Interesanual.setText("Anual");
        Interesanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresanualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        Interesmensual.setText("Mensual");
        Interesmensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresmensualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesmensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    CLIENTE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, 50));

        ingresarcliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 210, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -20, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Accion al ingresar el tiempo
    private void ingresartiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartiempoActionPerformed

    }//GEN-LAST:event_ingresartiempoActionPerformed

    /**
     * Acción realizada al presionar el botón "Calcular". Calcula el interés simple
     * basado en los datos ingresados y los guarda en un archivo de texto.
     */
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
    // Obtener los valores ingresados en los campos de texto y convertirlos a mayúsculas
    String prestamista = ingresarprestamista.getText().toUpperCase();
    String cliente = ingresarcliente.getText().toUpperCase();
    String montoinicial = ingresarmontoinicial.getText();
    String tasadeinteres = ingresartasadeinteres.getText();
    String interesTipo = Interesanual.isSelected() ? "anual" : "mensual"; // Determina si el interés es anual o mensual
    String tiempo = ingresartiempo.getText();
    String tiempoTipo = Tiempoaños.isSelected() ? "años" : "meses"; // Determina si el tiempo es en años o meses

    
 
    
    // Intentar convertir los valores ingresados a números y calcular el interés simple 
    try {
        // Convertir los valores ingresados a tipos numéricos
        double monto = Double.parseDouble(montoinicial); // Convierte el monto inicial a un número
        double tasa = Double.parseDouble(tasadeinteres) / 100; // Convierte la tasa de interés a decimal
        double tiempoTotal = Double.parseDouble(tiempo);

        // Calcular el interés simple
          // Ajustar el tiempo total según la selección de interés y tiempo
        if (interesTipo.equals("mensual") && tiempoTipo.equals("años")) {
            // Si la tasa es mensual y el tiempo es en años, convertimos el tiempo a meses
            tiempoTotal = Double.parseDouble(tiempo) * 12; // Convierte años a meses
        } else if (interesTipo.equals("anual") && tiempoTipo.equals("meses")) {
            // Si la tasa es anual y el tiempo es en meses, convertimos el tiempo a años
            tiempoTotal = Double.parseDouble(tiempo) / 12; // Convierte meses a años

        } else {
            // En los otros casos, el tiempo se usa tal como está
            tiempoTotal = Double.parseDouble(tiempo);
        }
        //Calculo del interes simple
        double interesSimple = monto * tasa * tiempoTotal;
        // Mostrar el resultados en una nueva ventana
        RESULTADO resultado = new RESULTADO();
        resultado.mostrarResultado(interesSimple); // Actualizar el resultado 
         // Guardar los datos ingresados en un archivo de texto
      guardarTxt(prestamista, cliente, montoinicial, tasadeinteres, interesTipo, tiempo, tiempoTipo, interesSimple);
      //Cierra la ventana actual 
      this.dispose();
    } catch (NumberFormatException e) {
        // Si el usuario ingresa un valor no numérico, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
      
    }//GEN-LAST:event_CalcularActionPerformed

    private void ingresarprestamistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarprestamistaActionPerformed
           
    }//GEN-LAST:event_ingresarprestamistaActionPerformed

    private void ingresarmontoinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarmontoinicialActionPerformed
       
    }//GEN-LAST:event_ingresarmontoinicialActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
        MENU menu = new MENU();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ingresartasadeinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartasadeinteresActionPerformed
       
    }//GEN-LAST:event_ingresartasadeinteresActionPerformed

    private void TiempoañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoañosActionPerformed
        
    }//GEN-LAST:event_TiempoañosActionPerformed

    private void InteresanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresanualActionPerformed
       
    }//GEN-LAST:event_InteresanualActionPerformed

    private void InteresmensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresmensualActionPerformed
        
    }//GEN-LAST:event_InteresmensualActionPerformed

    private void TiempomesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempomesesActionPerformed
        
    }//GEN-LAST:event_TiempomesesActionPerformed

    private void ingresarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarclienteActionPerformed

//Otras acciones de botones omitidas por simplicidad...
    /**
     * Método que agrupa los botones de opción para asegurar que solo uno pueda ser seleccionado a la vez.
     */ 
private void agruparBotones() {
    // Crear los ButtonGroup para agrupar los botones de tiempo e interés
    ButtonGroup grupoTiempo = new ButtonGroup();
    ButtonGroup grupoInteres = new ButtonGroup();

    // Agregar los botones de tiempo al grupo "grupoTiempo"
    grupoTiempo.add(Tiempoaños); //Agrupar los botones de tiempo
    grupoTiempo.add(Tiempomeses);

    // Agregar los botones de interés al grupo "grupoInteres"
    grupoInteres.add(Interesanual); //Agrupa los botones de interes
    grupoInteres.add(Interesmensual);
}
/**
     * Método que guarda los datos en un archivo de texto. Los datos incluyen el prestamista,
     * cliente, monto inicial, tasa de interés, tipo de interés, tiempo y el interés simple calculado.
     * 
     * @param prestamista Nombre del prestamista
     * @param cliente Nombre del cliente
     * @param montoinicial Monto inicial del préstamo
     * @param tasadeinteres Tasa de interés aplicada
     * @param interesTipo Tipo de interés (anual o mensual)
     * @param tiempo Tiempo de pago
     * @param tiempoTipo Tipo de tiempo (años o meses)
     * @param interesSimple Resultado del cálculo del interés simple
     */
private void guardarTxt(String prestamista, String cliente, String montoinicial, String tasadeinteres, String interesTipo, String tiempo, String tiempoTipo, double interesSimple ) {
    String nombreArchivo = "DATOS DEL CLIENTE "+ cliente +".txt";

    try {
        // Crear FileWriter y BufferedWriter para escribir en el archivo
        FileWriter escribir = new FileWriter(nombreArchivo, true); // Escribe en el archivo (agrega al existente)
        BufferedWriter buffer = new BufferedWriter(escribir);

        // Guardar los datos ingresados en el archivo
        buffer.write("Prestamista: " + prestamista);
        buffer.newLine();
        buffer.write("Cliente: " + cliente);
        buffer.newLine();
        buffer.write("Monto Inicial: " + montoinicial);
        buffer.newLine();
        buffer.write("Tasa de Interés: " + tasadeinteres + "% " + interesTipo);
        buffer.newLine();
        buffer.write("Tiempo: " + tiempo + " " + tiempoTipo);
        buffer.newLine();
        buffer.write("Interés Simple Calculado: " + interesSimple); // Escribir el resultado
        buffer.newLine();
        buffer.write("----------------------------");
        buffer.newLine();
        
        buffer.close();  // Cierra el archivo después de guardar

        //System.out.println("Datos guardados correctamente en " + nombreArchivo);
        
    } catch (IOException e) {
        // Manejo de errores al guardar el archivo
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Cancelar;
    private javax.swing.JRadioButton Interesanual;
    private javax.swing.JRadioButton Interesmensual;
    private javax.swing.JRadioButton Tiempoaños;
    private javax.swing.JRadioButton Tiempomeses;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresarcliente;
    private javax.swing.JTextField ingresarmontoinicial;
    private javax.swing.JTextField ingresarprestamista;
    private javax.swing.JTextField ingresartasadeinteres;
    private javax.swing.JTextField ingresartiempo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
