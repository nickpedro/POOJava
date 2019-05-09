package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JanelaExemplo extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaExemplo frame = new JanelaExemplo();
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
	public JanelaExemplo() {
		setTitle("Gerenciar Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("Id do Cliente:");
		lblIdDoCliente.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblIdDoCliente.setBounds(10, 11, 76, 14);
		contentPane.add(lblIdDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(96, 6, 96, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
	}
}
