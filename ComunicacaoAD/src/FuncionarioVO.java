
public class FuncionarioVO {
	
	private String access_token;
	private String token_type;
	private String expires_in;
	
	
	private String error_description;
	private String error;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getError_description() {
		return error_description;
	}
	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "FuncionarioVO [access_token=" + access_token + ", token_type="
				+ token_type + ", expires_in=" + expires_in
				+ ", error_description=" + error_description + ", error="
				+ error + "]";
	}


	

}
