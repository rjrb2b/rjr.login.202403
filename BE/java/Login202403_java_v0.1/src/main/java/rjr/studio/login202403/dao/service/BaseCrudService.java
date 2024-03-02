package rjr.studio.login202403.dao.service;

import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import rjr.studio.login202403.dao.entity.BaseEntity;
import rjr.studio.login202403.dao.repository.BaseRepository;

public abstract class BaseCrudService<E extends BaseEntity, ID extends Serializable> {
	
	private BaseRepository<E, ID> repo;
	
	@Autowired
	protected BaseCrudService(BaseRepository<E, ID> repo) {
		this.repo = repo;
	}
	
	public List<E> findAll() {
		return repo.findAll();
	}
	
	public E findById(Class<E> clazz, ID id) {
		return repo.findById(id).orElseThrow(() -> new NoSuchElementException(clazz.getSimpleName()+" ID "+id.toString()+" not found"));
	}
	
	public E save(E entity) {
		return repo.save(entity);
	}
	
	public void deleteById(Class<E> clazz, ID id) {
		this.findById(clazz, id);
		repo.deleteById(id);
	}

}
