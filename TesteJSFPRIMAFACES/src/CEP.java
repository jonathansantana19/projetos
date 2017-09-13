

import java.util.ArrayList;
import java.util.List;

import org.json.*;


public class CEP extends ViaCEPBase {

	
	@Override
	  public void buscarCEP(String Uf, String Localidade, String Logradouro) {
	        // define o cep atual
	        currentCEP = "?????-???";

	        // define a url
	        String url = "http://viacep.com.br/ws/" + Uf.toUpperCase() + "/" + Localidade + "/" + Logradouro + "/json/";

	        // obtem a lista de CEP's
	        JSONArray ceps = new JSONArray(getHttpGET(url));

	        if (ceps.length() > 0) {
	            for (int i = 0; i < ceps.length(); i++) {
	                JSONObject obj = ceps.getJSONObject(i);

	                if (!obj.has("erro")) {
	                    CepInfoVo novoCEP = new CepInfoVo(obj.getString("cep"),
	                            obj.getString("logradouro"),
	                            obj.getString("complemento"),
	                            obj.getString("bairro"),
	                            obj.getString("localidade"),
	                            obj.getString("uf"),
	                            obj.getString("ibge"),
	                            obj.getString("gia"));

	                    // insere o novo CEP
	                    CEPs.add(novoCEP);

	                    // atualiza o index
	                    index = CEPs.size() - 1;

	                    // verifica os Eventos
	                    if (Events instanceof ViaCEPEvents) {
	                        Events.onCEPSuccess(this);
	                    }
	                } else {
	                    // verifica os Eventos
	                    if (Events instanceof ViaCEPEvents) {
	                        Events.onCEPError(currentCEP);
	                    }

	                  System.out.println("Não foi possível validar o CEP");
	                }
	            }
	        } else {
	        	 System.out.println("Nenhum CEP encontrado");
	        }

	  }
	  
	
	
	public List<Paciente> buscarCEPVersaoDois(String Uf, String Localidade, String Logradouro) {
        // define o cep atual
        currentCEP = "?????-???";

        // define a url
        String url = "http://viacep.com.br/ws/" + Uf.toUpperCase() + "/" + Localidade + "/" + Logradouro + "/json/";
        	
        // obtem a lista de CEP's
        JSONArray ceps = new JSONArray(getHttpGET(url));
        
        List<Paciente> lista = new ArrayList<Paciente>();
        
        if (ceps.length() > 0) {
            for (int i = 0; i < ceps.length(); i++) {
                JSONObject obj = ceps.getJSONObject(i);

                if (!obj.has("erro")) {
                	Paciente obj2 = new Paciente();
                			
                	obj2.setCep(obj.getString("cep"));
                	obj2.setEndereco(obj.getString("logradouro"));
                	obj2.setComplemento(obj.getString("complemento"));
                	obj2.setBairro(obj.getString("bairro"));
                	obj2.setCidade(obj.getString("localidade"));
                	obj2.setUf(obj.getString("uf"));
//                            obj.getString("ibge"),
//                            obj.getString("gia"));

                    // insere o novo CEP
                    lista.add(obj2);
                } else {
                    // verifica os Eventos
                    if (Events instanceof ViaCEPEvents) {
                        Events.onCEPError(currentCEP);
                    }

                  System.out.println("Não foi possível validar o CEP");
                }
            }
        } else {
        	 System.out.println("Nenhum CEP encontrado");
        }
        return lista;

  }
	  
	  
	  public static void main(String[] args) {
		 
		  
		  String Uf = "pr";
		  String Localidade = "fazenda rio grande";
		  String Logradouro = "avenida venezuela";
		  
		  
		  new CEP().buscarCEP(Uf, Localidade, Logradouro);
	}



	@Override
	public void buscar(String cep) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void buscarCEP(CepInfoVo cepInfoVo) {
		// TODO Auto-generated method stub
		
	}
	
}
