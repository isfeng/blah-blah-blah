package actions.accounts;

import actions.base.BaseAction;

public class Delete extends BaseAction {

	public String execute() {
		services.deleteAccount(id);
		return redirect("Listing.action");
	}

	long id;

	public void setId(long value) {
		id = value;
	}

	public long getId() {
		return id;
	}

}
