package actions.accounts;

import data.Account;
import actions.base.BaseAction;

public class Update extends BaseAction {

	public String execute() {
		return SUCCESS;
	}

	private Long id;
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
