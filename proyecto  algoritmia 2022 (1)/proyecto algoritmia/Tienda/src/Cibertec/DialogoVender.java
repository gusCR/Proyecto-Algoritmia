package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoVender extends JDialog {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox cboModelo;
	private JTextField txtPrecioBase;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoVender dialog = new DialogoVender();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setForeground(Color.BLACK);
		setTitle("Vender");
		setBounds(100, 100, 450, 321);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(23, 20, 69, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio S/.");
		lblPrecio.setBounds(23, 42, 69, 14);
		getContentPane().add(lblPrecio);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(23, 67, 69, 14);
		getContentPane().add(lblCantidad);

		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
		cboModelo.setBounds(102, 16, 138, 22);
		getContentPane().add(cboModelo);

		txtPrecioBase = new JTextField();
		txtPrecioBase.setEditable(false);
		txtPrecioBase.setBounds(102, 42, 138, 20);
		getContentPane().add(txtPrecioBase);
		txtPrecioBase.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(102, 67, 138, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnVender(e);
			}
		});
		btnVender.setBounds(310, 16, 89, 23);
		getContentPane().add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
			}
		});
		btnCerrar.setBounds(310, 51, 89, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 102, 382, 169);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}

	protected void actionPerformedBtnVender(ActionEvent e) {
		// Declaración de variables
		int modelo, cantidad;
		double impcom = 0, impdes = 0, imppag;
		String obsequio = "Ninguno";
		String precio = "";
		String model = "";
		// Entrada de datos
		modelo = cboModelo.getSelectedIndex();
		cantidad = Integer.parseInt(txtCantidad.getText());

		// Calcula el importe de la compra
		if (modelo == 0)
			impcom = 949.0 * cantidad;
		else if (modelo == 1)
			impcom = 1089.0 * cantidad;
		else if (modelo == 2)
			impcom = 850.0 * cantidad;
		else if (modelo == 3)
			impcom = 629.0 * cantidad;
		else
			impcom = 849.0 * cantidad;

		// calculo modelo
		if (modelo == 0) {
			model = "Mabe EMP6120PG0";
		} else if (modelo == 1) {
			model = "Indurama Parma";
		} else if (modelo == 2) {
			model = "Sole COSOL027";
		} else if (modelo == 3) {
			model = "Coldex CX602";
		} else if (modelo == 4) {
			model = "Reco Dakota ";
		}

		// Calculo boton precio
		if (modelo == 0) {
			precio = "949.00";
		} else if (modelo == 1) {
			precio = "1089.00";
		} else if (modelo == 2) {
			precio = "850.00";
		} else if (modelo == 3) {
			precio = "629.00";
		} else if (modelo == 4) {
			precio = "849.00";
		}

		// Calcula el importe del descuento
		if (cantidad >= 1 && cantidad <= 5)
			impdes = 0.075 * impcom;
		else if (cantidad >= 6 && cantidad <= 10)
			impdes = 0.1 * impcom;
		else if (cantidad >= 11 && cantidad <= 15)
			impdes = 0.125 * impcom;
		else
			impdes = 0.15 * impcom;

		// Calcula el importe a pagar
		imppag = impcom - impdes;

		// Calcula el obsequio
		if (cantidad == 1)
			obsequio = "Cafetera";
		if (cantidad >= 2)
			obsequio = "Licuadora";
		if (cantidad >= 5)
			obsequio = "Extractor";

		// Salida de resultados
		txtS.setText("BOLETA DE VENTA" + "\n" + "\n");
		txtPrecioBase.setText("" + precio + " ");

		txtS.append("Modelo 	\t:" + model + "\n");
		txtS.append("Precio 	\t:S/." + precio + "\n");
		txtS.append("Cantidad 	\t:" + cantidad + "\n");
		txtS.append("Importe compra  \t: S/. " + String.format("%,10.2f", impcom) + "\n");
		txtS.append("Importe descuento \t: S/. " + String.format("%,10.2f", impdes) + "\n");
		txtS.append("Importe pagar 	\t: S/. " + String.format("%,10.2f", imppag) + "\n");
		txtS.append("Obsequio 	\t: " + obsequio);

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		if(JOptionPane.showConfirmDialog(this, "¿Estas seguro de cerrar consultar venta?", "Salir", 
		JOptionPane.YES_NO_OPTION, JOptionPane.	QUESTION_MESSAGE) == 0)
		this.dispose();
	}
}

//
