package rjr.studio.login202403.business;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rjr.studio.login202403.dao.entity.BaseEntity;
import rjr.studio.login202403.dao.service.BaseCrudService;

public abstract class BaseCrudBusiness<E extends BaseEntity, ID extends Serializable> {
	
	private BaseCrudService<E, ID> service;
	
	@Autowired
	protected BaseCrudBusiness(BaseCrudService<E, ID> service) {
		this.service = service;
	}
	
	public List<E> findAll() {
		return service.findAll();
	}
	
	public E findById(Class<E> clazz, ID id) {
		return service.findById(clazz, id);
	}
	
	public E save(E entity) {
		return service.save(entity);
	}
	
	public void deleteById(Class<E> clazz, ID id) {
		this.findById(clazz, id);
		service.deleteById(clazz, id);
	}

}
