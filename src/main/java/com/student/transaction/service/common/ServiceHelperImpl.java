package com.student.transaction.service.common;

import com.student.transaction.dao.GenericDao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
@Service("serviceHelper")
public abstract class ServiceHelperImpl<T> implements ServiceHelper<T> {

	@Autowired
	protected GenericDao<T> genericDao;

	@Transactional(readOnly = true)
	public List<T> getAll(Class<T> clazz) {

		return genericDao.getAll(clazz);
	}

	@Transactional(readOnly = true)
	public List<T> getAccounts(String strQuery) {

		return genericDao.getAccounts(strQuery);
	}

	@Transactional(readOnly = true)
	public Object getAccount(Object object , Long id) {
		return genericDao.getAccount(object.getClass(),id);
	}

}
