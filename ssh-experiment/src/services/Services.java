package services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import data.Account;

@Transactional
public class Services {
	// So Spring can inject the session factory
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory value) {
		sessionFactory = value;
	}

	// Shortcut for sessionFactory.getCurrentSession()
	public Session sess() {
		return sessionFactory.getCurrentSession();
	}

	public void createAccount(String email, String name, String password) {
		Account account = new Account();
		account.setName(name);
		account.setEmail(email);
		account.setPassword(password);
		sess().save(account);
	}

	public void deleteAccount(Long id) {
		sess().delete(getAccountById(id));
	}

	public Account getAccountById(Long id) {
		return (Account) sess().load(Account.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Account> getAccounts() {
		return sess().createQuery("from Account").list();
	}

	@SuppressWarnings("unchecked")
	public boolean isValidUser(String email, String password) {
		List<Account> accounts = sess().createCriteria(Account.class)
				.add(Restrictions.eq("email", email)).list();
		if (accounts.size() == 0)
			return false;

		// assume email is unique
		Account user = accounts.get(0);
		if (user.getPassword().equals(password))
			return true;
		else
			return false;
	}
}
