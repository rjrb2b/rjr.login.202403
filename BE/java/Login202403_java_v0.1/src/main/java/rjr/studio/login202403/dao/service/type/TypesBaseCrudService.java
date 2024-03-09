package rjr.studio.login202403.dao.service.type;

import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import rjr.studio.login202403.dao.entity.type.TypeBaseEntity;
import rjr.studio.login202403.dao.repository.type.TypesBaseRepository;

public abstract class TypesBaseCrudService<E extends TypeBaseEntity, CODE extends Serializable> {
	
	private TypesBaseRepository<E, CODE> repo;
	
	@Autowired
	protected TypesBaseCrudService(TypesBaseRepository<E, CODE> repo) {
		this.repo = repo;
	}
	
	public List<E> findAll() {
		return repo.findAll();
	}
	
	public E findById(Class<E> clazz, CODE code) {
		return repo.findById(code).orElseThrow(() -> new NoSuchElementException(clazz.getSimpleName()+" CODE "+code+" not found"));
	}
	
	public E save(E entity) {
		return repo.save(entity);
	}
	
	public void deleteById(Class<E> clazz, CODE code) {
		this.findById(clazz, code);
		repo.deleteById(code);
	}

}
