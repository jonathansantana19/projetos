import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;




public class App3 {


public static void main(String[] args) throws ClientProtocolException, IOException {

	

		String input = "{\"password\":\"santana1.jonathan\",\"senha\"}";
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost("http://web5:93/token");
		
		StringEntity request = new StringEntity("grant_type=password&username=santana.jonathan&password=senha");
		request.setContentType("application/x-www-form-urlencoded");
		postRequest.setEntity(request);
		
		HttpResponse response = httpClient.execute(postRequest);
		
		System.out.println(response.getStatusLine().getStatusCode());

		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent()), "UTF-8") );

		String output;
		
		
		FuncionarioVO funcionario = new FuncionarioVO();
		
		while ((output = br.readLine()) != null) {
			System.out.println("JSON \n" + output);
			
			
			
			
			Gson gson = new Gson();
			funcionario = gson.fromJson(output ,  FuncionarioVO.class);
			
		}

		httpClient.getConnectionManager().shutdown();
		
		
		System.out.println(funcionario.toString());
		
	
}
}
