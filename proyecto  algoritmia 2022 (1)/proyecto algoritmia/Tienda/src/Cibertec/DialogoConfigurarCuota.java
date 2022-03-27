package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DialogoConfigurarCuota extends JDialog {
	private JLabel lblNewLabel;
	private JTextField txtCuota;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarCuota dialog = new DialogoConfigurarCuota();
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
	public DialogoConfigurarCuota() {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 515, 126);
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Cuota diaria esperada");
		lblNewLabel.setBounds(21, 11, 152, 14);
		getContentPane().add(lblNewLabel);

		txtCuota = new JTextField();
		txtCuota.setBounds(227, 8, 86, 20);
		getContentPane().add(txtCuota);
		txtCuota.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(385, 11, 89, 23);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(385, 45, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
