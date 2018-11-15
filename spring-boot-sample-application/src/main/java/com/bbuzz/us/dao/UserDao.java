package com.bbuzz.us.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethods;
import org.springframework.stereotype.Repository;

import com.bbuzz.us.bean.User;

@Repository
public class UserDao implements IUserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		}

}
