package actions.accounts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import actions.base.BaseAction;

public class Logout extends BaseAction implements SessionAware {

	private Map<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {
		sessionMap.remove("email");
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap = arg0;
	}

}
