package com.student.transaction.dao;

import java.lang.Object;

import java.util.List;
import java.util.Map;

public interface GenericDao<T> {

	List<T> getAll(Class<T> clazz);
    List<T> getAccounts(String strQuery);
	Object getAccount(Object object , Long id);
}
