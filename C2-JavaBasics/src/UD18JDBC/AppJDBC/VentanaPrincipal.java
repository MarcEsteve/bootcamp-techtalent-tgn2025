package UD18JDBC.AppJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {
    private JTextField codigoTextField, nombreTextField;
    private JButton insertarButton, actualizarButton, eliminarButton, mostrarButton;

    public VentanaPrincipal() {
        setTitle("Gestor de BD de Tienda Info Tabla Fabricantes");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        JPanel panelBotones = new JPanel(new FlowLayout());
        insertarButton = new JButton("Insertar");
        mostrarButton = new JButton("Mostrar Tabla");
        actualizarButton = new JButton("Actualizar");
        eliminarButton = new JButton("Eliminar");

        panelBotones.add(insertarButton);
        panelBotones.add(mostrarButton);
        panelBotones.add(actualizarButton);
        panelBotones.add(eliminarButton);

        panelPrincipal.add(panelBotones, BorderLayout.NORTH);

        JPanel panelCampos = new JPanel(new GridLayout(3, 2));
        codigoTextField = new JTextField();
        nombreTextField = new JTextField();
        panelCampos.add(new JLabel("Código:"));
        panelCampos.add(codigoTextField);
        panelCampos.add(new JLabel("Nombre:"));
        panelCampos.add(nombreTextField);

        panelPrincipal.add(panelCampos, BorderLayout.CENTER);

        insertarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ejecutarOperacion("insertar");
            }
        });

        actualizarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ejecutarOperacion("actualizar");
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ejecutarOperacion("eliminar");
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ejecutarOperacion("mostrar");
            }
        });

        add(panelPrincipal);
    }

    public void mostrar() {
        setVisible(true);
    }

    private void ejecutarOperacion(String operacion) {
        String codigo = codigoTextField.getText();
        String nombre = nombreTextField.getText();

        if ((operacion.equals("insertar") || operacion.equals("actualizar")) && (codigo.isEmpty() || nombre.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        GestorBD gestorBD = new GestorBD();
        switch (operacion) {
            case "insertar":
                gestorBD.insertarRegistro("fabricantes", codigo, nombre);
                break;
            case "actualizar":
                if (codigo.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese el código para la actualización.");
                    return;
                }
                gestorBD.actualizarRegistro("fabricantes", "nombre", nombre, "codigo", codigo);
                break;
            case "eliminar":
                if (codigo.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese el código para la eliminación.");
                    return;
                }
                gestorBD.eliminarRegistro("fabricantes", "codigo", codigo);
                break;
            case "mostrar":
                gestorBD.mostrarRegistros("fabricantes");
                break;
            default:
                break;
        }
    }
}