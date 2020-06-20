package vista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.google.gson.Gson;


import javax.swing.JLabel;

public class MainWindow {

	private JFrame frmAdminLaboratorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmAdminLaboratorio.setLocationRelativeTo(null);
					window.frmAdminLaboratorio.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() {
		frmAdminLaboratorio = new JFrame();
		frmAdminLaboratorio.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmAdminLaboratorio.getContentPane().setForeground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(frmAdminLaboratorio.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
		);
		
		JButton btnPacientes = new JButton("");
		btnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PacienteMainWindow window = new PacienteMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPacientes.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconoPacientes150.jpg")));
		
		JButton btnPracticas = new JButton("");
		btnPracticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					PracticaMainWindow window = new PracticaMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPracticas.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconoPracticas150.jpg")));
		
		JButton btnSucursales = new JButton("");
		btnSucursales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SucursalMainWindow window = new SucursalMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSucursales.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconoSucursales150.jpg")));
		
		JButton btnPeticiones = new JButton("");
		btnPeticiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PeticionMainWindow window = new PeticionMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnPeticiones.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconoPeticiones150.jpg")));
		
		JButton btnResultados = new JButton("");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultadoMainWindow window = new ResultadoMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnResultados.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconosResultados150.jpg")));
		
		JButton btnUsuarios = new JButton("");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UsuarioMainWindow window = new UsuarioMainWindow();
					window.frame.setVisible(true);
					window.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnUsuarios.setIcon(new ImageIcon(MainWindow.class.getResource("/res/iconosUsuarios150.jpg")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPacientes, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
						.addComponent(btnPeticiones, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSucursales, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
						.addComponent(btnResultados, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPracticas, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
						.addComponent(btnUsuarios, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
					.addGap(60))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPacientes, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSucursales, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPracticas, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPeticiones, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnResultados, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUsuarios, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frmAdminLaboratorio.getContentPane().setLayout(groupLayout);
		frmAdminLaboratorio.setTitle("Admin. Laboratorio");
		frmAdminLaboratorio.setBounds(100, 100, 700, 435);
		frmAdminLaboratorio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frmAdminLaboratorio.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Laboratorio");
		menuBar.add(mnFile);
		
		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mntmCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmCerrar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmBienveido = new JMenuItem("Bienvenid@");
		mntmBienveido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bienvenid@ a la app de IOO Grupo 6 ! \n \n Integrantes: \n Agustin Drewes \n Micaela Di Carpio \n Yao Chien Hsi");
			}
		});
		mnAyuda.add(mntmBienveido);
	}
}
