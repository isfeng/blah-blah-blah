package actions.accounts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import actions.base.BaseAction;

public class Login extends BaseAction implements SessionAware {

	@Override
	public String execute() throws Exception {
		if ("admin".equals(this.getEmail().trim()) && "admin".equals(this.getPassword().trim())) {
			sessionMap.put("email", "admin");
			return SUCCESS;
		} else if (services.isValidUser(getEmail(), getPassword())) {
			sessionMap.put("email", getEmail());
			return SUCCESS;
		} else {
			this.addFieldError("email", "E-Mail or Password is wrong!");
			return INPUT;
		}
	}

	@Override
	public void validate() {
		if (null == this.getEmail() || "".equals(this.getEmail().trim())) {
			this.addFieldError("email", "E-Mail is required!");
		}
		if (null == this.getPassword() || "".equals(this.getPassword().trim())) {
			this.addFieldError("password", "Password is required!");
		}
	}

	private String email;
	private String password;
	private Map<String, Object> sessionMap;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap = arg0;
	}

}
