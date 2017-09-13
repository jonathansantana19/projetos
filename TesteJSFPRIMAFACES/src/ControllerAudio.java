import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

@ViewScoped
@ManagedBean
public class ControllerAudio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	public void AcionaAudio(){
		 FileInputStream in;
		 try {
		  //Inicializa o FileInputStream com o endereço do arquivo para tocar
		  in = new FileInputStream("D:/Hey Jude.mp3");

		  //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
		  Player p = new Player(in);

		  //executa o som
		  p.play();
		 } catch (FileNotFoundException e) {
		  e.printStackTrace();
		 } catch (JavaLayerException e) {
		  e.printStackTrace();
		 }
		}
		
}
