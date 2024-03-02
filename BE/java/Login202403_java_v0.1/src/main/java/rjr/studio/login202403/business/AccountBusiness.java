package rjr.studio.login202403.business;

import rjr.studio.login202403.dao.entity.AccountEntity;

public interface AccountBusiness {
	
	AccountEntity findByUsername(String username);
	
}
