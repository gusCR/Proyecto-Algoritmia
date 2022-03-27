package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DialogoConfigurarDescuento extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarDescuento dialog = new DialogoConfigurarDescuento();
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
	public DialogoConfigurarDescuento() {
		setTitle("Configurar porcentajes  de descuento");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel(" 1 a 5 unidades");
		lblNewLabel.setBounds(26, 27, 104, 14);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel(" 6 a 10 unidades");
		lblNewLabel_1.setBounds(26, 59, 104, 14);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel(" 11 a 15 unidades");
		lblNewLabel_2.setBounds(26, 96, 104, 14);
		getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Mas de 15 unidades");
		lblNewLabel_3.setBounds(26, 133, 124, 14);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(150, 24, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(150, 56, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(150, 93, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(150, 130, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(257, 27, 46, 14);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(257, 59, 46, 14);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(257, 96, 46, 14);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(257, 133, 46, 14);
		getContentPane().add(lblNewLabel_7);

		btnAceptar = new JButton("Aceptar ");
		btnAceptar.setBounds(335, 27, 89, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 77, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
