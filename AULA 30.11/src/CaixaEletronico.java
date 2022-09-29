import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CaixaEletronico extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtSaldo;

	private CamadaControle ctrl = new CamadaControle(this);
	
	public double getValor() {
		return Double.parseDouble(txtValor.getText());
		
	}
	
	public void setSaldo(double saldo) {
		txtSaldo.setText(Double.toString(saldo));
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaixaEletronico frame = new CaixaEletronico();
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
	public CaixaEletronico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caixa Eletronico");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(33, 28, 159, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblInformaValor = new JLabel("Informa valor:");
		lblInformaValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformaValor.setBounds(66, 93, 106, 14);
		contentPane.add(lblInformaValor);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSaldo.setBounds(113, 190, 59, 19);
		contentPane.add(lblSaldo);
		
		txtValor = new JTextField();
		txtValor.setBounds(182, 92, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(182, 191, 86, 20);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JButton btnDeposita = new JButton("Deposita");
		btnDeposita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ctrl.efetuaDeposito();
			}
		});
		btnDeposita.setBounds(80, 149, 89, 23);
		contentPane.add(btnDeposita);
		
		JButton btnSaca = new JButton("Saca");
		btnSaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.efetuaSaque();
			}
		});
		btnSaca.setBounds(179, 149, 98, 23);
		contentPane.add(btnSaca);
		
		JButton btnSaldo = new JButton("Consulta Saldo");
		btnSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.atualizaSaldo();
			}
		});
		btnSaldo.setBounds(287, 149, 106, 23);
		contentPane.add(btnSaldo);
	}
}
