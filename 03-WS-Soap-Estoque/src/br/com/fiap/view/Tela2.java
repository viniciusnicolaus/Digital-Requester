package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2 {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtPreco;
	private JTextField txtQuantidade;
	private JTextField txtMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setBounds(175, 11, 72, 14);
		frame.getContentPane().add(lblEstoque);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setBounds(10, 49, 46, 14);
		frame.getContentPane().add(Nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(95, 46, 119, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel Preco = new JLabel("Pre\u00E7o:");
		Preco.setBounds(10, 80, 46, 14);
		frame.getContentPane().add(Preco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(95, 77, 119, 20);
		frame.getContentPane().add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel quantidade = new JLabel("Quantidade:");
		quantidade.setBounds(10, 111, 72, 14);
		frame.getContentPane().add(quantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(95, 108, 119, 20);
		frame.getContentPane().add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel Marca = new JLabel("Marca:");
		Marca.setBounds(10, 142, 46, 14);
		frame.getContentPane().add(Marca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(95, 139, 119, 20);
		frame.getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
	}

}
