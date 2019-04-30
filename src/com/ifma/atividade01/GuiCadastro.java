package com.ifma.atividade01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GuiCadastro extends JFrame {
	
	private JLabel labelNome, labelSexo, labelCpf, labelEscolaridade, labelCursos, labelHabilidades;
	private JTextField campoNome, campoCpf;	
	private JRadioButton rbMasculino, rbFeminino;
	private ButtonGroup buttonGroup;	
	private JCheckBox java, php, python, javascript;	
	private JComboBox cbEscolaridade;
	private JButton botaoCadastrar;
	private JTextArea about;
	
	
	
	public GuiCadastro() {		
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		Color corFundo =  new Color(174, 214, 241);
		Color corBtn =  new Color(52, 152, 219);
		String [] itensEscolaridade = {"","Ensino Médio Completo", "Ensino Médio Incompleto", "Ensino Superior Completo", "Ensino Superior Incompleto"};
		
		setTitle("Cadastro de Usuário");
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(corFundo);
		
		
		labelNome = new JLabel("Nome: ");
		campoNome = new JTextField();
		labelCpf = new JLabel("CPF: ");
		campoCpf = new JTextField();
		labelSexo = new JLabel("Sexo: ");
		rbMasculino = new JRadioButton("Masculino", true);
		rbFeminino = new JRadioButton("Feminino", false);	
		rbMasculino.setBackground(corFundo);
		rbFeminino.setBackground(corFundo);
		labelEscolaridade = new JLabel("Escolaridade: ");
		cbEscolaridade = new JComboBox(itensEscolaridade);
		cbEscolaridade.setBackground(corFundo);
		labelCursos= new JLabel("Cursos: ");
		java = new JCheckBox("Java");
		php = new JCheckBox("PHP");
		python = new JCheckBox("Python");
		javascript = new JCheckBox("Javascript");
		botaoCadastrar = new JButton("Cadastrar");
		about = new JTextArea(2,4);
		labelHabilidades = new JLabel("Habilidades: ");			
		
		labelNome.setBounds(20,30,80,25);
		campoNome.setBounds(120, 30, 250, 25);
		labelCpf.setBounds(20,55,80,25);
		campoCpf.setBounds(120, 55, 250, 25);
		labelSexo.setBounds(20,80, 80,25);
		rbMasculino.setBounds(120,80, 100,25);
		
		rbFeminino.setBounds(230,80, 100,25);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbFeminino);
		buttonGroup.add(rbMasculino);
		labelEscolaridade.setBounds(20,105, 100,25);
		cbEscolaridade.setBounds(120,105, 250,25);
		labelCursos.setBounds(20,130, 250,25);
		labelCursos.setToolTipText("Selecione os cursos que deseja aprender");
		java.setBounds(120,130, 250,25);
		java.setBackground(corFundo);
		php.setBounds(120,155, 250,25);
		php.setBackground(corFundo);
		python.setBounds(120,180, 250,25);
		python.setBackground(corFundo);
		javascript.setBounds(120,205, 250,25);
		javascript.setBackground(corFundo);
		botaoCadastrar.setBounds(220,300, 150,30);
		botaoCadastrar.setBackground(corBtn);
		botaoCadastrar.setForeground(Color.white);
		about.setBounds(120,250, 250,35);
		labelHabilidades.setBounds(20,245, 250,30);
		labelHabilidades.setToolTipText("Descreva suas habilidades aqui!");		
		
		add(labelNome);
		add(campoNome);
		add(labelCpf);
		add(campoCpf);
		add(labelSexo);
		add(rbMasculino);
		add(rbFeminino);
		add(labelEscolaridade);
		add(cbEscolaridade);
		add(labelCursos);		
		add(python);
		add(php);
		add(javascript);
		add(java);
		add(botaoCadastrar);
		add(about);
		add(labelHabilidades);
	}
	
	public void definirEventos() {
		botaoCadastrar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				String nome = String.valueOf(campoNome.getText());
				JOptionPane.showMessageDialog(null, "Cadastro de "+ nome + " realizado com sucesso!!", "", JOptionPane.DEFAULT_OPTION);
			}			
		});
	}
	
//	public static void main(String [] args) {
//		GuiCadastro gui = new GuiCadastro();
//		gui.setVisible(true);
//	}
}
