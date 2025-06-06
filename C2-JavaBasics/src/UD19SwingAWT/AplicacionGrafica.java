package UD19SwingAWT;


import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	public AplicacionGrafica() {
		setTitle("Titulo ventana FRAME");
		setBounds(400,200,600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// CREACIÓN DE COMPONENTES
		//Componente Etiqueta
		JLabel etiqueta= new JLabel("Nombre");
		etiqueta.setBounds(43,20,100,20);
		contentPane.add(etiqueta);
		//Componente Campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(43,47,100,26);
		contentPane.add(campo);
		//Componente Botón
		JButton boton = new JButton("Enviar");
		boton.setBounds(43,120,100,23);
		contentPane.add(boton);
		//Componente "Botón radio" se debe "agrupar" selección ÚNICA
		JRadioButton rdbtnOpcion1 = new JRadioButton("Opción 1 radio", true);
		rdbtnOpcion1.setBounds(43, 194, 109, 23);
		contentPane.add(rdbtnOpcion1);
		
		JRadioButton rdbtnOpcion2 = new JRadioButton("Opción 2 radio", false);
		rdbtnOpcion2.setBounds(43, 220, 109, 23);
		contentPane.add(rdbtnOpcion2);
		
		JRadioButton rdbtnOpcion3 = new JRadioButton("Opción 3 radio", false);
		rdbtnOpcion3.setBounds(43, 246, 109, 23);
		contentPane.add(rdbtnOpcion3);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnOpcion1);
		bgroup.add(rdbtnOpcion2);
		bgroup.add(rdbtnOpcion3);
		//Que ocurre con el radio buton 3? Uno encima de otro, solapados
		
		//Componente "Cajas seleccionables"
		JCheckBox chckbxOpcion = new JCheckBox ("Caja ok 1", true);
		chckbxOpcion.setBounds(43, 305, 97, 23);
		contentPane.add(chckbxOpcion);
		
		JCheckBox chckbxNewCheck = new JCheckBox ("Caja ok 2", false);
		chckbxNewCheck.setBounds(43, 325, 97, 23);
		contentPane.add(chckbxNewCheck);
		
		JCheckBox chckbxOpcion3 = new JCheckBox ("Caja ok 3", false);
		chckbxOpcion3.setBounds(43, 345, 97, 23);
		contentPane.add(chckbxOpcion3);
		
		//Componente "Área de texto"
		JTextArea textArea = new JTextArea("prueba");
		textArea.setBounds(189, 18, 141, 117);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		contentPane.add(textArea);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(189, 18, 141, 117);
		contentPane.add(scroll);
		
		//Componente "campo de contraseña"
		JPasswordField pwd = new JPasswordField("123456");
		pwd.setBounds(189, 171, 139, 20);
		contentPane.add(pwd);
		
		//Componente "Menú de selección"
		JComboBox comboBox = new JComboBox<>();
		comboBox.setBounds(189, 221, 141, 22);
		contentPane.add(comboBox);
		
		JLabel etiquetaCombo= new JLabel("Escoge una opción:");
		etiquetaCombo.setBounds(189, 200, 141, 22);
		contentPane.add(etiquetaCombo);
		comboBox.addItem("---");
		comboBox.addItem("Fernando");
		comboBox.addItem("Alberto");
		comboBox.addItem("Arturo");
		
		//Componente "Interruptor"
		JToggleButton toggle = new JToggleButton("Interruptor ON/OFF", true);
		toggle.setBounds(189, 291, 200, 23);
		contentPane.add(toggle);
		
		//Componente "Contador"
		JSpinner spin = new JSpinner();
		spin.setBounds(371, 20, 50, 20);
		contentPane.add(spin);
		
		JLabel lista= new JLabel("Escoge una peli de la lista:");
		lista.setBounds(371, 48, 180, 22);
		contentPane.add(lista);
		//Componente "Lista"
		String pelis[] = {"Star Wars","Otra", "Matrix", "Inception","Star Wars", "Matrix", "Inception"};
		JList list = new JList<>(pelis);
		list.setBounds(371, 72, 86, 200);
		contentPane.add(list);
		
		//MENUS y submenus
		JMenuBar barraMenu = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu editar = new JMenu("Editar");
		barraMenu.add(archivo);
		barraMenu.add(editar);
		
		JMenuItem abrir = new JMenuItem("Abrir");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem cargar = new JMenuItem("Cargar");
		JMenuItem salir = new JMenuItem("Salir");
		
		JMenuItem modificar = new JMenuItem("Modificar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		
		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(cargar);
		archivo.add(salir);
		
		editar.add(modificar);
		editar.add(copiar);
		editar.add(pegar);
		
		setJMenuBar(barraMenu);
		
	}
}