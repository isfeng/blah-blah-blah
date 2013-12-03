package actions.accounts;

import actions.base.BaseAction;

public class Create extends BaseAction {

	public String execute() {
		if (name != null && name.length() > 0) {
			services.createAccount(email, name, password);
			return redirect("Listing.action");
		}
		return SUCCESS;
	}

	private String name;
	private String email;
	private String password;
	
	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

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
}
