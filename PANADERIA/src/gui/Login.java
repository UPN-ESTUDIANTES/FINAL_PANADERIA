package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JButton btnIngresarLogin;
	private JComboBox cbocargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/Paisaje_Login.jpg")));
		lblNewLabel.setBounds(324, 0, 312, 395);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 327, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(30, 23, 239, 346);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/icono_login.png")));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(69, 11, 82, 73);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 128, 86, 23);
		panel_1.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(11, 149, 140, 20);
		panel_1.add(txtUsuario);
		
		JLabel lblNewLabel_3 = new JLabel("CONTRASEÑA :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 180, 119, 23);
		panel_1.add(lblNewLabel_3);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(10, 204, 140, 20);
		panel_1.add(txtContraseña);
		
		cbocargo = new JComboBox();
		cbocargo.setModel(new DefaultComboBoxModel(new String[] {"ADMINISTRADOR", "EMPLEADO"}));
		cbocargo.setBounds(10, 95, 141, 22);
		panel_1.add(cbocargo);
		
		JLabel lblNewLabel_2_1 = new JLabel("CARGO:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 72, 86, 23);
		panel_1.add(lblNewLabel_2_1);
		
		btnIngresarLogin = new JButton("INGRESAR");
		btnIngresarLogin.addActionListener(this);
		btnIngresarLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngresarLogin.setBounds(49, 248, 150, 33);
		panel_1.add(btnIngresarLogin);
		
		JButton btnCerrarSesion = new JButton("CERRAR SESIÓN");
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrarSesion.setBounds(49, 292, 150, 33);
		panel_1.add(btnCerrarSesion);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresarLogin) {
			do_btnIngresarLogin_actionPerformed(e);
		}
	}
	protected void do_btnIngresarLogin_actionPerformed(ActionEvent e) {
		 String usuario    = txtUsuario.getText().trim();
	     String contraseña = txtContraseña.getText().trim();
	     String rol  = (String)cbocargo.getSelectedItem();
	     
	     if ("ADMINISTRADOR".equals(rol) && "admin".equals(usuario) && "1234".equals(contraseña)) {
	            Sistema_Administrador v2 = new Sistema_Administrador();
	            v2.setVisible(true);
	            this.setVisible(false);
	            JOptionPane.showMessageDialog(this,
	                "Acceso concedido como " + rol + ". Bienvenido " + usuario);
	        }
	        else if ("EMPLEADO".equals(rol) && "empleado".equals(usuario) && "abcd".equals(contraseña)) {
	            Sistema_Empleado v2 = new Sistema_Empleado();
	            v2.setVisible(true);
	            this.setVisible(false);
	            JOptionPane.showMessageDialog(this,
	                "Acceso concedido como " + rol + ". Bienvenido " + usuario);
	        }
	        else {
	            JOptionPane.showMessageDialog(this,
	                "Usuario, contraseña o rol incorrectos");
	        }
	}
}
