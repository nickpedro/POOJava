package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("Id Categoria");
	static JLabel lblNomeCat = new JLabel("Nome Categoria");
	static JLabel lblDescCat = new JLabel("Descrição");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar categoria");
	
	//Elementos para o fornecedor
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Razão Social:");
	static JLabel lblcnpj = new JLabel("CNPJ:");
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtcnpj = new JTextField();
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	//Elementos para produtos
	static JLabel lblIDPr = new JLabel("Id Produto:");
	static JLabel lblNomePr = new JLabel ("Nome do Produto:");
	static JLabel lblDescPr = new JLabel ("Descricao Produto:");
	static JLabel Categoria = new JLabel ("Selecione uma Categotria:");
	static JLabel Fornecedor = new JLabel ("Selecione um Fornecedor:");
	static JLabel precoPr = new JLabel ("Preço do Produto:");

	static JTextField txtIdPr = new JTextField ();
	static JTextField txtNomePr = new JTextField ();
	static JTextField txtDescPr = new JTextField ();
	static JTextField txtCategoria = new JTextField ();
	static JTextField txtFornecedor = new JTextField ();
	static JTextField txtPrecoPr = new JTextField ();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");
	
	
	public static void main(String[] args) {
		JFrame Gerenciar = new JFrame();
		Gerenciar.setTitle("Gerenciar Produtos");
		Gerenciar.setSize(900,800);
		Gerenciar.setLocationRelativeTo(null);
		Gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Gerenciar.setResizable(true);
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		Gerenciar.getContentPane().setLayout(null);
		lblIdCat.setBounds(10,10,150,30);
		Gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10,45,150,30);
		Gerenciar.add(txtIdCat);
		
	    lblNomeCat.setBounds(10,75,150,30);
	    Gerenciar.add(lblNomeCat);
	    
	    txtNomeCat.setBounds(10,110,150,30);
	    Gerenciar.add(txtNomeCat);
	    
	    lblDescCat.setBounds(10,145,150,30);
	    Gerenciar.add(lblDescCat);
	    
	    txtDescCat.setBounds(10,175,200,30);
	    Gerenciar.add(txtDescCat);
	    
	    btnCadCat.setBounds(10,210,200,30);
	    Gerenciar.add(btnCadCat);
	    
	    lblIdFor.setBounds(10,245,200,30);
	    Gerenciar.add(lblIdFor);
	    
	    txtIdFor.setBounds(10,280,200,30);
	    Gerenciar.add(txtIdFor);
	    
	    lblRS.setBounds(10,310,200,30);
	    Gerenciar.add(lblRS);
	  
	    txtRS.setBounds(10,340,200,30);
	    Gerenciar.add(txtRS);
	    
	    lblcnpj.setBounds(10,370,200,30);
	    Gerenciar.add(lblcnpj);
	    
	    txtcnpj.setBounds(10,400,200,30);
	    Gerenciar.add(txtcnpj);
	    
	    btnCadFor.setBounds(10,440,200,30);
	    Gerenciar.add(btnCadFor);
	    
	    lblIDPr.setBounds(470,10,150,30);
	    Gerenciar.add(lblIDPr);
	    
	    txtIdPr.setBounds(470,40,310,30);
	    Gerenciar.add(txtIdPr);
	    
	    lblNomePr.setBounds(470,70,150,30);
	    Gerenciar.add(lblNomePr);
	    
	    txtNomePr.setBounds(470,100,310,30);
	    Gerenciar.add(txtNomePr);
	    
	    lblDescPr.setBounds(470,130,310,30);
	    Gerenciar.add(lblDescPr);
	    
	    txtDescPr.setBounds(470,160,310,170);
	    Gerenciar.add(txtDescPr);
	    
	    Categoria.setBounds(470,350,310,30);
	    Gerenciar.add(Categoria);
	    
	    txtCategoria.setBounds(470,400,310,30);
	    Gerenciar.add(txtCategoria);
	    
	    Fornecedor.setBounds(470,430,310,30);
	    Gerenciar.add(Fornecedor);
	    
	    txtFornecedor.setBounds(470,460,310,30);
	    Gerenciar.add(txtFornecedor);
	    
	    precoPr.setBounds(470,490,310,30);
	    Gerenciar.add(precoPr);
	    
	    txtPrecoPr.setBounds(470,520,310,30);
	    Gerenciar.add(txtPrecoPr);
	    
	    btnCadPr.setBounds(470,550,310,30);
	    Gerenciar.add(btnCadPr);
	    
	    
	    //Desabilitar os controles TextField do Fornecedor e Produtos
	    
	    txtIdFor.setEnabled(false);
	    txtRS.setEnabled(false);
	    txtcnpj.setEnabled(false);
	    btnCadFor.setEnabled(false);
	    
	    txtIdPr.setEnabled(false);
	    txtNomePr.setEnabled(false);
	    txtDescPr.setEnabled(false);
	    txtFornecedor.setEnabled(false);
	    txtCategoria.setEnabled(false);
	    txtPrecoPr.setEnabled(false);
	    btnCadPr.setEnabled(false);
	    
	    //-------- Vamos criar o objeto categoria e
	    //-------- Passar os dados do formulário para
	    //-------- o objeto
	    Categoria cat = new Categoria();
	    
	    //--- vamos fazer a passagem dos dados para o objeto
	    //--- no momento em que clicarmos no botão de cadastro
	    btnCadCat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setDescricao(txtDescCat.getText());
				
				//----desabilitar as caixas da categoria;
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//----habilitar as caixas do fornecedor
				txtIdFor.setEnabled(true);
			    txtRS.setEnabled(true);
			    txtcnpj.setEnabled(true);
			    btnCadFor.setEnabled(true);
				
			}
		});
	    
	    
	    //----- Vamos instanciar a classe fornecedor e passar 
	    //----- os dados para o objeto no momento em que 
	    //----- o botão de cadastro for clicado
	    Fornecedor f = new Fornecedor(); 
	    btnCadFor.addActionListener(new ActionListener() {
	   	
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtcnpj.getText());
				
				// desabilitar as caixas do fornecedor 
				txtIdFor.setEnabled(false);
			    txtRS.setEnabled(false);
			    txtcnpj.setEnabled(false);
			    btnCadFor.setEnabled(false);
			    
			    //habilitar os controles do produto
			    txtIdPr.setEnabled(true);
			    txtNomePr.setEnabled(true);
			    txtDescPr.setEnabled(true);
			    txtFornecedor.setEnabled(true);
			    txtCategoria.setEnabled(true);
			    txtPrecoPr.setEnabled(true);
			    btnCadPr.setEnabled(true);
				
				
			}
		});
	    
	    //------ Vamos criar um objeto basedo em
	    //------ produtos para passar os dados no momento do clique
	    //------ botão cadastro
	    
	    Produto pr = new Produto();
	    btnCadPr.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		pr.setId(Integer.parseInt(txtIdPr.getText()));
	    		pr.setNome(txtNomePr.getText());
	    		pr.setDescricao(txtDescPr.getText());
	    		pr.setCategoria(cat);
	    		pr.setFornecedor(f);
	    		pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
	    		
	    		// desabilitar as caixas do fornecedor
	    		txtIdPr.setEnabled(false);
	    	    txtNomePr.setEnabled(false);
	    	    txtDescPr.setEnabled(false);
	    	    txtFornecedor.setEnabled(false);
	    	    txtCategoria.setEnabled(false);
	    	    txtPrecoPr.setEnabled(false);
	    	    btnCadPr.setEnabled(false);
	    	    // ----- Caixa de confirmacao
	    	    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
	    	    
	    	    // Habilitar categorias
	    	    txtIdCat.setEnabled(true);
				txtNomeCat.setEnabled(true);
				txtDescCat.setEnabled(true);
				btnCadCat.setEnabled(true);
	    		
	    	}
	    });
	     
		Gerenciar.setVisible(true);
		
	}
	

}
