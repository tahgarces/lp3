package com.ifma.atividade01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiLogin extends JFrame {
	private JTextField tfLogin;
	private JLabel labelSenha;
	private JLabel labelLogin;
	private JButton botaoLogar;
	private JPasswordField jpSenha;
	private JButton botaoCancelar;
	
	
	public GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Login no Sistema");
		setBounds(0,0,250, 200);
		setLayout(null);
		setSize(300,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfLogin = new JTextField(5);
		labelLogin = new JLabel("Login: ");
		jpSenha = new JPasswordField(5);
		labelSenha = new JLabel("Senha: ");
		botaoLogar = new JButton("Logar");
		botaoCancelar = new JButton("Cadastrar");
		
		tfLogin.setBounds(80, 30, 120, 25);
		labelLogin.setBounds(30,30,80,25);
		jpSenha.setBounds(80,75,120,25);
		labelSenha.setBounds(30,75,80,25);
		botaoLogar.setBounds(20, 120,100,25);
		botaoCancelar.setBounds(125, 120, 100,25);
		
		
		add(tfLogin);
		add(labelLogin);
		add(jpSenha);
		add(labelSenha);
		add(botaoCancelar);
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
		
		botaoCancelar.addActionListener( new ActionListener() {			
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
