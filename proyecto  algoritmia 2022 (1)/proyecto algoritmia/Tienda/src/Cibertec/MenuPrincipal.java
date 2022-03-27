package Cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MenuPrincipal extends JFrame {

	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnNewMenu_1;
	private JMenu mnMantenimiento;
	private JMenu mnNewMenu_3;
	private JMenu mnVentas;
	private JMenu mnNewMenu_5;
	private JMenu mnConfiguracion;
	private JMenu mnNewMenu_7;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmModificarCocina;
	private JMenuItem mntmListarCocina;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidad;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JMenuItem mntmAcercaDeTienda;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\proyecto  algoritmia 2022\\salida.png"));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmSalir(e);
			}
		});
		mnArchivo.add(mntmSalir);
		
		mnNewMenu_1 = new JMenu("|");
		menuBar.add(mnNewMenu_1);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCocina = new JMenuItem("Consultar Cocina");
		mntmConsultarCocina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmConsultarCocina(e);
			}
		});
		mnMantenimiento.add(mntmConsultarCocina);
		
		separator = new JSeparator();
		mnMantenimiento.add(separator);
		
		mntmModificarCocina = new JMenuItem("Modificar cocina");
		mntmModificarCocina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmModificarCocina(e);
			}
		});
		mnMantenimiento.add(mntmModificarCocina);
		
		separator_1 = new JSeparator();
		mnMantenimiento.add(separator_1);
		
		mntmListarCocina = new JMenuItem("Listar cocinas");
		mnMantenimiento.add(mntmListarCocina);
		
		mnNewMenu_3 = new JMenu("|");
		menuBar.add(mnNewMenu_3);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmVender(e);
			}
		});
		mnVentas.add(mntmVender);
		
		separator_2 = new JSeparator();
		mnVentas.add(separator_2);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnNewMenu_5 = new JMenu("|");
		menuBar.add(mnNewMenu_5);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		separator_3 = new JSeparator();
		mnConfiguracion.add(separator_3);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		separator_4 = new JSeparator();
		mnConfiguracion.add(separator_4);
		
		mntmConfigurarCantidad = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnConfiguracion.add(mntmConfigurarCantidad);
		
		separator_5 = new JSeparator();
		mnConfiguracion.add(separator_5);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		mnNewMenu_7 = new JMenu("|");
		menuBar.add(mnNewMenu_7);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmAcercaDeTienda(e);
			}
		});
		mnAyuda.add(mntmAcercaDeTienda);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\proyecto  algoritmia 2022\\cocinas.png"));
		lblNewLabel.setBounds(0, 0, 2027, 1097);
		contentPane.add(lblNewLabel);
	}

	protected void actionPerformedMntmSalir(ActionEvent e) {
		if(JOptionPane.showConfirmDialog(this, "¿Quieres salir de Tienda?", "Salir", 
		JOptionPane.YES_NO_OPTION, JOptionPane.	QUESTION_MESSAGE) == 0)
			System.exit(0);
	}
	
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		
	DialogoAcercaDeTienda adt = new DialogoAcercaDeTienda();
	adt.setLocationRelativeTo(this);
	adt.setVisible(true);
	}
		protected void actionPerformedMntmConsultarCocina(ActionEvent e) {
		DialogoConsultarCocina cc = new DialogoConsultarCocina();
		cc.setLocationRelativeTo(this);
		cc.setVisible(true);
				
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender cc = new DialogoVender();
		cc.setLocationRelativeTo(this);
		cc.setVisible(true);
		
	}
	protected void actionPerformedMntmModificarCocina(ActionEvent e) {
		DialogoModificarCocina mc = new DialogoModificarCocina ();
		mc.setLocationRelativeTo(this);
		mc.setVisible(true);
		}
}
