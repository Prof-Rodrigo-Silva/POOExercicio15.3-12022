package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import control.ClassControl;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppTela {

	private JFrame frame;
	private JTextField textCampoValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppTela window = new AppTela();
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
	public AppTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setTitle("AppMoedas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversorDeMoedas = new JLabel("Conversor de Moedas");
		lblConversorDeMoedas.setForeground(Color.BLACK);
		lblConversorDeMoedas.setFont(new Font("Arial", Font.BOLD, 30));
		lblConversorDeMoedas.setBounds(60, 25, 320, 30);
		frame.getContentPane().add(lblConversorDeMoedas);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 70, 390, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Valor em R$:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 100, 160, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textCampoValor = new JTextField();
		textCampoValor.setFont(new Font("Dialog", Font.PLAIN, 20));
		textCampoValor.setBounds(185, 90, 200, 30);
		frame.getContentPane().add(textCampoValor);
		textCampoValor.setColumns(10);
		
		JLabel lblMoeda = new JLabel("Moeda:");
		lblMoeda.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMoeda.setBounds(20, 150, 160, 15);
		frame.getContentPane().add(lblMoeda);
		
		final JComboBox cBoxMoeda = new JComboBox();
		cBoxMoeda.setModel(new DefaultComboBoxModel(new String[] {"Dolar - USD", "Euro - EUR", "Peso Argentino - ARS"}));
		cBoxMoeda.setBounds(185, 140, 200, 30);
		frame.getContentPane().add(cBoxMoeda);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 250, 390, 2);
		frame.getContentPane().add(separator_1);
		
		final JLabel lblConvertido = new JLabel("");
		lblConvertido.setFont(new Font("Dialog", Font.BOLD, 20));
		lblConvertido.setBounds(20, 270, 400, 30);
		frame.getContentPane().add(lblConvertido);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCampoValor.getText().isEmpty() || textCampoValor.getText()==null) {
					JOptionPane.showMessageDialog(null, "Preencha um valor!","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				else {
					String mensagem="";
					double valor;
					double valorConvertido;
					int item = (Integer) cBoxMoeda.getSelectedIndex();
					switch(item) {
					case 0:
						valor = Double.parseDouble(textCampoValor.getText());
						valorConvertido = ClassControl.converter(valor, item);
						mensagem = ClassControl.mensagem(valorConvertido);
						break;
					case 1:
						valor = Double.parseDouble(textCampoValor.getText());
						valorConvertido = ClassControl.converter(valor, item);
						mensagem = ClassControl.mensagem(valorConvertido);
						break;
					case 2:
						valor = Double.parseDouble(textCampoValor.getText());
						valorConvertido = ClassControl.converter(valor, item);
						mensagem = ClassControl.mensagem(valorConvertido);
						break;
					}
					
					lblConvertido.setText(mensagem);
					
				}
			}

		});
		btnConverter.setFont(new Font("Dialog", Font.BOLD, 20));
		btnConverter.setBounds(150, 202, 170, 30);
		frame.getContentPane().add(btnConverter);
		
		
		
	}
}
