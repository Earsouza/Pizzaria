package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

public class Pedidos {

	private JFrame frame;
	private JTable tablePedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedidos window = new Pedidos();
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
	public Pedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Pedidos");
		lblNewLabel.setBounds(177, 11, 104, 14);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		tablePedidos = new JTable();
		tablePedidos.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		tablePedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablePedidos.setRowSelectionAllowed(false);
		tablePedidos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Pedido", "Valor", "Descri\u00E7\u00E3o", "Cliente", "Status"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Object.class, Float.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablePedidos.getColumnModel().getColumn(1).setPreferredWidth(48);
		tablePedidos.getColumnModel().getColumn(2).setPreferredWidth(124);
		tablePedidos.getColumnModel().getColumn(4).setPreferredWidth(58);
		tablePedidos.setBounds(23, 50, 382, 96);
		frame.getContentPane().add(tablePedidos);
		
		JButton adicionarPedido = new JButton("Adicionar");
		adicionarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adicionarPedido.setBounds(30, 157, 89, 23);
		frame.getContentPane().add(adicionarPedido);
		
		JButton excluirPedido = new JButton("Excluir");
		excluirPedido.setBounds(167, 157, 89, 23);
		frame.getContentPane().add(excluirPedido);
		
		JButton alterarPedido = new JButton("Alterar");
		alterarPedido.setBounds(306, 157, 89, 23);
		frame.getContentPane().add(alterarPedido);
		
		JButton adicionarCliente = new JButton("Novo Cliente");
		adicionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adicionarCliente.setBounds(78, 211, 118, 23);
		frame.getContentPane().add(adicionarCliente);
		
		JButton adicionarNovoFuncionario = new JButton("Novo funcionário");
		adicionarNovoFuncionario.setBounds(242, 211, 118, 23);
		frame.getContentPane().add(adicionarNovoFuncionario);
		
		JLabel lblNewLabel_1 = new JLabel("Pedido");
		lblNewLabel_1.setBounds(30, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descrição");
		lblNewLabel_1_1.setBounds(187, 36, 61, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cliente");
		lblNewLabel_1_2.setBounds(293, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Status");
		lblNewLabel_1_3.setBounds(359, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Valor");
		lblNewLabel_1_4.setBounds(108, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
	}
}
