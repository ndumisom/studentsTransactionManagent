package com.student.transaction.service.common;

import java.util.List;
import java.util.Map;

public interface ServiceHelper<T> {
	 List<T> getAll(Class <T> clazz);
	 List<T> getAccounts(String strQuery);
	 Object getAccount(Object object , Long id);

}
