package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import COMPRAS.ArrayComprasProductos;
import COMPRAS.ComprasProductos;
import EMPLEADOS.ArrayEmpleados;
import EMPLEADOS.Empleados;
import PRODUCTOS.ArrayProductos;
import PRODUCTOS.Productos;
import PROVEEDORES.ArrayProveedor;
import PROVEEDORES.Proveedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Sistema_Administrador extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblAdministrador;
	private JPanel panel;
	private JButton btnSalir;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtNomPro;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtDescripcion;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio;
	private JLabel lblNewLabel_5;
	private JTextField txtStock;
	private JTextField txtCodigo;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_12;
	private JTextField txtCodE;
	private JTextField txtNomE;
	private JTextField txtApelli;
	private JComboBox cboCargo;
	private JTextField txtSalario;
	private JComboBox cboAfiliacion;
	private JButton btnAgregarE;
	private JButton btnModificarE;
	private JButton btnEliminarE;
	private JTable table_1;
	private JTable table;
	private JPanel panel_4;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JTextField txtRuc;
	private JTextField txtEmpresa;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnAgregarProve;
	private JButton btnModificarProve;
	private JButton btnEliminarProve;
	private JTable table_2;
	private JTextField txtEmail;
	private JTextField txtDistrito;
	private JTextField txtNombreProveedor;
	private JTable tablaCompras;
	private JTextField txtNombreEmpleado;
	private JTextField txtCargoEmpleado;
	private JComboBox<String> cmbProveedor;
	private JComboBox<String> cmbEmpleado;
	private JButton btnNewButton;
	private JTextField txtNOMPRO;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField txtPREVEN;
	private JLabel lblNewLabel_22;
	private JTextField txtDES;
	private JLabel lblNewLabel_23;
	private JTextField txtCANT;
	private JLabel lblNewLabel_24;
	private JTextField txtPRECOM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema_Administrador frame = new Sistema_Administrador();
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
	public Sistema_Administrador() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setForeground(Color.WHITE);
			panel.setBackground(Color.ORANGE);
			panel.setBounds(0, 0, 179, 545);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				btnSalir = new JButton("SALIR");
				btnSalir.setBounds(29, 511, 89, 23);
				panel.add(btnSalir);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(179, 2, 824, 91);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(551, 11, 145, 82);
				panel_1.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon(Sistema_Administrador.class.getResource("/IMAGENES/panaderia_logo.png")));
			}
			{
				lblAdministrador = new JLabel("ADMINISTRADOR ");
				lblAdministrador.setBounds(70, 11, 387, 82);
				panel_1.add(lblAdministrador);
				lblAdministrador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
			}
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(179, 94, 824, 451);
			contentPane.add(tabbedPane);
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("EMPLEADOS", null, panel_2, null);
				panel_2.setLayout(null);
				{
					lblNewLabel_6 = new JLabel("CODIGO:");
					lblNewLabel_6.setBounds(10, 11, 45, 14);
					panel_2.add(lblNewLabel_6);
				}
				{
					lblNewLabel_7 = new JLabel("NOMBRE:");
					lblNewLabel_7.setBounds(10, 36, 63, 25);
					panel_2.add(lblNewLabel_7);
				}
				{
					lblNewLabel_8 = new JLabel("APELLIDO:");
					lblNewLabel_8.setBounds(10, 66, 63, 25);
					panel_2.add(lblNewLabel_8);
				}
				{
					lblNewLabel_9 = new JLabel("CARGO:");
					lblNewLabel_9.setBounds(185, 6, 63, 25);
					panel_2.add(lblNewLabel_9);
				}
				{
					lblNewLabel_10 = new JLabel("SALARIO:");
					lblNewLabel_10.setBounds(185, 36, 63, 25);
					panel_2.add(lblNewLabel_10);
				}
				{
					lblNewLabel_12 = new JLabel("AFILIACIÓN:");
					lblNewLabel_12.setBounds(185, 72, 86, 25);
					panel_2.add(lblNewLabel_12);
				}
				{
					txtCodE = new JTextField();
					txtCodE.setBounds(67, 8, 86, 20);
					panel_2.add(txtCodE);
					txtCodE.setColumns(10);
				}
				{
					txtNomE = new JTextField();
					txtNomE.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
							   char c = e.getKeyChar();
						        // Solo permite letras y espacio
						        if (!Character.isLetter(c) && c != ' ') {
						            e.consume(); // bloquea el carácter
						        }
							
						}
					});
					txtNomE.setColumns(10);
					txtNomE.setBounds(67, 38, 86, 20);
					panel_2.add(txtNomE);
				}
				{
					txtApelli = new JTextField();
					txtApelli.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
							//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
							   char c = e.getKeyChar();
						        // Solo permite letras y espacio
						        if (!Character.isLetter(c) && c != ' ') {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtApelli.setColumns(10);
					txtApelli.setBounds(67, 72, 86, 20);
					panel_2.add(txtApelli);
				}
				{
					cboCargo = new JComboBox();
					cboCargo.setModel(new DefaultComboBoxModel(new String[] {"VENDEDOR", "PANADERO", "SUPERVISOR"}));
					cboCargo.setBounds(256, 7, 80, 22);
					panel_2.add(cboCargo);
				}
				{
					txtSalario = new JTextField();
					txtSalario.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							//PARA QUE PERMITA SOLAMENTE INGRESAR NUMEROS
							  char c = e.getKeyChar();
						        // Permite solo números y el punto (para números decimales)
						        if (!Character.isDigit(c) && c != '.' && c != '\b') {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtSalario.setBounds(258, 38, 80, 20);
					panel_2.add(txtSalario);
					txtSalario.setColumns(10);
				}
				{
					cboAfiliacion = new JComboBox();
					cboAfiliacion.setModel(new DefaultComboBoxModel(new String[] {"AFP", "ONP"}));
					cboAfiliacion.setBounds(256, 73, 80, 22);
					panel_2.add(cboAfiliacion);
				}
				{
					btnAgregarE = new JButton("AGREGAR");
					btnAgregarE.addActionListener(this);
					btnAgregarE.setBounds(366, 37, 89, 23);
					panel_2.add(btnAgregarE);
				}
				{
					btnModificarE = new JButton("EDITAR");
					btnModificarE.addActionListener(this);
					btnModificarE.setBounds(366, 67, 174, 23);
					panel_2.add(btnModificarE);
				}
				{
					btnEliminarE = new JButton("ELIMINAR");
					btnEliminarE.addActionListener(this);
					btnEliminarE.setBounds(451, 37, 89, 23);
					panel_2.add(btnEliminarE);
				}
				{
					table_1 = new JTable();
					JScrollPane scrollEmpleados = new JScrollPane(table_1);
					scrollEmpleados.setBounds(10, 106, 799, 311);
					panel_2.add(scrollEmpleados);
				}
			}
			{
				panel_4 = new JPanel();
				tabbedPane.addTab("PROVEEDOR", null, panel_4, null);
				panel_4.setLayout(null);
				{
					lblNewLabel_13 = new JLabel("RUC 20:");
					lblNewLabel_13.setBounds(10, 11, 63, 25);
					panel_4.add(lblNewLabel_13);
				}
				{
					lblNewLabel_14 = new JLabel("EMPRESA: ");
					lblNewLabel_14.setBounds(10, 46, 63, 25);
					panel_4.add(lblNewLabel_14);
				}
				{
					lblNewLabel_15 = new JLabel("TELÉFONO:");
					lblNewLabel_15.setBounds(163, 11, 63, 25);
					panel_4.add(lblNewLabel_15);
				}
				{
					lblNewLabel_16 = new JLabel("DIRECCIÓN:");
					lblNewLabel_16.setBounds(163, 46, 63, 25);
					panel_4.add(lblNewLabel_16);
				}
				{
					txtRuc = new JTextField();
					txtRuc.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							 char c = e.getKeyChar();
						        if (!Character.isDigit(c) && c != ' ' && c != '\b') {
						            e.consume(); // bloquea el carácter
						        }
						}
					});
					txtRuc.setBounds(67, 13, 86, 20);
					panel_4.add(txtRuc);
					txtRuc.setColumns(10);
				}
				{
					txtEmpresa = new JTextField();
					txtEmpresa.setColumns(10);
					txtEmpresa.setBounds(67, 48, 86, 20);
					panel_4.add(txtEmpresa);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.addKeyListener(new KeyAdapter() {
						@Override
						public void keyTyped(KeyEvent e) {
							
							char c = e.getKeyChar();
					        // Permite solo números enteros
					        if (!Character.isDigit(c) && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }

						}
					});
					txtTelefono.setColumns(10);
					txtTelefono.setBounds(236, 13, 100, 20);
					panel_4.add(txtTelefono);
				}
				{
					txtDireccion = new JTextField();
					txtDireccion.setColumns(10);
					txtDireccion.setBounds(236, 48, 100, 20);
					panel_4.add(txtDireccion);
				}
				{
					btnAgregarProve = new JButton("AGREGAR");
					btnAgregarProve.addActionListener(this);
					btnAgregarProve.setBounds(346, 12, 89, 23);
					panel_4.add(btnAgregarProve);
				}
				{
					btnModificarProve = new JButton("MODIFICAR");
					btnModificarProve.addActionListener(this);
					btnModificarProve.setBounds(445, 12, 95, 23);
					panel_4.add(btnModificarProve);
				}
				{
					btnEliminarProve = new JButton("ELIMINAR");
					btnEliminarProve.addActionListener(this);
					btnEliminarProve.setBounds(346, 47, 89, 23);
					panel_4.add(btnEliminarProve);
				}
				{
					table_2 = new JTable();
					JScrollPane scrollProveedores = new JScrollPane(table_2);
					scrollProveedores.setBounds(10, 109, 799, 303);
					panel_4.add(scrollProveedores);
				}
				
				JLabel lblNewLabel_14_1 = new JLabel("EMAIL:");
				lblNewLabel_14_1.setBounds(10, 79, 63, 25);
				panel_4.add(lblNewLabel_14_1);
				
				JLabel lblNewLabel_14_1_1 = new JLabel("DISTRITO:");
				lblNewLabel_14_1_1.setBounds(163, 79, 63, 25);
				panel_4.add(lblNewLabel_14_1_1);
				
				txtEmail = new JTextField();
				txtEmail.setColumns(10);
				txtEmail.setBounds(67, 78, 86, 20);
				panel_4.add(txtEmail);
				
				txtDistrito = new JTextField();
				txtDistrito.setColumns(10);
				txtDistrito.setBounds(236, 78, 86, 20);
				panel_4.add(txtDistrito);
			}
			panel_3 = new JPanel();
			tabbedPane.addTab("PRODUCTOS", null, panel_3, null);
			panel_3.setLayout(null);
			{
				lblNewLabel_1 = new JLabel("CODIGO:");
				lblNewLabel_1.setBounds(10, 11, 63, 25);
				panel_3.add(lblNewLabel_1);
			}
			{
				txtNomPro = new JTextField();
				txtNomPro.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						//PARA QUE PERMITA SOLAMENTE INGRESAR  LETRAS NO NUMEROS
						   char c = e.getKeyChar();
					        // Solo permite letras y espacio
					        if (!Character.isLetter(c) && c != ' ') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtNomPro.setBounds(65, 47, 86, 20);
				panel_3.add(txtNomPro);
				txtNomPro.setColumns(10);
			}
			{
				lblNewLabel_2 = new JLabel("NOMBRE: ");
				lblNewLabel_2.setBounds(10, 47, 63, 25);
				panel_3.add(lblNewLabel_2);
			}
			{
				lblNewLabel_3 = new JLabel("DESCRIPCIÓN:");
				lblNewLabel_3.setBounds(172, 11, 79, 25);
				panel_3.add(lblNewLabel_3);
			}
			{
				txtDescripcion = new JTextField();
				txtDescripcion.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
					}
				});
				txtDescripcion.setBounds(249, 13, 291, 54);
				txtDescripcion.setColumns(10);
				panel_3.add(txtDescripcion);
			}
			{
				lblNewLabel_4 = new JLabel("PRECIO:");
				lblNewLabel_4.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
					}
				});
				lblNewLabel_4.setBounds(10, 78, 86, 25);
				panel_3.add(lblNewLabel_4);
			}
			{
				txtPrecio = new JTextField();
				txtPrecio.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						 char c = e.getKeyChar();
					        // Permite solo números y el punto (para números decimales)
					        if (!Character.isDigit(c) && c != '.' && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtPrecio.setColumns(10);
				txtPrecio.setBounds(65, 78, 86, 20);
				panel_3.add(txtPrecio);
			}
			{
				lblNewLabel_5 = new JLabel("STOCK:");
				lblNewLabel_5.setBounds(207, 78, 44, 25);
				panel_3.add(lblNewLabel_5);
			}
			{
				txtStock = new JTextField();
				txtStock.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						 char c = e.getKeyChar();
					     
					        if (!Character.isDigit(c) && c != '.' && c != '\b') {
					            e.consume(); // bloquea el carácter
					        }
					}
				});
				txtStock.setColumns(10);
				txtStock.setBounds(249, 80, 86, 20);
				panel_3.add(txtStock);
			}
			{
				txtCodigo = new JTextField();
				txtCodigo.setColumns(10);
				txtCodigo.setBounds(65, 13, 86, 20);
				panel_3.add(txtCodigo);
			}
			
			btnEliminar = new JButton("ELIMINAR");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(136, 116, 89, 23);
			panel_3.add(btnEliminar);
			
			btnModificar = new JButton("MODIFICAR");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(246, 116, 104, 23);
			panel_3.add(btnModificar);
			{
				btnAgregar = new JButton("AGREGAR");
				btnAgregar.addActionListener(this);
				btnAgregar.setBounds(20, 116, 89, 23);
				panel_3.add(btnAgregar);
			}
			{
				table = new JTable();
				JScrollPane scrollProductos = new JScrollPane(table);
				scrollProductos.setBounds(10, 146, 799, 266);
				panel_3.add(scrollProductos);
			}
			
			JPanel panel_5 = new JPanel();
			tabbedPane.addTab("COMPRAS PRODUCTOS", null, panel_5, null);
			panel_5.setLayout(null);
			
			cmbProveedor = new JComboBox<String>();
			cmbProveedor.setBounds(511, 9, 86, 22);
			panel_5.add(cmbProveedor);
			cmbProveedor.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        String idProveedor = (String) cmbProveedor.getSelectedItem();
			        ArrayProveedor array = new ArrayProveedor();
			        ArrayList<Proveedor> lista = array.ConsultarProveedoresID(idProveedor);

			        if (!lista.isEmpty()) {
			            Proveedor prov = lista.get(0); //primer proveedor
			            txtNombreProveedor.setText(prov.getNombre_PROV());
			        } else {
			            txtNombreProveedor.setText(""); //por si no se encuentra nada
			        }
			    }
			});
			
			JLabel lblNewLabel_17 = new JLabel("PROVEEDOR:");
			lblNewLabel_17.setBounds(444, 13, 69, 14);
			panel_5.add(lblNewLabel_17);
			
			txtNombreProveedor = new JTextField();
			txtNombreProveedor.setEditable(false);
			txtNombreProveedor.setBounds(607, 10, 96, 20);
			panel_5.add(txtNombreProveedor);
			txtNombreProveedor.setColumns(10);
			
			JLabel lblNewLabel_18 = new JLabel("EMPLEADO:");
			lblNewLabel_18.setBounds(444, 40, 63, 14);
			panel_5.add(lblNewLabel_18);
			
			cmbEmpleado = new JComboBox<String>();
			cmbEmpleado.setBounds(511, 36, 86, 22);
			panel_5.add(cmbEmpleado);
			cmbEmpleado.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	String idEmpleado = (String) cmbEmpleado.getSelectedItem();
			        if (idEmpleado != null) {
			            ArrayEmpleados array = new ArrayEmpleados();
			            ArrayList<Empleados> lista = array.ConsultarEmpleadosID(idEmpleado);
			            if (!lista.isEmpty()) {
			                Empleados emp = lista.get(0);
			                txtNombreEmpleado.setText(emp.getNombre_EMP());
			                txtCargoEmpleado.setText(emp.getCargo_EMP());
			            } else {
			                txtNombreEmpleado.setText("");
			                txtCargoEmpleado.setText("");
			            }
			        }
			    }
			});
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 148, 799, 264);
			panel_5.add(scrollPane);
			
			tablaCompras = new JTable();
			scrollPane.setViewportView(tablaCompras);
			{
				txtNombreEmpleado = new JTextField();
				txtNombreEmpleado.setEditable(false);
				txtNombreEmpleado.setColumns(10);
				txtNombreEmpleado.setBounds(607, 37, 96, 20);
				panel_5.add(txtNombreEmpleado);
			}
			{
				txtCargoEmpleado = new JTextField();
				txtCargoEmpleado.setEditable(false);
				txtCargoEmpleado.setColumns(10);
				txtCargoEmpleado.setBounds(713, 37, 96, 20);
				panel_5.add(txtCargoEmpleado);
			}
			llenarComboProveedores(cmbProveedor);
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			{
				btnNewButton = new JButton("REGISTRAR COMPRA");
				btnNewButton.addActionListener(this);
				btnNewButton.setBounds(98, 114, 135, 23);
				panel_5.add(btnNewButton);
			}
			{
				txtNOMPRO = new JTextField();
				txtNOMPRO.setColumns(10);
				txtNOMPRO.setBounds(75, 10, 86, 20);
				panel_5.add(txtNOMPRO);
			}
			{
				lblNewLabel_20 = new JLabel("NOMBRE: ");
				lblNewLabel_20.setBounds(10, 9, 63, 22);
				panel_5.add(lblNewLabel_20);
			}
			{
				lblNewLabel_21 = new JLabel("PRECIO VENTA:");
				lblNewLabel_21.setBounds(10, 33, 86, 25);
				panel_5.add(lblNewLabel_21);
			}
			{
				txtPREVEN = new JTextField();
				txtPREVEN.setColumns(10);
				txtPREVEN.setBounds(98, 35, 63, 20);
				panel_5.add(txtPREVEN);
			}
			{
				lblNewLabel_22 = new JLabel("DESCRIPCIÓN:");
				lblNewLabel_22.setBounds(171, 9, 79, 22);
				panel_5.add(lblNewLabel_22);
			}
			{
				txtDES = new JTextField();
				txtDES.setColumns(10);
				txtDES.setBounds(252, 8, 182, 46);
				panel_5.add(txtDES);
			}
			{
				lblNewLabel_23 = new JLabel("CANTIDAD:");
				lblNewLabel_23.setBounds(171, 57, 69, 25);
				panel_5.add(lblNewLabel_23);
			}
			{
				txtCANT = new JTextField();
				txtCANT.setColumns(10);
				txtCANT.setBounds(238, 59, 86, 20);
				panel_5.add(txtCANT);
			}
			{
				lblNewLabel_24 = new JLabel("PRECIO COMPRA:");
				lblNewLabel_24.setBounds(10, 57, 97, 25);
				panel_5.add(lblNewLabel_24);
			}
			{
				txtPRECOM = new JTextField();
				txtPRECOM.setColumns(10);
				txtPRECOM.setBounds(108, 59, 53, 20);
				panel_5.add(txtPRECOM);
			}
			{
				ListarC("");
				ListarP("");
				ListarE("");
				ListarPV("");
			}
		}	
	}
	
	//INTERACTUAR CON LA TABLA PRODUCTOS
	protected void do_table_mouseClicked(MouseEvent e) {
		
		int fila = table.getSelectedRow();
		txtCodigo.setText(String.valueOf(table.getValueAt(fila, 0)));
		txtNomPro.setText(String.valueOf(table.getValueAt(fila, 1)));
		txtDescripcion.setText(String.valueOf(table.getValueAt(fila, 2)));
		txtPrecio.setText(String.valueOf(table.getValueAt(fila, 3)));
		txtStock.setText(String.valueOf(table.getValueAt(fila, 4)));	
	}
	
	//LISTAR PRODUCTOS
	public void ListarP(String nom) 
	{
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayProductos p = new ArrayProductos();
		ArrayList<Productos> lista = new ArrayList<Productos>();
		if(nom.length()==0) lista=p.listarProductos();
		else lista= p.consultarProductos(nom);	
		modelo.setRowCount(lista.size());
		Iterator<Productos> it = lista.iterator();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Descripción");
		modelo.addColumn("Precio");
		modelo.addColumn("Stock");
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Productos produc = (Productos) obj;
			modelo.setValueAt(produc.getID_PRODUCTO(), i, 0);
			modelo.setValueAt(produc.getNombre_PRO(), i, 1);
			modelo.setValueAt(produc.getDescripción_PRO(), i, 2);
			modelo.setValueAt(produc.getPrecio_venta(), i, 3);
			modelo.setValueAt(produc.getStock_PRO(), i, 4);
			i++;
		}
		table.setModel(modelo);
	}
	
	//LISTAR EMPLEADOS
	public void ListarE(String nom) 
	{
		DefaultTableModel modelo1 = new DefaultTableModel();
		ArrayEmpleados e = new ArrayEmpleados();
		ArrayList<Empleados> listaE = new ArrayList<Empleados>();
		if(nom.length()==0) listaE=e.ListarEmpleados();
		else listaE= e.ConsultarEmpleados(nom);	
		modelo1.setRowCount(listaE.size());
		Iterator<Empleados> it = listaE.iterator();
		modelo1.addColumn("Código");
		modelo1.addColumn("Nombre");
		modelo1.addColumn("Apellido");
		modelo1.addColumn("Cargo");
		modelo1.addColumn("Salario");
		modelo1.addColumn("Afiliación");
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Empleados emple = (Empleados) obj;
			modelo1.setValueAt(emple.getID_EMPLEADO(), i, 0);
			modelo1.setValueAt(emple.getNombre_EMP(), i, 1);
			modelo1.setValueAt(emple.getApellido_EMP(), i, 2);
			modelo1.setValueAt(emple.getCargo_EMP(), i, 3);
			modelo1.setValueAt(emple.getSalario(), i, 4);
			modelo1.setValueAt(emple.getTipoAfiliacion(), i, 5);
			i++;
		}
		table_1.setModel(modelo1);
	}
	
	//LISTAR PROVEEDORES
	public void ListarPV(String nom) 
	{
		DefaultTableModel modelo2 = new DefaultTableModel();
		ArrayProveedor pv = new ArrayProveedor();
		ArrayList<Proveedor> listaE = new ArrayList<Proveedor>();
		if(nom.length()==0) listaE=pv.ListarProveedores();
		else listaE= pv.ConsultarProveedores(nom);	
		modelo2.setRowCount(listaE.size());
		Iterator<Proveedor> it = listaE.iterator();
		modelo2.addColumn("RUC 20");
		modelo2.addColumn("EMPRESA");
		modelo2.addColumn("Teléfono");
		modelo2.addColumn("Email");
		modelo2.addColumn("Distrito");
		modelo2.addColumn("Dirección");
		int i=0;
		while(it.hasNext())
		{
			Object obj= it.next();
			Proveedor prove = (Proveedor) obj;
			modelo2.setValueAt(prove.getID_PROVEEDOR(), i, 0);
			modelo2.setValueAt(prove.getNombre_PROV(), i, 1);
			modelo2.setValueAt(prove.getTelefono_PROV(), i, 2);
			modelo2.setValueAt(prove.getEmail_PROV(), i, 3);
			modelo2.setValueAt(prove.getDireccion_PROV(), i, 4);
			modelo2.setValueAt(prove.getDistrito_PROV(), i, 5);
			i++;
		}
		table_2.setModel(modelo2);
	}

	// LLENAR COMBO DE PROVEEDORES
		public void llenarComboProveedores(JComboBox<String> cmb) {
			cmb.removeAllItems(); //Esto limpia el combo primero
		    ArrayProveedor prov = new ArrayProveedor();
		    for (Proveedor p : prov.ListarProveedores()) {
		        cmb.addItem(p.getID_PROVEEDOR());
		    }
		}

		// LLENAR COMBO DE EMPLEADOS
		public void LlenarComboEmpleadosSUPER(JComboBox<String> cmb) {
		    cmbEmpleado.removeAllItems();
		    ArrayEmpleados empleadosDAO = new ArrayEmpleados();
		    for (Empleados emp : empleadosDAO.ListarEmpleados()) {
		        if (emp.getCargo_EMP().equalsIgnoreCase("Supervisor")) {
		            cmbEmpleado.addItem(emp.getID_EMPLEADO());
		        }
		    }
		}
		
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarProve) {
			do_btnEliminarProve_actionPerformed(e);
		}
		if (e.getSource() == btnModificarProve) {
			do_btnModificarProve_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarProve) {
			do_btnAgregarProve_actionPerformed(e);
		}
		if (e.getSource() == btnEliminarE) {
			do_btnEliminarE_actionPerformed(e);
		}
		if (e.getSource() == btnModificarE) {
			do_btnModificarE_actionPerformed(e);
		}
		if (e.getSource() == btnAgregarE) {
			do_btnAgregarE_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
	}
	
	//PROGRAMAMOS LA PESTAÑA PRODUCTOS
	
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		try 
		{
			Productos produc = new Productos(txtCodigo.getText(),txtNomPro.getText(),txtDescripcion.getText(),Double.parseDouble(txtPrecio.getText()),Integer.parseInt(txtStock.getText()));
			ArrayProductos p = new ArrayProductos();
			p.insertar(produc);
			ListarP("");
			LimpiarP();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
		LlenarComboEmpleadosSUPER(cmbEmpleado);
	}
	void LimpiarP() {
		txtCodigo.setText("");
		txtNomPro.setText("");
		txtDescripcion.setText("");
		txtPrecio.setText("");
		txtStock.setText("");	
	}	
	protected void do_btnModificar_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Productos produc = new Productos(txtCodigo.getText(),txtNomPro.getText(),txtDescripcion.getText(),Double.parseDouble(txtPrecio.getText()),Integer.parseInt(txtStock.getText()));
			ArrayProductos p = new ArrayProductos();
			p.editar(produc);
			ListarP("");
			LimpiarP();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) 
	{
		ArrayProductos eliminar= new ArrayProductos();
		eliminar.eliminar(txtCodigo.getText());
		ListarP("");
		LimpiarP();
	}
	
	
	//PROGRMAMOS LA PANTALLA DE EMPLEADOS
	
	protected void do_btnAgregarE_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Empleados emple = new Empleados(txtCodE.getText(),txtNomE.getText(),txtApelli.getText(), cboCargo.getSelectedItem().toString(),Double.parseDouble(txtSalario.getText()),cboAfiliacion.getSelectedItem().toString());
			ArrayEmpleados E = new ArrayEmpleados();
			E.Insertar(emple);
			ListarE("");
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			LimpiarE();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
		
	}
	void LimpiarE() 
	{
		txtCodE.setText("");
		txtNomE.setText("");
		txtApelli.setText("");
		txtSalario.setText("");
	}
	
	protected void do_btnModificarE_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Empleados emple = new Empleados(txtCodE.getText(),txtNomE.getText(),txtApelli.getText(), cboCargo.getSelectedItem().toString(),Double.parseDouble(txtSalario.getText()),cboAfiliacion.getSelectedItem().toString());
			ArrayEmpleados E = new ArrayEmpleados();
			E.Editar(emple);
			ListarE("");
			LlenarComboEmpleadosSUPER(cmbEmpleado);
			LimpiarE();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_btnEliminarE_actionPerformed(ActionEvent e) 
	{
		ArrayEmpleados E= new ArrayEmpleados();
		E.Eliminar(txtCodE.getText());
		ListarE("");
		LlenarComboEmpleadosSUPER(cmbEmpleado);
		LimpiarE();	
	}
	
	//PROGRAMAMOS LA PESTAÑA PROVEEDOR
	protected void do_btnAgregarProve_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Proveedor provee = new Proveedor(txtRuc.getText(),txtEmpresa.getText(),txtTelefono.getText(),txtEmail.getText(),txtDireccion.getText(),txtDistrito.getText());
			ArrayProveedor PV = new ArrayProveedor();
			PV.Insertar(provee);
			ListarPV("");
			llenarComboProveedores(cmbProveedor);
			LimpiarPV();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
		
	}
	void LimpiarPV() {
		txtRuc.setText("");
		txtEmpresa.setText("");
		txtTelefono.setText("");
		txtDireccion.setText("");
		txtEmail.setText("");
		txtDistrito.setText("");
	}	
	protected void do_btnModificarProve_actionPerformed(ActionEvent e) 
	{
		try 
		{		
			Proveedor provee = new Proveedor(txtRuc.getText(),txtEmpresa.getText(),txtTelefono.getText(),txtEmail.getText(),txtDireccion.getText(),txtDistrito.getText());
			ArrayProveedor PV = new ArrayProveedor();
			PV.Editar(provee);
			ListarPV("");
			llenarComboProveedores(cmbProveedor);
			LimpiarPV();
		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null,"Datos vacios");
		}
	}
	protected void do_btnEliminarProve_actionPerformed(ActionEvent e) 
	{
		ArrayProveedor PV = new ArrayProveedor();
		PV.Eliminar(txtRuc.getText());
		ListarPV("");
		llenarComboProveedores(cmbProveedor);
		LimpiarPV();
	}
	
	public void ListarC(String nom) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayComprasProductos ac = new ArrayComprasProductos();
	    ArrayProductos productosDAO = new ArrayProductos();
	    ArrayEmpleados empleadosDAO = new ArrayEmpleados();
	    ArrayProveedor proveedoresDAO = new ArrayProveedor();

	    ArrayList<ComprasProductos> listaC;

	    if (nom.length() == 0) {
	        listaC = ac.Listar();
	    } else {
	        listaC = ac.ConsultarPorID(nom);
	    }

	    modelo.addColumn("ID COMPRA");
	    modelo.addColumn("RUC PROV");
	    modelo.addColumn("NOM PROV");  // solo visual
	    modelo.addColumn("DNI EMP");
	    modelo.addColumn("NOM EMP");   // solo visual
	    modelo.addColumn("FECHA");
	    modelo.addColumn("PRODUCTO");  // solo visual
	    modelo.addColumn("CANTIDAD");
	    modelo.addColumn("P COMPRA");
	    modelo.addColumn("TOTAL");

	    for (ComprasProductos c : listaC) {
	        String nombreEmpleado = "";
	        String nombreProveedor = "";
	        String nombreProducto = "";

	        //Buscar nombre del empleado
	        for (Empleados emp : empleadosDAO.ListarEmpleados()) {
	            if (emp.getID_EMPLEADO().equals(c.getID_EMPLEADO())) {
	                nombreEmpleado = emp.getNombre_EMP();
	                break;
	            }
	        }

	        //Buscar nombre del proveedor
	        for (Proveedor prov : proveedoresDAO.ListarProveedores()) {
	            if (prov.getID_PROVEEDOR().equals(c.getID_PROVEEDOR())) {
	                nombreProveedor = prov.getNombre_PROV();
	                break;
	            }
	        }

	        //Buscar producto que tenga exactamente la cantidad registrada (solo como visual)
	        for (Productos p : productosDAO.listarProductos()) {
	            if (p.getStock_PRO() == c.getCantidad_COM_PRO()) {
	                nombreProducto = p.getNombre_PRO();
	                break;
	            }
	        }

	        Object[] fila = new Object[10];
	        fila[0] = c.getID_COMPRA();
	        fila[1] = c.getID_PROVEEDOR();
	        fila[2] = nombreProveedor;
	        fila[3] = c.getID_EMPLEADO();
	        fila[4] = nombreEmpleado;
	        fila[5] = c.getFecha_COM_PRO();
	        fila[6] = nombreProducto;
	        fila[7] = c.getCantidad_COM_PRO();
	        fila[8] = c.getPrecioC_COM_PRO();
	        fila[9] = c.getTotal_COM();
	        modelo.addRow(fila);
	    }

	    tablaCompras.setModel(modelo);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
	        //Obtener datos del producto desde los campos de texto
	        String nombre = txtNOMPRO.getText().trim();
	        String descripcion = txtDES.getText().trim();
	        double precioVenta = Double.parseDouble(txtPREVEN.getText());
	        int cantidad = Integer.parseInt(txtCANT.getText());
	        double precioCompra = Double.parseDouble(txtPRECOM.getText());
	        double total = precioCompra * cantidad;

	        //Obtener datos del proveedor y empleado
	        String idProveedor = (String) cmbProveedor.getSelectedItem();
	        String idEmpleado = (String) cmbEmpleado.getSelectedItem();

	        //Validar que el empleado sea SUPERVISOR
	        ArrayEmpleados daoEmp = new ArrayEmpleados();
	        ArrayList<Empleados> empList = daoEmp.ConsultarEmpleadosID(idEmpleado);
	        if (empList.isEmpty() || !empList.get(0).getCargo_EMP().equalsIgnoreCase("Supervisor")) {
	            JOptionPane.showMessageDialog(null, "Solo un Supervisor puede registrar compras.");
	            return;
	        }

	        //Verificar si el producto ya existe por su nombre
	        ArrayProductos daoProd = new ArrayProductos();
	        ArrayList<Productos> existe = daoProd.ConsultarPorNombre(nombre);
	        String idProducto;

	        if (!existe.isEmpty()) {
	            //Producto ya existe → solo actualiza stock
	            idProducto = existe.get(0).getID_PRODUCTO();
	            daoProd.ActualizarStock(idProducto, cantidad);
	        } else {
	            //Producto nuevo → generar ID de PRODUCTO y registrar
	            idProducto = daoProd.generarNuevoIDProducto();  //ID tipo A01, A02, etc.
	            Productos nuevo = new Productos(idProducto, nombre, descripcion, precioVenta, cantidad);
	            daoProd.insertar(nuevo);
	        }

	        //Generar ID de compra
	        ArrayComprasProductos daoCompra = new ArrayComprasProductos();
	        String idCompra = daoCompra.generarNuevoIDCompra();  // ID tipo CP01, CP02...

	        //Crear objeto de compra y registrar en tabla COMPRA_PRODUCTOS
	        ComprasProductos cp = new ComprasProductos(
	            idCompra,
	            idProveedor,
	            idEmpleado,
	            null,  // Fecha se autogenera
	            cantidad,
	            precioCompra,
	            total
	        );

	        daoCompra.Insertar(cp);

	        //Limpiar campos
	        txtNOMPRO.setText("");
	        txtDES.setText("");
	        txtPREVEN.setText("");
	        txtCANT.setText("");
	        txtPRECOM.setText("");

	        //Actualizar visualización
	        ListarC("");   // Tabla de compras
	        ListarP("");   // Tabla de productos

	        JOptionPane.showMessageDialog(null, "Compra registrada correctamente.");

	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al registrar compra: " + ex.getMessage());
	    }
	}
}
