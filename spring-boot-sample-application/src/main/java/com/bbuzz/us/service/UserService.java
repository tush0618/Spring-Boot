package com.bbuzz.us.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbuzz.us.bean.User;
import com.bbuzz.us.dao.UserDao;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean addUser(User user) {
		userDao.addUser(user);
		return false;
	}

	@Override
	public String updateUser(String accNo, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUser(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
