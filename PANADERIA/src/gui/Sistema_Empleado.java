package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class Sistema_Empleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnSalir;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema_Empleado frame = new Sistema_Empleado();
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
	public Sistema_Empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PANADERÍA DELICIAS");
			lblNewLabel.setBounds(98, 11, 387, 82);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
			contentPane.add(lblNewLabel);
		}
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 179, 461);
			panel.setLayout(null);
			panel.setForeground(Color.WHITE);
			panel.setBackground(Color.ORANGE);
			contentPane.add(panel);
			{
				btnSalir = new JButton("SALIR");
				btnSalir.setBounds(39, 397, 103, 29);
				panel.add(btnSalir);
			}
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(498, 11, 145, 82);
			lblNewLabel_1.setIcon(new ImageIcon(Sistema_Empleado.class.getResource("/IMAGENES/panaderia_logo.png")));
			contentPane.add(lblNewLabel_1);
		}
		{
			panel_1 = new JPanel();
			panel_1.setBounds(178, 0, 565, 91);
			panel_1.setBackground(Color.WHITE);
			contentPane.add(panel_1);
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(178, 88, 565, 373);
			contentPane.add(tabbedPane);
			{
				panel_2 = new JPanel();
				panel_2.setToolTipText("");
				tabbedPane.addTab("NUEVA VENTA", null, panel_2, null);
			}
			{
				panel_4 = new JPanel();
				tabbedPane.addTab("New tab", null, panel_4, null);
			}
		}
	}
}
