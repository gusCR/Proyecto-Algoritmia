package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DialogoConfigurarCantidad extends JDialog {
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConfigurarCantidad dialog = new DialogoConfigurarCantidad();
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
	public DialogoConfigurarCantidad() {
		setTitle("Configurar cantidad \u00F3ptima");
		setBounds(100, 100, 541, 144);
		getContentPane().setLayout(null);
		
		lblCantidad = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
		lblCantidad.setBounds(10, 11, 241, 14);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(286, 8, 86, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(414, 11, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(414, 57, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
