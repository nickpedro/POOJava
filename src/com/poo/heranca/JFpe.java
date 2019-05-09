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

public class JFpe extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textEndereço;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textRG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFpe frame = new JFpe();
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
	public JFpe() {
		setTitle("Pessoa Fisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(41, 11, 15, 14);
		contentPane.add(lblId);
		
		textId = new JTextField();
		textId.setBounds(66, 8, 241, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(27, 46, 31, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(66, 43, 241, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 83, 48, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(66, 80, 241, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 119, 59, 14);
		contentPane.add(lblEndereo);
		
		textEndereço = new JTextField();
		textEndereço.setBounds(66, 116, 241, 20);
		contentPane.add(textEndereço);
		textEndereço.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(27, 152, 36, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(66, 149, 241, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(33, 183, 23, 14);
		contentPane.add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.setBounds(66, 180, 183, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(33, 221, 23, 14);
		contentPane.add(lblRg);
		
		textRG = new JTextField();
		textRG.setBounds(66, 218, 183, 20);
		contentPane.add(textRG);
		textRG.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		
		
		PessoaFisica pf = new PessoaFisica();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(textId.getText()));
				pf.setNome(textNome.getText());
				pf.setEmail(textEmail.getText());
				pf.setTelefone(textTelefone.getText());
				pf.setEndereco(textEndereço.getText());
				pf.setCpf(textCPF.getText());
				pf.setRg(textRG.getText());
				
				pf.cadastrar();
				
			}
		});
		
	
		btnNewButton.setBounds(259, 180, 89, 55);
		contentPane.add(btnNewButton);
	}
}
