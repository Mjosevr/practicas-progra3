/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;

import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Lab_2 extends JFrame {

    JTextField nombre = new JTextField(15);
    JTextField telefono = new JTextField(15);
    String[] genero = {"Masculino", "Femenino"};
    JComboBox formatBox = new JComboBox(genero);
    JTextArea comentarios = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Lab_2() {
        super("LAB_2");
        setSize(210, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JLabel NombreLabel = new JLabel("Nombre: ");
        JLabel TelefonoLabel = new JLabel("Telefono: ");
        JLabel commentsLabel = new JLabel("Comentarios: ");
        JLabel formatLabel = new JLabel("Genero:");

        NombreLabel.setName("lblNombre");
        TelefonoLabel.setName("lblTelefono");
        commentsLabel.setName("lblComentarios");
        nombre.setName("Nombre");
        telefono.setName("Telefono");
        comentarios.setName("Comentarios");
        ok.setName("Aceptar");
        cancel.setName("Limpiar");

        comentarios.setLineWrap(true);
        comentarios.setWrapStyleWord(true);

        panel.setName("LAB2");
        panel.add(NombreLabel);
        panel.add(nombre);
        panel.add(TelefonoLabel);
        panel.add(telefono);
        panel.add(formatLabel);
        panel.add(formatBox);
        panel.add(ok);
        panel.add(cancel);
        panel.add(commentsLabel);
        panel.add(comentarios);

        add(panel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lab_2 lab = new Lab_2();
    }

}
