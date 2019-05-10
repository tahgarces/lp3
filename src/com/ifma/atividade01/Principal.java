package com.ifma.atividade01;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{

    private JLabel labelUsuario;
    private JLabel labelSenha;
    private JTextField textoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JButton botaoSair;
    private JCheckBox rememberme;

    public Principal() {

        iniciarComponentes();
        eventoBotaoLogin();

    }

    public void iniciarComponentes(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocation(150,200);
        setLayout(null);

        labelUsuario = new JLabel("Usuário: ");
        labelSenha = new JLabel("Senha: ");
        textoUsuario = new JTextField(20);
        textoUsuario.setToolTipText("Digite aqui o seu usuário");
        campoSenha = new JPasswordField(8);
        campoSenha.setToolTipText("Digite aqui a sua senha");
        botaoLogin = new JButton("Login");
        botaoSair = new JButton("Sair" );
        rememberme = new JCheckBox("Lembrar-me");

        labelUsuario.setBounds(100,50,100,50);
        labelSenha.setBounds(100,80,100,50);
        textoUsuario.setBounds(170,60,200,30);
        campoSenha.setBounds(170,90,200,30);
        botaoLogin.setBounds(120,200,100,50);
        botaoSair.setBounds(250,200,100,50);
        rememberme.setBounds(120,250,100,50);

        add(labelUsuario);
        add(labelSenha);
        add(textoUsuario);
        add(campoSenha);
        add(botaoLogin);
        add(botaoSair);
        add(rememberme);

        setVisible(true);

    }

    public void eventoBotaoLogin(){

        botaoLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(campoSenha.getPassword());
                System.out.println(senha + " " + textoUsuario.getText());
                if(textoUsuario.getText().equals("admin") && senha.equals("admin")){
                	
                    JOptionPane.showMessageDialog(null,"Login Realizado");
                } else {
                    JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos!");
                }
            }
        });

    }

    public static void main (String args[]){

        Principal janela1 = new Principal();
        

    }


}