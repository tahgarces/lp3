package com.ifma.atividade02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfLogin;
	private JLabel labelSenha;
	private JLabel labelLogin;
	private JButton botaoLogar;
	private JPasswordField jpSenha;
	private JButton botaoCadastrar;
	
	
	public GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		Color corFundo =  new Color(174, 214, 241);
		Color corBtn =  new Color(52, 152, 219);
		
		setTitle("Login no Sistema");
		setBounds(0,0,250, 200);
		setLayout(null);
		setSize(400,400);
		getContentPane().setBackground(corFundo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfLogin = new JTextField(5);
		labelLogin = new JLabel("Login: ");
		jpSenha = new JPasswordField(5);
		labelSenha = new JLabel("Senha: ");
		botaoLogar = new JButton("Logar");
		botaoCadastrar = new JButton("Cadastrar");
		botaoLogar.setBackground(corBtn);
		botaoLogar.setForeground(Color.white);
		
		botaoCadastrar.setBackground(corBtn);
		botaoCadastrar.setForeground(Color.white);
		
		tfLogin.setBounds(150,100, 120, 25);
		labelLogin.setBounds(80,100,80,25);
		jpSenha.setBounds(150,140,120,25);
		labelSenha.setBounds(80,140,80,25);
		botaoLogar.setBounds(75, 190,100,25);
		botaoCadastrar.setBounds(180, 190, 100,25);
		
		
		add(tfLogin);
		add(labelLogin);
		add(jpSenha);
		add(labelSenha);
		add(botaoCadastrar);
		add(botaoLogar);
	}
	
	public void definirEventos() {
		botaoLogar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(jpSenha.getPassword());
				System.out.print(tfLogin.getText());
				if(tfLogin.getText().equals("ifma1") && senha.equals("ifma1")) {
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null,  "Login ou senha incorretas!");
				}				
			}			
		});
		
		botaoCadastrar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				GuiCadastro cad = new GuiCadastro();
				cad.setVisible(true);
				setVisible(false);
			}			
		});
	}
	
	public static void main(String [] args) {
		GuiLogin gui = new GuiLogin();
		gui.setVisible(true);
	}
	

}
