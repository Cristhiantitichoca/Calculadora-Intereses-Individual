package igu;

import igu.MENU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 * HISTORIAL es un JFrame que permite a los usuarios ver el historial de clientes específicos.
 * Muestra el contenido de un archivo de texto basado en el nombre del cliente ingresado en el campo de texto.
 * Los usuarios también pueden regresar al menú principal desde esta interfaz.
 * Los datos del cliente se leen desde un archivo de texto local y se muestran en un JTextArea.
 */

public class HISTORIAL extends javax.swing.JFrame {

    /**
     * Constructor de la clase HISTORIAL.
     * Inicializa los componentes de la interfaz gráfica, define el tamaño y posición de la ventana
     * y la hace visible.
     */
   public HISTORIAL() {
    initComponents();
    setSize(500, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
     /**
     * Inicializa los componentes del JFrame.
     * Este método es generado automáticamente por el editor de formularios.
     */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        verHistorial = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        ingresarcliente = new javax.swing.JTextField();
        Okey = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verHistorial.setColumns(20);
        verHistorial.setRows(5);
        jScrollPane1.setViewportView(verHistorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 450, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 20));

        ingresarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 210, -1));

        Okey.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Okey.setText("OK");
        Okey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeyActionPerformed(evt);
            }
        });
        getContentPane().add(Okey, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -20, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Maneja la acción que ocurre cuando el usuario presiona Enter en el campo de texto del cliente.
     * Llama al método {@link #mostrarHistorial()} para mostrar el historial del cliente en el JTextArea.
     *
     * @param evt El evento de acción que se dispara cuando se presiona Enter.
     */
    private void ingresarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarclienteActionPerformed
        // Llamamos al método para mostrar el historial cuando se presione Enter en el JTextField
        mostrarHistorial();

    }//GEN-LAST:event_ingresarclienteActionPerformed
/**
     * Maneja la acción que ocurre cuando se presiona el botón OK.
     * Abre el menú principal creando una instancia de la clase {@link MENU} 
     * y cierra la ventana actual.
     *
     * @param evt El evento de acción que se dispara al hacer clic en el botón.
     */
    private void OkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeyActionPerformed
        MENU menu = new MENU();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OkeyActionPerformed
 /**
     * Muestra el historial del cliente ingresado en el campo de texto.
     * Llama al método {@link #obtenerHistorial(String)} para recuperar los datos y luego los muestra en el JTextArea.
     */
    private void mostrarHistorial() {
    String cliente = ingresarcliente.getText().toUpperCase();
    String historial = obtenerHistorial(cliente); // Obtener el historial del cliente
    verHistorial.setText(historial); // Establece el texto del JTextArea al historial obtenid
}
 /**
     * Recupera el historial de un cliente específico leyendo un archivo de texto local.
     * El archivo se nombra en función del nombre del cliente y se almacena en un directorio predefinido.
     *
     * @param cliente El nombre del cliente cuyo historial será recuperado.
     * @return Una cadena que contiene el historial del cliente o un mensaje de error si no se puede leer el archivo.
     */
    private String obtenerHistorial(String cliente) {
        StringBuilder historial = new StringBuilder(); // Usamos StringBuilder para construir el historial
        String archivo = "C:/Users/USUARIO/OneDrive/Documentos/NetBeansProjects/Calculadora/DATOS DEL CLIENTE " + cliente + ".txt";

        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader leerbuffer = new BufferedReader(leer);
            String linea;
            while ((linea = leerbuffer.readLine()) != null) { // Leemos cada línea del archivo
            historial.append(linea).append("\n"); // Agregamos la línea al historial
        }
    } catch (IOException e) {
        e.printStackTrace(); // Imprimimos el error
        return "Error al leer el historial"; // Mensaje en caso de error
    }

    return historial.toString(); // Devolvemos el historial como un String
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Okey;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresarcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea verHistorial;
    // End of variables declaration//GEN-END:variables
}
