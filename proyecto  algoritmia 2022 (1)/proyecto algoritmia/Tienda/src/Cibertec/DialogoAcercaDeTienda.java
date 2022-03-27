package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class DialogoAcercaDeTienda extends JDialog {
	private JButton btnCerrar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoAcercaDeTienda dialog = new DialogoAcercaDeTienda();
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
	public DialogoAcercaDeTienda() {
		setForeground(Color.BLACK);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 338);
		getContentPane().setLayout(null);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnCerrar(e);
			}
		});
		btnCerrar.setBounds(159, 254, 89, 23);
		getContentPane().add(btnCerrar);

		lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(149, 23, 100, 14);
		getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(27, 48, 369, 2);
		getContentPane().add(separator);

		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAutores.setBounds(159, 62, 100, 14);
		getContentPane().add(lblAutores);

		JLabel lblNewLabel_1 = new JLabel("Betsy Karina Montalvo Vicente");
		lblNewLabel_1.setBounds(131, 103, 218, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Ethel Geraldine Chero Chipana");
		lblNewLabel_2.setBounds(131, 128, 218, 14);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("José Miguel Policarpio Parras");
		lblNewLabel_3.setBounds(131, 153, 218, 14);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Gustavo Adolfo Calderón Rodríguez");
		lblNewLabel_4.setBounds(131, 178, 218, 14);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Roberto Julio Palomino Meza");
		lblNewLabel_5.setBounds(131, 203, 218, 14);
		getContentPane().add(lblNewLabel_5);

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		if (JOptionPane.showConfirmDialog(this, "¿Quieres salir de Acerca de Tienda?", "Salir", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0)
			this.dispose();
	}
}
