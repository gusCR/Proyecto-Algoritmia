package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DialogoConfigurarObsequio extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarObsequio dialog = new DialogoConfigurarObsequio();
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
	public DialogoConfigurarObsequio() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 156);
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel(" 1 unidad");
		lblNewLabel.setBounds(28, 32, 86, 14);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel(" 2 a 5 unidades");
		lblNewLabel_1.setBounds(28, 59, 86, 14);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("6 a mas unidades");
		lblNewLabel_2.setBounds(28, 91, 112, 14);
		getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(178, 29, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(178, 56, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(178, 87, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(314, 28, 89, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(314, 59, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
