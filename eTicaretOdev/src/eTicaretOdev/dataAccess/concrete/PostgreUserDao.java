package eTicaretOdev.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eTicaretOdev.dataAccess.abstracts.UserDao;
import eTicaretOdev.entities.concrete.User;

public class PostgreUserDao implements UserDao{

	List<User> users = new ArrayList();
	
	@Override
	public void add(User user) {
		System.out.println("User saved in Postgre DB: " + user.getName());
		users.add(user);
	}

	@Override
	public void remove(User user) {
		System.out.println("User deleted in Postgre DB: " + user.getName());
		users.remove(user);		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated in Postgre DB: " + user.getName());
		((UserDao) users).update(user);		
	}

	@Override
	public User getId(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
