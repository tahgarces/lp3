package aula;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu  extends JFrame {
	
	
	private JMenuBar menuBar;
	private JMenu menuPrincipal;
	private JMenuItem menuArquivo, menuAjuda, menuSobre, menuSair;
	
	public Menu() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes(){
		Color corFundo =  new Color(0, 172, 237);
		Color corBtn =  new Color(27, 79, 114 );
		
		setTitle("Menu");
		setBounds(0,0,500, 300);
		setLayout(null);
		
		setLocationRelativeTo(null);
		setSize(500,300);
		getContentPane().setBackground(corFundo);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(corBtn);		
		menuPrincipal = new JMenu("Menu");
		menuPrincipal.setForeground(Color.white);
		menuPrincipal.setBounds(0, 0, 60, 50);
	
	
		menuSair = new JMenuItem("Sair");
		menuArquivo = new JMenuItem("Arquivo");
		menuSobre = new JMenuItem("Sobre");
		menuAjuda = new JMenuItem("Ajuda");
		
		menuPrincipal.add(menuArquivo);
		menuPrincipal.add(menuAjuda);
		menuPrincipal.add(menuSobre);
		menuPrincipal.add(menuSair);	
		
		menuBar.add(menuPrincipal);	
		
		setJMenuBar(menuBar);
		
	}
	
	public void definirEventos(){
		
		menuSair.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);	
				if (resposta == JOptionPane.YES_OPTION) {
					   dispose();
					   GuiLogin gui = new GuiLogin();
					   gui.setVisible(true);
					} 
			}			
		});
		
		menuSobre.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null,  "Twitter \nVersão: 1.0 \nAno: 2019");	
							
			}			
		});
	}
	
	public static void main(String [] args) {
	Menu gui = new Menu();
		gui.setVisible(true);
}
	
}
