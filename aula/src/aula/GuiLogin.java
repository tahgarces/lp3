package aula;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
	int tentativas = 3;
	
	
	public GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		Color corFundo =  new Color(0, 172, 237);
		Color corBtn =  new Color(0, 132, 180);
		
		setTitle("Login no Sistema");
		setBounds(0,0,500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		setSize(500,300);
		getContentPane().setBackground(corFundo);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfLogin = new JTextField(5);
		labelLogin = new JLabel("Login: ");
		labelLogin.setFont(new Font("Serif", Font.BOLD, 18));
		JLabel lb = new JLabel(new ImageIcon("person.png"));
		labelLogin.setForeground(Color.white);
		jpSenha = new JPasswordField(5);
		labelSenha = new JLabel("Senha: ");
		labelSenha.setFont(new Font("Serif", Font.BOLD, 18));
		labelSenha.setForeground(Color.white);
		botaoLogar = new JButton("Logar");
		botaoCadastrar = new JButton("Cancelar");
		botaoLogar.setBackground(corBtn);
		botaoLogar.setForeground(Color.white);
		botaoLogar.setFont(new Font("Serif", Font.BOLD, 20));
		
		botaoCadastrar.setBackground(corBtn);
		botaoCadastrar.setForeground(Color.white);
		botaoCadastrar.setFont(new Font("Serif", Font.BOLD, 20));
		
		tfLogin.setBounds(100,60, 300, 30);
		labelLogin.setBounds(100,30,100,25);
		jpSenha.setBounds(100,120,300,30);
		labelSenha.setBounds(100,90,100,25);
		botaoLogar.setBounds(100, 170,150,40);
		botaoCadastrar.setBounds(250, 170, 150,40);
		
		lb.setBounds(10,10,20,20);
		add(lb);
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
					Menu mn = new Menu();
					mn.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null,  "Login ou senha incorretas! \n Tentativas restantes: "+ (tentativas-1));
					tentativas -= 1;
					if(tentativas <=0) {
						JOptionPane.showMessageDialog(null,  "tentativas encerradas");
						dispose();
						
					}
					
				}				
			}			
		});
		
		botaoCadastrar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				//GuiCadastro cad = new GuiCadastro();
				//cad.setVisible(true);
				//setVisible(false);
			}			
		});
	}
	
//	public static void main(String [] args) {
//		GuiLogin gui = new GuiLogin();
//		gui.setVisible(true);
//	}
	

}
