package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPedidos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPedidos window = new CadastroPedidos();
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
	public CadastroPedidos() {
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
		
		JLabel lblNewLabel = new JLabel("Cadastro de Pedido");
		lblNewLabel.setBounds(172, 11, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(10, 54, 139, 22);
		frame.getContentPane().add(comboBoxCliente);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione um Cliente");
		lblNewLabel_1.setBounds(10, 39, 125, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBoxPagamento = new JComboBox();
		comboBoxPagamento.setBounds(267, 54, 139, 22);
		frame.getContentPane().add(comboBoxPagamento);
		
		JLabel lblNewLabel_2 = new JLabel("Forma de Pagamento");
		lblNewLabel_2.setBounds(267, 39, 125, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tamanho");
		lblNewLabel_3.setBounds(10, 102, 46, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Grande");
		rdbtnNewRadioButton.setBounds(10, 125, 72, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMdio = new JRadioButton("Médio");
		rdbtnMdio.setBounds(10, 151, 72, 23);
		frame.getContentPane().add(rdbtnMdio);
		
		JRadioButton rdbtnPequeno = new JRadioButton("Pequeno");
		rdbtnPequeno.setBounds(10, 177, 72, 23);
		frame.getContentPane().add(rdbtnPequeno);
		
		JCheckBox chckbxPortuguesa = new JCheckBox("Portuguesa");
		chckbxPortuguesa.setBounds(108, 99, 97, 23);
		frame.getContentPane().add(chckbxPortuguesa);
		
		JCheckBox chckbxQuatroQueijos = new JCheckBox("4 Queijos");
		chckbxQuatroQueijos.setBounds(218, 99, 97, 23);
		frame.getContentPane().add(chckbxQuatroQueijos);
		
		JCheckBox chckbxPrestigio = new JCheckBox("Prestígio");
		chckbxPrestigio.setBounds(317, 99, 97, 23);
		frame.getContentPane().add(chckbxPrestigio);
		
		JCheckBox chckbxFrangoCatupiry = new JCheckBox("Frango Catupiry");
		chckbxFrangoCatupiry.setBounds(108, 125, 108, 23);
		frame.getContentPane().add(chckbxFrangoCatupiry);
		
		JCheckBox chckbxMexicana = new JCheckBox("Mexicana");
		chckbxMexicana.setBounds(218, 125, 97, 23);
		frame.getContentPane().add(chckbxMexicana);
		
		JCheckBox chckbxChocoPreto = new JCheckBox("Chocolate Preto");
		chckbxChocoPreto.setBounds(317, 125, 107, 23);
		frame.getContentPane().add(chckbxChocoPreto);
		
		JCheckBox chckbxCalabresa = new JCheckBox("Calabresa");
		chckbxCalabresa.setBounds(108, 151, 97, 23);
		frame.getContentPane().add(chckbxCalabresa);
		
		JCheckBox chckbxMarguerita = new JCheckBox("Marguerita");
		chckbxMarguerita.setBounds(108, 177, 97, 23);
		frame.getContentPane().add(chckbxMarguerita);
		
		JCheckBox chckbxDaCasa = new JCheckBox("Da casa");
		chckbxDaCasa.setBounds(218, 151, 97, 23);
		frame.getContentPane().add(chckbxDaCasa);
		
		JCheckBox chckbxLombo = new JCheckBox("Lombo");
		chckbxLombo.setBounds(218, 177, 97, 23);
		frame.getContentPane().add(chckbxLombo);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Chocolate Branco");
		chckbxNewCheckBox_10.setBounds(317, 151, 111, 23);
		frame.getContentPane().add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxBananaNevada = new JCheckBox("Banana nevada");
		chckbxBananaNevada.setBounds(317, 177, 107, 23);
		frame.getContentPane().add(chckbxBananaNevada);
		
		JButton btnNewButton = new JButton("Salvar Pedido");
		btnNewButton.setBounds(299, 227, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Pedido");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 227, 125, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
