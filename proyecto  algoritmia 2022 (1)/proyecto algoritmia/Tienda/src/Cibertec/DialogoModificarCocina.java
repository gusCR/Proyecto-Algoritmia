package Cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;

public class DialogoModificarCocina extends JDialog {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoModificarCocina dialog = new DialogoModificarCocina();
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
	public DialogoModificarCocina() {
		setTitle("Modificar cocina");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(24, 22, 46, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(24, 56, 70, 14);
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(24, 97, 97, 14);
		getContentPane().add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(24, 139, 81, 14);
		getContentPane().add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(24, 180, 70, 14);
		getContentPane().add(lblFondo);

		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(24, 220, 97, 14);
		getContentPane().add(lblQuemadores);

		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
		cboModelo.setBounds(131, 18, 138, 22);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(131, 53, 138, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setBounds(131, 94, 138, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setBounds(131, 136, 138, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField();
		txtFondo.setBounds(131, 177, 138, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);

		txtQuemadores = new JTextField();
		txtQuemadores.setBounds(131, 217, 138, 20);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
			}
		});
		btnCerrar.setBounds(324, 18, 89, 23);
		getContentPane().add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnGrabar(e);
			}
		});
		btnGrabar.setBounds(324, 70, 89, 23);
		getContentPane().add(btnGrabar);
	}

	protected void actionPerformedBtnGrabar(ActionEvent e) {

		// Declaración de variables
		int modelo;
		String precio = "";
		String ancho = "";
		String alto = "";
		String fondo = "";
		String quemadores = "";

		modelo = cboModelo.getSelectedIndex();

		if (modelo == 0) {
			precio = "949.0";
			ancho = "60.0";
			alto = "91.0";
			fondo = "58.6";
			quemadores = "4";
		} else if (modelo == 1) {
			precio = "1089.0";
			ancho = "80.0";
			alto = "94.0";
			fondo = "67.5";
			quemadores = "6";
		} else if (modelo == 2) {
			precio = "850.0";
			ancho = "60.0";
			alto = "90.0";
			fondo = "50.0";
			quemadores = "4";
		} else if (modelo == 3) {
			precio = "629.0";
			ancho = "61.6";
			alto = "95.0";
			fondo = "51.5";
			quemadores = "5";
		} else if (modelo == 4) {
			precio = "849.0";
			ancho = "75.4";
			alto = "94.5";
			fondo = "66.0";
			quemadores = "5";
		}

		txtPrecio.setText("" + precio + "\n");
		txtAncho.setText("" + ancho + "\n");
		txtAlto.setText("" + alto + "\n");
		txtFondo.setText("" + fondo + "\n");
		txtQuemadores.setText("" + quemadores + "\n");

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		if (JOptionPane.showConfirmDialog(this, "¿Estas seguro de cerrar Modificar ocina?", "Salir",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
			this.dispose();

	}
}
