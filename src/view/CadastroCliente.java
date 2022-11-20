package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class CadastroCliente {

	private JFrame frame;
	private JTextField txtNomeCliente;
	private JTextField txtTelefoneCliente;
	private JTextField txtRuaCliente;
	private JTextField txtNRuaCliente;
	private JTextField txtBairroCliente;
	private JTextField txtCepCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente window = new CadastroCliente();
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
	public CadastroCliente() {
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
		
		JLabel labelCliente = new JLabel("Nome do Cliente");
		labelCliente.setBounds(10, 61, 86, 14);
		frame.getContentPane().add(labelCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(10, 77, 129, 20);
		frame.getContentPane().add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel labelTitulo = new JLabel("Cadastro de Cliente");
		labelTitulo.setBounds(165, 11, 148, 14);
		frame.getContentPane().add(labelTitulo);
		
		txtTelefoneCliente = new JTextField();
		txtTelefoneCliente.setBounds(10, 122, 129, 20);
		frame.getContentPane().add(txtTelefoneCliente);
		txtTelefoneCliente.setColumns(10);
		
		JLabel telefoneCliente = new JLabel("Telefone");
		telefoneCliente.setBounds(10, 108, 46, 14);
		frame.getContentPane().add(telefoneCliente);
		
		JLabel lblNewLabel = new JLabel("Endereço");
		lblNewLabel.setBounds(232, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rua");
		lblNewLabel_1.setBounds(232, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtRuaCliente = new JTextField();
		txtRuaCliente.setBounds(232, 77, 185, 20);
		frame.getContentPane().add(txtRuaCliente);
		txtRuaCliente.setColumns(10);
		
		JButton salvarCliente = new JButton("Salvar");
		salvarCliente.setBounds(328, 227, 89, 23);
		frame.getContentPane().add(salvarCliente);
		
		JButton CancelarCliente = new JButton("Cancelar");
		CancelarCliente.setBounds(7, 227, 89, 23);
		frame.getContentPane().add(CancelarCliente);
		
		JLabel nCliente = new JLabel("Nº");
		nCliente.setBounds(356, 108, 46, 14);
		frame.getContentPane().add(nCliente);
		
		txtNRuaCliente = new JTextField();
		txtNRuaCliente.setBounds(356, 122, 61, 20);
		frame.getContentPane().add(txtNRuaCliente);
		txtNRuaCliente.setColumns(10);
		
		txtBairroCliente = new JTextField();
		txtBairroCliente.setBounds(232, 122, 114, 20);
		frame.getContentPane().add(txtBairroCliente);
		txtBairroCliente.setColumns(10);
		
		JLabel bairroCliente = new JLabel("Bairro");
		bairroCliente.setBounds(232, 108, 46, 14);
		frame.getContentPane().add(bairroCliente);
		
		JLabel cepCliente = new JLabel("CEP");
		cepCliente.setBounds(232, 158, 46, 14);
		frame.getContentPane().add(cepCliente);
		
		txtCepCliente = new JTextField();
		txtCepCliente.setBounds(232, 174, 86, 20);
		frame.getContentPane().add(txtCepCliente);
		txtCepCliente.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Dados do Cliente");
		lblNewLabel_6.setBounds(10, 33, 102, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
