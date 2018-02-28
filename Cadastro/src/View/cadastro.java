package View;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Control.RepositorioImoveisArray;
import Model.Imovel;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastro extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField tfCodigo;
	private JTextField tfArea;
	private JTextField tfGaragem;
	private JLabel lbTipoImovel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfTipoImovel;
	private JTextField tfNumeroQuartos;
	private JTextField tfPrecoImovel;
	private JLabel titulo;
	private JLabel subtitulo;
	private JTextField tfBairro;
	private JTextField tfNumeroBanheiro;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro frame = new cadastro();
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
	public cadastro() {
		
		RepositorioImoveisArray r = new RepositorioImoveisArray();
		
		setTitle("Tabajara Imobili\u00E1ria 0.01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(76, 117, 105, 20);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		tfArea = new JTextField();
		tfArea.setColumns(10);
		tfArea.setBounds(76, 148, 105, 20);
		contentPane.add(tfArea);
		
		tfGaragem = new JTextField();
		tfGaragem.setColumns(10);
		tfGaragem.setBounds(76, 179, 105, 20);
		contentPane.add(tfGaragem);
		
		JLabel lbCdigo = new JLabel("C\u00F3digo:");
		lbCdigo.setBounds(10, 120, 46, 14);
		contentPane.add(lbCdigo);
		
		JLabel lbArea = new JLabel("\u00C1rea:");
		lbArea.setBounds(10, 151, 46, 14);
		contentPane.add(lbArea);
		
		JLabel lbGaragens = new JLabel("Garagens:");
		lbGaragens.setBounds(10, 182, 65, 14);
		contentPane.add(lbGaragens);
		
		lbTipoImovel = new JLabel("Tipo im\u00F3vel:");
		lbTipoImovel.setBounds(201, 120, 75, 14);
		contentPane.add(lbTipoImovel);
		
		lblNewLabel = new JLabel("N\u00FAmero de quartos:");
		lblNewLabel.setBounds(201, 151, 120, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Pre\u00E7o imovel:");
		lblNewLabel_1.setBounds(201, 182, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Bairro:");
		lblNewLabel_2.setBounds(408, 120, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("N\u00FAmero de banheiros:");
		lblNewLabel_3.setBounds(408, 151, 128, 14);
		contentPane.add(lblNewLabel_3);
		
		tfTipoImovel = new JTextField();
		tfTipoImovel.setBounds(278, 117, 120, 20);
		contentPane.add(tfTipoImovel);
		tfTipoImovel.setColumns(10);
		
		tfNumeroQuartos = new JTextField();
		tfNumeroQuartos.setBounds(323, 148, 75, 20);
		contentPane.add(tfNumeroQuartos);
		tfNumeroQuartos.setColumns(10);
		
		tfPrecoImovel = new JTextField();
		tfPrecoImovel.setBounds(287, 179, 111, 20);
		contentPane.add(tfPrecoImovel);
		tfPrecoImovel.setColumns(10);
		
		titulo = new JLabel("Tabajara Imobili\u00E1ria Vers\u00E3o 0.01");
		titulo.setForeground(Color.RED);
		titulo.setFont(new Font("Monotype Corsiva", Font.ITALIC+Font.BOLD,20));
		titulo.setBounds(153, 11, 326, 32);
		contentPane.add(titulo);
		
		subtitulo = new JLabel("Seu im\u00F3vel est\u00E1 aqui");
		subtitulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		subtitulo.setBounds(209, 54, 213, 32);
		contentPane.add(subtitulo);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(459, 117, 193, 20);
		contentPane.add(tfBairro);
		tfBairro.setColumns(10);
		
		tfNumeroBanheiro = new JTextField();
		tfNumeroBanheiro.setBounds(547, 148, 105, 20);
		contentPane.add(tfNumeroBanheiro);
		tfNumeroBanheiro.setColumns(10);
		
		JButton btnNewButton = new JButton("Primeiro");
		btnNewButton.setBounds(76, 260, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Anterior");
		btnNewButton_1.setBounds(177, 260, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pr\u00F3ximo");
		btnNewButton_2.setBounds(278, 260, 91, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00DAltimo");
		btnNewButton_3.setBounds(379, 260, 91, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnCadastrarImovel = new JButton("Cadastrar");
		btnCadastrarImovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int codigo = Integer.parseInt(tfCodigo.getText());
				double area = Double.parseDouble(tfArea.getText());
				int garagem = Integer.parseInt(tfGaragem.getText());
				String tipoImovel = tfTipoImovel.getText();
				int numeroQuartos = Integer.parseInt(tfNumeroQuartos.getText());
				double precoImovel = Double.parseDouble(tfPrecoImovel.getText());
				String bairro = tfBairro.getText();
				int numeroBanheiros = Integer.parseInt(tfNumeroBanheiro.getText());
				
				Imovel imovel = new Imovel(codigo, area, garagem, tipoImovel, numeroQuartos, precoImovel, bairro, numeroBanheiros);
						
						r.inserir(imovel);
			}
		});
		btnCadastrarImovel.setBounds(480, 260, 91, 23);
		contentPane.add(btnCadastrarImovel);
	}
}
