package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
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
		
		JLabel cdProduto = new JLabel("C\u00F3digo do produto:");
		cdProduto.setBounds(10, 22, 98, 14);
		frame.getContentPane().add(cdProduto);
		
		textField = new JTextField();
		textField.setBounds(121, 19, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Produto:");
		lblNewLabel.setBounds(10, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 44, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel quantidade = new JLabel("Quantidade:");
		quantidade.setBounds(10, 72, 65, 14);
		frame.getContentPane().add(quantidade);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 69, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 141, 357, 109);
		frame.getContentPane().add(table);
		
		JButton btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.setBounds(10, 107, 117, 23);
		frame.getContentPane().add(btnConfirmarCompra);
		
		JButton btnNewButton = new JButton("Encerar Aplica\u00E7\u00E3o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(145, 107, 126, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(232, 18, 89, 23);
		frame.getContentPane().add(btnPesquisar);
	}
}
