package eTicaretOdev.business.abstracts;

import eTicaretOdev.entities.concrete.User;

public interface UserService {
	void register(User user);
	void login(User user);
}
