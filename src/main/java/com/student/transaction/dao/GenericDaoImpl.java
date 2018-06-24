package com.student.transaction.dao;

import java.util.List;

import com.student.transaction.domain.Account;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("genericDao")
public class GenericDaoImpl<T> implements GenericDao<T> {

	private HibernateTemplate hibernate;

	private SessionFactory sessionFactory;

	@Autowired
	public GenericDaoImpl(SessionFactory sessionFactory) {
		super();
		this.hibernate = new HibernateTemplate(sessionFactory);
		this.sessionFactory = sessionFactory;
	}

	protected final Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public List<T> getAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return hibernate.loadAll(clazz);
	}

	public List<T> getAccounts(String strQuery) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(strQuery);
		query.addEntity(Account.class);
		List<T> results = query.list();
		return results;
	}

	public Object getAccount(Object object , Long id){
		// TODO Auto-generated method stub
          return hibernate.load(object.getClass(),id);
	}
}
