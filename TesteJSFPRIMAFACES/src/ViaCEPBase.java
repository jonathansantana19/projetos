import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


public abstract class ViaCEPBase {

	// pripriedades do CEP
    protected List<CepInfoVo> CEPs;
    protected int index;
    protected String currentCEP;
    
    // v�riaveis internas
    protected ViaCEPEvents Events;
    
    public ViaCEPBase () {
        CEPs = new ArrayList<>();
        index = -1;
        currentCEP = "00000-000";
        this.Events = null;
    }
    
    // m�todos abstratos
    public abstract void buscar(String cep) ;
    public abstract void buscarCEP(CepInfoVo cepInfoVo) ;
    
    /**
     * Busca um CEP usando um endere�o
     * @param Uf estado
     * @param Localidade cidade
     * @param Logradouro nome ou parte do nome da rua, av, viela...
     * @throws br.com.parg.viacep.ViaCEPException
     */
    public void buscarCEP(String Uf, String Localidade, String Logradouro) {
        buscarCEP(new CepInfoVo(Logradouro, Localidade, Uf));
    }
    
    /**
     * Retona o index atual;
     * @return 
     */
    public int getIndex() {
        return index;
    }
    
    /**
     * Retorna o total de CEP's
     * @return 
     */
    public int getSize() {
        return CEPs.size();
    }
    
    /**
     * Retonar o CEP
     *
     * @return
     */
    public String getCep() {
        return CEPs.get(index).CEP;
    }

    /**
     * Retorna o nome da rua, avenida, travessa, ...
     *
     * @return
     */
    public String getLogradouro() {
        return CEPs.get(index).Logradouro;
    }

    /**
     * Retorna se tem algum complemento Ex: lado impar
     *
     * @return
     */
    public String getComplemento() {
        return CEPs.get(index).Complemento;
    }

    /**
     * Retorna o Bairro
     *
     * @return
     */
    public String getBairro() {
        return CEPs.get(index).Bairro;
    }

    /**
     * Retorna a Cidade
     *
     * @return
     */
    public String getLocalidade() {
        return CEPs.get(index).Localidade;
    }

    /**
     * Retorna o UF
     *
     * @return
     */
    public String getUf() {
        return CEPs.get(index).Uf;
    }

    /**
     * Retorna o Ibge
     *
     * @return
     */
    public String getIbge() {
        return CEPs.get(index).Ibge;
    }

    /**
     * Retorna a Gia
     *
     * @return
     */
    public String getGia() {
        return CEPs.get(index).Gia;
    }
    
    /**
     * Procedimento para obtem dados via GET
     *
     * @param urlToRead endere�o
     * @return conte�do remoto
     * @throws br.com.parg.viacep.ViaCEPException caso ocorra algum erro
     */
    public final String getHttpGET(String urlToRead)  {
        StringBuilder result = new StringBuilder();
        
//        urlToRead = "https://viacep.com.br/ws/PR/fazenda%20rio%20grande/avenida%20venezuela/json/";
        urlToRead = formatStringToUri(urlToRead);
        
        System.out.println(urlToRead);
        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.addRequestProperty("User-Agent", "Mozilla/4.76"); 

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            
        } catch (MalformedURLException | ProtocolException ex) {
            // verifica os Eventos
           ex.printStackTrace();
            
        } catch (IOException ex) {
        	ex.printStackTrace();
        }
        
        return result.toString();
    }
    
    /**
     * Move para um registro espec�fico
     * @param index
     * @return 
     */
    public boolean move(int index) {
        if (CEPs.size() > 0 && index >= 0 && index < CEPs.size()) {
            this.index = index;
            return true;
        }
        
        this.index = -1;
        return false;
    }
    
    /**
     * Move para o primeiro registro
     * @return 
     */
    public boolean moveFirst() {
        if (CEPs.size() > 0) {
            index = 0;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o pr�ximo registro
     * @return 
     */
    public boolean moveNext() {
        if (CEPs.size() > 0 && (index + 1) < CEPs.size()) {
            index += 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o registro anterior
     * @return 
     */
    public boolean movePrevious() {
        if (CEPs.size() > 0 && (index - 1) >= 0) {
            index -= 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Move para o �ltimo registro
     * @return 
     */
    public boolean moveLast() {
        if (CEPs.size() > 0) {
            index = CEPs.size() - 1;
            return true;
        }
        
        index = -1;
        return false;
    }
    
    /**
     * Retorna a lista de CEP's
     * @return 
     */
    public List<CepInfoVo> getList() {
        return CEPs;
    }
    
    /**
     * Procedimento para formatar uma string para usar em urls
     * @param string texto que vai ser formatado
     * @return texto formatado
     * @throws ViaCEPException em caso de erro
     */
    private  java.lang.String formatStringToUri(String url)  {
        String out = null;
        
        // verifica est� v�lido
        if (url != null && !url.isEmpty()) {
//            try {
//                out = URLEncoder.encode(string, "utf-8");
//                out = out.replace(" ", "%20"); // for�a espa�o como %20
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
        	
        	out = url.replace(" ", "%20"); // for�a espa�o como %20
        } else {
           System.out.println("Valor nulo ou vazio informado!");
        }
        
        return out;
    }

}
