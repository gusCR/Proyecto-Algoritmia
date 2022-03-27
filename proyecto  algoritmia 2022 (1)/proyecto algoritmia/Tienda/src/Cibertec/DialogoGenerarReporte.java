package Cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class DialogoGenerarReporte extends JDialog {
	private JScrollPane scrollPane;
	private JComboBox comboBox;
	private JButton btnCerrar;
	private JLabel lblNewLabel;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoGenerarReporte dialog = new DialogoGenerarReporte();
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
	public DialogoGenerarReporte() {
		setTitle("Generar reportes");
		setBounds(100, 100, 623, 300);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 587, 197);
		getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Ventas por Modelo" }));
		comboBox.setBounds(107, 11, 342, 22);
		getContentPane().add(comboBox);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(508, 11, 89, 23);
		getContentPane().add(btnCerrar);

		lblNewLabel = new JLabel("Tipo de reporte");
		lblNewLabel.setBounds(10, 15, 109, 14);
		getContentPane().add(lblNewLabel);

	}

}
