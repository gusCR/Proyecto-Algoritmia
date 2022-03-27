package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DialogoConsultarCocina extends JDialog {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JButton btnCerrar;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	/**
	 * @wbp.nonvisual location=-10,19
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConsultarCocina dialog = new DialogoConsultarCocina();
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
	public DialogoConsultarCocina() {
		setTitle("Consultar Cocina");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 28, 46, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio S/.");
		lblPrecio.setBounds(10, 67, 78, 14);
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 105, 78, 14);
		getContentPane().add(lblAncho);

		lblAlto = new JLabel("Alto 8cm)");
		lblAlto.setBounds(10, 140, 78, 14);
		getContentPane().add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 176, 78, 14);
		getContentPane().add(lblFondo);

		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(10, 211, 78, 14);
		getContentPane().add(lblQuemadores);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
			}
		});
		btnCerrar.setBounds(323, 24, 89, 23);
		getContentPane().add(btnCerrar);

		cboModelo = new JComboBox();
		cboModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				itemStateChangedCboModelo(e);
			}
		});
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
		cboModelo.setBounds(114, 24, 147, 22);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPrecio.setBounds(114, 64, 147, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(114, 102, 147, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(114, 137, 147, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(114, 173, 147, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);

		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setBounds(114, 208, 147, 20);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);

	}

	protected void itemStateChangedCboModelo(ItemEvent e) {

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
		if (JOptionPane.showConfirmDialog(this, "¿Estas seguro de cerrar Consultar cocina?", "Salir", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0)
			this.dispose();

	}
}
