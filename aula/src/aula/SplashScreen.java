package aula;

import java.awt.Menu;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; 

//Classe Splash, que extende da JFrame
public class SplashScreen extends JFrame{
	
  private static JLabel lbSplash;          //label respons�vel por conter a imagem
  private ImageIcon imSplash;              //imagem que ser� mostrada no label
 
  //fun��o principal que ser� carregada
  public static void main(String arg[]){
    //Criando a janela de Splash
    SplashScreen s = new SplashScreen();
     
    //definindo o tipo de fechamento, o tamanho, tirando a barra de t�tulos, deixando no centro, definindo um icone e mostrando a janela
    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    s.setSize(500,300);
    s.setUndecorated(true);
    s.setLocationRelativeTo(null);
    s.setVisible(true);
     
    //for�ando a espera de 1500 milissegundos (1,5 segundos)
    try {
      Thread.sleep (1500);
    }
    catch (InterruptedException ex) {}
    //fechando a janela
    s.dispose();
    GuiLogin form = new GuiLogin();
    form.setVisible(true);
    
  }
   
  //fun��o respons�vel por carregar os dados da janela (layout e imagem)
  public SplashScreen() {
    //definindo o layout como nulo
    setLayout(null);
     
    //setando a imagem de splash
    imSplash =  new ImageIcon("C:\\twitter.png");
     
    //adicionando a imagem no label e mudando o tamanho
    lbSplash = new JLabel(imSplash);
    lbSplash.setBounds(0,0,500,300);
     
    //adicionando componentes na janela
    add(lbSplash);
  }
   
  //fun��o ao fechar a splash
  public void dispose(){
    //criar a tela de menu, e fechar o splash
    new Menu();
    super.dispose();
  }
     
}