package com.ifma.atividade01;

import javax.swing.*;

public class GuiCadastro extends JFrame {
	
	private JLabel labelNome;
	private JTextField campoNome;
	
	public GuiCadastro() {
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		labelNome = new JLabel("Nome: ");
		campoNome = new JTextField();
		
		labelNome.setBounds(30,30,80,25);
		campoNome.setBounds(80, 30, 100, 25);
		
		add(labelNome);
		add(campoNome);
		
	}
	
}
