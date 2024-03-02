package rjr.studio.login202403.business.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import rjr.studio.login202403.api.view.LoginCredentials;
import rjr.studio.login202403.business.AccountBusiness;
import rjr.studio.login202403.dao.entity.AccountEntity;
import rjr.studio.login202403.dao.service.BaseCrudService;
import rjr.studio.login202403.dao.service.AccountService;

@Component
public class AccountBusinessImpl implements AccountBusiness {

	private BaseCrudService<AccountEntity, Integer> baseCrudService;
	private AccountService accountService;

	@Autowired
	public AccountBusinessImpl(BaseCrudService<AccountEntity, Integer> baseCrudService, AccountService accountService) {
		this.baseCrudService = baseCrudService;
		this.accountService = accountService;
	}

	@Override
	public List<AccountEntity> findAll() {
		return baseCrudService.findAll();
	}

	@Override
	public AccountEntity findById(Class<AccountEntity> clazz, Integer id) {
		return baseCrudService.findById(clazz, id);
	}

	@Override
	public AccountEntity findByUsername(String username) {
		return accountService.findByUsername(username);
	}

	@Override
	public AccountEntity save(AccountEntity accountEntity) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashedPassword = encoder.encode(accountEntity.getPassword());

		accountEntity.setPassword(hashedPassword);

		return baseCrudService.save(accountEntity);
	}

	@Override
	public void deleteById(Class<AccountEntity> clazz, Integer id) {
		this.findById(clazz, id);
		baseCrudService.deleteById(clazz, id);
	}

	@Override
	public Boolean login(LoginCredentials loginCredentials) {
		AccountEntity found = accountService.findByUsername(loginCredentials.getUsername());
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (!encoder.matches(loginCredentials.getPassword(), found.getPassword())) {
			throw new BadCredentialsException("Invalid username or password");
		}

		return true;
	}
}
