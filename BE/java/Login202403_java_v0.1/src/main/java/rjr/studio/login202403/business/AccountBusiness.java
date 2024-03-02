package rjr.studio.login202403.business;

import java.util.List;

import rjr.studio.login202403.api.view.LoginCredentials;
import rjr.studio.login202403.dao.entity.AccountEntity;

public interface AccountBusiness {
	
	List<AccountEntity> findAll();
	AccountEntity findById(Class<AccountEntity> clazz, Integer accountId);
	AccountEntity findByUsername(String username);
	AccountEntity save(AccountEntity accountEntity);
	void deleteById(Class<AccountEntity> clazz, Integer accountId);
	Boolean login(LoginCredentials loginCredentials);
	
}
