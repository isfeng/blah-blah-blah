package actions.accounts;

import actions.base.BaseAction;
import data.*;
import java.util.List;

public class Listing extends BaseAction {

	public String execute() {
		accounts = services.getAccounts();
		return "success";
	}

	List<Account> accounts;

	public List<Account> getAccounts() {
		return accounts;
	}
}
