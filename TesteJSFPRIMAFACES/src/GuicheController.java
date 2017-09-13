import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class GuicheController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<GuicheVO> lista;
	
	private GuicheVO guiche;
	
	private String dataHora;
	
	@PostConstruct
	public void init(){
		
		System.out.println("iniciando");
		GuicheVO obj = new GuicheVO();
		
		lista = new ArrayList<GuicheVO>();
		guiche = new GuicheVO(); 
		
		obj.setNomePaciente("Anderson");
		obj.setSala("Ambulatorio3");
		lista.add(obj);
		
		obj.setNomePaciente("Carlos");
		obj.setSala("Ambulatorio1");
		lista.add(obj);
		
		obj.setNomePaciente("Fernando");
		obj.setSala("Sala2");
		lista.add(obj);
		
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador = DateTimeFormatter.
				ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
//		agora.format(formatador); //08/04/14 10:02
		
		dataHora = agora.format(formatador);
	}


	public List<GuicheVO> getLista() {
		return lista;
	}
	public void setLista(List<GuicheVO> lista) {
		this.lista = lista;
	}
	public GuicheVO getGuiche() {
		return guiche;
	}
	public void setGuiche(GuicheVO guiche) {
		this.guiche = guiche;
	}


	public String getDataHora() {
		return dataHora;
	}


	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
}
