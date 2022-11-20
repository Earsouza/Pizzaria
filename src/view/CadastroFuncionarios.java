package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroFuncionarios {

	private JFrame frame;
	private JTextField txtNomeFuncionario;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionarios window = new CadastroFuncionarios();
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
	public CadastroFuncionarios() {
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
		
		JLabel cadastrodeCliente = new JLabel("Cadastro de Funcionários");
		cadastrodeCliente.setBounds(171, 11, 131, 14);
		frame.getContentPane().add(cadastrodeCliente);
		
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(47, 40, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setBounds(47, 57, 131, 20);
		frame.getContentPane().add(txtNomeFuncionario);
		txtNomeFuncionario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento");
		lblNewLabel_1.setBounds(47, 88, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField formattedTextDataNasc = new JFormattedTextField();
		formattedTextDataNasc.setBounds(47, 105, 131, 20);
		frame.getContentPane().add(formattedTextDataNasc);
		
		JFormattedTextField formattedTextCPF = new JFormattedTextField();
		formattedTextCPF.setBounds(47, 153, 131, 20);
		frame.getContentPane().add(formattedTextCPF);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(47, 136, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Função");
		lblNewLabel_3.setBounds(222, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBoxFuncao = new JComboBox();
		comboBoxFuncao.setBounds(216, 104, 143, 22);
		frame.getContentPane().add(comboBoxFuncao);
		
		JButton btnSalvarFuncionario = new JButton("Salvar");
		btnSalvarFuncionario.setBounds(318, 227, 89, 23);
		frame.getContentPane().add(btnSalvarFuncionario);
		
		JButton btnCancelarFuncionario = new JButton("Cancelar");
		btnCancelarFuncionario.setBounds(33, 227, 89, 23);
		frame.getContentPane().add(btnCancelarFuncionario);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(216, 57, 143, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(216, 40, 75, 14);
		frame.getContentPane().add(lblEmail);
	}
}
