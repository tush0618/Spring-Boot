package com.bbuzz.us.service;

import java.util.List;

import com.bbuzz.us.bean.User;

public interface IUserService {

	public boolean addUser(User user);

	public String updateUser(String accNo, User user);

	public String deleteUser(String accNo);

	public String getUser(String accNo);

	public List<User> getUsers();
}
