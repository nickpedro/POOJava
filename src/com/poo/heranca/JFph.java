package com.poo.heranca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFph extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFph frame = new JFph();
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
	public JFph() {
		setTitle("PessoaJuridica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social:");
		lblRazoSocial.setBounds(10, 11, 66, 14);
		contentPane.add(lblRazoSocial);
		
		textField = new JTextField();
		textField.setBounds(86, 8, 247, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(47, 42, 29, 14);
		contentPane.add(lblCnpj);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 39, 247, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setBounds(-1, 76, 77, 14);
		contentPane.add(lblNomeFantasia);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 70, 247, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(61, 111, 15, 14);
		contentPane.add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 108, 247, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(45, 149, 31, 14);
		contentPane.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(86, 146, 247, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(28, 180, 48, 14);
		contentPane.add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 177, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(28, 211, 64, 14);
		contentPane.add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(86, 208, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				pj.cadastrar();
				
			}
		});
		

		btnNewButton.setBounds(206, 177, 127, 48);
		contentPane.add(btnNewButton);
	}

}
