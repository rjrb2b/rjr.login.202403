package rjr.studio.login202403.dao.service.impl;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rjr.studio.login202403.dao.entity.AccountEntity;
import rjr.studio.login202403.dao.repository.BaseRepository;
import rjr.studio.login202403.dao.repository.AccountRepository;
import rjr.studio.login202403.dao.service.BaseCrudService;
import rjr.studio.login202403.dao.service.AccountService;

@Service
public class AccountServiceImpl extends BaseCrudService<AccountEntity, Integer> implements AccountService {

	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(BaseRepository<AccountEntity, Integer> repo, AccountRepository accountRepository) {
		super(repo);
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountEntity findByUsername(String username) {
		return accountRepository.findByUsername(username).orElseThrow(() -> new NoSuchElementException(AccountEntity.class.getSimpleName()+" USERNAME "+username+" not found"));
	}

}
