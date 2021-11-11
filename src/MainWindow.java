
import java.io.File;
import javax.swing.JFileChooser;
// import javax.xml.parsers.*;
// import org.w3c.dom.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author trm
 */
public class MainWindow extends javax.swing.JFrame {

    static MetodosDOM metodosDOM;
    static MetodosSAX metodosSAX;
//    DOM ;
//    SAX ;
//    JAXB ;

    public MainWindow() {
        initComponents();
        // Deshabilitamos botones al iniciarse
        mostrarDOMboton.setEnabled(false);
        addLibroBoton.setEnabled(false);
        guardarDOM.setEnabled(false);
        replaceTitulo.setEnabled(false);
        reemplazarAutor.setEnabled(false);
        reemplazarAno.setEnabled(false);
        mostrarSAXboton.setEnabled(false);
    }

    private File dialogoSeleccionFichero() {
        File f = null;
        JFileChooser jfc = new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setDialogType(JFileChooser.OPEN_DIALOG);
        // guarda con que se ha cerrado el file chooser
        int res = jfc.showOpenDialog(this);

        if (res == JFileChooser.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
        }
        return f;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tituloText = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        annoText = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        autorText = new javax.swing.JTextPane();
        addLibroBoton = new javax.swing.JButton();
        mostrarDOMboton = new javax.swing.JButton();
        guardarDOM = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tituloViejoText = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tituloNuevoText = new javax.swing.JTextPane();
        replaceTitulo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        autorViejo = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        autorNuevo = new javax.swing.JTextPane();
        reemplazarAutor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        anoViejo = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        anoNuevo = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        reemplazarAno = new javax.swing.JButton();
        mostrarSAXboton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuDOM = new javax.swing.JMenuItem();
        jMenuSAX = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Título:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Publicado en:");

        jScrollPane3.setViewportView(tituloText);

        jScrollPane2.setViewportView(annoText);

        jScrollPane4.setViewportView(autorText);

        addLibroBoton.setText("Añadir Libro");
        addLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLibroBotonActionPerformed(evt);
            }
        });

        mostrarDOMboton.setText("Mostrar DOM ");
        mostrarDOMboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDOMbotonActionPerformed(evt);
            }
        });

        guardarDOM.setText("Guardar DOM a File");
        guardarDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDOMActionPerformed(evt);
            }
        });

        jLabel4.setText("Título actual:");

        jScrollPane5.setViewportView(tituloViejoText);

        jLabel5.setText("Título nuevo:");

        jScrollPane6.setViewportView(tituloNuevoText);

        replaceTitulo.setText("Reemplazar Título");
        replaceTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceTituloActionPerformed(evt);
            }
        });

        jLabel6.setText("AÑADIR NUEVO LIBRO");

        jLabel7.setText("REEMPLAZAR TÍTULO");

        jLabel8.setText("Autor actual:");

        jScrollPane7.setViewportView(autorViejo);

        jLabel9.setText("REEMPLAZAR AUTOR");

        jLabel10.setText("Autor nuevo:");

        jScrollPane8.setViewportView(autorNuevo);

        reemplazarAutor.setText("Reemplazar Autor");
        reemplazarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarAutorActionPerformed(evt);
            }
        });

        jLabel11.setText("REEMPLAZAR AÑO");

        jLabel12.setText("Año actual:");

        jScrollPane9.setViewportView(anoViejo);

        jScrollPane10.setViewportView(anoNuevo);

        jLabel13.setText("Año nuevo:");

        reemplazarAno.setText("Reemplazar año");
        reemplazarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarAnoActionPerformed(evt);
            }
        });

        mostrarSAXboton.setText("Mostrar SAX");
        mostrarSAXboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSAXbotonActionPerformed(evt);
            }
        });

        jMenu1.setText("Ficheros XML");

        jMenuDOM.setText("Abrir DOM");
        jMenuDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDOMActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDOM);

        jMenuSAX.setText("Abrir SAX");
        jMenuSAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSAXActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSAX);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mostrarDOMboton, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(mostrarSAXboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addLibroBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guardarDOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane10))
                                        .addComponent(replaceTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reemplazarAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(reemplazarAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel9)))
                                        .addGap(0, 44, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addLibroBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarDOM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(replaceTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reemplazarAutor)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reemplazarAno, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                    .addComponent(mostrarDOMboton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarSAXboton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDOMActionPerformed

        File fichero = dialogoSeleccionFichero();
        int res = metodosDOM.abrir_XML_DOM(fichero);
        if (res == 0) {
            estadoLabel.setText("Se ha creado el arbol correctamente");
            // Habilitamos botones DOM
            mostrarDOMboton.setEnabled(true);
            addLibroBoton.setEnabled(true);
            guardarDOM.setEnabled(true);
            replaceTitulo.setEnabled(true);
            reemplazarAutor.setEnabled(true);
            reemplazarAno.setEnabled(true);
        } else {
            estadoLabel.setText("Fallo en leer el xml. Seleccione otro archivo");
        }
    }//GEN-LAST:event_jMenuDOMActionPerformed

    private void addLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLibroBotonActionPerformed
        // TODO add your handling code here:
        int res = metodosDOM.annadirLibroDOM(tituloText.getText(), autorText.getText(), annoText.getText());
        if (res == 0) {
            estadoLabel.setText("Se ha añadido el libro correctamente");
        } else if (res == -1) {
            estadoLabel.setText("No se ha podido añadir el libro");
        }
    }//GEN-LAST:event_addLibroBotonActionPerformed

    private void mostrarDOMbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDOMbotonActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(metodosDOM.recorrerDOMyMostrar());
    }//GEN-LAST:event_mostrarDOMbotonActionPerformed

    private void guardarDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDOMActionPerformed
        // TODO add your handling code here:
        JFileChooser saveDOM = new JFileChooser();
        saveDOM.showSaveDialog(this);
        int res = metodosDOM.guardarDOMcomoFile(saveDOM.getSelectedFile());
        if (res == 0) {
            estadoLabel.setText("Se ha guardado correctamente");
        } else if (res == -1) {
            estadoLabel.setText("No se ha podido guardar");
        }
    }//GEN-LAST:event_guardarDOMActionPerformed

    private void replaceTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceTituloActionPerformed
        // TODO add your handling code here:
        int res = metodosDOM.replaceTitle(tituloViejoText.getText(), tituloNuevoText.getText());
        if (res == 0) {
            estadoLabel.setText("Se ha reemplazado correctamente");
        } else {
            estadoLabel.setText("No se ha podido reemplazar. Revisa el título");
        }
    }//GEN-LAST:event_replaceTituloActionPerformed

    private void reemplazarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarAutorActionPerformed
        // TODO add your handling code here:
        int res = metodosDOM.replaceAutor(autorViejo.getText(), autorNuevo.getText());
        if (res == 0) {
            estadoLabel.setText("Se ha reemplazado correctamente");
        } else {
            estadoLabel.setText("No se ha podido reemplazar. Revisa el autor");
        }
    }//GEN-LAST:event_reemplazarAutorActionPerformed

    private void reemplazarAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarAnoActionPerformed
        // TODO add your handling code here:
        int res = metodosDOM.replaceAno(anoViejo.getText(), anoNuevo.getText());
        if (res == 0) {
            estadoLabel.setText("Se ha reemplazado correctamente");
        } else {
            estadoLabel.setText("No se ha podido reemplazar. Revisa el año");
        }
    }//GEN-LAST:event_reemplazarAnoActionPerformed

    private void jMenuSAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSAXActionPerformed
        // TODO add your handling code here:
        JFileChooser saveSAX = new JFileChooser();
        saveSAX.showSaveDialog(this);
        int res = metodosSAX.abrir_XML_SAX(saveSAX.getSelectedFile());
        if (res == 0) {
            estadoLabel.setText("Se ha creado el SAX correctamente");
            mostrarSAXboton.setEnabled(true);
        } else {
            estadoLabel.setText("No se ha podido crear");
        }
    }//GEN-LAST:event_jMenuSAXActionPerformed

    private void mostrarSAXbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSAXbotonActionPerformed
        // TODO add your handling code here:
        String leerSAX = metodosSAX.recorrerSAX();
        jTextArea1.setText(leerSAX);
    }//GEN-LAST:event_mostrarSAXbotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Inicializamos clases
        metodosDOM = new MetodosDOM();
        metodosSAX = new MetodosSAX();

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLibroBoton;
    private javax.swing.JTextPane annoText;
    private javax.swing.JTextPane anoNuevo;
    private javax.swing.JTextPane anoViejo;
    private javax.swing.JTextPane autorNuevo;
    private javax.swing.JTextPane autorText;
    private javax.swing.JTextPane autorViejo;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JButton guardarDOM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDOM;
    private javax.swing.JMenuItem jMenuSAX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mostrarDOMboton;
    private javax.swing.JButton mostrarSAXboton;
    private javax.swing.JButton reemplazarAno;
    private javax.swing.JButton reemplazarAutor;
    private javax.swing.JButton replaceTitulo;
    private javax.swing.JTextPane tituloNuevoText;
    private javax.swing.JTextPane tituloText;
    private javax.swing.JTextPane tituloViejoText;
    // End of variables declaration//GEN-END:variables
}
